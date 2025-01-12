# -- 코드를 입력하세요
SELECT sub.category, sub.total_sales
from (select b.category, sum(sales) as total_sales
     from book_sales bs
     join book b on bs.book_id = b.book_id
     where bs.sales_date >= '2022-01-01' and bs.sales_date < '2022-02-01'
     group by b.category) sub
    
order by sub.category asc;

# select b.category, count(bs.sales) as total_sales
# from book_sales bs
# join book b on bs.book_id = b.book_id
# where bs.sales_date >= '2022-01-01' and bs.sales_date < '2022-02-01'
# group by b.category
# order by b.category asc