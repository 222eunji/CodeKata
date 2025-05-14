SELECT a.author_id, a.author_name, b.category, sum(s.sales * b.price) AS 'TOTAL_SALES'
FROM book_sales s JOIN book b ON s.book_id = b.book_id
                  JOIN author a ON b.author_id = a.author_id
WHERE YEAR(s.sales_date) = 2022 AND MONTH(s.sales_date) = 1
GROUP BY a.author_name, b.category
ORDER BY a.author_id, b.category DESC
