CREATE SCHEMA IF NOT EXISTS test;

CREATE TABLE IF NOT EXISTS test.users(
    id SERIAL primary key,
    c_name VARCHAR(50) NOT NULL,
    c_age INTEGER NOT NULL CHECK( c_age < 100),
    с_city VARCHAR(168)
);


