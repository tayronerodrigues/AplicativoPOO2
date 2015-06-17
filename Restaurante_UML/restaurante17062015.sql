-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema Restaurante
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Restaurante
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Restaurante` DEFAULT CHARACTER SET latin1 ;
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
  `fotoFuncionario` BLOB NULL,
  `loginFuncionario` VARCHAR(8) NOT NULL,
  `cpfFuncionario` CHAR(11) NOT NULL,
  `telefoneFuncionario` VARCHAR(10) NOT NULL,
  `enderecoFuncionario` VARCHAR(200) NULL,
  `celularFuncionario` VARCHAR(11) NULL,
  PRIMARY KEY (`idFuncionario`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;

-- -----------------------------------------------------
-- Table `Restaurante`.`Categoria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`categoria` (
  `idCategoria` INT(11) NOT NULL AUTO_INCREMENT,
  `nomeCategoria` VARCHAR(45) NOT NULL,
  `informacaoCategoria` VARCHAR(150) NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;
-- -----------------------------------------------------
-- Table `Restaurante`.`mesa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`mesa` (
  `idMesa` INT(11) NOT NULL AUTO_INCREMENT,
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
  `idPedido` INT(11) NOT NULL AUTO_INCREMENT,
  `valorTotalPedido` DOUBLE NOT NULL,
  `horarioPedido` DATETIME NOT NULL,
  `statusPedido` CHAR(10) NOT NULL,
  `Mesa_idMesa` INT(11) NOT NULL,
  `horarioFechamentoPedido` DATETIME,
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
  `idProduto` INT(11) NOT NULL AUTO_INCREMENT,
  `dataValidadeProduto` DATETIME NULL DEFAULT NULL,
  `nomeProduto` CHAR(25) NOT NULL,
  `precoCompraProduto` DOUBLE NOT NULL,
  `precoVendaProduto` DOUBLE NOT NULL,
  `tamanhoProduto` VARCHAR(10) NULL,
  `fotoProduto` BLOB NULL,
  `IngredienteProduto` VARCHAR(100) NULL,
  `Categoria_idCategoria` INT,
  PRIMARY KEY (`idProduto`),
  INDEX `fk_produto_Categoria1_idx` (`Categoria_idCategoria` ASC),
  CONSTRAINT `fk_produto_Categoria1`
    FOREIGN KEY (`Categoria_idCategoria`)
    REFERENCES `Restaurante`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `Restaurante`.`item_pedido`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Restaurante`.`item_pedido` (
  `precoItem_Pedido` DOUBLE NOT NULL,
  `Pedido_idPedido` INT(11) NOT NULL,
  `produto_idProduto` INT(11) NOT NULL,
  `qtdItem_Pedido` INT NOT NULL,
  `idItem_pedido` INT NOT NULL AUTO_INCREMENT,
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
insert into funcionario values (1, "Administrador de Sistema", "Adm TI", 1, "admin", null, "admin", "125645794", "123456", "nao sei", "1234678");
INSERT INTO categoria VALUES (1, "bebida", "bom");
INSERT INTO categoria VALUES (2, "massas", "monshtro");
insert into produto values (5, "2016-08-13", "batata doce", "5.00", "7.5", "kg", null, "batata doce", 2);
insert into produto values (6, "2016-07-12", "Caipirinha", "0.00", "6.00", "400 ml", null, "cachaça, limão, açucar e gelo", 1);
insert into pedido values (1, 0.00, now(), "aberto", 1, null);
/*
 `idPedido` INT(11) NOT NULL AUTO_INCREMENT,
  `valorTotalPedido` DOUBLE NOT NULL,
  `horarioPedido` DATETIME NOT NULL,
  `statusPedido` CHAR(10) NOT NULL,
  `Mesa_idMesa` INT(11) NOT NULL,
  `horarioFechamentoPedido` DATETIME,
*/
select * from categoria;
select * from produto;
select * from categoria;
select * from Mesa;
select * from pedido;
select * from funcionario;