/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : bysj

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-03-17 17:28:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` int(10) NOT NULL,
  `admin` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `gender` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', 'admin', '123456', null);

-- ----------------------------
-- Table structure for `goods`
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goodsId` int(4) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(50) NOT NULL,
  `goodsTypeId` int(4) NOT NULL,
  `goodsBrief` varchar(400) NOT NULL,
  `goodsPrice` int(8) NOT NULL,
  `goodsImageName` varchar(50) NOT NULL,
  `sellCount` int(4) DEFAULT NULL,
  `goodsDate` varchar(50) DEFAULT NULL,
  `storedCount` int(4) DEFAULT NULL,
  PRIMARY KEY (`goodsId`),
  KEY `goods_type_1` (`goodsTypeId`),
  CONSTRAINT `goods_type_1` FOREIGN KEY (`goodsTypeId`) REFERENCES `goodstype` (`goodsTypeId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '春装', '1', '春装berif。。。。', '99', 'imagename', '100', '2016-01-01 00:00:00.000000', '500');
INSERT INTO `goods` VALUES ('2', '秋装', '1', '秋装brief...', '59', 'imagename1', '99', '2016-08-08 00:00:00.000000', '200');
INSERT INTO `goods` VALUES ('3', '登山装', '1', '登上ing。。。', '150', 'image。。。', '20', '2016-10-01 00:00:00.000000', '100');
INSERT INTO `goods` VALUES ('4', '电脑', '1', '电脑ing', '5000', 'computer', '100', '2016-12-01 00:00:00.000000', '99');
INSERT INTO `goods` VALUES ('5', '手机', '1', '苹果落下来', '6000', 'phone', '578', '2016-05-04 00:00:00.000000', '411');

-- ----------------------------
-- Table structure for `goodstype`
-- ----------------------------
DROP TABLE IF EXISTS `goodstype`;
CREATE TABLE `goodstype` (
  `goodsTypeId` int(4) NOT NULL,
  `goodsTypeName` varchar(50) NOT NULL,
  PRIMARY KEY (`goodsTypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of goodstype
-- ----------------------------
INSERT INTO `goodstype` VALUES ('1', '衣服');
INSERT INTO `goodstype` VALUES ('2', '电子产品');
INSERT INTO `goodstype` VALUES ('3', '办公用品');
INSERT INTO `goodstype` VALUES ('4', '女婴用品');
INSERT INTO `goodstype` VALUES ('5', '男装');
INSERT INTO `goodstype` VALUES ('6', '女装');
INSERT INTO `goodstype` VALUES ('7', '学习永平');

-- ----------------------------
-- Table structure for `orderdetails`
-- ----------------------------
DROP TABLE IF EXISTS `orderdetails`;
CREATE TABLE `orderdetails` (
  `orderId` int(4) NOT NULL,
  `uid` int(10) NOT NULL,
  `goodsId` int(4) NOT NULL,
  `goodsprice` int(8) NOT NULL,
  `goodsCount` int(4) NOT NULL,
  `name` varchar(50) NOT NULL,
  `orderAddress` varchar(100) NOT NULL,
  `postCode` varchar(10) NOT NULL,
  `orderPhone` int(20) NOT NULL,
  `orderDate` varchar(20) NOT NULL,
  `orderState` int(2) NOT NULL,
  `orderCode` int(10) NOT NULL,
  PRIMARY KEY (`orderId`,`goodsId`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;

-- ----------------------------
-- Records of orderdetails
-- ----------------------------

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `truename` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `email` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `birthday` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `address` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'zhangsan', '123456', '张三', '123123', '132123', '男', '1993-11-22', '上海浦东');
INSERT INTO `users` VALUES ('2', '张三', '123123', '哈哈', '123213', '123123', '男', '123123121', '上海');
INSERT INTO `users` VALUES ('19', '李四', '123123', '李四', '123', '123', '女', '12312', '万达');
INSERT INTO `users` VALUES ('21', '吴宏', '123456', '吴宏', '123123', '231231', '男', '19931122', '上海浦东新区');
