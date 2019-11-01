drop database if exists my_database1;
create database my_database1;
use my_database1;
CREATE TABLE offices(
officeCode VARCHAR (50) PRIMARY KEY,
city VARCHAR (50) NOT NULL,
phone VARCHAR (50) NOT NULL,
addressLine1 VARCHAR (50) NOT NULL,
addressLine2 VARCHAR (50) NOT NULL,
state VARCHAR (50) NOT NULL,
country VARCHAR (50) NOT NULL,
postalCode VARCHAR (50) NOT NULL
);
CREATE TABLE employees (
 employeeNumber INT PRIMARY KEY,
 lastName VARCHAR (50) NOT NULL,
 firstName  VARCHAR (50) NOT NULL,
 email VARCHAR (100) NOT NULL,
 jobTitle  VARCHAR (50) NOT NULL,
 reportTo INT NOT NULL, FOREIGN KEY (reportTo) REFERENCES employees(employeeNumber),
 salesRepEmployeeNumber INT NOT NULL,
 officeCode VARCHAR (50),
FOREIGN KEY (officeCode) REFERENCES offices(officeCode) );

CREATE TABLE customers(
customerNumber INT   NOT NULL PRIMARY KEY ,
customerName VARCHAR (50) NOT NULL,
contactLastName VARCHAR (50) NOT NULL,
contactFirstName VARCHAR (50) NOT NULL,
phone VARCHAR (50) NOT NULL,
addressLine1 VARCHAR (50) NOT NULL,
addressLine2 VARCHAR (50) NOT NULL,
city VARCHAR (50) NOT NULL,
state VARCHAR (50) NOT NULL,
postalCode VARCHAR (15) NOT NULL,
country VARCHAR (50) NOT NULL,
creditLimit FLOAT ,
salesRepEmployeeNumber INT NOT NULL,
FOREIGN KEY (salesRepEmployeeNumber)
REFERENCES employees(employeeNumber)
);
CREATE TABLE orders(
orderNumber INT NOT NULL PRIMARY KEY ,
orderDate DATETIME NOT NULL ,
requiredDate DATETIME NOT NULL ,
shippedDate DATETIME NOT NULL ,
status VARCHAR (15),
comments TEXT NOT NULL,
quanlityOrdered INT NOT NULL ,
priceEach FLOAT NOT NULL,
customerNumber INT NOT NULL,
FOREIGN KEY (customerNumber)
REFERENCES customers(customerNumber)
);
CREATE TABLE payments(
customerNumber INT NOT NULL PRIMARY KEY,
checkNumber VARCHAR(50) NOT NULL ,
paymentDate DATETIME NOT NULL,
amount FLOAT NOT NULL,
FOREIGN KEY (customerNumber)
REFERENCES customers(customerNumber)
);
CREATE TABLE productlines (
productLine VARCHAR (50) NOT NULL PRIMARY KEY ,
textDescription TEXT NOT NULL,
image TEXT NOT NULL
);
CREATE TABLE products(
productCode VARCHAR (15) NOT NULL PRIMARY KEY,
productName VARCHAR (70) NOT NULL,
productSale VARCHAR (10) NOT NULL,
productVendor VARCHAR (50) NOT NULL,
productDescription TEXT NOT NULL,
quantityInStock VARCHAR (70) NOT NULL,
buyPrice FLOAT NOT NULL ,
MSRP FLOAT NOT NULL,
productLine VARCHAR (50) NOT NULL ,
FOREIGN KEY (productLine) REFERENCES productlines(productLine)
);

CREATE TABLE orderTail(
orderNumber INT NOT NULL   ,
productCode VARCHAR (15) NOT NULL ,
constraint pk_order primary key (orderNumber,productCode),
FOREIGN KEY (orderNumber) REFERENCES orders(orderNumber),
FOREIGN KEY (productCode) REFERENCES products(productCode)
);



