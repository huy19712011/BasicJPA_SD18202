CREATE TABLE course (
    id BIGINT NOT NULL,
    name VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO course(id, name, author)
VALUES
    (1, 'Java', 'FPoly'),
    (2, 'Spring', 'FPoly');