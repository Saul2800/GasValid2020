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
  `idestacion` int(11) NOT NULL AUTO_INCREMENT,
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_clientes`
--

LOCK TABLES `tabla_clientes` WRITE;
/*!40000 ALTER TABLE `tabla_clientes` DISABLE KEYS */;
INSERT INTO `tabla_clientes` VALUES (1,'2020-07-15 20:10:35','prueba','prueba','prueba','conocido','prueba','Merida','Jalisco','9992059252','jose.caamal','odkjalkdasljk','99','99','Pemex',1,1,1,'VIGENTE');
/*!40000 ALTER TABLE `tabla_clientes` ENABLE KEYS */;
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
  `Holograma` varchar(45) NOT NULL,
  `No Solicitud` varchar(45) DEFAULT NULL,
  `F_Verif` varchar(45) DEFAULT NULL,
  `Num Est` varchar(45) DEFAULT NULL,
  `Estacion` varchar(45) DEFAULT NULL,
  `Disp` varchar(45) DEFAULT NULL,
  `Modelo` varchar(45) DEFAULT NULL,
  `Manguera` varchar(45) DEFAULT NULL,
  `Lado` varchar(45) DEFAULT NULL,
  `Estatus` varchar(45) DEFAULT 'No asignada',
  `tipoHolograma` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`Holograma`),
  UNIQUE KEY `Holograma_UNIQUE` (`Holograma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tablagasvalid`
--

LOCK TABLES `tablagasvalid` WRITE;
/*!40000 ALTER TABLE `tablagasvalid` DISABLE KEYS */;
INSERT INTO `tablagasvalid` VALUES ('A202002100000123',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('A202002100000124',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('A202002100000125',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('F202102200021',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada','PROFECO'),('P20200210000100',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada',NULL),('P20200210000101',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada',NULL),('P20200210000102',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'No asignada',NULL);
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

-- Dump completed on 2020-07-16 13:19:21
