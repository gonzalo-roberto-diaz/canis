/*
SQLyog Community
MySQL - 5.6.21 : Database - canis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`canis` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;

/*Table structure for table `BREEDERS` */

CREATE TABLE `BREEDERS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `COUNTRY_ID` int(11) NOT NULL,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `NAME` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ZIP_CODE` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `URL` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `URL_ENCODED` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOGO_URL` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `EMAIL` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PHONE` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DESCRIPTION` text COLLATE utf8_unicode_ci NOT NULL,
  `STREET_ADDRESS` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PO_BOX` int(11) DEFAULT '0',
  `LATITUDE` decimal(11,8) NOT NULL,
  `LONGITUDE` decimal(11,8) NOT NULL,
  `ADMINISTRATIVE_AREA_LEVEL_1` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADMINISTRATIVE_AREA_LEVEL_2` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COLLOQUIAL_AREA` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOCALITY` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SUBLOCALITY_LEVEL_1` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `META_DESCRIPCION` text COLLATE utf8_unicode_ci,
  `META_KEYWORDS` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NUMBER` (`ID`),
  KEY `LATITUDE` (`LATITUDE`),
  KEY `LONGITUDE` (`LONGITUDE`),
  KEY `FK_BREEDERS_COUNTRIES` (`COUNTRY_ID`),
  CONSTRAINT `FK_BREEDERS_COUNTRIES` FOREIGN KEY (`COUNTRY_ID`) REFERENCES `COUNTRIES` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=77 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `BREEDS` */

CREATE TABLE `BREEDS` (
  `ID` bigint(20) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CANADA_PROVINCES` */

CREATE TABLE `CANADA_PROVINCES` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `PROVINCE_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PROVINCE_CODE` char(2) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CANADA_ZIPS` */

CREATE TABLE `CANADA_ZIPS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ZIP_CODE` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `LOCATION_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `LATITUDE` decimal(10,6) NOT NULL,
  `LONGITUDE` decimal(10,6) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ZIP_CODE` (`ZIP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CAT_BREEDS` */

CREATE TABLE `CAT_BREEDS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `CAT_BREED_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `DOG_BREED_NAME` (`CAT_BREED_NAME`)
) ENGINE=InnoDB AUTO_INCREMENT=103 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CAT_BREEDS_BY_BREEDER` */

CREATE TABLE `CAT_BREEDS_BY_BREEDER` (
  `CAT_BREED_ID` int(11) NOT NULL,
  `BREEDER_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CAT_BREEDS_BY_FORUM` */

CREATE TABLE `CAT_BREEDS_BY_FORUM` (
  `FORUM_ID` int(11) NOT NULL,
  `CAT_BREED_ID` int(11) unsigned NOT NULL,
  PRIMARY KEY (`CAT_BREED_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CAT_COAT_LENGTHS` */

CREATE TABLE `CAT_COAT_LENGTHS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `COAT_LENGTH_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ORDEN` smallint(6) NOT NULL,
  `ENABLED` smallint(6) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CAT_SIZES` */

CREATE TABLE `CAT_SIZES` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `CAT_SIZE_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `ORDEN` smallint(6) NOT NULL,
  `HABILITADA` smallint(6) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CHINA_PROVINCES` */

CREATE TABLE `CHINA_PROVINCES` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `PROVINCE_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PROVINCE_TYPE` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `CHINA_ZIPS` */

CREATE TABLE `CHINA_ZIPS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ZIP_CODE` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `LOCATION_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `LATITUDE` decimal(10,6) NOT NULL,
  `LONGITUDE` decimal(10,6) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ZIP_CODE` (`ZIP_CODE`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `COUNTRIES` */

CREATE TABLE `COUNTRIES` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Table structure for table `DOG_BREEDS` */

CREATE TABLE `DOG_BREEDS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `MAIN_FEATURES` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COLORS` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SIZE_MIN` decimal(6,2) DEFAULT NULL,
  `SIZE_MAX` decimal(6,2) DEFAULT NULL,
  `WEIGHT_MIN` decimal(6,2) DEFAULT NULL,
  `WEIGHT_MAX` decimal(6,2) DEFAULT NULL,
  `SERVING_MIN` decimal(6,2) NOT NULL DEFAULT '1.00',
  `SERVING_MAX` decimal(6,2) NOT NULL DEFAULT '1.00',
  `FRIENDLY_RANK` smallint(6) DEFAULT NULL,
  `FRIENDLY_TEXT` text COLLATE utf8_unicode_ci,
  `ACTIVE_RANK` smallint(6) DEFAULT NULL,
  `ACTIVE_TEXT` text COLLATE utf8_unicode_ci,
  `HEALTHY_RANK` smallint(6) DEFAULT NULL,
  `HEALTHY_TEXT` text COLLATE utf8_unicode_ci,
  `TRAINING_RANK` smallint(6) DEFAULT NULL,
  `TRAINING_TEXT` text COLLATE utf8_unicode_ci,
  `GUARDIAN_RANK` smallint(6) NOT NULL,
  `GUARDIAN_TEXT` text COLLATE utf8_unicode_ci NOT NULL,
  `GROOMING_RANK` smallint(6) NOT NULL,
  `GROOMING_TEXT` text COLLATE utf8_unicode_ci NOT NULL,
  `PICTURE_URL` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `VIDEO_URL` varchar(300) COLLATE utf8_unicode_ci DEFAULT NULL,
  `APARTMENTS` smallint(1) NOT NULL DEFAULT '0',
  `KIDS` smallint(1) NOT NULL DEFAULT '0',
  `ENABLED` smallint(6) NOT NULL DEFAULT '1',
  `DOG_SIZE_ID` int(11) DEFAULT NULL,
  `DOG_PURPOSE_ID` int(11) DEFAULT NULL,
  `DOG_SHEDDING_AMOUNT_ID` int(11) DEFAULT NULL,
  `DOG_SHEDDING_FREQUENCY_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `DOG_BREED_NAME` (`NAME`),
  KEY `FK_DOG_BREEDS_DOG_PURPOSES` (`DOG_PURPOSE_ID`),
  KEY `FK_DOG_BREEDS_DOG_SIZES` (`DOG_SIZE_ID`),
  KEY `FK_DOG_BREEDS_DOG_SHEDDING_AMOUNTS` (`DOG_SHEDDING_AMOUNT_ID`),
  KEY `FK_DOG_BREEDS_DOG_SHEDDING_FREQUENCIES` (`DOG_SHEDDING_FREQUENCY_ID`),
  CONSTRAINT `FK_DOG_BREEDS_DOG_PURPOSES` FOREIGN KEY (`DOG_PURPOSE_ID`) REFERENCES `DOG_PURPOSES` (`ID`),
  CONSTRAINT `FK_DOG_BREEDS_DOG_SHEDDING_AMOUNTS` FOREIGN KEY (`DOG_SHEDDING_AMOUNT_ID`) REFERENCES `DOG_SHEDDING_AMOUNTS` (`ID`),
  CONSTRAINT `FK_DOG_BREEDS_DOG_SHEDDING_FREQUENCIES` FOREIGN KEY (`DOG_SHEDDING_FREQUENCY_ID`) REFERENCES `DOG_SHEDDING_FREQUENCIES` (`ID`),
  CONSTRAINT `FK_DOG_BREEDS_DOG_SIZES` FOREIGN KEY (`DOG_SIZE_ID`) REFERENCES `DOG_SIZES` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `DOG_BREEDS_BY_BREEDER` */

CREATE TABLE `DOG_BREEDS_BY_BREEDER` (
  `DOG_BREED_ID` int(11) DEFAULT NULL,
  `BREEDER_ID` int(11) DEFAULT NULL,
  KEY `FK_DOG_BREEDS_BY_BREEDER_DOG_BREEDS` (`DOG_BREED_ID`),
  KEY `FK_DOG_BREEDS_BY_BREEDER_BREEDERS` (`BREEDER_ID`),
  CONSTRAINT `FK_DOG_BREEDS_BY_BREEDER_BREEDERS` FOREIGN KEY (`BREEDER_ID`) REFERENCES `BREEDERS` (`ID`),
  CONSTRAINT `FK_DOG_BREEDS_BY_BREEDER_DOG_BREEDS` FOREIGN KEY (`DOG_BREED_ID`) REFERENCES `DOG_BREEDS` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `DOG_BREEDS_BY_FORUM` */

CREATE TABLE `DOG_BREEDS_BY_FORUM` (
  `DOG_BREED_ID` int(11) DEFAULT NULL,
  `FORUM_ID` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `DOG_BREEDS_BY_SHELTER` */

CREATE TABLE `DOG_BREEDS_BY_SHELTER` (
  `DOG_BREED_ID` int(11) DEFAULT NULL,
  `SHELTER_ID` int(11) DEFAULT NULL,
  KEY `FK_DOG_BREEDS_BY_SHELTER_DOG_BREEDS` (`DOG_BREED_ID`),
  KEY `FK_DOG_BREEDS_BY_SHELTER_SHELTER_ID` (`SHELTER_ID`),
  CONSTRAINT `FK_DOG_BREEDS_BY_SHELTER_DOG_BREEDS` FOREIGN KEY (`DOG_BREED_ID`) REFERENCES `DOG_BREEDS` (`ID`),
  CONSTRAINT `FK_DOG_BREEDS_BY_SHELTER_SHELTER_ID` FOREIGN KEY (`SHELTER_ID`) REFERENCES `SHELTERS` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `DOG_PURPOSES` */

CREATE TABLE `DOG_PURPOSES` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `DESCRIPTION` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PICTURE_URL` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ENABLED` smallint(6) NOT NULL DEFAULT '1',
  `ORDER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `DOG_SHEDDING_AMOUNTS` */

CREATE TABLE `DOG_SHEDDING_AMOUNTS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ORDER` smallint(6) NOT NULL,
  `ENABLED` smallint(6) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `DOG_SHEDDING_FREQUENCIES` */

CREATE TABLE `DOG_SHEDDING_FREQUENCIES` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ORDER` smallint(6) NOT NULL,
  `ENABLED` smallint(6) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `DOG_SIZES` */

CREATE TABLE `DOG_SIZES` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ORDER` smallint(6) NOT NULL,
  `ENABLED` smallint(6) NOT NULL DEFAULT '1',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `FRONT_PAGE` */

CREATE TABLE `FRONT_PAGE` (
  `NEWS_1_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `NEWS_2_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NEWS_3_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NEWS_4_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NEWS_1_CUT` int(11) NOT NULL,
  `NEWS_2_CUT` int(11) NOT NULL,
  `NEWS_3_CUT` int(11) NOT NULL,
  `NEWS_4_CUT` int(11) NOT NULL,
  `VIDEO_1_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `VIDEO_2_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `VIDEO_3_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `DOG_BREED_1_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `DOG_BREED_2_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `DOG_BREED_3_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`NEWS_1_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `INDIA_STATES` */

CREATE TABLE `INDIA_STATES` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `STATE_CODE` char(2) COLLATE utf8_unicode_ci NOT NULL,
  `STATE_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `INDIA_ZIPS` */

CREATE TABLE `INDIA_ZIPS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ZIP_CODE` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `LOCATION_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `LATITUDE` decimal(10,6) NOT NULL,
  `LONGITUDE` decimal(10,6) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ZIP_CODE` (`ZIP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `JAPAN_PREFECTURES` */

CREATE TABLE `JAPAN_PREFECTURES` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `PREFECTURE_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `JAPAN_ZIPS` */

CREATE TABLE `JAPAN_ZIPS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ZIP_CODE` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `LOCATION_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `LATITUDE` decimal(10,6) NOT NULL,
  `LONGITUDE` decimal(10,6) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ZIP_CODE` (`ZIP_CODE`)
) ENGINE=InnoDB AUTO_INCREMENT=94389 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `NEWS` */

CREATE TABLE `NEWS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `NEWS_TITLE` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `URL_ENCODED` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NEWS_TEXT` text COLLATE utf8_unicode_ci NOT NULL,
  `NEWS_SOURCE` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL,
  `NEWS_DATE` date NOT NULL,
  `CUT_POSITION` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NEWS_TITLE` (`NEWS_TITLE`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `PET_FORUMS` */

CREATE TABLE `PET_FORUMS` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `FORUM_NAME` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `ENCODED_NAME` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `FORUM_URL` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `PICTURE_URL` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `META_DESCRIPCION` text COLLATE utf8_unicode_ci NOT NULL,
  `META_KEYWORDS` text COLLATE utf8_unicode_ci NOT NULL,
  `FORUM_DESCRIPTION` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `SHELTERS` */

CREATE TABLE `SHELTERS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `COUNTRY_ID` int(11) NOT NULL,
  `NAME` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `ZIP_CODE` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `URL` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `URL_ENCODED` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOGO_URL` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `EMAIL` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `PHONE` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `DESCRIPTION` text COLLATE utf8_unicode_ci NOT NULL,
  `STREET_ADDRESS` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `PO_BOX` int(11) DEFAULT '0',
  `LATITUDE` decimal(11,8) NOT NULL,
  `LONGITUDE` decimal(11,8) NOT NULL,
  `ADMINISTRATIVE_AREA_LEVEL_1` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ADMINISTRATIVE_AREA_LEVEL_2` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `COLLOQUIAL_AREA` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LOCALITY` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `SUBLOCALITY_LEVEL_1` varchar(100) COLLATE utf8_unicode_ci DEFAULT NULL,
  `META_DESCRIPCION` text COLLATE utf8_unicode_ci,
  `META_KEYWORDS` text COLLATE utf8_unicode_ci,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `NUMBER` (`ID`),
  KEY `LATITUDE` (`LATITUDE`),
  KEY `LONGITUDE` (`LONGITUDE`)
) ENGINE=InnoDB AUTO_INCREMENT=630 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `TEXT_RESOURCES` */

CREATE TABLE `TEXT_RESOURCES` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `TEXT_RES_KEY` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `TEXT_RESOURCE` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `TEXT_RES_KEY` (`TEXT_RES_KEY`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `TEXT_RESOURCES2` */

CREATE TABLE `TEXT_RESOURCES2` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `TEXT_RES_KEY` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `TEXT_RESOURCE` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `TEXT_RES_KEY` (`TEXT_RES_KEY`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `UK_REGIONS` */

CREATE TABLE `UK_REGIONS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `STATISTICAL_AREA` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `REGION_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `COUNTRY_NAME` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=177 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `UK_ZIPS` */

CREATE TABLE `UK_ZIPS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ZIP_CODE` char(8) COLLATE utf8_unicode_ci NOT NULL,
  `LOCATION_ID` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `LATITUDE` decimal(10,6) NOT NULL,
  `LONGITUDE` decimal(10,6) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ZIP_CODE` (`ZIP_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `USA_CITIES` */

CREATE TABLE `USA_CITIES` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `CITY_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `COUNTY_ID` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_USA_CITIES_USA_COUNTIES` (`COUNTY_ID`),
  CONSTRAINT `FK_USA_CITIES_USA_COUNTIES` FOREIGN KEY (`COUNTY_ID`) REFERENCES `USA_COUNTIES` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=29936 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `USA_COUNTIES` */

CREATE TABLE `USA_COUNTIES` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `COUNTY_NAME` char(32) COLLATE utf8_unicode_ci NOT NULL,
  `STATE_ID` int(11) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_USA_COUNTIES_USA_STATES` (`STATE_ID`),
  CONSTRAINT `FK_USA_COUNTIES_USA_STATES` FOREIGN KEY (`STATE_ID`) REFERENCES `USA_STATES` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3081 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `USA_STATES` */

CREATE TABLE `USA_STATES` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `STATE_NAME` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `STATE_CODE` char(2) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `USA_ZIPS` */

CREATE TABLE `USA_ZIPS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `ZIP_CODE` char(5) COLLATE utf8_unicode_ci NOT NULL,
  `LOCATION_ID` char(32) COLLATE utf8_unicode_ci DEFAULT NULL,
  `LATITUDE` decimal(10,6) NOT NULL,
  `LONGITUDE` decimal(10,6) NOT NULL,
  `CITY_ID` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ZIP_CODE` (`ZIP_CODE`),
  KEY `FK_USA_ZIPS_USA_CITIES` (`CITY_ID`),
  CONSTRAINT `FK_USA_ZIPS_USA_CITIES` FOREIGN KEY (`CITY_ID`) REFERENCES `USA_CITIES` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=40835 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Table structure for table `VIDEOS` */

CREATE TABLE `VIDEOS` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `GUID` char(32) COLLATE utf8_unicode_ci NOT NULL DEFAULT '',
  `VIDEO_TITLE` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `VIDEO_URL` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `VIDEO_TAGS` text COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/* Function  structure for function  `DISTANCE_PYT` */

DELIMITER $$

/*!50003 CREATE DEFINER=`almarlam`@`localhost` FUNCTION `DISTANCE_PYT`(`deg_lat1` DECIMAL(10,6), `deg_lng1` DECIMAL(10,6), `deg_lat2` DECIMAL(10,6), `deg_lng2` DECIMAL(10,6)) RETURNS double
    SQL SECURITY INVOKER
BEGIN
  DECLARE x DOUBLE;
  DECLARE y DOUBLE; 
  DECLARE distance DOUBLE; 
  SET DISTANCE = 0;
  
  
  /* si la longitud y la latitud parámetros son 0, que no calcule nada */
  IF deg_lat1 <> 0 AND deg_lng1 <> 0 THEN
    SET x = radians(deg_lng2 - deg_lng1) * cos(0.5 * radians(deg_lat2+deg_lat1)) ;
    SET y = radians(deg_lat2 - deg_lat1);
    SET distance = 6371 * sqrt( x*x + y*y);
    
  END IF;  
  
  
  
  RETURN DISTANCE;
END */$$
DELIMITER ;

/* Function  structure for function  `GETDISTANCE` */

DELIMITER $$

/*!50003 CREATE DEFINER=`almarlam`@`localhost` FUNCTION `GETDISTANCE`(`deg_lat1` DECIMAL(10,6), `deg_lng1` DECIMAL(10,6), `deg_lat2` DECIMAL(10,6), `deg_lng2` DECIMAL(10,6)) RETURNS double
    SQL SECURITY INVOKER
    COMMENT 'distancia en km entre 2 coordenadas'
BEGIN 
  DECLARE distance FLOAT;
  DECLARE delta_lat FLOAT; 
  DECLARE delta_lng FLOAT; 
  DECLARE lat1 FLOAT; 
  DECLARE lat2 FLOAT;
  DECLARE a FLOAT;
  SET distance = 0;
  
  IF deg_lat1 <> 0 AND deg_lng1 <> 0 THEN
  /*Convert degrees to radians and get the variables I need.*/
  SET delta_lat = radians(deg_lat2 - deg_lat1); 
  SET delta_lng = radians(deg_lng2 - deg_lng1); 
  SET lat1 = radians(deg_lat1); 
  SET lat2 = radians(deg_lat2); 
  /*Formula found here: http://www.movable-type.co.uk/scripts/latlong.html*/
  SET a = sin(delta_lat/2.0) * sin(delta_lat/2.0) + sin(delta_lng/2.0) * sin(delta_lng/2.0) * cos(lat1) * cos(lat2); 
  SET distance =  6371 * 2 * atan2(sqrt(a),  sqrt(1-a)); 
  
  END IF;
  RETURN distance;
END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
