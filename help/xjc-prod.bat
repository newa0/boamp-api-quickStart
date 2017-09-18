@echo off

SET xjc="C:\_dev\Java\jdk1.8.0_91\bin\xjc"
%xjc%

ECHO ---- INITIALISATION LES VARIABLES -----
SET PATH_PROJ="C:\Users\pe1512za\Documents\Atelier\Boamp-api-QuickStart"

SET	xsd_Boamp_v010=  "http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v010.xsd"
SET	xsd_Boamp_v111=  "http://schemas.journal-officiel.gouv.fr/schemabook/boamp/api/Boamp_api_v111.xsd"
SET	xsd_Boamp_v230=  "http://schemas.journal-officiel.gouv.fr/schemabook/boamp/Boamp_v230.xsd"

ECHO ----------------------------------
cd    %PATH_PROJ%
%xjc% %xsd_Boamp_v010%  -d src/main/gen  -p fr.gouv.api.Boamp_v010  -no-header  -readOnly  -encoding UTF-8
%xjc% %xsd_Boamp_v111%  -d src/main/gen  -p fr.gouv.api.Boamp_v111  -no-header  -readOnly  -encoding UTF-8
%xjc% %xsd_Boamp_v230%  -d src/main/gen  -p fr.gouv.api.Boamp_v230  -no-header  -readOnly  -encoding UTF-8

ECHO ----------------------------------

pause