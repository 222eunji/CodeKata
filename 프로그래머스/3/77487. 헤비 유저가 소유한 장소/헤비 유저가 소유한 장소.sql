SELECT p.ID, p.NAME, p.HOST_ID
FROM places p JOIN 
    (SELECT host_id
      FROM places
      GROUP BY host_id
      HAVING count(id) >= 2) i ON p.HOST_ID = i.HOST_ID
ORDER BY p.ID