CREATE TABLE IF NOT EXISTS test.products(
    id SERIAL primary key,
    c_name VARCHAR(100) NOT NULL,
    c_category VARCHAR(50) NOT NULL,
    c_price INTEGER NOT NULL
)