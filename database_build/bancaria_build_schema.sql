-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bancariadb
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `agencia`
--

DROP TABLE IF EXISTS `agencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agencia` (
  `id` int NOT NULL,
  `nombre_punto` varchar(45) NOT NULL COMMENT 'El nombre de la sucursal',
  `direccion` varchar(45) NOT NULL COMMENT 'La direccion de la sucursal. Ojala se encuentre en formato <direccion catastral, ciudad, departamento>',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agencia`
--

LOCK TABLES `agencia` WRITE;
/*!40000 ALTER TABLE `agencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `agencia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empleado` (
  `id` int NOT NULL,
  `numID` varchar(45) NOT NULL COMMENT 'Formato: TipoDocNumeroID\nEJ: CC1075680601',
  `nombres` varchar(45) NOT NULL,
  `apellidos` varchar(45) NOT NULL,
  `ciudad_residencia` varchar(45) NOT NULL COMMENT 'Formato: <Direccion Catastral, Ciudad, Departamento>',
  `cargo` varchar(45) NOT NULL,
  `salario` decimal(2,0) NOT NULL,
  `tipo_contrato` int NOT NULL COMMENT '0 -> Indefinido\n1 -> Término Fijo\n2 -> Prestación de Servicios',
  `cod_empleado` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `BelongsAgencia_FK` FOREIGN KEY (`id`) REFERENCES `agencia` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleado`
--

LOCK TABLES `empleado` WRITE;
/*!40000 ALTER TABLE `empleado` DISABLE KEYS */;
/*!40000 ALTER TABLE `empleado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prestamo`
--

DROP TABLE IF EXISTS `prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prestamo` (
  `id` int NOT NULL,
  `num_prestamo` int NOT NULL,
  `valor` decimal(2,0) NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `BelongsEmpleado` FOREIGN KEY (`id`) REFERENCES `empleado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prestamo`
--

LOCK TABLES `prestamo` WRITE;
/*!40000 ALTER TABLE `prestamo` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestamo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tituloacademico`
--

DROP TABLE IF EXISTS `tituloacademico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tituloacademico` (
  `id` int NOT NULL,
  `tipo_titulo` varchar(45) NOT NULL,
  `nombre_titulo` varchar(45) NOT NULL,
  `fecha_expedicion` date DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `BelongsEmpleado_FK` FOREIGN KEY (`id`) REFERENCES `empleado` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tituloacademico`
--

LOCK TABLES `tituloacademico` WRITE;
/*!40000 ALTER TABLE `tituloacademico` DISABLE KEYS */;
/*!40000 ALTER TABLE `tituloacademico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'bancariadb'
--

--
-- Dumping routines for database 'bancariadb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-16 15:35:17
