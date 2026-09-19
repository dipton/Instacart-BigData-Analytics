products = LOAD '/InstacartProject/input/order_products__prior.csv'
USING PigStorage(',')
AS (
order_id:int,
product_id:int,
add_to_cart_order:int,
reordered:int
);

grp = GROUP products BY product_id;

cnt = FOREACH grp GENERATE group AS product_id, COUNT(products) AS total_purchases;

ordered = ORDER cnt BY total_purchases DESC;

STORE ordered
INTO '/InstacartProject/output/Pig3_TopPurchasedProducts'
USING PigStorage(',');