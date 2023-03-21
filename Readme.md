# Docker Spring Boot and MySQL base

## Flyway Mysql Repeatable Procedure format

```
-- ${flyway:timestamp}
DROP PROCEDURE IF EXISTS sp_GetMovies;
DELIMITER $$
CREATE PROCEDURE sp_GetMovies()
BEGIN
SELECT * FROM movies;
END$$

DELIMITER ;
```

*****

## Docker for development env

Run mysql:

```bash
docker run --name my-mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=my-secret-pw -d mysql
```

Run jenkins:

```bash
docker run -p 49001:8080 -t jenkins/jenkins
```

Run gitlab:

```bash
docker run -d --name local-gitlab --restart always -p 80:80 gitlab/gitlab-ce
```