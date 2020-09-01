/*
@Objetive: Se crea la base de datos y las tablas:
@Author: Jose Luis Caamal Ic
@Date: 28/08/2020
*/
CREATE DATABASE `gasvalid` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci */;
USE `gasvalid`;
CREATE TABLE `tabla_clientes` (
  `idestacion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecharegistro` datetime DEFAULT NULL,
  `nombre_responsable` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `razon_social` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `registro_fedcausante` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `domicilio` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `colonia` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `ciudad` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `telefono` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `correo_electronico` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `coordenadasUTM` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `codigo_postal` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `numero_cre` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `marca_gasolina` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraMagna` int(11) DEFAULT NULL,
  `mangueraPremium` int(11) DEFAULT NULL,
  `mangueraDiesel` int(11) DEFAULT NULL,
  `estatus_maguera` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`idestacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `tabla_cronometros` (
  `id_Crono` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `marca` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `serie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estatus` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_calibracion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `resultado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `informe_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id_Crono`),
  UNIQUE KEY `id_Crono_UNIQUE` (`id_Crono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `tabla_dispensarios` (
  `id_dispensario` int(11) NOT NULL AUTO_INCREMENT,
  `no_dispensario` int(11) NOT NULL,
  `numero_estacion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `marca_dispensario` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `numSerie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `alcanceMin` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `aprobacionDGN` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `alcanceMax` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraA` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraB` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraC` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraD` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraE` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `mangueraF` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_reg_disp` datetime DEFAULT NULL,
  PRIMARY KEY (`id_dispensario`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;


CREATE TABLE `tabla_jarras` (
  `id_Jarra` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `marca` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `serie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estatus` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `vol_conv` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `factor_kc` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `resultado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `informe_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id_Jarra`),
  UNIQUE KEY `id_Jarra_UNIQUE` (`id_Jarra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `tabla_mangueras` (
  `id_tmanguera` int(11) NOT NULL,
  `total` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `magna` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `premium` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  `diesel` varchar(10) COLLATE utf8_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_tmanguera`),
  UNIQUE KEY `id_tmanguera_UNIQUE` (`id_tmanguera`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `tabla_registro_solicitud` (
  `folio_solicitud` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `valida_contrato` int(11) NOT NULL DEFAULT '0',
  `nombre_usuario` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `nombre_tecnico` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `fecha_propuesta` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `tipo_solicitud` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `idestacion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `total_mangueras` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `referencia` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `observaciones` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `personal` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`folio_solicitud`),
  UNIQUE KEY `folio_solicitud_UNIQUE` (`folio_solicitud`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `tabla_termometros` (
  `id_Termo` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `marca` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `serie` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `estatus` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fecha_calibracion` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `resultado` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `informe_calibracion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`id_Termo`),
  UNIQUE KEY `id_Termo_UNIQUE` (`id_Termo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `tabla_usuarios` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `password` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `fechainicio` datetime DEFAULT NULL,
  `fechafinal` datetime DEFAULT NULL,
  `nombre_completo` varchar(80) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `tipo_usuario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `nombre_usuario_UNIQUE` (`nombre_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

CREATE TABLE `tablagasvalid` (
  `Holograma` varchar(45) COLLATE utf8_spanish2_ci NOT NULL,
  `No Solicitud` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `F_Verif` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Num Est` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Estacion` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Disp` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Modelo` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Manguera` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Lado` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `Estatus` varchar(45) COLLATE utf8_spanish2_ci DEFAULT 'No asignada',
  `tipoHolograma` varchar(30) COLLATE utf8_spanish2_ci DEFAULT NULL,
  PRIMARY KEY (`Holograma`),
  UNIQUE KEY `Holograma_UNIQUE` (`Holograma`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;





