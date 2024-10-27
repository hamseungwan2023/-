-- 코드를 입력하세요
SELECT c.car_id
from CAR_RENTAL_COMPANY_CAR c
join CAR_RENTAL_COMPANY_RENTAL_HISTORY ch on c.car_id = ch.car_id
where date_format(ch.start_date, '%m') = 10 and c.car_type = '세단'
group by c.car_id
order by c.car_id desc