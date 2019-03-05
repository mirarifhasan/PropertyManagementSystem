Alter login sa with password = '123456'
Alter login sa enable

Create Database PropertyManagementSystemDB;
Use PropertyManagementSystemDB;



CREATE TABLE Address(
	AddressID int IDENTITY(1, 1) PRIMARY KEY,
	City varchar(50),
	Area varchar(50),
	Road_Block_Sector varchar(50),
	House varchar(10)
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


CREATE TABLE Product(
	ProductID int IDENTITY(7000,1) PRIMARY KEY,
	AddressID int NOT NULL FOREIGN KEY REFERENCES Address (AddressID),
	OwnerID int NOT NULL FOREIGN KEY REFERENCES Owner (OwnerID),
	
	Title varchar(300) NOT NULL,
	Type varchar(4) NOT NULL, --Rent/Sell/Both
	Status varchar(15) NOT NULL, --Available or not
	RentalPrice int NOT NULL,
	AdvancePrice int,

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


INSERT INTO Address VALUES ('Dhaka', 'Basabo', '1', '56');
SELECT * FROM Address;

INSERT INTO Owner VALUES ('1', 'Arif', 'Hasan', '01996846517', 'arif.ishan05@gmail.com', '1234');
SELECT * FROM Owner;

SELECT * FROM Owner WHERE (Email='arif.ishan05@gmail.com' OR Phone='01996846517') AND Password='1234';


--Executed Done (Above)
