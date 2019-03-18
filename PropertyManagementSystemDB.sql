Alter login sa with password = '123456'
Alter login sa enable

Create Database PropertyManagementSystemDB;
Use PropertyManagementSystemDB;



CREATE TABLE Address(
	AddressID int IDENTITY(1, 1) PRIMARY KEY,
	City varchar(50) NOT NULL,
	Area varchar(50) NOT NULL,
	Road varchar(5),
	Block varchar(5),
	Sector varchar(5),
	House varchar(5) NOT NULL
);


CREATE TABLE Owner (
    OwnerID int IDENTITY(1000,1) PRIMARY KEY,
	AddressID int NOT NULL FOREIGN KEY REFERENCES Address (AddressID),
    FirstName varchar(30) NOT NULL,
	LastName varchar(30) NOT NULL,
    Phone varchar(20) NOT NULL,
	Email varchar(30),
	Password varchar(15) NOT NULL
);


CREATE TABLE Client (
    ClientID int IDENTITY(3000,1) PRIMARY KEY,
	AddressID int NOT NULL FOREIGN KEY REFERENCES Address (AddressID),
    FirstName varchar(30) NOT NULL,
	LastName varchar(30) NOT NULL,
    Phone varchar(20) NOT NULL,
	Email varchar(30),
	Password varchar(15) NOT NULL
);


CREATE TABLE Property(
	PropertyID int IDENTITY(7000,1) PRIMARY KEY,
	AddressID int NOT NULL FOREIGN KEY REFERENCES Address (AddressID),
	OwnerID int NOT NULL FOREIGN KEY REFERENCES Owner (OwnerID),
	ClientID int,
	
	Title varchar(300) NOT NULL,
	Type varchar(4) NOT NULL, --Rent/Sell/Both
	Status varchar(15) NOT NULL, --Available or not
	RentalPrice int NOT NULL,
	AdvancePrice int,
	Img image,

	Area int NOT NULL,
	Bedroom int NOT NULL,
	Bathroom int NOT NULL,
	Balcony int NOT NULL,
	Lift int,
	MainView varchar(20), --Ex: South view
	Parking varchar(3), --YES/NO
	ElectricityBackup varchar(3), --Yes/No
	CCTVSecurity varchar(3), --Yes/No
	Intercom varchar(3) --Yes/No
);


INSERT INTO Address VALUES ('Dhaka', 'Basabo', '1', '', '', '56');
INSERT INTO Owner VALUES ('1', 'Arif', 'Hasan', '01996846517', 'arif.ishan05@gmail.com', '1234');

SELECT * FROM Owner;
SELECT * FROM Client;
SELECT * FROM Address;


--TrUncate TABLE client;
--delete from owner where OwnerID='1001';
--delete from Address where AddressID='6';

SELECT * FROM Address WHERE Block='' AND Sector='';
SELECT * FROM Owner WHERE (Email='arif.ishan05@gmail.com' OR Phone='01996846517') AND Password='1234';


--Executed Done (Above)
