/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.5.27 : Database - home_electric
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`home_electric` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `home_electric`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `adminname` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `admin` */

insert  into `admin`(`id`,`adminname`,`pwd`) values (1,'admin','123456');

/*Table structure for table `appointment` */

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `repair_shop_id` int(11) DEFAULT NULL,
  `electric_name` varchar(255) DEFAULT NULL,
  `electric_age` varchar(11) DEFAULT NULL,
  `electric_pheno` varchar(255) DEFAULT NULL,
  `appointment_time` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `state` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `appointment` */

insert  into `appointment`(`id`,`repair_shop_id`,`electric_name`,`electric_age`,`electric_pheno`,`appointment_time`,`create_date`,`username`,`state`) values (5,1,'冰箱','10年','坏了','2019-03-06','2019-03-30 12:40:58','Leroy','15'),(11,3,'手机','5年','坏了','2018-03-06','2019-04-06 07:03:18','Leroy','10'),(14,3,'苹果手机','10年','坏了','2019-06-06','2019-04-06 07:18:09','Leroy','15');

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `shopId` int(11) DEFAULT NULL,
  `comment` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `comment` */

insert  into `comment`(`id`,`shopId`,`comment`,`username`,`create_date`) values (1,1,'你们家很好,很社会','张三','2019-03-27 12:12:12'),(2,1,'你们家真垃圾','李四','2019-03-27 18:37:31'),(3,1,'我爱你们的维修带路','王五','2019-03-27 19:37:48'),(4,1,'阿斯达四大所发安抚','王二麻醉','2019-03-27 19:37:49'),(9,2,'我这里天快要亮了','王五','2019-04-05 06:43:34'),(10,2,'你真帅其','Leroy','2019-04-05 06:45:30'),(11,2,'这家店真好啊','Leroy','2019-04-06 06:00:31'),(12,3,'你家不错','Leroy','2019-04-06 06:44:41'),(13,3,'我爱我的家啊啊啊啊啊','Leroy','2019-04-06 06:46:12'),(14,3,'你好吗？\n','Leroy','2019-04-06 07:03:00'),(15,3,'你好啊阿斯达四大所','Leroy','2019-04-06 07:13:58');

/*Table structure for table `complaint` */

DROP TABLE IF EXISTS `complaint`;

CREATE TABLE `complaint` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `repair_shop_id` int(11) DEFAULT NULL,
  `user_name` varchar(11) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `create_date` datetime DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `complaint` */

insert  into `complaint`(`id`,`repair_shop_id`,`user_name`,`content`,`create_date`) values (15,14,'Leroy','垃圾 我爱我家吧','2019-04-06 07:18:38');

/*Table structure for table `repair_shop` */

DROP TABLE IF EXISTS `repair_shop`;

CREATE TABLE `repair_shop` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'reparir',
  `photo` varchar(500) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `browser_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `repair_shop` */

insert  into `repair_shop`(`id`,`photo`,`name`,`description`,`address`,`browser_num`) values (1,'http://corp.lesoft.com.cn:8588/filedoc/file/doc/d/local/_4bg2tXQ2djT3-D938jVytXIxeCOjI2FjI-OiuDM08_I2c710d3b2ZSLj5WS1szZ2w==','蓝翔家电维修','励志做中国最好的维修家电公司','海南省三亚市三亚区猪八戒村',200),(2,'http://corp.lesoft.com.cn:8588/filedoc/file/doc/d/local/_4bg2tXQ2djT3-D938jVytXIxeCOjI2FjI-OiuDM08_I2c710d3b2ZSLj5WS1szZ2w==','上海家电维修','用最好的服务回报大家','北京市丰台区大红门',300),(3,'http://localhost:8899/upload/6151d2cf-22e8-401c-9064-f4194f6317d8.png','我爱我家','房地产啦及','北京市',100),(4,'http://localhost:8899/upload/f6ebf539-811d-4a2b-8ed0-934bed6e9754.png','变形记囊个',' 阿萨德','水星',100);

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `open_id` varchar(30) NOT NULL,
  `nick_name` varchar(255) DEFAULT NULL,
  `avatar_url` varchar(255) DEFAULT NULL,
  `province` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`open_id`,`nick_name`,`avatar_url`,`province`,`city`) values (1,'o0yVZ5BbIFAUMpf7agF7XaMA6Fjk','Leroy','https://wx.qlogo.cn/mmopen/vi_32/pktZLy8B9gD4n8ZCjwiagp34d5DGRyUZ0NFbVvnU4FR0ndkiclzw0ibljquCbnWkXPoT7d1t5uDY1VAYGZxJfTEiaA/132','','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
