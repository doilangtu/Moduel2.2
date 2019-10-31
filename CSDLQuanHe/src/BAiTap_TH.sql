//Phan customer
  SELECT * FROM classicmodels.customers;
SELECT customername, phone, city, country FROM customers;
SELECT * FROM classicmodels.customers WHERE customerName = 'MiniObji';
SELECT * FROM classicmodels.customers WHERE customerName = 'Atelier graphique';
SELECT * FROM classicmodels.customers WHERE customerName LIKE 'M%';
SELECT * FROM classicmodels.customers WHERE customerName LIKE '%A';
SELECT * FROM classicmodels.customers WHERE customerName LIKE '%M%';
SELECT*FROM classicmodels.customers WHERE city IN ('Nantes', 'Las Vegas', 'Warszawa', 'NYC');
UPDATE customers SET addressLine2='Level 2'WHERE customerNumber = '103';
UPDATE customers SET customerName='Hung'WHERE customerNumber = '112';
    //Phan order
    SELECT * FROM classicmodels.orders;
select*from classicmodels.orders where ordernumber between 10100 and 10110;
 SELECT * FROM classicmodels.orders where orderDate >='2003-03-03' and    status like "%shipped%";