SELECT 
    order_id,
    order_Line_Number,
    quantity_Ordered * price_Each AS subtotal
FROM classic_models.orderdetails
ORDER BY subtotal DESC;