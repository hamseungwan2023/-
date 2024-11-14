-- 코드를 입력하세요
SELECT ugu.user_id,
ugu.nickname,
concat(ugu.city, ' ',ugu.street_address1,' ', ugu.street_address2) as 전체주소,
concat(substr(ugu.tlno,1,3),'-',substr(ugu.tlno,4,4),'-',substr(ugu.tlno,8,4)) as 전화번호
from used_goods_user ugu
join (select count(*) as user_count, writer_id
     from used_goods_board
     group by writer_id
     having count(*) >= 3) ugb on ugu.user_id = ugb.writer_id
order by ugu.user_id desc