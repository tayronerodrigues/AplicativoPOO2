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
  `idFuncionario` INT(11) NOT NULL,
  `nomeFuncionario` CHAR(25) NOT NULL,
  `funcaoFuncionario` CHAR(10) NOT NULL,
  `tipoFuncionario` INT NOT NULL,
  `senhaFuncionario` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idFuncionario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Restaurante`.`ingrediente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`ingrediente` (
  `idIngrediente` INT(11) NOT NULL,
  `nomeIngrediente` CHAR(25) NOT NULL,
  `descricaoIngrediente` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`idIngrediente`))
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
  INDEX `Pedido_idPedido` (`Pedido_idPedido` ASC),
  INDEX `fk_item_pedido_produto1_idx` (`produto_idProduto` ASC),
  PRIMARY KEY (`Pedido_idPedido`, `produto_idProduto`),
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


-- -----------------------------------------------------
-- Table `Restaurante`.`produto_ingrediente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`produto_ingrediente` (
  `Ingrediente_idIngrediente` INT(11) NOT NULL,
  `qntdPrato_Ingrediente` INT NOT NULL,
  `produto_idProduto` INT(11) NOT NULL,
  INDEX `Ingrediente_idIngrediente` (`Ingrediente_idIngrediente` ASC),
  PRIMARY KEY (`Ingrediente_idIngrediente`, `produto_idProduto`),
  INDEX `fk_prato_ingrediente_produto1_idx` (`produto_idProduto` ASC),
  CONSTRAINT `prato_ingrediente_ibfk_2`
    FOREIGN KEY (`Ingrediente_idIngrediente`)
    REFERENCES `Restaurante`.`ingrediente` (`idIngrediente`),
  CONSTRAINT `fk_prato_ingrediente_produto1`
    FOREIGN KEY (`produto_idProduto`)
    REFERENCES `Restaurante`.`produto` (`idProduto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
