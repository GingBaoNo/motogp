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
-- Table structure for table `riders`
--

DROP TABLE IF EXISTS `riders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `riders` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `country` varchar(255) NOT NULL,
  `team_id` int DEFAULT NULL,
  `rider_number` int NOT NULL,
  `imgUrl` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `team_id` (`team_id`),
  CONSTRAINT `riders_ibfk_1` FOREIGN KEY (`team_id`) REFERENCES `teams` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `riders`
--

LOCK TABLES `riders` WRITE;
/*!40000 ALTER TABLE `riders` DISABLE KEYS */;
INSERT INTO `riders` VALUES (1,'Jorge Martin','Spain',1,89,'89-Jorge-Martin-Official-Rider_DSC9358.png (600×400) (pulselive.com)'),(2,'Franco Morbidelli','Italy',1,21,'21-Franco-Morbidelli-Official-Rider_DSC9540.png (600×400) (pulselive.com)'),(3,'Francesco Bagnaia','Italy',2,63,'Francesco Bagnaia	https://resources.motogp.pulselive.com/photo-resources/2024/02/19/3a568eee-1e12-4091-b120-f53c71cbe8f6/rider-bio_francescobagnaia.png?height=700&width=900'),(4,'Enea Bastianini','Italy',2,23,'Enea Bastianini	rider-bio_eneabastianini.png (600×400) (pulselive.com)'),(5,'Marco Bezzecchi','Italy',3,73,'rider-bio_marcobezzecchi.png (600×400) (pulselive.com)'),(6,'Fabio di Giannantonio','Italy',3,49,'rider-bio_fabiodigiannantonio.png (600×400) (pulselive.com)'),(7,'Brad Binder','South Africa',4,33,'rider-bio_bradbinder.png (600×400) (pulselive.com)'),(8,'Jack Miller','Australia',4,43,'rider-bio_jackmiller.png (600×400) (pulselive.com)'),(9,'Aleix Espargaro','Spain',5,41,'rider-bio_aleixespargaro.png (600×400) (pulselive.com)'),(10,'Maverick Vinales','Spain',5,12,'https://resources.motogp.pulselive.com/photo-resources/2024/02/19/5cc9bb88-4d65-4498-9808-f36bde7936f1/rider-bio_maverickvin-ales.png?height=400&width=600'),(11,'Alex Marquez','Spain',6,73,'rider-bio_alexmarquez.png (600×400) (pulselive.com)'),(12,'Marc Marquez','Spain',6,93,'93_Marc_MarquezFullbodyGresini.png (600×400) (pulselive.com)'),(13,'Fabio Quartararo','France',7,20,'rider-bio_fabioquartararo.png (600×400) (pulselive.com)'),(14,'Alex Rins','Spain',7,42,'rider-bio_alexrins.png (600×400) (pulselive.com)'),(15,'Joan Mir','Spain',8,36,'rider-bio_joanmir.png (600×400) (pulselive.com)'),(16,'Luca Marini','Italy',8,10,'https://resources.motogp.pulselive.com/photo-resources/2024/02/19/3a49cbe4-f2a9-4eb5-8e75-08b5387e6dea/rider-bio_lucamarini.png?height=400&width=600'),(17,'Takaaki Nakagami','Japan',9,30,'rider-bio_takaakinakagami.png (600×400) (pulselive.com)'),(18,'Johann Zarco','France',9,5,'https://resources.motogp.pulselive.com/photo-resources/2024/02/19/804f0106-d53b-4052-bbd4-23e41f093ae6/rider-bio_johannzarco.png?height=400&width=600'),(19,'Augusto Fernandez','Spain',10,37,'rider-bio_augustofernandez.png (600×400) (pulselive.com)'),(20,'Pedro Acosta','Spain',10,51,'Jo8FzsJQ.png (600×400) (pulselive.com)'),(21,'Miguel Oliveira','Portugal',11,88,'88-Miguel-Oliveira-MotoGP_rider.png (600×400) (pulselive.com)'),(22,'Raul Fernandez','Spain',11,25,'25-Raul-Fernandez-MotoGPrider.png (600×400) (pulselive.com)');
/*!40000 ALTER TABLE `riders` ENABLE KEYS */;
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
