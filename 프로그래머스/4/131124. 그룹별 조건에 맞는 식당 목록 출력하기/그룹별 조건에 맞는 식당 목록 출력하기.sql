SELECT MEMBER_NAME, REVIEW_TEXT, DATE_FORMAT(REVIEW_DATE, "%Y-%m-%d") AS REVIEW_DATE
FROM rest_review r LEFT JOIN member_profile m ON r.member_id = m.member_id 
WHERE r.member_id = (
        SELECT member_id
        FROM rest_review
        GROUP BY member_id
        ORDER BY COUNT(review_id) DESC LIMIT 1
    )
ORDER BY review_date, review_text
    