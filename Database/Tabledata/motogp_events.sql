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
-- Table structure for table `events`
--

DROP TABLE IF EXISTS `events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `events` (
  `id` int NOT NULL AUTO_INCREMENT,
  `event_name` varchar(255) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `circuit_id` int DEFAULT NULL,
  `sponsor` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `circuit_id` (`circuit_id`),
  CONSTRAINT `events_ibfk_1` FOREIGN KEY (`circuit_id`) REFERENCES `circuits` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events`
--

LOCK TABLES `events` WRITE;
/*!40000 ALTER TABLE `events` DISABLE KEYS */;
INSERT INTO `events` VALUES (1,'Qatar MotoGP','2024-03-10','2024-03-10',1,NULL),(2,'Portugal MotoGP','2024-03-24','2024-03-24',2,NULL),(3,'Americas MotoGP','2024-04-14','2024-04-14',3,NULL),(4,'Spain MotoGP','2024-04-28','2024-04-28',4,NULL),(5,'France MotoGP','2024-05-12','2024-05-12',5,NULL),(6,'Catalunya MotoGP','2024-05-26','2024-05-26',6,NULL),(7,'Italy MotoGP','2024-06-02','2024-06-02',7,NULL),(8,'TT Assen','2024-06-30','2024-06-30',8,NULL),(9,'Germany MotoGP','2024-07-07','2024-07-07',9,NULL),(10,'UK MotoGP','2024-08-04','2024-08-04',10,NULL),(11,'Austria MotoGP','2024-08-18','2024-08-18',11,NULL),(12,'Aragon MotoGP','2024-09-01','2024-09-01',12,NULL),(13,'San Marino MotoGP','2024-09-08','2024-09-08',13,NULL),(14,'Emilia-Romagna MotoGP','2024-09-22','2024-09-22',14,NULL),(15,'Indonesia MotoGP','2024-09-29','2024-09-29',15,NULL),(16,'Japan MotoGP','2024-10-06','2024-10-06',16,NULL),(17,'Australia MotoGP','2024-10-20','2024-10-20',17,NULL),(18,'Thailand MotoGP','2024-10-27','2024-10-27',18,NULL),(19,'Malaysia MotoGP','2024-11-03','2024-11-03',19,NULL),(20,'Valencia MotoGP','2024-11-17','2024-11-17',20,NULL);
/*!40000 ALTER TABLE `events` ENABLE KEYS */;
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
