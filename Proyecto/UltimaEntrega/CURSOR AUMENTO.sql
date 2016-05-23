--------------------------------------------------------
-- Archivo creado  - domingo-mayo-22-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure AUMENTO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "SYSTEM"."AUMENTO" 
(
  cantidad IN NUMBER
)
AS 
  CURSOR CURS_AUM 
  IS
  SELECT PERSONAL.SALARIO_PERS 
  FROM PERSONAL
  WHERE PERSONAL.SALARIO_PERS > 0
  FOR UPDATE;
  salario NUMBER(8);
BEGIN
  OPEN CURS_AUM;
  FETCH CURS_AUM INTO salario;
  WHILE CURS_AUM%found
  LOOP 
	UPDATE PERSONAL 
        SET SALARIO_PERS = salario+cantidad
        WHERE CURRENT OF CURS_AUM;

        FETCH CURS_AUM INTO salario;
    END LOOP; 
  CLOSE CURS_AUM;
  
END AUMENTO;

/
