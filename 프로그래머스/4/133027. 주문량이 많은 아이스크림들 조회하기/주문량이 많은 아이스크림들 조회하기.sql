SELECT flavor
FROM (SELECT flavor, total_order FROM first_half
      UNION
      SELECT flavor, total_order FROM JULY) a
GROUP BY a.flavor
ORDER BY SUM(a.total_order) DESC LIMIT 3