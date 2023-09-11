-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 07, 2023 at 12:34 PM
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
-- Table structure for table `ordering_services`
--

CREATE TABLE `ordering_services` (
  `service_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `service` varchar(50) NOT NULL,
  `price` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ordering_services`
--

INSERT INTO `ordering_services` (`service_id`, `customer_id`, `service`, `price`) VALUES
(52, 2, 'Bridal Makeup', 20000.00),
(53, 4, 'Reception Makeup', 20000.00),
(64, 18, 'Bridal Makeup', 35000.00),
(67, 23, 'Muslim Bridal Makeup', 15000.00),
(68, 23, 'Party Makeup', 3500.00),
(69, 24, 'Reception Makeup', 11500.00),
(70, 26, 'Muslim Reception Makeup', 12800.00),
(71, 28, 'Muslim Bridal Makeup', 15000.00),
(76, 13, 'Muslim Bridal Makeup', 16500.00),
(77, 13, 'Muslim Bridal Makeup', 10000.00),
(83, 14, 'Muslim reception Makeup', 18500.00),
(84, 15, 'Muslim reception Makeup', 19000.00),
(99, 5, 'Muslim reception Makeup', 17500.00),
(100, 5, 'Party Makeup', 3250.00),
(101, 5, 'Reception Makeup', 10000.00),
(102, 7, 'Muslim reception Makeup', 15200.00),
(106, 6, 'Party Makeup', 3500.00),
(107, 9, 'Reception Makeup', 32500.00),
(108, 31, 'Muslim reception Makeup', 18500.00),
(109, 33, 'Party Makeup', 10000.00),
(110, 33, 'Pubery', 8500.00),
(111, 34, 'Bridal Makeup', 54000.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ordering_services`
--
ALTER TABLE `ordering_services`
  ADD PRIMARY KEY (`service_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ordering_services`
--
ALTER TABLE `ordering_services`
  MODIFY `service_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=112;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
