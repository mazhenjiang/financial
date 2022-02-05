/*
 Navicat Premium Data Transfer

 Source Server         : mzh
 Source Server Type    : MySQL
 Source Server Version : 80028
 Source Host           : localhost:3306
 Source Schema         : financial

 Target Server Type    : MySQL
 Target Server Version : 80028
 File Encoding         : 65001

 Date: 05/02/2022 10:06:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_data_account
-- ----------------------------
DROP TABLE IF EXISTS `t_data_account`;
CREATE TABLE `t_data_account`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `account_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户名',
  `pwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `tel` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_data_income
-- ----------------------------
DROP TABLE IF EXISTS `t_data_income`;
CREATE TABLE `t_data_income`  (
  `id` int NOT NULL COMMENT '主键id',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收入人id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '收入人姓名',
  `amount` decimal(16, 2) NULL DEFAULT NULL COMMENT '收入金额',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '收入日期',
  `date_month` tinyint(1) NULL DEFAULT NULL COMMENT '收入月份',
  `way` tinyint(1) NULL DEFAULT NULL COMMENT '收入方式',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `creator_id` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_data_outcome
-- ----------------------------
DROP TABLE IF EXISTS `t_data_outcome`;
CREATE TABLE `t_data_outcome`  (
  `id` int NOT NULL COMMENT '主键id',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支出人id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支出人姓名',
  `amount` decimal(16, 2) NULL DEFAULT NULL COMMENT '支出金额',
  `date` datetime(0) NULL DEFAULT NULL COMMENT '支出日期',
  `date_month` tinyint(1) NULL DEFAULT NULL COMMENT '支出月份',
  `way` tinyint(1) NULL DEFAULT NULL COMMENT '支出方式',
  `remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支出内容',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `creator_id` tinyint(1) NULL DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_data_user
-- ----------------------------
DROP TABLE IF EXISTS `t_data_user`;
CREATE TABLE `t_data_user`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `age` tinyint(1) NULL DEFAULT NULL COMMENT '年龄',
  `sex` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '性别',
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '邮箱号',
  `tel` varchar(18) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `account_id` int NOT NULL COMMENT '账户id',
  `create_time` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_permission`;
CREATE TABLE `t_sys_permission`  (
  `id` int NOT NULL COMMENT '主键id',
  `permission_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci NULL DEFAULT NULL COMMENT '权限编码',
  `permission_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限描述',
  `type` tinyint(1) NULL DEFAULT NULL COMMENT '权限类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role`;
CREATE TABLE `t_sys_role`  (
  `id` int NOT NULL COMMENT '主键id',
  `role_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `role_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sys_role1
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_role1`;
CREATE TABLE `t_sys_role1`  (
  `role_id` int NOT NULL COMMENT '角色ID',
  `account_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户ID',
  `account_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '账户号',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
