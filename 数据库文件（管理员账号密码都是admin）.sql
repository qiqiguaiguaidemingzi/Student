# Host: localhost  (Version 5.5.22)
# Date: 2017-11-04 18:14:14
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "studentinfo"
#

DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` char(10) DEFAULT NULL,
  `class` char(10) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `major` char(10) DEFAULT NULL,
  `course` varchar(100) DEFAULT NULL,
  `hobby` char(20) DEFAULT NULL,
  `beizhu` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=gbk;

#
# Data for table "studentinfo"
#

INSERT INTO `studentinfo` VALUES (1,'林一','15班',1,'1999-01-01','计算机科学与技术','数据结构','book','null'),(2,'马二','15班',1,'1999-02-02','计算机科学与技术','计算机导论','music',NULL),(3,'张三','15班',1,'1999-03-03','计算机科学与技术','大学物理','web',NULL),(4,'李四','16班',1,'1999-04-04','通信工程','计算机网络','music,web',NULL),(5,'王五','16班',0,'1999-05-05','通信工程','计算机原理','book,web',NULL),(6,'陈六','16班',1,'1999-06-06','通信工程','大学物理','web',NULL),(7,'房七','17班',1,'1999-07-07','电气工程','大学物理,计算机原理','book',NULL),(8,'薛八','17班',1,'1999-08-08','电气工程','大学物理,计算机网络','music,web',NULL),(9,'白九','17班',0,'1999-09-09','电气工程','大学物理,数据结构','music,book',NULL);

#
# Structure for table "usertable"
#

DROP TABLE IF EXISTS `usertable`;
CREATE TABLE `usertable` (
  `username` char(10) NOT NULL,
  `password` char(10) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

#
# Data for table "usertable"
#

INSERT INTO `usertable` VALUES ('',''),('admin','admin');
