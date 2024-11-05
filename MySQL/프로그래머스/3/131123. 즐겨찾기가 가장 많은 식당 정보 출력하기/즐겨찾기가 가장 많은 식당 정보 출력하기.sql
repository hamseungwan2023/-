# -- 코드를 입력하세요
SELECT a.food_type, a.rest_id, a.rest_name, a.favorites
from rest_info a 
where (a.food_type, a.favorites) in (select food_type, max(favorites)
     from rest_info
     group by food_type)

order by a.food_type desc
