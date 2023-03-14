-- ${flyway:timestamp}
DELIMITER //
DROP PROCEDURE IF EXISTS sp_student;

CREATE
    DEFINER = `root`@`localhost` PROCEDURE sp_student(
    IN P_PAGE_BEGIN INT
, IN P_PAGE_END INT
)
BEGIN

    SELECT *
    FROM (SELECT ROW_NUMBER() OVER (ORDER BY ID) AS INTROW,
                 ST.*
          FROM ele_hrm_db.student ST) S
    WHERE S.INTROW BETWEEN P_PAGE_BEGIN AND P_PAGE_END;
END;
//
DELIMITER ;
# DROP PROCEDURE IF EXISTS reproduceError;
# DELIMITER //
# CREATE PROCEDURE reproduceError()
# BEGIN
#     SELECT 1;
# END //
# DELIMITER ;
# CALL reproduceError();
# DROP PROCEDURE IF EXISTS reproduceError;