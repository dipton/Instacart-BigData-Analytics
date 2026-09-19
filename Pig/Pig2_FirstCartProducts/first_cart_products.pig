products = LOAD '/InstacartProject/input/order_products__prior.csv'
USING PigStorage(',')
AS (
order_id:int,
product_id:int,
add_to_cart_order:int,
reordered:int
);

first_products = FILTER products BY add_to_cart_order == 1;

STORE first_products
INTO '/InstacartProject/output/Pig2_FirstCartProducts'
USING PigStorage(',');