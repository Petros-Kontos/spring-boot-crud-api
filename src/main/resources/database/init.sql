
CREATE DATABASE  IF NOT EXISTS `payroll_directory`;

USE `payroll_directory`;

DROP TABLE IF EXISTS `employee`;
DROP TABLE IF EXISTS `payment_details`;

CREATE TABLE `payment_details` (
  `id` int NOT NULL AUTO_INCREMENT,
  `account_number` varchar(20) NOT NULL,
  `sort_code` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `payment_details_id` int NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (payment_details_id) REFERENCES payment_details(id)
);

INSERT INTO `payment_details` VALUES
	(1, 23795837, 592379324),
	(2, 0239875098, 9759558),
	(3, 987798686, 8595675),
	(4, 769769867, 985965865),
	(5, 659565, 87957868);

INSERT INTO `employee` VALUES
	(1,'Alex','Turner','alex@arcticmonkeys.com', 1),
	(2,'Axl','Rose','axl@gunsnroses.com', 2),
	(3,'Bruce','Dickinson','bruce@ironmaiden.com', 3),
	(4,'Kurt','Cobain','kurt@nirvana.com', 4),
	(5,'James','Hetfield','james@metallica.com', 5);
