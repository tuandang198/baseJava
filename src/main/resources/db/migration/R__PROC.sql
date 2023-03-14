-- ${flyway:timestamp}
DROP TABLE IF EXISTS student_kk;
CREATE TABLE student_kk
(
    id   INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100) DEFAULT NULL,
    PRIMARY KEY (id)
);
