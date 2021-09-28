CREATE DATABASE IF NOT EXISTS tao
    DEFAULT CHARSET UTF8
    COLLATE UTF8_GENERAL_CI;

USE tao;

CREATE TABLE IF NOT EXISTS `user`
(
    `id`          VARCHAR(32) NOT NULL,
    `username`    VARCHAR(64) DEFAULT NULL,
    `password`    VARCHAR(64) NOT NULL,
    `mobile`      VARCHAR(16) NOT NULL,
    `create_time` DATETIME    NOT NULL,
    `status`      TINYINT     NOT NULL,
    PRIMARY KEY (id)
);