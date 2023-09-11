-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 07, 2023 at 12:33 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `biz`
--

-- --------------------------------------------------------

--
-- Table structure for table `db_5_year_in_exp_pro`
--

CREATE TABLE `db_5_year_in_exp_pro` (
  `year` int(11) DEFAULT NULL,
  `income` double(10,2) DEFAULT NULL,
  `expense` double(10,2) DEFAULT NULL,
  `profit` double(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `db_5_year_in_exp_pro`
--

INSERT INTO `db_5_year_in_exp_pro` (`year`, `income`, `expense`, `profit`) VALUES
(2023, 336800.00, 244980.00, 91820.00),
(2022, 600.00, 271400.00, -270800.00),
(2021, 0.00, 0.00, 0.00),
(2020, 0.00, 0.00, 0.00),
(2019, 0.00, 0.00, 0.00);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
