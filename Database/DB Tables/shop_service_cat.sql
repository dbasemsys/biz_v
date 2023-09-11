-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 09, 2023 at 07:41 PM
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
-- Table structure for table `shop_service_cat`
--

CREATE TABLE `shop_service_cat` (
  `service_id` int(11) NOT NULL,
  `service` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shop_service_cat`
--

INSERT INTO `shop_service_cat` (`service_id`, `service`) VALUES
(1, 'Eyebrow Threding'),
(2, 'Facial Threding'),
(3, 'Normal Facial'),
(4, 'Gold Facial'),
(5, 'Silver Facial'),
(6, 'Hair Cut'),
(7, 'Layer Hair Cut'),
(8, 'Manicure'),
(9, 'Pedicure'),
(11, 'Pearl Facial');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `shop_service_cat`
--
ALTER TABLE `shop_service_cat`
  ADD PRIMARY KEY (`service_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
