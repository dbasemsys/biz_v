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
-- Table structure for table `ordering_service_expenses`
--

CREATE TABLE `ordering_service_expenses` (
  `expense_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `expense` varchar(50) NOT NULL,
  `cost` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ordering_service_expenses`
--

INSERT INTO `ordering_service_expenses` (`expense_id`, `customer_id`, `expense`, `cost`) VALUES
(26, 4, 'Reception Makeup', 1500.00),
(36, 24, 'Head Dress', 300.00),
(37, 24, 'Jewells', 200.00),
(38, 28, 'Head Dress', 500.00),
(39, 28, 'Jewells', 500.00),
(42, 13, 'Head Dress', 250.00),
(43, 13, 'Boquet', 250.00),
(49, 14, 'Jewells', 500.00),
(50, 15, 'Head Dress', 800.00),
(51, 15, 'Jewells', 1200.00),
(71, 5, 'Boquet', 250.00),
(72, 5, 'Head Dress', 500.00),
(73, 7, 'Jewells', 800.00),
(79, 6, 'Jewells', 200.00),
(80, 9, 'Boquet', 1500.00),
(81, 9, 'Head Dress', 1000.00),
(82, 31, 'Boquet', 500.00),
(83, 34, 'Boquet', 500.00),
(84, 34, 'Jewells', 500.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ordering_service_expenses`
--
ALTER TABLE `ordering_service_expenses`
  ADD PRIMARY KEY (`expense_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ordering_service_expenses`
--
ALTER TABLE `ordering_service_expenses`
  MODIFY `expense_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=85;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
