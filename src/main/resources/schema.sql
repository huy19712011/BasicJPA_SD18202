-- CREATE TABLE course (
--     id BIGINT NOT NULL,
--     name VARCHAR(255) NOT NULL,
--     author VARCHAR(255) NOT NULL,
--     PRIMARY KEY (id)
-- );
--
-- INSERT INTO course(id, name, author)
-- VALUES
--     (1, 'Java', 'FPoly'),
--     (2, 'Spring', 'FPoly');
SELECT 'file .sql khong bi rong';

INSERT INTO shipping_address(id, city)
VALUES
    (1001, 'Hanoi');

INSERT INTO customer(id, name, fk_shipping_address)
VALUES
    (1, 'Customer 1', 1001);