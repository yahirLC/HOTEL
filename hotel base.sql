-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-01-2023 a las 18:42:01
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `idPersona` int(11) NOT NULL,
  `CodigoCliente` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cuarto`
--

CREATE TABLE `cuarto` (
  `idCuarto` int(11) NOT NULL,
  `numero` varchar(4) NOT NULL,
  `piso` varchar(2) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `caracteristicas` varchar(512) DEFAULT NULL,
  `precio_diario` decimal(7,2) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `tipocuarto` varchar(20) NOT NULL,
  `nomimagen` varchar(100) NOT NULL,
  `imagen` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cuarto`
--

INSERT INTO `cuarto` (`idCuarto`, `numero`, `piso`, `descripcion`, `caracteristicas`, `precio_diario`, `estado`, `tipocuarto`, `nomimagen`, `imagen`) VALUES
(13, '1', '6', 'Nuestro cuarto individual es la opción perfecta para aquellos que viajan en solitario y buscan una habitación privada y cómoda. Incluye una cama doble, escritorio, TV y baño privado.', '-Para una pesona\n-Cuarto pequeño', '100.00', 'Disponible', 'Individual', '', ''),
(14, '2', '6', 'Nuestro cuarto individual es ideal para aquellos que buscan una escapada solitaria y relajante. Incluye una cama doble cómoda, escritorio, TV y baño privado con ducha de hidromasaje.', '-Para una pesona\n-Cuarto pequeño', '100.00', 'Disponible', 'Individual', '', ''),
(15, '3', '6', 'Nuestro cuarto individual es ideal para viajeros que buscan privacidad y comodidad. Incluye una cama doble cómoda, escritorio, TV y baño privado con ducha de hidromasaje.', '-Para una pesona\n-Cuarto pequeño', '100.00', 'Disponible', 'Individual', '', ''),
(16, '4', '6', 'Nuestro cuarto individual es perfecto para aquellos que buscan un espacio acogedor y privado. Incluye una cama doble cómoda, escritorio, TV y baño privado con ducha de hidromasaje.', '-Para una pesona\n-Cuarto pequeño', '100.00', 'Disponible', 'Individual', '', ''),
(17, '5', '5', 'Nuestro cuarto individual es ideal para aquellos que buscan una habitación cómoda y privada durante su viaje. Incluye una cama doble cómoda, escritorio, TV y baño privado con ducha de hidromasaje.', '-Para una pesona\n-Cuarto pequeño', '100.00', 'Disponible', 'Individual', '', ''),
(18, '6', '5', 'Nuestro cuarto individual es perfecto para aquellos que buscan un espacio acogedor y privado para descansar durante su viaje. Incluye una cama doble cómoda, escritorio, TV y baño privado con ducha de hidromasaje.', '-Para una pesona\n-Cuarto pequeño', '100.00', 'Disponible', 'Individual', '', ''),
(19, '7', '5', 'Nuestro cuarto matrimonial es ideal para parejas que buscan un espacio romántico y cómodo. Incluye una cama king size, chimenea, sofá cama y baño con bañera de hidromasaje.', '-Para 2 personas\n-Perfecto para recien casados', '200.00', 'Disponible', 'Matrimonial', '', ''),
(20, '8', '5', 'Nuestro cuarto matrimonial es perfecto para parejas que desean disfrutar de un fin de semana romántico. Incluye una cama king size, chimenea, sofá cama y baño con bañera de hidromasaje.', '-Para 2 personas\n-Perfecto para recien casados', '200.00', 'Disponible', 'Matrimonial', '', ''),
(21, '9', '4', 'Nuestro cuarto matrimonial es ideal para parejas que desean un espacio romántico y acogedor. Incluye una cama king size, chimenea, sofá cama y baño con bañera de hidromasaje.', '-Para 2 personas\n-Perfecto para recien casados', '200.00', 'Disponible', 'Matrimonial', '', ''),
(22, '10', '4', 'Nuestro cuarto matrimonial es perfecto para parejas que buscan un lugar romántico y cómodo durante su viaje. Incluye una cama king size, chimenea, sofá cama y baño con bañera de hidromasaje.', '-Para 2 personas\n-Perfecto para recien casados', '200.00', 'Disponible', 'Matrimonial', '', ''),
(23, '11', '4', 'Nuestro cuarto matrimonial es ideal para parejas que buscan un espacio acogedor y privado durante su estancia. Incluye una cama king size, chimenea, sofá cama y baño con bañera de hidromasaje.', '-Para 2 personas\n-Perfecto para recien casados', '200.00', 'Disponible', 'Matrimonial', '', ''),
(24, '12', '4', 'Nuestro cuarto matrimonial es perfecto para parejas que buscan un lugar romántico y cómodo durante su viaje. Incluye una cama king size, chimenea, sofá cama y baño con bañera de hidromasaje.', '-Para 2 personas\n-Perfecto para recien casados', '200.00', 'Disponible', 'Matrimonial', '', ''),
(25, '13', '3', 'Nuestro cuarto familiar es perfecto para familias con niños. Incluye dos habitaciones conectadas con puertas interiores, cada una con su propia cama doble y baño privado. También hay una sala de estar con sofá cama y TV.', '-Para 3 personas\n-Para pasar unas vacaciones con la familia', '300.00', 'Disponible', 'Familiar', '', ''),
(26, '14', '3', 'Nuestro cuarto familiar es ideal para familias con niños pequeños. Incluye dos habitaciones conectadas con puertas interiores, cada una con su propia cama doble y baño privado. También hay una sala de estar con sofá cama y TV.', '-Para 3 personas\n-Para pasar unas vacaciones con la familia', '300.00', 'Disponible', 'Familiar', '', ''),
(27, '15', '3', 'Nuestro cuarto familiar es la opción perfecta para familias que buscan un espacio amplio y cómodo durante su estancia. Incluye dos habitaciones conectadas con puertas interiores, cada una con su propia cama doble y baño privado..', '-Para 3 personas\n-Para pasar unas vacaciones con la familia', '300.00', 'Disponible', 'Familiar', '', ''),
(28, '16', '3', 'Nuestro cuarto familiar es perfecto para familias que buscan un lugar acogedor y espacioso durante su estancia. Incluye dos habitaciones conectadas con puertas interiores, cada una con su propia cama doble y baño privado. ', '-Para 3 personas\n-Para pasar unas vacaciones con la familia', '300.00', 'Disponible', 'Familiar', '', ''),
(29, '17', '2', 'Nuestro cuarto familiar es ideal para familias que buscan un lugar cómodo y espacioso para disfrutar durante su viaje. Incluye dos habitaciones conectadas con puertas interiores, cada una con su propia cama doble y baño privado.', '-Para 3 personas\n-Para pasar unas vacaciones con la familia', '300.00', 'Disponible', 'Familiar', '', ''),
(30, '18', '2', 'Nuestro cuarto familiar es ideal para familias que buscan un lugar cómodo y espacioso para disfrutar durante su viaje. Incluye dos habitaciones conectadas con puertas interiores, cada una con su propia cama doble y baño privado.', '-Para 3 personas\n-Para pasar unas vacaciones con la familia', '300.00', 'Disponible', 'Familiar', '', ''),
(31, '19', '1', 'Nuestro cuarto de fiesta es ideal para grupos de amigos que buscan un lugar para celebrar. Incluye una gran cama king size, una mesa de billar, un bar y una terraza con vistas panorámicas.', '-Para mas de 4 personas (6 limite)\n-Ideal para fiestas', '400.00', 'Disponible', 'Fiesta', '', ''),
(32, '20', '1', 'Nuestro cuarto de fiesta es perfecto para grupos de amigos que buscan un lugar para celebrar y divertirse. Incluye una gran cama king size, una mesa de billar, un bar y una terraza con vistas panorámicas.', '-Para mas de 4 personas (6 limite)\n-Ideal para fiestas', '400.00', 'Disponible', 'Fiesta', '', ''),
(33, '21', '1', 'Nuestro cuarto de fiesta es la opción perfecta para grupos de amigos que buscan un lugar para celebrar y pasar un buen rato. Incluye una gran cama king size, una mesa de billar, un bar y una terraza con vistas panorámicas.', '-Para mas de 4 personas (6 limite)\n-Ideal para fiestas', '400.00', 'Disponible', 'Fiesta', '', ''),
(34, '22', '1', 'Nuestro cuarto de fiesta es la opción perfecta para grupos de amigos que buscan un lugar para celebrar y pasar un buen rato. Incluye una gran cama king size, una mesa de billar, un bar y una terraza con vistas panorámicas.', '-Para mas de 4 personas (6 limite)\n-Ideal para fiestas', '400.00', 'Disponible', 'Fiesta', '', ''),
(35, '23', '1', 'Nuestro cuarto de fiesta es ideal para grupos de amigos que buscan un lugar para celebrar. Incluye una gran cama king size, una mesa de billar, un bar y una terraza con vistas panorámicas.', '-Para mas de 4 personas (6 limite)\n-Ideal para fiestas', '400.00', 'Disponible', 'Fiesta', '', ''),
(36, '24', '1', 'Nuestro cuarto de fiesta es ideal para grupos de amigos que buscan un lugar para celebrar. Incluye una gran cama king size, una mesa de billar, un bar y una terraza con vistas panorámicas.', '-Para mas de 4 personas (6 limite)\n-Ideal para fiestas', '400.00', 'Disponible', 'Fiesta', '', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `idPago` int(11) NOT NULL,
  `tipo` varchar(45) NOT NULL,
  `monto` decimal(7,2) NOT NULL,
  `idReservacion` int(11) NOT NULL,
  `fecha_pago` varchar(50) NOT NULL,
  `no_comprobante` varchar(11) NOT NULL,
  `iva` double(4,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `a_paterno` varchar(45) NOT NULL,
  `a_materno` varchar(45) NOT NULL,
  `fecha_nacimiento` varchar(50) NOT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `correo` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`idPersona`, `nombre`, `a_paterno`, `a_materno`, `fecha_nacimiento`, `telefono`, `correo`) VALUES
(22, 'Yahir', 'Lagunes', 'Ceballos', 'Sun Nov 24 21:06:52 CST 2002', '2299507538', 'yahirlagunesceballos@gmail.com'),
(23, 'Elon', 'Reeve', 'Musk', 'Thu Jan 05 10:01:33 CST 2023', '1234567890', 'elon@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservacion`
--

CREATE TABLE `reservacion` (
  `idReservacion` int(11) NOT NULL,
  `fecha_reservacion` varchar(50) NOT NULL,
  `fecha_ingreso` varchar(50) NOT NULL,
  `fecha_salida` varchar(50) NOT NULL,
  `costo_total` decimal(7,2) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `idCuarto` int(11) NOT NULL,
  `estado` varchar(15) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `idTrabajador` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trabajador`
--

CREATE TABLE `trabajador` (
  `idPersona` int(11) NOT NULL,
  `login` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `acceso` varchar(45) NOT NULL,
  `sueldo` double(7,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `trabajador`
--

INSERT INTO `trabajador` (`idPersona`, `login`, `contraseña`, `acceso`, `sueldo`) VALUES
(22, 'yahir', '1234', 'Admin', 99999.00),
(23, 'elon', '1234', 'Editor', 10.00);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`idPersona`),
  ADD UNIQUE KEY `CodigoCliente` (`CodigoCliente`);

--
-- Indices de la tabla `cuarto`
--
ALTER TABLE `cuarto`
  ADD PRIMARY KEY (`idCuarto`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`idPago`),
  ADD KEY `idReservacion` (`idReservacion`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`idPersona`),
  ADD UNIQUE KEY `telefono` (`telefono`),
  ADD UNIQUE KEY `correo` (`correo`);

--
-- Indices de la tabla `reservacion`
--
ALTER TABLE `reservacion`
  ADD PRIMARY KEY (`idReservacion`),
  ADD KEY `idCliente` (`idCliente`),
  ADD KEY `idCuarto` (`idCuarto`),
  ADD KEY `reservacion_ibfk_3` (`idTrabajador`);

--
-- Indices de la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD PRIMARY KEY (`idPersona`),
  ADD UNIQUE KEY `login` (`login`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cuarto`
--
ALTER TABLE `cuarto`
  MODIFY `idCuarto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `idPago` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `persona`
--
ALTER TABLE `persona`
  MODIFY `idPersona` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `reservacion`
--
ALTER TABLE `reservacion`
  MODIFY `idReservacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `cliente_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pago`
--
ALTER TABLE `pago`
  ADD CONSTRAINT `pago_ibfk_1` FOREIGN KEY (`idReservacion`) REFERENCES `reservacion` (`idReservacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `reservacion`
--
ALTER TABLE `reservacion`
  ADD CONSTRAINT `reservacion_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `cliente` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `reservacion_ibfk_2` FOREIGN KEY (`idCuarto`) REFERENCES `cuarto` (`idCuarto`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `reservacion_ibfk_3` FOREIGN KEY (`idTrabajador`) REFERENCES `trabajador` (`idPersona`);

--
-- Filtros para la tabla `trabajador`
--
ALTER TABLE `trabajador`
  ADD CONSTRAINT `trabajador_ibfk_1` FOREIGN KEY (`idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
