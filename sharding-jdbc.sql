-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_myshop_0, db_myshop_1
-- ------------------------------------------------------
-- Server version	8.0.12

 SET NAMES utf8 ;

DROP TABLE IF EXISTS `tb_order_0`;

 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_order_0` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

LOCK TABLES `tb_order_0` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `tb_order_1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_order_1` (
  `id` bigint(20) NOT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


LOCK TABLES `tb_order_1` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `tb_order_item_0`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_order_item_0` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `order_item_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


LOCK TABLES `tb_order_item_0` WRITE;
UNLOCK TABLES;


DROP TABLE IF EXISTS `tb_order_item_1`;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tb_order_item_1` (
  `id` bigint(20) NOT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `order_id` bigint(20) DEFAULT NULL,
  `order_item_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


LOCK TABLES `tb_order_item_1` WRITE;
UNLOCK TABLES;
