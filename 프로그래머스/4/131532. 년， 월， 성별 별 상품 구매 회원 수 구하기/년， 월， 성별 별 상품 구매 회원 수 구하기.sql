SELECT YEAR(s.sales_date) AS 'YEAR',
       MONTH(s.sales_date) AS 'MONTH',
       u.gender,
       COUNT(DISTINCT s.user_id) AS 'USERS'
FROM online_sale s LEFT JOIN user_info u ON s.user_id = u.user_id
WHERE u.gender IS NOT NULL
GROUP BY YEAR(s.sales_date), MONTH(s.sales_date), u.gender
ORDER BY YEAR(s.sales_date), MONTH(s.sales_date), u.gender