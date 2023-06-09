/*
 Navicat Premium Data Transfer

 Source Server         : demo
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : blood_user_sys

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 30/06/2023 11:26:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int NOT NULL COMMENT '主键id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `is_del` tinyint(1) NOT NULL COMMENT '是否禁用，1是0否',
  `name` varchar(255) DEFAULT NULL COMMENT '权限名称',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='权限表';

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `is_del` tinyint(1) NOT NULL COMMENT '是否删除，1是0否',
  `name` varchar(255) DEFAULT NULL COMMENT '角色名称',
  `description` varchar(255) DEFAULT NULL COMMENT '角色描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色表';

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` int NOT NULL COMMENT '主键id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `role_id` int DEFAULT NULL COMMENT '角色id',
  `permission_id` int DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='角色权限关联表';

-- ----------------------------
-- Table structure for user_account
-- ----------------------------
DROP TABLE IF EXISTS `user_account`;
CREATE TABLE `user_account` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `is_del` tinyint(1) NOT NULL COMMENT '是否已经删除，1是0否',
  `user_basic_id` int DEFAULT NULL COMMENT '用户唯一id',
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '昵称\n',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '头像',
  `type` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '账户类型名称',
  `acc_last_at` datetime DEFAULT NULL COMMENT '账户最后活跃时间',
  `acc_id` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '对应每个平台下用户唯一id\n',
  `acc_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '每个平台下用户的信息',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `acc_type_user` (`type`,`acc_id`) USING BTREE COMMENT '账户类型和平台唯一ID'
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='布拉得用户账户信息表\n';

-- ----------------------------
-- Table structure for user_basic
-- ----------------------------
DROP TABLE IF EXISTS `user_basic`;
CREATE TABLE `user_basic` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `is_del` tinyint(1) NOT NULL COMMENT '是否删除，1是0否',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '名字',
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '昵称',
  `blood_type` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '血型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=207 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户基础信息表';

-- ----------------------------
-- Table structure for user_credentials
-- ----------------------------
DROP TABLE IF EXISTS `user_credentials`;
CREATE TABLE `user_credentials` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `is_del` tinyint(1) NOT NULL COMMENT '是否已经删除，0未删除，1已删除',
  `name` varchar(64) DEFAULT NULL COMMENT '姓名',
  `type` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '证件类型',
  `number` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '证件号码',
  `user_basic_id` int DEFAULT NULL COMMENT '用户唯一id',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `credentials` (`type`,`number`) USING BTREE COMMENT '用户证件类型和证件号唯一'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='布拉得用户证件信息表';

-- ----------------------------
-- Table structure for user_phone
-- ----------------------------
DROP TABLE IF EXISTS `user_phone`;
CREATE TABLE `user_phone` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `is_del` tinyint(1) NOT NULL COMMENT '是否已经删除，1是0否',
  `phone_number` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '用户电话号',
  `user_basic_id` int DEFAULT NULL COMMENT '用户唯一id',
  `last_active_time` datetime DEFAULT NULL COMMENT '最后活跃时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE KEY `user_phone` (`phone_number`) USING BTREE COMMENT '手机号唯一'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='布拉得用户手机信息表';

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int NOT NULL COMMENT '主键id',
  `created_at` datetime NOT NULL COMMENT '创建时间',
  `updated_at` datetime NOT NULL COMMENT '更新时间',
  `user_basic_id` int DEFAULT NULL COMMENT '用户id',
  `role_id` int DEFAULT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户角色关联表';

SET FOREIGN_KEY_CHECKS = 1;
