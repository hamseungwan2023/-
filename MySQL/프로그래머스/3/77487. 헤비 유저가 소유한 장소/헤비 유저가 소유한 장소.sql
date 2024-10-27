-- 코드를 입력하세요
select a.id, a.name, a.host_id
from places a
join (select count(*) as host_count, host_id
from places
group by host_id) b on a.host_id = b.host_id
where b.host_count > 1
order by a.id