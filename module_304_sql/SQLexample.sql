select * from employees where firstname = 'Diana';
select * from employees where job_title = 'Sales Rep' order by firstname desc;
select * from offices where country = 'USA';

select distinct country from offices;
select distinct firstname from employees order by firstname;

select count(*) as 'count'
from offices o
where o.country = 'USA';


-- i want to see al employees that work in an office in the USA
select e.*
from employees e, offices o
where e.office_id = o.id and o.country = 'USA';

-- lets just start looking at what is in the various tables
select * from orders;
select * from orderdetails
order by order_line_number;

-- now add the product name to this query result
select od.*, (quantity_ordered * price_each) as total_price
from orderdetails od
where order_id = 10103
order by order_line_number;

-- now add the product name to this quert result
select od.*, (quantity_ordered * price_each) as total_price, p.product_name
from orderdetails od, products p
where order_id = 10103
and p.id = od.product_id
order by order_line_number;

-- now lets add the date of the order
select od.*, (quantity_ordered * price_each) as total_price, p.product_name
from orderdetails od, products p, orders o
where order_id = 10103
and p.id = od.product_id
order by order_line_number;

-- so this is a new question --
-- I want to see the sum of the total cost for all line items for order 10103
-- the sum() funtion is called an aggregate function
select sum(quantity_ordered * price_each) as total_order_cost,
	max(quantity_ordered) as max_quantity_ordered,
    min(quantity_ordered) as max_quantity_ordered,
    avg(quantity_ordered * price_each) as average_line_item_cost,
    avg(quantity_ordered) as avg_quantity_ordered
from orderdetails od
where order_id = 10103;

select ord.*, quantity_ordered * price_each) as total_price
from order details od
where order_id = 10103;


-- I want to see the total cost of each order of each order for all orders
select * from orderdetails
select order_id, sum(quantity_ordered * price_each) as total_order_cost
from orderdetails
group by order_id;

- ##### now I want to  see. the totla amount each customer has spend
-- step 1 was to join the customer table and the rorder table
-- we always limited our columns in the result set so eht data was a bit more consumable by a human brain
-- put an order by on this so we could see all of the customer order together
select c.customer_name, o.oid as order_id
from customers c, order o
where c.id = o.customer_id
order by customer_name;

-- setp 2 we need tot continue joining over to the order details table
-- we added a second column to the order by so we could see the products in each order by the order ide
select c.customer_name, o.id as order_id, od.product_id
from customers c, orders o, orderdetails od
where c.id = o.customer_id
	and o.id = od.order_id
order by customer_name, order_id;

-- step 3 to join to the order details table and we added the line item cost calculation
select c.customer_name, o.id as order_id, od.product_id, quantity_ordered, price_each,  (quantity_ordered * price_each) as line_item_cost
from customers c, orders o, orderdetails od
where c.id = o.customer_id
	and o.id = od.order_id
order by customer_name, order_id;