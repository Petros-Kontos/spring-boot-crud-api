
CREATE DATABASE  IF NOT EXISTS `payroll_directory`;

USE `payroll_directory`;

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `employee` VALUES
	(1,'Alex','Turner','alex@arcticmonkeys.com'),
	(2,'Axl','Rose','axl@gunsnroses.com'),
	(3,'Bruce','Dickinson','bruce@ironmaiden.com'),
	(4,'Kurt','Cobain','kurt@nirvana.com'),
	(5,'James','Hetfield','james@metallica.com');
