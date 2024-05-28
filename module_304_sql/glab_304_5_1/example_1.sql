SELECT order_id, SUM(quantity_Ordered) as Qty,
    IF(MOD(SUM(quantity_Ordered),2),'Odd', 'Even') as oddOrEven
FROM    classic_models.orderdetails
GROUP BY    order_id
ORDER BY    order_id;
