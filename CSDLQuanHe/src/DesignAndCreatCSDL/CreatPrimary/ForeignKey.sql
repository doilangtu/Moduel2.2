CREATE TABLE customers(
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
address VARCHAR(255),
email VARCHAR(255)
);
CREATE TABLE orders(
order_id INT AUTO_INCREMENT ,
staff VARCHAR(50),
customer_id int,
PRIMARY KEY (order_id),
FOREIGN KEY (customer_id) REFERENCES customers(id)
);
/* rut gon code khoa ngoại co the lam nhu sau
*/
CREATE TABLE orders(
order_id INT AUTO_INCREMENT PRIMARY KEY,
staff VARCHAR(50),
customer_id INT REFERENCES customers(id)
);

