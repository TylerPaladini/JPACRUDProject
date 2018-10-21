-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema megafaunadb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `megafaunadb` ;

-- -----------------------------------------------------
-- Schema megafaunadb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `megafaunadb` DEFAULT CHARACTER SET utf8 ;
USE `megafaunadb` ;

-- -----------------------------------------------------
-- Table `megafauna`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `megafauna` ;

CREATE TABLE IF NOT EXISTS `megafauna` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `latin_scientific` VARCHAR(45) NULL,
  `description` TEXT BINARY NULL,
  `weight` INT NULL,
  `size` VARCHAR(200) NULL,
  `diet` VARCHAR(200) NULL,
  `habitat` VARCHAR(350) NULL,
  `region` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS megafaunauser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'megafaunauser'@'localhost' IDENTIFIED BY 'megafaunauser';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'megafaunauser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `megafauna`
-- -----------------------------------------------------
START TRANSACTION;
USE `megafaunadb`;
INSERT INTO `megafauna` (`id`, `name`, `latin_scientific`, `description`, `weight`, `size`, `diet`, `habitat`, `region`) VALUES (1, 'Bear', 'test', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `megafauna` (`id`, `name`, `latin_scientific`, `description`, `weight`, `size`, `diet`, `habitat`, `region`) VALUES (2, 'lion', 'test', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `megafauna` (`id`, `name`, `latin_scientific`, `description`, `weight`, `size`, `diet`, `habitat`, `region`) VALUES (3, 'camel', 'test', NULL, NULL, NULL, NULL, NULL, NULL);

COMMIT;

