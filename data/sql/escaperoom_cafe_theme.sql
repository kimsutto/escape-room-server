-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: 220.149.235.230    Database: escaperoom
-- ------------------------------------------------------
-- Server version	5.7.31-0ubuntu0.16.04.1

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
-- Table structure for table `cafe_theme`
--

DROP TABLE IF EXISTS `cafe_theme`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cafe_theme` (
  `cafe_id` int(11) NOT NULL,
  `theme_id` int(11) NOT NULL,
  PRIMARY KEY (`cafe_id`,`theme_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cafe_theme`
--

LOCK TABLES `cafe_theme` WRITE;
/*!40000 ALTER TABLE `cafe_theme` DISABLE KEYS */;
INSERT INTO `cafe_theme` VALUES (1,1),(1,2),(1,3),(1,4),(1,5),(1,6),(2,7),(2,8),(2,9),(2,10),(2,11),(2,12),(2,13),(3,14),(3,15),(3,16),(3,17),(4,18),(4,19),(4,20),(4,21),(4,22),(4,23),(5,24),(5,25),(5,26),(5,27),(5,28),(6,29),(6,30),(6,31),(6,32),(6,33),(6,34),(7,35),(7,36),(7,37),(7,38),(7,39),(7,40),(7,41),(7,42),(7,43),(7,44),(7,45),(8,46),(8,47),(8,48),(9,49),(9,50),(9,51),(9,52),(9,53),(9,54),(10,55),(10,56),(10,57),(10,58),(10,59),(10,60),(11,61),(11,62),(11,63),(11,64),(11,65),(11,66),(12,67),(12,68),(12,69),(12,70),(13,71),(13,72),(13,73),(13,74),(13,75),(14,76),(14,77),(14,78),(14,79),(14,80),(14,81),(14,82),(14,83),(14,84),(15,85),(15,86),(15,87),(15,88),(15,89),(15,90),(16,91),(16,92),(16,93),(16,94),(16,95),(16,96),(16,97),(17,98),(18,99),(18,100),(18,101),(19,102),(19,103),(19,104),(19,105),(20,106),(20,107),(20,108),(21,109),(21,110),(21,111),(21,112),(21,113),(22,114),(22,115),(22,116),(22,117),(22,118),(22,119),(23,120),(23,121),(24,122),(24,123),(24,124),(25,125),(25,126),(25,127),(25,128),(26,129),(26,130),(26,131),(26,132),(26,133),(26,134),(26,135),(26,136),(26,137),(26,138),(26,139),(26,140),(26,141),(26,142),(26,143),(27,144),(27,145),(27,146),(27,147),(27,148),(28,149),(28,150),(28,151),(28,152),(28,153),(29,154),(29,155),(29,156),(29,157),(29,158),(29,159),(30,160),(30,161),(30,162),(30,163),(30,164),(30,165),(31,166),(31,167),(31,168),(31,169),(31,170),(31,171),(31,172),(32,173),(32,174),(32,175),(32,176),(32,177),(32,178),(33,179),(33,180),(33,181),(34,182),(34,183),(34,184),(34,185);
/*!40000 ALTER TABLE `cafe_theme` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-19 10:06:16
