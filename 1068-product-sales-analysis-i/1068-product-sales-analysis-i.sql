# Write your MySQL query statement below
SELECT  PRODUCT.product_name, SALES.year, sALES.price 
FROM Sales 
LEFT JOIN Product 
ON SALES.product_id = PRODUCT.product_id