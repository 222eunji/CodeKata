SELECT *
FROM (SELECT c.car_id, c.car_type, ROUND(30 * c.daily_fee * (1 - d.discount_rate/100), 0) AS FEE
FROM car_rental_company_car c
JOIN car_rental_company_discount_plan d
ON c.car_type = d.car_type
WHERE c.car_type IN ('세단', 'SUV')
AND d.duration_type = '30일 이상'
AND car_id NOT IN(
SELECT car_id
FROM car_rental_company_rental_history
WHERE END_DATE >= '2022-11-01' AND START_DATE <= '2022-11-30'
)) a
WHERE fee >= 500000 AND fee <2000000
ORDER BY fee DESC, car_type, car_id DESC
    
# 자동차 종류 세단 또는 SUV
# 2022년 11월 1일 ~ 2022년 11월 30일까지 대여 가능
# 30일간의 대여 금액이 50만원 이상 200만원 미만인 자동차
# 에 대해 자동차ID, 자동차 종류, 대여 금액(컬럼명: FEE) 리스트를 출력하는 SQL문 작성
# 대여금액을 기준으로 DESC, 자동차 종류 기준 ASC , 자동차 ID 기준 DESC
