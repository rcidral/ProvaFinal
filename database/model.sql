-- MySQL Script generated by MySQL Workbench
-- Mon Nov 28 19:27:59 2022
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema aeroporto
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema aeroporto
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `aeroporto` DEFAULT CHARACTER SET utf8 ;
USE `aeroporto` ;

-- -----------------------------------------------------
-- Table `aeroporto`.`companhia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aeroporto`.`companhia` (
  `id` INT UNSIGNED AUTO_INCREMENT,
  `nome` VARCHAR(255),
  `cnpj` VARCHAR(255),
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aeroporto`.`aviao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aeroporto`.`aviao` (
  `id` INT UNSIGNED AUTO_INCREMENT,
  `marca` VARCHAR(255),
  `modelo` VARCHAR(255) NULL,
  `prefixo` VARCHAR(255) NULL,
  `capacidade` INT NULL,
  `companhia_id` INT UNSIGNED,
  PRIMARY KEY (`id`),
  INDEX `fk_aviao_companhia1_idx` (`companhia_id` ASC) ,
  CONSTRAINT `fk_aviao_companhia1`
    FOREIGN KEY (`companhia_id`)
    REFERENCES `aeroporto`.`companhia` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aeroporto`.`hangar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aeroporto`.`hangar` (
  `id` INT UNSIGNED AUTO_INCREMENT,
  `local` VARCHAR(255),
  `aviao_id` INT UNSIGNED,
  PRIMARY KEY (`id`),
  INDEX `fk_hangar_aviao_idx` (`aviao_id` ASC) ,
  CONSTRAINT `fk_hangar_aviao`
    FOREIGN KEY (`aviao_id`)
    REFERENCES `aeroporto`.`aviao` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aeroporto`.`pista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aeroporto`.`pista` (
  `id` INT UNSIGNED AUTO_INCREMENT,
  `numero` VARCHAR(255),
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aeroporto`.`helicoptero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aeroporto`.`helicoptero` (
  `id` INT UNSIGNED AUTO_INCREMENT,
  `marca` VARCHAR(255),
  `modelo` VARCHAR(255) NULL,
  `cor` VARCHAR(255),
  `capacidade` INT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aeroporto`.`jato`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aeroporto`.`jato` (
  `id` INT UNSIGNED AUTO_INCREMENT,
  `marca` VARCHAR(255),
  `modelo` VARCHAR(255),
  `cor` VARCHAR(255),
  `velocidade` INT,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `aeroporto`.`voo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `aeroporto`.`voo` (
  `id` INT UNSIGNED AUTO_INCREMENT,
  `numero` VARCHAR(255),
  `data` VARCHAR(255),
  `hora` VARCHAR(255),
  `origem` VARCHAR(255),
  `destino` VARCHAR(255),
  `piloto` VARCHAR(255),
  `copiloto` VARCHAR(255),
  `observacao` VARCHAR(255),
  `jato_id` INT UNSIGNED,
  `pista_id` INT UNSIGNED,
  `helicoptero_id` INT UNSIGNED,
  `aviao_id` INT UNSIGNED,
  PRIMARY KEY (`id`),
  INDEX `fk_voo_jato1_idx` (`jato_id` ASC) ,
  INDEX `fk_voo_pista1_idx` (`pista_id` ASC) ,
  INDEX `fk_voo_helicoptero1_idx` (`helicoptero_id` ASC) ,
  INDEX `fk_voo_aviao1_idx` (`aviao_id` ASC) ,
  CONSTRAINT `fk_voo_jato1`
    FOREIGN KEY (`jato_id`)
    REFERENCES `aeroporto`.`jato` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_voo_pista1`
    FOREIGN KEY (`pista_id`)
    REFERENCES `aeroporto`.`pista` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_voo_helicoptero1`
    FOREIGN KEY (`helicoptero_id`)
    REFERENCES `aeroporto`.`helicoptero` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_voo_aviao1`
    FOREIGN KEY (`aviao_id`)
    REFERENCES `aeroporto`.`aviao` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
