-- 코드를 작성해주세요
select ii.item_id, ii.item_name, ii.rarity
from item_info ii
left join item_tree it on ii.item_id = it.parent_item_id
where it.parent_item_id is null
order by ii.item_id desc