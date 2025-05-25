SELECT DATE_FORMAT(sales_date,'%Y-%m-%d') AS sales_date, product_id, user_id, sales_amount
FROM online_sale
WHERE DATE_FORMAT(sales_date,'%Y-%m') = '2022-03'
UNION
SELECT sales_Date, product_id, NULL, sales_amount
FROM offline_sale
WHERE DATE_FORMAT(sales_date,'%Y-%m') = '2022-03'
ORDER BY 1, 2, 3