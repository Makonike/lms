/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.33 : Database - lms2
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`lms2` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `lms2`;

/*Table structure for table `course` */

DROP TABLE IF EXISTS `course`;

CREATE TABLE `course` (
  `id` varchar(10) NOT NULL COMMENT '课程号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `teacherId` varchar(20) NOT NULL COMMENT '任课教师号',
  `creditHour` int(3) NOT NULL COMMENT '学时',
  `creditPoint` int(2) NOT NULL COMMENT '学分',
  `schoolTime` datetime NOT NULL COMMENT '上课时间',
  `classPlace` varchar(50) NOT NULL COMMENT '上课地点',
  `examTime` datetime NOT NULL COMMENT '考试时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `course` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `depNo` varchar(20) NOT NULL COMMENT '系号',
  `name` varchar(20) NOT NULL COMMENT '系名称',
  `intro` varchar(128) DEFAULT NULL COMMENT '系的简介',
  PRIMARY KEY (`depNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `score` */

DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `scoreId` int(10) NOT NULL AUTO_INCREMENT COMMENT '序列号',
  `studentId` varchar(20) NOT NULL COMMENT '学号',
  `courseId` varchar(10) NOT NULL COMMENT '课程号',
  `usualScore` int(3) NOT NULL COMMENT '平时成绩',
  `examScore` int(3) NOT NULL COMMENT '考试成绩',
  `totalScore` int(3) NOT NULL COMMENT '总评成绩',
  PRIMARY KEY (`scoreId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `score` */

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` varchar(20) NOT NULL COMMENT '学号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(2) NOT NULL DEFAULT '男' COMMENT '性别',
  `bornDate` datetime DEFAULT NULL COMMENT '出生日期',
  `scores` int(3) DEFAULT NULL COMMENT '入学成绩',
  `depNo` varchar(20) NOT NULL COMMENT '所在系号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `id` varchar(20) NOT NULL COMMENT '职工号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `sex` varchar(2) NOT NULL DEFAULT '男' COMMENT '性别',
  `bornDate` datetime DEFAULT NULL COMMENT '出生日期',
  `depNo` varchar(20) NOT NULL COMMENT '所在系号',
  `jobTitle` varchar(20) NOT NULL COMMENT '职称',
  `major` varchar(12) NOT NULL COMMENT '专业及教学方向',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
