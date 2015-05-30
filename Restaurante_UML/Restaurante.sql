-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
-- -----------------------------------------------------
-- Schema Restaurante
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Restaurante
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Restaurante` DEFAULT CHARACTER SET latin1 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Categoria` (
  `idCategoria` INT NOT NULL,
  `nomeCategoria` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;

USE `Restaurante` ;

-- -----------------------------------------------------
-- Table `Restaurante`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`funcionario` (
  `idFuncionario` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeFuncionario` CHAR(50) NOT NULL,
  `funcaoFuncionario` CHAR(45) NULL,
  `tipoFuncionario` INT NOT NULL,
  `senhaFuncionario` VARCHAR(45) NOT NULL,
  `fotoFuncionario` BLOB,
  `loginFuncionario` VARCHAR(8) NOT NULL,
  `cpfFuncionario` CHAR(11) NOT NULL,
  `telefoneFuncionario` VARCHAR(10) NOT NULL,
  `enderecoFuncionario` VARCHAR(200) NULL,
  `celularFuncionario` VARCHAR(11) NULL,
  PRIMARY KEY (`idFuncionario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Restaurante`.`mesa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`mesa` (
  `idMesa` INT(11) NOT NULL,
  `Funcionario_idFuncionario` INT(11) NOT NULL,
  PRIMARY KEY (`idMesa`),
  INDEX `Funcionario_idFuncionario` (`Funcionario_idFuncionario` ASC),
  CONSTRAINT `mesa_ibfk_1`
    FOREIGN KEY (`Funcionario_idFuncionario`)
    REFERENCES `Restaurante`.`funcionario` (`idFuncionario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Restaurante`.`pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`pedido` (
  `idPedido` INT(11) NOT NULL,
  `valorTotalPedido` FLOAT NOT NULL,
  `horarioPedido` DATETIME NOT NULL,
  `statusPedido` CHAR(10) NOT NULL,
  `Mesa_idMesa` INT(11) NOT NULL,
  `horarioFechamentoPedido` DATETIME NOT NULL,
  PRIMARY KEY (`idPedido`),
  INDEX `Mesa_idMesa` (`Mesa_idMesa` ASC),
  CONSTRAINT `pedido_ibfk_1`
    FOREIGN KEY (`Mesa_idMesa`)
    REFERENCES `Restaurante`.`mesa` (`idMesa`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Restaurante`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`produto` (
  `idProduto` INT(11) NOT NULL,
  `dataValidadeProduto` DATETIME NULL DEFAULT NULL,
  `nomeProduto` CHAR(25) NOT NULL,
  `precoCompraProduto` FLOAT NOT NULL,
  `tamanhoProduto` VARCHAR(10) NULL,
  `Categoria_idCategoria` INT NOT NULL,
  `fotoProduto` BLOB NULL,
  `IngredienteProduto` VARCHAR(100) NULL,
  PRIMARY KEY (`idProduto`),
  INDEX `fk_produto_Categoria1_idx` (`Categoria_idCategoria` ASC),
  CONSTRAINT `fk_produto_Categoria1`
    FOREIGN KEY (`Categoria_idCategoria`)
    REFERENCES `mydb`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Restaurante`.`item_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`item_pedido` (
  `precoItem_Pedido` FLOAT NOT NULL,
  `Pedido_idPedido` INT(11) NOT NULL,
  `produto_idProduto` INT(11) NOT NULL,
  `qtdItem_Pedido` INT NOT NULL,
  `idItem_pedido` VARCHAR(45) NOT NULL,
  INDEX `Pedido_idPedido` (`Pedido_idPedido` ASC),
  INDEX `fk_item_pedido_produto1_idx` (`produto_idProduto` ASC),
  PRIMARY KEY (`idItem_pedido`),
  CONSTRAINT `item_pedido_ibfk_1`
    FOREIGN KEY (`Pedido_idPedido`)
    REFERENCES `Restaurante`.`pedido` (`idPedido`),
  CONSTRAINT `fk_item_pedido_produto1`
    FOREIGN KEY (`produto_idProduto`)
    REFERENCES `Restaurante`.`produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

use restaurante;

INSERT INTO Funcionario values (1, "Administrador do Sistema", "gerente de TI", 1, "admin", NULL, "admin", "12345678900", "12345678", "rua qualquer, n 0, nao interessa a cidade", "12345678");

/*
 `idFuncionario` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeFuncionario` CHAR(25) NOT NULL,
  `funcaoFuncionario` CHAR(10) NULL,
  `tipoFuncionario` INT NOT NULL,
  `senhaFuncionario` VARCHAR(45) NOT NULL,
  `fotoFuncionario` BLOB NOT NULL,
  `loginFuncionario` VARCHAR(8) NOT NULL,
  `cpfFuncionario` CHAR(11) NOT NULL,
  `telefoneFuncionario` VARCHAR(10) NOT NULL,
  `enderecoFuncionario` VARCHAR(200) NULL,
  `celularFuncionario` VARCHAR(11) NULL,
*/