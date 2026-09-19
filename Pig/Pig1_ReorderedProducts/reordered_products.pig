products = LOAD '/InstacartProject/input/order_products__prior.csv'
USING PigStorage(',')
AS (
order_id:int,
product_id:int,
add_to_cart_order:int,
reordered:int
);

reordered_products = FILTER products BY reordered == 1;

STORE reordered_products
INTO '/InstacartProject/output/Pig1_ReorderedProducts'
USING PigStorage(',');