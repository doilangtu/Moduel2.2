CREATE TABLE  customer(
customer_name INT AUTO_INCREMENT PRIMARY KEY ,
full_name VARCHAR (50) NOT NULL ,
address VARCHAR (50) NOT NULL ,
email VARCHAR (50) NOT NULL ,
phone INT NOT NULL
);
CREATE TABLE  accounts(
customer_number int references customer(customer_name),
account_name int  PRIMARY KEY ,
account_type varchar(20),
dates datetime ,
balance int
);
CREATE TABLE Transactions (
account_number int references accounts(customer_number),
tran_number INT PRIMARY KEY,
account_name INT ,
dates datetime,
amount int ,
description varchar (200)
);
