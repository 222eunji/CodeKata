SELECT car_id, ROUND(AVG(a.rental_period),1) AS 'AVERAGE_DURATION'
FROM (
SELECT history_id, car_id, DATEDIFF(end_date, start_date) + 1 AS 'rental_period'
FROM car_rental_company_rental_history
) a
GROUP BY car_id
HAVING AVG(a.rental_period) >= 7
ORDER BY 2 DESC, 1 DESC