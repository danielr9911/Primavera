--------------------------------------------------------
-- Archivo creado  - domingo-abril-03-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table DONACION_MATERIAL
--------------------------------------------------------

  CREATE TABLE "SYSTEM"."DONACION_MATERIAL" 
   (	"ID_MATERIAL" NUMBER(15,0), 
	"ID_PATROCINADOR" NUMBER(15,0), 
	"ID_SUBSISTEMA" NUMBER(15,0), 
	"NOMBRE" VARCHAR2(30 BYTE), 
	"CANTIDAD" NUMBER(6,0)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;

   COMMENT ON COLUMN "SYSTEM"."DONACION_MATERIAL"."ID_MATERIAL" IS 'N�mero �nico que identifica cada donaci�n de material. ';
   COMMENT ON COLUMN "SYSTEM"."DONACION_MATERIAL"."ID_PATROCINADOR" IS 'N�mero �nico que identifica un patrocinador de otro. ';
   COMMENT ON COLUMN "SYSTEM"."DONACION_MATERIAL"."ID_SUBSISTEMA" IS 'N�mero que identifica un subsitema de otro dentro del proyecto. ';
   COMMENT ON COLUMN "SYSTEM"."DONACION_MATERIAL"."NOMBRE" IS 'Nombre del material o herramienta donada. ';
   COMMENT ON COLUMN "SYSTEM"."DONACION_MATERIAL"."CANTIDAD" IS 'N�mero de piezas donadas. ';
--------------------------------------------------------
--  DDL for Index DONACION_MATERIAL_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SYSTEM"."DONACION_MATERIAL_PK" ON "SYSTEM"."DONACION_MATERIAL" ("ID_MATERIAL") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table DONACION_MATERIAL
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" ADD CONSTRAINT "DONACION_MATERIAL_PK" PRIMARY KEY ("ID_MATERIAL")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" MODIFY ("CANTIDAD" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" MODIFY ("NOMBRE" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" MODIFY ("ID_SUBSISTEMA" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" MODIFY ("ID_PATROCINADOR" NOT NULL ENABLE);
  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" MODIFY ("ID_MATERIAL" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table DONACION_MATERIAL
--------------------------------------------------------

  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" ADD CONSTRAINT "DONACION_MATERIAL_FK1" FOREIGN KEY ("ID_PATROCINADOR")
	  REFERENCES "SYSTEM"."PATROCINADOR" ("ID_PATROCINADOR") ENABLE;
  ALTER TABLE "SYSTEM"."DONACION_MATERIAL" ADD CONSTRAINT "DONACION_MATERIAL_FK2" FOREIGN KEY ("ID_SUBSISTEMA")
	  REFERENCES "SYSTEM"."SUBSISTEMA" ("ID_SUBSISTEMA") ENABLE;
