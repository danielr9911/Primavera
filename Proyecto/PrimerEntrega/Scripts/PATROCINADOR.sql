--------------------------------------------------------
-- Archivo creado  - domingo-abril-03-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PATROCINADOR
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."PATROCINADOR" 
   (	"ID_PATROCINADOR" NUMBER(15,0), 
	"NOMBRE" VARCHAR2(30 BYTE), 
	"TELEFONO" VARCHAR2(15 BYTE), 
	"CORREO" VARCHAR2(30 BYTE), 
	"ESTADO" VARCHAR2(15 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "SYSTEM"."PATROCINADOR"."ID_PATROCINADOR" IS 'N�mero �nico que identifica un patrocinador de otro. ';
   COMMENT ON COLUMN "SYSTEM"."PATROCINADOR"."NOMBRE" IS 'Nombre de la empresa. ';
   COMMENT ON COLUMN "SYSTEM"."PATROCINADOR"."TELEFONO" IS 'Tel�fono de la empresa. ';
   COMMENT ON COLUMN "SYSTEM"."PATROCINADOR"."CORREO" IS 'Correo electr�nico de la empresa. ';
   COMMENT ON COLUMN "SYSTEM"."PATROCINADOR"."ESTADO" IS 'Estado del patrocinador. Puede tomar los siguientes valores: activo o inactivo. ';
--------------------------------------------------------
--  DDL for Index PATROCINADOR_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."PATROCINADOR_PK" ON "SYSTEM"."PATROCINADOR" ("ID_PATROCINADOR") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table PATROCINADOR
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."PATROCINADOR" ADD CONSTRAINT "PATROCINADOR_CHK_ESTADO" CHECK (ESTADO IN ('ACTIVO', 'INACTIVO')) ENABLE;
  ALTER TABLE "SYSTEM"."PATROCINADOR" ADD CONSTRAINT "PATROCINADOR_PK" PRIMARY KEY ("ID_PATROCINADOR")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."PATROCINADOR" MODIFY ("ESTADO" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."PATROCINADOR" MODIFY ("CORREO" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."PATROCINADOR" MODIFY ("TELEFONO" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."PATROCINADOR" MODIFY ("NOMBRE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."PATROCINADOR" MODIFY ("ID_PATROCINADOR" NOT NULL ENABLE);
