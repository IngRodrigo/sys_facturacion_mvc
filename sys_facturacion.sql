/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : sys_facturacion

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2021-03-20 10:04:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ciudades
-- ----------------------------
DROP TABLE IF EXISTS `ciudades`;
CREATE TABLE `ciudades` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of ciudades
-- ----------------------------
INSERT INTO `ciudades` VALUES ('1', 'Asunción');
INSERT INTO `ciudades` VALUES ('2', 'Capiatá');
INSERT INTO `ciudades` VALUES ('3', 'Fernando de la Mora');
INSERT INTO `ciudades` VALUES ('4', 'San Lorenzo');

-- ----------------------------
-- Table structure for clientes
-- ----------------------------
DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `documento` varchar(100) DEFAULT NULL,
  `razon_social` varchar(100) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `idCiudad` int(10) DEFAULT NULL,
  `idPais` int(10) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `telefono_movil` varchar(15) DEFAULT NULL,
  `idTipoDocumento` int(10) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `idUser` int(10) DEFAULT NULL,
  `ipServidor` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of clientes
-- ----------------------------
INSERT INTO `clientes` VALUES ('1', '3664274', 'rodrigo_dev', 'Rodrigo Jesús Miguel', 'Sánchez Romero', '2', '1', 'Ruta 1 km 19', '021578707', '0982196660', '1', '2020-11-19 23:09:19', '2020-11-19 23:09:23', '1', '192.168.0.1');
INSERT INTO `clientes` VALUES ('2', '123456', 'test razon', 'test', 'test', '1', '1', 'Esto es una prueba de direccion', '0991996335', '0982164875', '2', '2020-11-21 22:56:23', '2020-11-21 22:56:23', '1', '192.168.0.7');

-- ----------------------------
-- Table structure for estados
-- ----------------------------
DROP TABLE IF EXISTS `estados`;
CREATE TABLE `estados` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of estados
-- ----------------------------
INSERT INTO `estados` VALUES ('1', 'activo');
INSERT INTO `estados` VALUES ('2', 'inactivo');

-- ----------------------------
-- Table structure for factura_cab
-- ----------------------------
DROP TABLE IF EXISTS `factura_cab`;
CREATE TABLE `factura_cab` (
  `idfactura_cab` int(11) NOT NULL AUTO_INCREMENT,
  `nroFactura` varchar(255) DEFAULT NULL,
  `timbrado` varchar(255) DEFAULT NULL,
  `fechaEmision` date DEFAULT NULL,
  `idCliente` int(10) DEFAULT NULL,
  PRIMARY KEY (`idfactura_cab`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of factura_cab
-- ----------------------------

-- ----------------------------
-- Table structure for factura_detalle
-- ----------------------------
DROP TABLE IF EXISTS `factura_detalle`;
CREATE TABLE `factura_detalle` (
  `idfactura_detalle` int(10) NOT NULL,
  `cantidad` int(10) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio_unitario` double DEFAULT NULL,
  `extensas` double DEFAULT NULL,
  `iva5` double DEFAULT NULL,
  `iva10` double DEFAULT NULL,
  `total` double DEFAULT NULL,
  PRIMARY KEY (`idfactura_detalle`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of factura_detalle
-- ----------------------------

-- ----------------------------
-- Table structure for impuestos
-- ----------------------------
DROP TABLE IF EXISTS `impuestos`;
CREATE TABLE `impuestos` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of impuestos
-- ----------------------------
INSERT INTO `impuestos` VALUES ('1', 'IVA10');
INSERT INTO `impuestos` VALUES ('2', 'IVA5');

-- ----------------------------
-- Table structure for paises
-- ----------------------------
DROP TABLE IF EXISTS `paises`;
CREATE TABLE `paises` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of paises
-- ----------------------------
INSERT INTO `paises` VALUES ('1', 'Paraguay');
INSERT INTO `paises` VALUES ('2', 'Brasil');
INSERT INTO `paises` VALUES ('3', 'Uruguay');
INSERT INTO `paises` VALUES ('4', 'Argentina');
INSERT INTO `paises` VALUES ('5', 'Bolivia');

-- ----------------------------
-- Table structure for productos
-- ----------------------------
DROP TABLE IF EXISTS `productos`;
CREATE TABLE `productos` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(255) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `precio_neto` double DEFAULT NULL,
  `precio_impuesto` double DEFAULT NULL,
  `gravada` double DEFAULT NULL,
  `idImpuesto` int(10) DEFAULT NULL,
  `cantidad` int(10) DEFAULT NULL,
  `idProveedor` int(10) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `ipCreacion` varchar(20) DEFAULT NULL,
  `idUsuario` int(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of productos
-- ----------------------------
INSERT INTO `productos` VALUES ('1', 'codigotest', 'productoTest', '15000', '15000000', null, '1', '5', '1', '2020-11-16 15:56:04', '2020-11-16 15:56:04', '192.168.0.9', '1');
INSERT INTO `productos` VALUES ('2', 's', null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `productos` VALUES ('3', 'test', 'test', '1500', '1500000', null, '1', '2', '1', '2020-11-16 16:19:53', '2020-11-16 16:19:53', '192.168.0.9', '1');
INSERT INTO `productos` VALUES ('4', 'test', 'test', '24000', '24000000', null, '1', '10', '1', '2020-11-16 16:24:29', '2020-11-16 16:24:29', '192.168.0.9', '1');
INSERT INTO `productos` VALUES ('5', 'galletita', 'Galletita Nico', '3000', '3000000', null, '1', '2', '1', '2020-11-16 16:25:54', '2020-11-16 16:25:54', '192.168.0.9', '1');
INSERT INTO `productos` VALUES ('6', '52561', 'coca', '5000', '500', null, '1', '5', '1', '2020-11-16 16:40:38', '2020-11-16 16:40:38', '192.168.0.7', '1');

-- ----------------------------
-- Table structure for proveedores
-- ----------------------------
DROP TABLE IF EXISTS `proveedores`;
CREATE TABLE `proveedores` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `idCiudad` int(10) DEFAULT NULL,
  `idPais` int(10) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `RUC` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of proveedores
-- ----------------------------

-- ----------------------------
-- Table structure for seg_grupos
-- ----------------------------
DROP TABLE IF EXISTS `seg_grupos`;
CREATE TABLE `seg_grupos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of seg_grupos
-- ----------------------------
INSERT INTO `seg_grupos` VALUES ('1', 'Super Administrador');
INSERT INTO `seg_grupos` VALUES ('2', 'Adminsitrador');
INSERT INTO `seg_grupos` VALUES ('3', 'Supervisor');
INSERT INTO `seg_grupos` VALUES ('4', 'Estandar');
INSERT INTO `seg_grupos` VALUES ('5', 'Invitado');

-- ----------------------------
-- Table structure for seg_grupo_accesos
-- ----------------------------
DROP TABLE IF EXISTS `seg_grupo_accesos`;
CREATE TABLE `seg_grupo_accesos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_grupo` int(11) DEFAULT NULL,
  `id_acceso` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of seg_grupo_accesos
-- ----------------------------

-- ----------------------------
-- Table structure for seg_grupo_usuario
-- ----------------------------
DROP TABLE IF EXISTS `seg_grupo_usuario`;
CREATE TABLE `seg_grupo_usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_grupo` int(11) DEFAULT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of seg_grupo_usuario
-- ----------------------------
INSERT INTO `seg_grupo_usuario` VALUES ('1', '1', '1');

-- ----------------------------
-- Table structure for seg_usuarios
-- ----------------------------
DROP TABLE IF EXISTS `seg_usuarios`;
CREATE TABLE `seg_usuarios` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `userName` varchar(255) DEFAULT NULL,
  `userPassword` varchar(255) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `edad` int(5) DEFAULT NULL,
  `sexo` varchar(20) DEFAULT NULL,
  `direccion` varchar(255) DEFAULT NULL,
  `idCiudad` int(10) DEFAULT NULL,
  `idPais` int(10) DEFAULT NULL,
  `idEstado` int(10) DEFAULT NULL,
  `idGrupo` int(10) DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL,
  `server` varchar(30) DEFAULT NULL,
  `usuario_creat` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of seg_usuarios
-- ----------------------------
INSERT INTO `seg_usuarios` VALUES ('1', 'admin', 'admin', 'admin', 'admin', 'admin@admin', '27', 'M', null, '1', '1', '1', '1', '2020-11-14 17:42:42', '2020-11-14 17:42:46', '192.168.0.1', '1');

-- ----------------------------
-- Table structure for tipos_documentos
-- ----------------------------
DROP TABLE IF EXISTS `tipos_documentos`;
CREATE TABLE `tipos_documentos` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tipos_documentos
-- ----------------------------
INSERT INTO `tipos_documentos` VALUES ('1', 'RUC');
INSERT INTO `tipos_documentos` VALUES ('2', 'Ceduda de Identidad');
