--------------------------------------------------------
-- Archivo creado  - domingo-mayo-22-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Procedure UPDATE_CARRO
--------------------------------------------------------
set define off;

  CREATE OR REPLACE PROCEDURE "SYSTEM"."UPDATE_CARRO" 
(
  NOMBRE IN VARCHAR2 
, ID IN NUMBER
) AS 
BEGIN
  UPDATE CARROSOLAR SET NOMBRE_CARRO = NOMBRE WHERE ID_CARRO = ID;
  COMMIT;
END UPDATE_CARRO;

/
