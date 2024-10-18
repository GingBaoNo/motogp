-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: motogp
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `circuits`
--

DROP TABLE IF EXISTS `circuits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `circuits` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `location` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `circuits`
--

LOCK TABLES `circuits` WRITE;
/*!40000 ALTER TABLE `circuits` DISABLE KEYS */;
INSERT INTO `circuits` VALUES (1,'Losail International Circuit','Lusail, Qatar'),(2,'Algarve International Circuit','Portimão, Portugal'),(3,'Circuit of the Americas','Austin, USA'),(4,'Circuito de Jerez','Jerez de la Frontera, Spain'),(5,'Circuit Bugatti','Le Mans, France'),(6,'Circuit de Barcelona-Catalunya','Montmeló, Catalunya'),(7,'Autodromo del Mugello','Scarperia e San Piero, Italy'),(8,'TT Circuit Assen','Assen, Netherlands'),(9,'Sachsenring','Hohenstein-Ernstthal, Germany'),(10,'Silverstone Circuit','Silverstone, UK'),(11,'Red Bull Ring','Spielberg, Austria'),(12,'Motorland Aragón','Alcañiz, Aragon'),(13,'Misano World Circuit','Misano Adriatico, San Marino'),(14,'Autodromo Internazionale del Mugello','Mugello, Italy'),(15,'Mandalika International Street Circuit','Central Lombok, Indonesia'),(16,'Twin Ring Motegi','Motegi, Japan'),(17,'Phillip Island Circuit','Phillip Island, Australia'),(18,'Chang International Circuit','Buriram, Thailand'),(19,'Sepang International Circuit','Sepang, Malaysia'),(20,'Circuit Ricardo Tormo','Valencia, Spain');
/*!40000 ALTER TABLE `circuits` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-10-02 17:10:34
