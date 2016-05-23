--------------------------------------------------------
-- Archivo creado  - domingo-mayo-22-2016   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for View VISTA_MATERIALES
--------------------------------------------------------

  CREATE OR REPLACE FORCE VIEW "SYSTEM"."VISTA_MATERIALES" ("ID_DONMATERIAL", "NOMBRE_MATERIAL", "CANTIDAD_MAT", "NOMBRE_SUBS", "FECHA_DONMAT") AS 
  select Donacion_material.ID_DONMATERIAL, Material.nombre_material,Donacion_material.cantidad_mat,Subsistema.nombre_subs, Donacion_material.fecha_donmat 
from Donacion_material, Material, subsistema 
Where Donacion_material.ID_DONMATERIAL = Material.ID_MATERIAL 
AND Donacion_material.ID_SUBSISTEMA = subsistema.ID_SUBSISTEMA;
