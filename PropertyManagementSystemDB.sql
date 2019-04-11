Alter login sa with password = '123456'
Alter login sa enable

Create Database PropertyManagementSystemDB;
Use PropertyManagementSystemDB;


CREATE TABLE Address(
	AddressID int IDENTITY(1, 1) PRIMARY KEY,
	City varchar(50) NOT NULL,
	Area varchar(50) NOT NULL,
	Road varchar(5) NOT NULL,
	Block varchar(5),
	Sector varchar(5),
	House varchar(5) NOT NULL
);
INSERT INTO Address VALUES ('Dhaka', 'Basabo', '1', '', '', '56');
SELECT * FROM Address;


CREATE TABLE Users(
    UsersID int IDENTITY(3000,1) PRIMARY KEY,
	AddressID int NOT NULL FOREIGN KEY REFERENCES Address (AddressID),
    FirstName varchar(30) NOT NULL,
	LastName varchar(30) NOT NULL,
    Phone varchar(20) NOT NULL,
	Email varchar(30),
	Password varchar(15) NOT NULL
);
INSERT INTO Users VALUES ('1', 'Arif', 'Hasan', '01996846517', 'arif.ishan05@gmail.com', '1234');
SELECT * FROM Users;


CREATE TABLE Property(
	PropertyID int IDENTITY(7000,1) PRIMARY KEY,
	AddressID int NOT NULL FOREIGN KEY REFERENCES Address (AddressID),
	OwnerID int NOT NULL FOREIGN KEY REFERENCES Users (UsersID),
	BuyerID int,
	
	Title varchar(300) NOT NULL,
	Purpose varchar(4) NOT NULL, --Rent/Sell/Both
	Status varchar(15) NOT NULL, --Available or not
	RentTo varchar(15) NOT NULL, --Family/Bachalor/Both
	RentalPrice int,
	AdvancePrice int,
	SellingPrice int,
	Img image,

	Area int NOT NULL, --Sq. Ft.
	Bedroom int NOT NULL,
	Bathroom int NOT NULL,
	Balcony int NOT NULL,
	MainView varchar(20), --Ex: South/East etc.

	Lift int,
	Parking varchar(3), --YES/NO
	ElectricityBackup varchar(3), --Yes/No
	CCTVSecurity varchar(3), --Yes/No
	Intercom varchar(3), --Yes/No

	Description varchar(1000)
);
INSERT INTO Property VALUES ('1', '3000', null, 'Sample room', 'Both', 'Available', 'Any', '10000', null, '16000', null, '1200', '3', '2', '2', 'South', '0', 'Yes', 'No', 'No', 'Yes', 'Good day.');
SELECT * FROM Property;


CREATE TABLE BookRequest(
	OwnerID int NOT NULL FOREIGN KEY REFERENCES Users (UsersID),
	BuyerID int NOT NULL FOREIGN KEY REFERENCES Users (UsersID),
	PropertyID int NOT NULL FOREIGN KEY REFERENCES Property (PropertyID)
);
select * from BookRequest;


CREATE TABLE History(
	HistoryID int IDENTITY(10000,1) PRIMARY KEY,
	OwnerID int NOT NULL FOREIGN KEY REFERENCES Users (UsersID),
	BuyerID int NOT NULL FOREIGN KEY REFERENCES Users (UsersID),
	PropertyID int NOT NULL FOREIGN KEY REFERENCES Property (PropertyID),
	FromDate datetime NOT NULL,
	EndDate datetime
);
select * from History;


--Select * from Property where RentalPrice >= 100;
--Select * from Property where Purpose='Rent'
--Select * from Property where PropertyID='7001'

--delete from property where propertyID='7001';

--TrUncate TABLE Property
--TrUncate TABLE client;

--delete from users where Usersid='3001';
--delete from client where OwnerID='1001';
--delete from Address where AddressID='2';
--Drop table Property;
select *  from BookRequest
select *  from History

Insert into BookRequest values ('3002', '3000', '7001');

SELECT * FROM Address WHERE Block='' AND Sector='';
SELECT * FROM Users WHERE (Email='arif.ishan05@gmail.com' OR Phone='01996846517') AND Password='1234';


--Executed Done (Above)
