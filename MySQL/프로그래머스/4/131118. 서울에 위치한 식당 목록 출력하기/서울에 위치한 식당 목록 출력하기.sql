-- 코드를 입력하세요
SELECT ri.rest_id, ri.rest_name, ri.food_type, ri.favorites, ri.address, ROUND(avg(rr.review_score),2) as score
from rest_info ri
join rest_review rr on ri.rest_id = rr.rest_id
where ri.address like '서울%'
group by ri.rest_name
order by score desc, favorites desc