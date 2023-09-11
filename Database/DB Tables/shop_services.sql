-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 07, 2023 at 12:35 PM
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
-- Table structure for table `shop_services`
--

CREATE TABLE `shop_services` (
  `service_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `service` varchar(50) NOT NULL,
  `price` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shop_services`
--

INSERT INTO `shop_services` (`service_id`, `customer_id`, `service`, `price`) VALUES
(54, 1, 'Eyebrow Threding', 5500.00),
(66, 20, 'Normal Facial', 650.00),
(67, 21, 'Gold facial', 5000.00),
(68, 22, 'Normal Facial', 4500.00),
(70, 27, 'Facial Threding', 1500.00),
(71, 27, 'Silver Facial', 4500.00),
(72, 29, 'Gold facial', 1500.00),
(95, 19, 'Facial Threding', 2800.00),
(96, 19, 'Normal Facial', 1000.00),
(105, 11, 'Manicure', 5000.00),
(106, 11, 'Eyebrow Threading', 500.00),
(109, 17, 'Silver Facial', 4500.00),
(110, 17, 'Gold Facial', 5000.00),
(121, 12, 'Silver Facial', 2500.00),
(122, 12, 'Gold Facial', 4500.00),
(128, 10, 'Normal Facial', 1500.00),
(129, 8, 'Normal Facial', 1800.00),
(131, 30, 'Normal Facial', 1500.00),
(132, 32, 'Gold Facial', 4500.00),
(133, 32, 'Hair Cut', 1500.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `shop_services`
--
ALTER TABLE `shop_services`
  ADD PRIMARY KEY (`service_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `shop_services`
--
ALTER TABLE `shop_services`
  MODIFY `service_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=134;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
