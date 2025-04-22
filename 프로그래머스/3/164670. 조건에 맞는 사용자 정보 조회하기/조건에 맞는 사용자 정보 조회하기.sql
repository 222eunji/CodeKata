select 
    USER_ID,
    NICKNAME,
    concat(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2) as 전체주소,
    concat(left(TLNO,3), '-', substr(TLNO,4,4), '-', right(TLNO,4)) as 전화번호
from USED_GOODS_USER ugu
join USED_GOODS_BOARD ugb on ugu.USER_ID = ugb.WRITER_ID
group by USER_ID
having count(BOARD_ID) >= 3
order by USER_ID desc;