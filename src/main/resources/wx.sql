/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : wx

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-26 08:33:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `classts`
-- ----------------------------
DROP TABLE IF EXISTS `classts`;
CREATE TABLE `classts` (
  `cid` varchar(255) NOT NULL,
  `teacherId` varchar(255) DEFAULT NULL,
  `num` int(11) DEFAULT '0' COMMENT '班级人数',
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classts
-- ----------------------------

-- ----------------------------
-- Table structure for `examResult`
-- ----------------------------
DROP TABLE IF EXISTS `examResult`;
CREATE TABLE `examResult` (
  `id` varchar(255) NOT NULL COMMENT '每次测试id',
  `uid` varchar(255) NOT NULL COMMENT '用户id',
  `type` int(10) DEFAULT NULL COMMENT '题目类型',
  `score` double DEFAULT NULL COMMENT '分数',
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of examResult
-- ----------------------------
INSERT INTO `examResult` VALUES ('0759', '0759', null, '7', '2017-09-22 13:05:53');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` varchar(255) NOT NULL,
  `wxid` varchar(255) DEFAULT NULL,
  `createTime` datetime NOT NULL,
  `lastTime` datetime NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('123', '456', '2017-09-23 01:11:05', '2017-09-23 01:11:05');
