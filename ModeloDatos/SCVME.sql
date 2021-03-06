-- MySQL Script generated by MySQL Workbench
-- Sun Dec 17 01:48:15 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SCVME
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `SCVME` ;

-- -----------------------------------------------------
-- Schema SCVME
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SCVME` DEFAULT CHARACTER SET utf8 ;
USE `SCVME` ;

-- -----------------------------------------------------
-- Table `SCVME`.`Unidad_Academica`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Unidad_Academica` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Unidad_Academica` (
  `idUnidad_Academica` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`idUnidad_Academica`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SCVME`.`Tipo_Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Tipo_Usuario` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Tipo_Usuario` (
  `idTipo_Usuario` INT NOT NULL AUTO_INCREMENT,
  `Tipo` VARCHAR(45) NOT NULL,
  `Descripcion` VARCHAR(200) NOT NULL,
  PRIMARY KEY (`idTipo_Usuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SCVME`.`Estatus`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Estatus` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Estatus` (
  `idEstatus` INT NOT NULL AUTO_INCREMENT,
  `Estatus` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEstatus`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SCVME`.`Usuario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Usuario` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Usuario` (
  `idUsuario` INT NOT NULL AUTO_INCREMENT,
  `Email` VARCHAR(80) NOT NULL,
  `NombreUsuario` VARCHAR(15) NOT NULL,
  `Clave` VARCHAR(15) NOT NULL,
  `Nombre` VARCHAR(45) NOT NULL,
  `PrimerApellido` VARCHAR(45) NOT NULL,
  `SegundoApellido` VARCHAR(45) NOT NULL,
  `Calificacion` INT NULL,
  `Unidad_Academica_idUnidad_Academica` INT NOT NULL,
  `Tipo_Usuario_idTipo_Usuario` INT NOT NULL,
  `Estatus_idEstatus` INT NOT NULL,
  PRIMARY KEY (`idUsuario`),
  INDEX `fk_Usuario_Unidad_Academica1_idx` (`Unidad_Academica_idUnidad_Academica` ASC),
  INDEX `fk_Usuario_Tipo_Usuario1_idx` (`Tipo_Usuario_idTipo_Usuario` ASC),
  INDEX `fk_Usuario_Estatus1_idx` (`Estatus_idEstatus` ASC),
  CONSTRAINT `fk_Usuario_Unidad_Academica1`
    FOREIGN KEY (`Unidad_Academica_idUnidad_Academica`)
    REFERENCES `SCVME`.`Unidad_Academica` (`idUnidad_Academica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Tipo_Usuario1`
    FOREIGN KEY (`Tipo_Usuario_idTipo_Usuario`)
    REFERENCES `SCVME`.`Tipo_Usuario` (`idTipo_Usuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Usuario_Estatus1`
    FOREIGN KEY (`Estatus_idEstatus`)
    REFERENCES `SCVME`.`Estatus` (`idEstatus`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
COMMENT = '				';


-- -----------------------------------------------------
-- Table `SCVME`.`Unidad_Aprendizaje`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Unidad_Aprendizaje` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Unidad_Aprendizaje` (
  `idUnidad_Aprendizaje` INT NOT NULL AUTO_INCREMENT,
  `Nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idUnidad_Aprendizaje`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SCVME`.`Publicacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Publicacion` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Publicacion` (
  `idPublicacion` INT NOT NULL AUTO_INCREMENT,
  `NombreComponente` VARCHAR(45) NOT NULL,
  `Cantidad` INT NOT NULL,
  `Descripcion` TEXT NOT NULL,
  `Datasheet` VARCHAR(100) NULL,
  `LinkFacebook` VARCHAR(60) NULL,
  `Usuario_idUsuario` INT NOT NULL,
  `Estatus_idEstatus` INT NOT NULL,
  PRIMARY KEY (`idPublicacion`),
  INDEX `fk_Publicacion_Usuario1_idx` (`Usuario_idUsuario` ASC),
  INDEX `fk_Publicacion_Estatus1_idx` (`Estatus_idEstatus` ASC),
  CONSTRAINT `fk_Publicacion_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `SCVME`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Publicacion_Estatus1`
    FOREIGN KEY (`Estatus_idEstatus`)
    REFERENCES `SCVME`.`Estatus` (`idEstatus`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SCVME`.`Comentario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Comentario` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Comentario` (
  `idComentario` INT NOT NULL AUTO_INCREMENT,
  `FechaAlta` DATETIME NOT NULL,
  `FechaEdicion` DATETIME NULL,
  `FechaEliminacion` DATETIME NULL,
  `Comentario` VARCHAR(150) NOT NULL,
  `Publicacion_idPublicacion` INT NOT NULL,
  PRIMARY KEY (`idComentario`),
  INDEX `fk_Comentario_Publicacion1_idx` (`Publicacion_idPublicacion` ASC),
  CONSTRAINT `fk_Comentario_Publicacion1`
    FOREIGN KEY (`Publicacion_idPublicacion`)
    REFERENCES `SCVME`.`Publicacion` (`idPublicacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SCVME`.`ContactoPublicacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`ContactoPublicacion` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`ContactoPublicacion` (
  `idContactoPublicacion` INT NOT NULL AUTO_INCREMENT,
  `NombreContacto` VARCHAR(70) NOT NULL,
  `MedioContacto` VARCHAR(45) NOT NULL,
  `Mensaje` VARCHAR(250) NOT NULL,
  `FechaContacto` DATE NOT NULL,
  `Publicacion_idPublicacion` INT NOT NULL,
  PRIMARY KEY (`idContactoPublicacion`),
  INDEX `fk_ContactoPublicacion_Publicacion1_idx` (`Publicacion_idPublicacion` ASC),
  CONSTRAINT `fk_ContactoPublicacion_Publicacion1`
    FOREIGN KEY (`Publicacion_idPublicacion`)
    REFERENCES `SCVME`.`Publicacion` (`idPublicacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `SCVME`.`Publicacion_has_Unidad_Aprendizaje`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `SCVME`.`Publicacion_has_Unidad_Aprendizaje` ;

CREATE TABLE IF NOT EXISTS `SCVME`.`Publicacion_has_Unidad_Aprendizaje` (
  `Publicacion_idPublicacion` INT NOT NULL,
  `Unidad_Aprendizaje_idUnidad_Aprendizaje` INT NOT NULL,
  PRIMARY KEY (`Publicacion_idPublicacion`, `Unidad_Aprendizaje_idUnidad_Aprendizaje`),
  INDEX `fk_Publicacion_has_Unidad_Aprendizaje_Unidad_Aprendizaje1_idx` (`Unidad_Aprendizaje_idUnidad_Aprendizaje` ASC),
  INDEX `fk_Publicacion_has_Unidad_Aprendizaje_Publicacion1_idx` (`Publicacion_idPublicacion` ASC),
  CONSTRAINT `fk_Publicacion_has_Unidad_Aprendizaje_Publicacion1`
    FOREIGN KEY (`Publicacion_idPublicacion`)
    REFERENCES `SCVME`.`Publicacion` (`idPublicacion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Publicacion_has_Unidad_Aprendizaje_Unidad_Aprendizaje1`
    FOREIGN KEY (`Unidad_Aprendizaje_idUnidad_Aprendizaje`)
    REFERENCES `SCVME`.`Unidad_Aprendizaje` (`idUnidad_Aprendizaje`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
