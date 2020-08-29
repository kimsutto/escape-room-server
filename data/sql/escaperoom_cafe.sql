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
-- Table structure for table `cafe`
--

DROP TABLE IF EXISTS `cafe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cafe` (
  `cafe_id` int(11) NOT NULL AUTO_INCREMENT,
  `cafe_name` varchar(255) NOT NULL,
  `area` varchar(50) NOT NULL,
  `address` varchar(255) NOT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `url` varchar(255) NOT NULL,
  `phone_num` varchar(50) DEFAULT NULL,
  `logo` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cafe_id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cafe`
--

LOCK TABLES `cafe` WRITE;
/*!40000 ALTER TABLE `cafe` DISABLE KEYS */;
INSERT INTO `cafe` VALUES (1,'비밀의 화원','혜화','서울특별시 종로구 이화동 대학로 130 지하 1층',37.582964,127.002157,'http://www.secretgardenescape.com','02-765-8899','images/logo/1.png'),(2,'이스케이퍼스 1호점','홍대','서울특별시 마포구 연희로1길 7',37.560173,126.926114,'http://www.escapers.co.kr','010-5594-5216','images/logo/2.png'),(3,'이스케이퍼스 2호점','홍대','서울특별시 마포구 서교동 와우산로17길 19-24 지하 1층',37.549356,126.921301,'http://www.escapers.co.kr','010-6672-5216 ','images/logo/3.png'),(4,'엑스케이프 홍대점','홍대','서울특별시 마포구 서교동 369-4번지 호곡빌딩 7층',37.552613,126.921395,'http://xcapehd.co.kr','02-336-0502','images/logo/4.jpg'),(5,'뉴 이스케이프 홍대점','홍대','서울특별시 마포구 서교동 395-17',37.550755,126.920183,'http://hd.newescape.co.kr/home','02-322-1290','images/logo/5.png'),(6,'호텔드코드 홍대점','홍대','서울특별시 마포구 395-85 지하1층',37.551791,126.918891,'http://www.hoteldecode.com/','02-326-0610','images/logo/6.png'),(7,'룸즈에이 홍대점','홍대','서울특별시 마포구 서교동 번지 지하 343-11 23층',37.553517,126.92471,'http://roomsa.co.kr/','02-333-0058','images/logo/7.png'),(8,'키이스케이프 홍대점','홍대','서울특별시 마포구 서교동 어울마당로 44-1',37.548946,126.920873,'https://keyescape.co.kr/web/home.php','010-7497-5517 ','images/logo/8.png'),(9,'솔버 건대 1호점','건대','서울특별시 광진구 아차산로 201 지하 1층',37.541715,127.066017,'http://solver-gd.com/','02-2498-3737','images/logo/9.png'),(10,'넥스트 에디션 건대 1호점','건대','서울특별시 광진구 자양동 17-5',37.541513,127.064998,'https://www.nextedition.co.kr/shops/NextEdition%20Gundae','050-7417-6000','images/logo/10.png'),(11,'넥스트 에디션 건대 2호점','건대','서울특별시 광진구 자양4동 아차산로 192',37.541513,127.064998,'https://www.nextedition.co.kr/shops/NextEdition%20Gundae2','050-7417-8580','images/logo/11.png'),(12,'룸엘이스케이프 신림점','신림','서울특별시 관악구 서원동 신림로 322-4',37.483062,126.930421,'http://www.roomlescape.com/','02-882-1215','images/logo/12.png'),(13,'ESC 신림점','신림','서울특별시 관악구 신림동 1422-35',37.484605,126.930503,'http://esc-escape.co.kr/esc/main/main.php','02-873-8287','images/logo/13.png'),(14,'키이스케이프 명동점','명동','서울특별시 중구 명동 23-10',37.561586,126.984572,'http://www.keyescape.com/','010-3913-6082','images/logo/14.png'),(15,'키이스케이프 혜화점','혜화','서울특별시 종로구 동숭동 1-78',37.581817,127.003686,'http://www.keyescape.com/','02-7660-6082','images/logo/15.png'),(16,'비트포비아 대학로점','혜화','서울특별시 종로구 이화동 대학로10길 12',37.581578,127.002782,'https://www.xphobia.net/',' 02-742-5252','images/logo/16.png'),(17,'비트포비아 사라진 그녀','동대문','서울특별시 중구 을지로6가 21-18',37.56599,127.007328,'https://www.xphobia.net/','02-322-2600','images/logo/17.png'),(18,'이수케이프','이수','서울특별시 동작구 사당1동 동작대로 79 승지빌딩 지하',37.483571,126.981614,'https://isucape.com/','02-523-7651','images/logo/18.png'),(19,'비트포비아 강남던전','강남','서울특별시 강남구 역삼1동 824-30',37.497687,127.031048,'https://www.xphobia.net/','02-2555-4360','images/logo/19.png'),(20,'키이스케이프 강남점','강남','서울특별시 강남구 역삼동 강남대로96길 17',37.500058,127.028403,'http://www.keyescape.com/web/home.php#page1','02-777-6082','images/logo/20.png'),(21,'마스터키 강남점','강남','서울특별시 강남구 역삼1동 봉은사로6길 26',37.503294,127.027124,'http://www.master-key.co.kr/home','050-7957-7430','images/logo/21.png'),(22,'머더파커 건대점','건대','서울특별시 광진구 화양동 아차산로 213',37.541324,127.067175,'http://www.mdpk.co.kr/','02-497-2999','images/logo/22.png'),(23,'싸인이스케이프','홍대','서울특별시 마포구 서교동 와우산로 65',37.55038,126.922808,'http://signescape.com/main.html?JIJEM=S5','02-2039-9188','images/logo/23.png'),(24,'서울이스케이프룸 2호점','홍대','서울특별시 마포구 서교동 410-9',37.550076,126.922398,'http://www.seoul-escape.com/','02-333-6502','images/logo/24.png'),(25,'서울이스케이프룸 1호점','강남','서울특별시 서초구 서초동 1317-9',37.498682,127.026096,'http://www.seoul-escape.com/reservation/',' 02-533-6502','images/logo/25.png'),(26,'코드케이 강남점','강남','서울특별시 강남구 역삼동 813-4',37.502547,127.026538,'http://www.code-k.co.kr/main.html','02-501-8245','images/logo/26.png'),(27,'마스터키 잠실점','잠실','서울특별시 송파구 잠실본동 백제고분로7길 27',37.510791,127.081884,'https://www.roomescape.co.kr/store/detail.php?cafe=439','050-7458-6324','images/logo/27.png'),(28,'비트포비아 미션브레이크','용산','서울특별시 용산구 한강로3가 한강대로23길 55',37.528855,126.964052,'https://www.xphobia.net/infomation/infomation.html','02-2012-3783','images/logo/28.png'),(29,'마스터키 상수점','상수','서울특별시 마포구 상수동 독막로 65-1',37.547996,126.92092,'http://www.master-key.co.kr/booking/bk_detail?bid=20','050-7458-6346','images/logo/29.png'),(30,'덤앤더머 대학로점','혜화','서울특별시 종로구 이화동 동숭길 143',37.583224,127.002421,'http://dumbndumber.kr/index.html','02-741-0955','images/logo/30.png'),(31,'넥스트에디션 신촌 1호점','신촌','서울특별시 서대문구 창천동 2-7 지하 1 층',37.559068,126.938524,'http://www.nextedition.co.kr','050-7417-6066','images/logo/31.png'),(32,'ESC 홍대점','홍대','서울특별시 마포구 와우산로21길 19-16 지하2층',37.55156,126.922651,'http://hdesc.co.kr/esc/main/main.php','02-2336-8287','images/logo/32.png'),(33,'셜록홈즈 잠실 2호점','잠실','서울특별시 송파구 잠실동 182-5번지 4층',37.510902,127.082411,'http://sherlock-holmes.co.kr/','02-418-0153','images/logo/33.png');
/*!40000 ALTER TABLE `cafe` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-08-19 10:06:14
