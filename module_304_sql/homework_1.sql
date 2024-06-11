-- Homework 1
-- Question 0.1
-- I want to see the count of the number of products in each product line

SELECT productlines.product_line, COUNT(products.product_name)
FROM classic_models.products
INNER JOIN classic_models.productlines ON products.productline_id = productlines.id
GROUP BY productlines.product_line
ORDER BY productlines.product_line;

SELECT product_line, COUNT(product_name)
FROM classic_models.products, classic_models.productlines
WHERE productlines.id = products.productline_id
GROUP BY product_line
ORDER BY product_line;

-- question 0.2
-- I want to see a list of employees and all of the customers for that employee.   Employee name will be duplicated in the result set.   I want to see the employee first and last name
-- and the customer contact first and last name as well as the customer name

SELECT lastname, firstname, contact_firstname, contact_lastname, customer_name
FROM classic_models.employees, classic_models.customers 
WHERE sales_rep_employee_id = employees.id
ORDER BY lastname;


-- question 0.3
-- I want to see a list of employees in each office. Show the office name and the employee name

SELECT lastname, firstname, city
FROM classic_models.offices, classic_models.employees
WHERE offices.id = employees.office_id
ORDER BY lastname;

-- question 0.4
-- I want to see the total number of each employee type based on job title.. result should the job title and the number of employess with that job title.

SELECT job_title, COUNT(job_title)
FROM classic_models.employees
GROUP BY job_title
ORDER BY job_title;

-- question 0.5
-- I want to see a list of all payments each customer has made.  Order the list by custoemr name ascending, then by the payment amount descending

SELECT customer_name, payments.*
FROM classic_models.customers, classic_models.payments
ORDER BY customer_name;

-- question 0.6
-- I want to see a list of products that have never been sold.   use ... not in ( select product_id from order_details ) in your where clause
-- select * from products where id not in ( select product_id from orderdetails ); 

SELECT product_name
FROM classic_models.products
WHERE products.id NOT IN 
	(SELECT product_id
    FROM classic_models.orderdetails)
ORDER BY product_name;

-- question 0.7
-- are there any customers that have never made an order
SELECT DISTINCT customer_name
FROM classic_models.customers
WHERE id NOT IN 
	(SELECT customer_id
    FROM classic_models.payments)
ORDER BY customer_name;




-- Question 1
-- How many customer are handled by each office.  I want to see the office name and the count of the number of customers in that office.
SELECT COUNT(customer_name), offices.city
FROM classic_models.customers, classic_models.employees, classic_models.offices
WHERE customers.sales_rep_employee_id = employees.id AND employees.office_id = offices.id
GROUP BY city;

-- Question 2
-- I want to see the products with the most margin at the top of the table.  Include the product name, buy price, msrp, and margin in the results.  Margin is calculated (MSPR - buy_price) 
SELECT product_name, buy_price, msrp, (msrp - buy_price) AS margin
FROM classic_models.products
ORDER BY margin DESC;

-- Question 2.5
-- I want to see the top 5 customers in each state based on margin 
SELECT product_name, buy_price, msrp, (msrp - buy_price) AS margin
FROM classic_models.products
ORDER BY margin DESC
LIMIT 5;

-- Question 3
-- I want to see the top 5 salesmen in the company based on the total amount sold
SELECT employees.id, lastname, firstname, SUM(quantity_ordered * price_each) AS "Highest Sales"
FROM classic_models.employees, classic_models.customers, classic_models.orders, classic_models.orderdetails
WHERE employees.id = customers.sales_rep_employee_id
    AND customers.id = orders.customer_id
    AND orders.id = orderdetails.order_id
GROUP BY employees.id
ORDER BY lastname
LIMIT 5;

-- Question 4
-- I want to see the top 5 salesmen based on overall profit (margin)
SELECT employees.id, lastname, firstname, SUM(msrp - buy_price) AS 'Margin'
FROM classic_models.employees, classic_models.customers, classic_models.orders, classic_models.orderdetails, classic_models.products
WHERE employees.id = customers.sales_rep_employee_id
    AND customers.id = orders.customer_id
    AND orders.id = orderdetails.order_id
GROUP BY employees.id
ORDER BY lastname
LIMIT 5;

-- Question 5 
-- I want to see all of the orders that happened in 2004.   You can use a function called year(order_date) = 2004
SELECT orders.*
FROM classic_models.orders
WHERE year(order_date) = 2004;

-- Question 6
-- I want to see the total amount of all orders grouped by the year
SELECT year(order_date), count(id)
FROM classic_models.orders
GROUP BY year(order_date);

-- Question 7
-- I want to see the top 5 products based on quantity sold across all orders
SELECT product_name, sum(quantity_ordered) as total_ordered
FROM classic_models.orderdetails, classic_models.products
WHERE product_id = products.id
	  AND orderdetails.order_id not in (select id from classic_models.orders where status = 'Cancelled')
GROUP BY product_id
LIMIT 5;

-- question 7.5
-- how many times has each product appeared in an order reguardless of how many were purchased.
select p.product_name, count(p.id) as count
from classic_models.orderdetails od, classic_models.products p
where od.product_id = p.id
group by p.id
order by count desc;

-- question 7.6
-- how many products would be out of stock baed on the amount sold acrosss tiem.  -- not sure if the data will spoort this .. basically 
-- looking for any product where the sum of the quantity sold is greater than the quantity in stock
select product_id, p.product_name, sum(quantity_ordered) as otal_ordered, p.quantity_in_stock - sum(quantity_ordered) as overordered
from orderdetails

-- question 7.9
-- I want to see the distinct order status ordered alphabetically
select distinct o.name as office_name status from orders order by status;

-- Question 8
-- I want to see the office name and the distinct product lines that have been sold in that office.  This will require joining almost all of the tables.  
-- select distinct o.name as office_name, pl.productlines as product_line_name  ....