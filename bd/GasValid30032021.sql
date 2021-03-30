CREATE DATABASE  IF NOT EXISTS `gasvalid` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci */;
USE `gasvalid`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: gasvalid
-- ------------------------------------------------------
-- Server version	5.5.62-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tabla_clientes`
--

DROP TABLE IF EXISTS `tabla_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_clientes` (
  `idestacion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecharegistro` datetime DEFAULT NULL,
  `nombre_responsable` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `razon_social` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `registro_fedcausante` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `domicilio` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `colonia` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `ciudad` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `telefono` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `correo_electronico` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `coordenadasUTM` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `codigo_postal` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `numero_cre` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `marca_gasolina` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraMagna` int(11) DEFAULT NULL,
  `mangueraPremium` int(11) DEFAULT NULL,
  `mangueraDiesel` int(11) DEFAULT NULL,
  `estatus_maguera` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idestacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_clientes`
--

LOCK TABLES `tabla_clientes` WRITE;
/*!40000 ALTER TABLE `tabla_clientes` DISABLE KEYS */;
INSERT INTO `tabla_clientes` VALUES ('PL2020','2020-08-31 14:02:42','Alfredo Olivas','NUEVA REPUBLICA SA DE CV','NRSC2408932LA','CALLE 20 X 21 Y 25','TEOTITLAN','AMECA','Jalisco','9992052952','nr@nuevarep.com.mx','100,100,100,100','97930','10520','Pemex',3,3,3,'VIGENTE'),('PL2022','2020-09-13 10:57:27','Jose Luis Caamal Ic','GASVALID','CAIL920823','Zapopan','Miraflores','Guadalajara','Jalisco','9992059252','jose.caamal@hotmail.com','100.100.100','97930','10011','Pemex',1,1,1,'VIGENTE');
/*!40000 ALTER TABLE `tabla_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_cronometros`
--

DROP TABLE IF EXISTS `tabla_cronometros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_cronometros` (
  `id_Crono` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `marca` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `serie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estatus` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_calibracion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `resultado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `informe_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id_Crono`),
  UNIQUE KEY `id_Crono_UNIQUE` (`id_Crono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_cronometros`
--

LOCK TABLES `tabla_cronometros` WRITE;
/*!40000 ALTER TABLE `tabla_cronometros` DISABLE KEYS */;
INSERT INTO `tabla_cronometros` VALUES ('CRONO01','GATEWAY','G-05-05','G50505','VIGENTE','01-08-2020','111.11','100.01');
/*!40000 ALTER TABLE `tabla_cronometros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_datos_dictamen`
--

DROP TABLE IF EXISTS `tabla_datos_dictamen`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_datos_dictamen` (
  `idDictamen` int(11) NOT NULL AUTO_INCREMENT,
  `folio` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `noEstacion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `cadenaImprimir` longtext COLLATE utf8_spanish2_ci,
  `fecha` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `hora_inicio` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `hora_fin` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `dispensario` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idDictamen`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_datos_dictamen`
--

LOCK TABLES `tabla_datos_dictamen` WRITE;
/*!40000 ALTER TABLE `tabla_datos_dictamen` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabla_datos_dictamen` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_dispensarios`
--

DROP TABLE IF EXISTS `tabla_dispensarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_dispensarios` (
  `id_dispensario` int(11) NOT NULL AUTO_INCREMENT,
  `no_dispensario` int(11) NOT NULL,
  `numero_estacion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `marca_dispensario` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `numSerie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `alcanceMin` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `aprobacionDGN` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `alcanceMax` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraA` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraB` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraC` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraD` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraE` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraF` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_reg_disp` datetime DEFAULT NULL,
  PRIMARY KEY (`id_dispensario`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_dispensarios`
--

LOCK TABLES `tabla_dispensarios` WRITE;
/*!40000 ALTER TABLE `tabla_dispensarios` DISABLE KEYS */;
INSERT INTO `tabla_dispensarios` VALUES (8,1,'PL2020','PETROL & IMPORT','100','DP100','25','20','25','Magna','Magna','Magna','Magna','Magna','Magna','2020-08-31 14:04:30'),(9,2,'PL2020','WAYNE','','','','','','Magna','Magna','Magna','Magna','Magna','Magna','2020-08-31 14:58:01'),(10,3,'PL2020','BENNETT','N200','N200','25','20','25','Magna','Magna','Magna','Magna','Magna','Magna','2020-08-31 23:03:53'),(11,1,'PL2022','GBR','MODELO10','M1','25','PL20','25','Magna','Magna','Magna','Magna','Magna','Magna','2020-09-13 10:58:58'),(12,4,'PL2020','PETROL & IMPORT','daad','adads','dasads','dasdas','dasdas','Magna','Magna','Magna','Magna','Magna','Magna','2020-12-11 21:54:31'),(13,5,'PL2020','UNIVERSEL','xc','xc','xc','xc','xc','Magna','Magna','Magna','Magna','Magna','Magna','2020-12-11 22:00:46'),(14,6,'PL2020','WAYNE','cv','cv','cv','cv','cv','Magna','Magna','Magna','Magna','Magna','Magna','2020-12-11 22:00:54'),(15,7,'PL2020','WAYNE','PL2020','PL2020','PL2020','PL2020','PL2020','Magna','Magna','Magna','Magna','Magna','Magna','2020-12-11 22:01:10'),(16,8,'PL2020','WAYNE','PL2020','PL2020','PL2020','PL2020','PL2020','Magna','Magna','Magna','Magna','Magna','Magna','2020-12-11 22:01:24'),(17,9,'PL2020','WAYNE','PL2020','PL2020','PL2020','PL2020','PL2020','Magna','Magna','Magna','Magna','Magna','Magna','2020-12-11 22:01:33'),(18,2,'PL2022','WAYNE','SDDADA','DAAD','DADA','DAADS','DAAD','Magna','Magna','N/A','N/A','N/A','N/A','2021-01-05 12:50:38');
/*!40000 ALTER TABLE `tabla_dispensarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_jarras`
--

DROP TABLE IF EXISTS `tabla_jarras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_jarras` (
  `id_Jarra` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `marca` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `serie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estatus` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `vol_conv` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `factor_kc` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `resultado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `informe_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id_Jarra`),
  UNIQUE KEY `id_Jarra_UNIQUE` (`id_Jarra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_jarras`
--

LOCK TABLES `tabla_jarras` WRITE;
/*!40000 ALTER TABLE `tabla_jarras` DISABLE KEYS */;
INSERT INTO `tabla_jarras` VALUES ('J22020','JARRITOS','J500','9000','VIGENTE','11.20','J110','2020/08/01 13:57:57','...','110.10');
/*!40000 ALTER TABLE `tabla_jarras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_mangueras`
--

DROP TABLE IF EXISTS `tabla_mangueras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_mangueras` (
  `id_tmanguera` int(11) NOT NULL,
  `total` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `magna` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `premium` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `diesel` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_tmanguera`),
  UNIQUE KEY `id_tmanguera_UNIQUE` (`id_tmanguera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_mangueras`
--

LOCK TABLES `tabla_mangueras` WRITE;
/*!40000 ALTER TABLE `tabla_mangueras` DISABLE KEYS */;
INSERT INTO `tabla_mangueras` VALUES (1,'9','3','3','3'),(2,'6','2','2','2');
/*!40000 ALTER TABLE `tabla_mangueras` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_marca_gasolina`
--

DROP TABLE IF EXISTS `tabla_marca_gasolina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_marca_gasolina` (
  `idmarca_gasolina` int(11) NOT NULL AUTO_INCREMENT,
  `marca_gasolina` varchar(50) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idmarca_gasolina`),
  UNIQUE KEY `idmarca_gasolina_UNIQUE` (`idmarca_gasolina`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_marca_gasolina`
--

LOCK TABLES `tabla_marca_gasolina` WRITE;
/*!40000 ALTER TABLE `tabla_marca_gasolina` DISABLE KEYS */;
INSERT INTO `tabla_marca_gasolina` VALUES (1,'WAYNE'),(2,'PETROL & IMPORT'),(3,'GILBARCO'),(4,'TOKHEIM'),(5,'PEGASUS'),(6,'TEAM'),(7,'GBR'),(8,'UNIVERSEL'),(9,'WAYNE'),(10,'BENNETT'),(11,'SUPRAMAX');
/*!40000 ALTER TABLE `tabla_marca_gasolina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_registro_solicitud`
--

DROP TABLE IF EXISTS `tabla_registro_solicitud`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_registro_solicitud` (
  `folio_solicitud` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `valida_contrato` int(11) NOT NULL DEFAULT '0',
  `nombre_usuario` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `nombre_tecnico` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_propuesta` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `tipo_solicitud` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `idestacion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `total_mangueras` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `referencia` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `observaciones` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `personal` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`folio_solicitud`),
  UNIQUE KEY `folio_solicitud_UNIQUE` (`folio_solicitud`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_registro_solicitud`
--

LOCK TABLES `tabla_registro_solicitud` WRITE;
/*!40000 ALTER TABLE `tabla_registro_solicitud` DISABLE KEYS */;
INSERT INTO `tabla_registro_solicitud` VALUES ('1',1,'Jose Luis Caamal Ic',' JOSE LUIS CAAMAL IC','01-08-2020','01-08-2020','Inicial','PL2020','9','  CC','   CC',' PEDRO CHUC'),('2',0,'Jose Luis Caamal Ic',' Pedro Suarez','01-09-2020','01-09-2020','Inicial','PL2022','6','  N/A','   N/A',' Luis Sanchez');
/*!40000 ALTER TABLE `tabla_registro_solicitud` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_termometros`
--

DROP TABLE IF EXISTS `tabla_termometros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_termometros` (
  `id_Termo` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `marca` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `serie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estatus` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_calibracion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `resultado` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `informe_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id_Termo`),
  UNIQUE KEY `id_Termo_UNIQUE` (`id_Termo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_termometros`
--

LOCK TABLES `tabla_termometros` WRITE;
/*!40000 ALTER TABLE `tabla_termometros` DISABLE KEYS */;
INSERT INTO `tabla_termometros` VALUES ('T20020','TERMO','T20000','T202020','VIGENTE','01-08-2020','11.1','111.222'),('T3030','TERMO2','T3031','T3333','VIGENTE','02-09-2020','11.11','000');
/*!40000 ALTER TABLE `tabla_termometros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabla_usuarios`
--

DROP TABLE IF EXISTS `tabla_usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabla_usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fechainicio` datetime DEFAULT NULL,
  `fechafinal` datetime DEFAULT NULL,
  `nombre_completo` varchar(80) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `tipo_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nombre_usuario_UNIQUE` (`nombre_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_usuarios`
--

LOCK TABLES `tabla_usuarios` WRITE;
/*!40000 ALTER TABLE `tabla_usuarios` DISABLE KEYS */;
INSERT INTO `tabla_usuarios` VALUES (1,'jose.caamal','5f4dcc3b5aa765d61d8327deb882cf99','2020-06-01 00:00:00','2020-06-30 16:23:23','Jose Luis Caamal Ic',0),(2,'saul.ramirez','5f4dcc3b5aa765d61d8327deb882cf99','2020-06-01 00:00:00','2021-06-01 15:20:33','Saul Ramirez',1),(3,'roberto.apoyo','5f4dcc3b5aa765d61d8327deb882cf99','2020-06-07 00:00:00','2020-06-30 00:00:00','Roberto Palazuelos',2);
/*!40000 ALTER TABLE `tabla_usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tablagasvalid`
--

DROP TABLE IF EXISTS `tablagasvalid`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tablagasvalid` (
  `Holograma` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `No Solicitud` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `F_Verif` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Num Est` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Estacion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Disp` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Manguera` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Lado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Estatus` varchar(45) COLLATE utf8_spanish2_ci DEFAULT 'No asignada',
  `tipoHolograma` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`Holograma`),
  UNIQUE KEY `Holograma_UNIQUE` (`Holograma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tablagasvalid`
--

LOCK TABLES `tablagasvalid` WRITE;
/*!40000 ALTER TABLE `tablagasvalid` DISABLE KEYS */;
INSERT INTO `tablagasvalid` VALUES ('U20200210200',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','UVA'),('U20200210201',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','UVA'),('U20200210202',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','UVA'),('U20200210203',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','UVA'),('U20200210204',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','UVA'),('U20200210205',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','UVA'),('U20200220248701',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248702',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248703',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248704',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248705',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248706',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248707',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248708',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248709',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248710',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248711',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U20200220248712',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U2021023000012',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U2021023000013',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('U2021023000014',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO');
/*!40000 ALTER TABLE `tablagasvalid` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'gasvalid'
--

--
-- Dumping routines for database 'gasvalid'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-05 13:18:13
