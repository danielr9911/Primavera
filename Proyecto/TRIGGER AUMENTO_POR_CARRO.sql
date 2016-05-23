--------------------------------------------------------
-- Archivo creado  - domingo-mayo-22-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Trigger AUMENTO_POR_CARRO
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "SYSTEM"."AUMENTO_POR_CARRO" 
AFTER INSERT ON CARROSOLAR 
FOR EACH ROW 
BEGIN
  AUMENTO('100');
END;
/
ALTER TRIGGER "SYSTEM"."AUMENTO_POR_CARRO" ENABLE;
