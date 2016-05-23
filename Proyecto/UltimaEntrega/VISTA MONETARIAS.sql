--------------------------------------------------------
-- Archivo creado  - domingo-mayo-22-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for View VISTA_MONETARIAS
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "SYSTEM"."VISTA_MONETARIAS" ("ID_MONETARIA", "NOMBRE_PATR", "NOMBRE_CARRO", "CANTIDAD_COP", "FECHA_MONE") AS 
  select donacion_monetaria.id_monetaria, Patrocinador.nombre_patr, Carrosolar.nombre_carro, Donacion_monetaria.cantidad_cop, Donacion_monetaria.fecha_mone
from DONACION_MONETARIA, CARROSOLAR, PATROCINADOR
Where DONACION_MONETARIA.ID_CARRO = CARROSOLAR.ID_CARRO
AND DONACION_MONETARIA.ID_PATROCINADOR = PATROCINADOR.ID_PATROCINADOR;
