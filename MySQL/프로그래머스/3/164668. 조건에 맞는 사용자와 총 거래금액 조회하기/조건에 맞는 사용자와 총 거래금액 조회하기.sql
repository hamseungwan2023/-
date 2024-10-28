-- 코드를 입력하세요
SELECT ugu.user_id,ugu.nickname,ugb.total_price as total_sales
from USED_GOODS_USER ugu
join (select sum(price) as total_price, writer_id
    from USED_GOODS_BOARD
    where status = 'DONE'
    group by writer_id
) ugb on ugu.user_id = ugb.writer_id
where ugb.total_price >= 700000
order by ugb.total_price asc

