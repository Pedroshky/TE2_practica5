![1](https://user-images.githubusercontent.com/66241934/83451779-d4f29880-a457-11ea-9f44-ff15facbf2c9.jpg)
![2](https://user-images.githubusercontent.com/66241934/83451782-d58b2f00-a457-11ea-8915-6c6fa6fb7ad5.jpg)
![3](https://user-images.githubusercontent.com/66241934/83451784-d58b2f00-a457-11ea-9bf3-a747f4dbc598.jpg)
![4](https://user-images.githubusercontent.com/66241934/83451787-d623c580-a457-11ea-800a-f64e7eb9d231.jpg)
![5](https://user-images.githubusercontent.com/66241934/83451788-d623c580-a457-11ea-8d85-fe7a924d406b.jpg)
![6](https://user-images.githubusercontent.com/66241934/83451789-d6bc5c00-a457-11ea-8407-7b0b5ad36e60.jpg)
![7](https://user-images.githubusercontent.com/66241934/83451790-d6bc5c00-a457-11ea-85be-b0e5d75272ec.jpg)

[bd_almacen.txt](https://github.com/Pedroshky/TE2_practica5/files/4713275/bd_almacen.txt)




# TE2_practica5
DAO
-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-06-2020 a las 22:10:24
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_almacen`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `descripcion`, `stock`) VALUES
(1, 'Tomates', 81),
(2, 'Choklitos', 13),
(3, 'Sopitas', 67),
(4, 'Picolo', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
