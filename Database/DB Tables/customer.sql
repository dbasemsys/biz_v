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
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL,
  `service_type` varchar(50) NOT NULL,
  `serviced_date` date DEFAULT NULL,
  `branch` varchar(50) NOT NULL,
  `discount` double(10,2) NOT NULL,
  `total_price` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `customer_name`, `phone`, `service_type`, `serviced_date`, `branch`, `discount`, `total_price`) VALUES
(1, 'one', '1111', 'Shop', '2023-08-01', 'Branch1', 500.00, 5000.00),
(2, 'two', '222', 'Order', '2023-08-02', 'Branch2', 0.00, 20000.00),
(3, 'three', '333', 'Shop', '2023-08-03', 'Branch2', 0.00, 0.00),
(4, 'four', '444', 'Order', '2023-08-04', 'Branch1', 0.00, 18500.00),
(5, 'five55', '5558523690', 'Order', '2023-08-05', 'Branch2', 0.00, 30000.00),
(6, 'six66', '6666666666', 'Order', '2023-08-06', 'Branch1', 0.00, 3300.00),
(7, 'seven77seven', '7758568945', 'Order', '2023-08-17', 'Branch2', 0.00, 14400.00),
(8, 'eight8eight', '8855788956', 'Shop', '2023-08-08', 'Branch2', 0.00, 1800.00),
(9, 'nine99nine', '9999451223', 'Order', '2023-08-08', 'Branch1', 0.00, 30000.00),
(10, 'ten1010ten', '1010457812', 'Shop', '2023-08-11', 'Branch1', 500.00, 1000.00),
(11, 'eleven11', '1452859623', 'Shop', '2023-08-17', 'Branch2', 100.00, 5400.00),
(12, 'twelve1212', '1212635241', 'Shop', '2023-08-12', 'Branch1', 500.00, 6500.00),
(13, 'thirteen1313', '1313635241', 'Order', '2023-08-14', 'Branch2', 0.00, 26000.00),
(14, 'fourteen', '1245587458', 'Order', '2023-08-14', 'Branch2', 0.00, 18000.00),
(15, 'fifteen15', '4578895612', 'Order', '2023-08-15', 'Branch2', 0.00, 17000.00),
(17, 'seventeen17', '1745788956', 'Shop', '2023-08-17', 'Branch2', 0.00, 9500.00),
(18, 'eighteen', '5645786523', 'Order', '2023-08-25', 'Branch2', 0.00, 35000.00),
(19, 'niinteen', '8956235689', 'Shop', '2023-08-26', 'Branch2', 0.00, 3800.00),
(20, 'tw0', '8954785623', 'Shop', '2022-08-03', 'Branch1', 50.00, 600.00),
(21, 'tw1', '1245897845', 'Shop', '2023-08-16', 'Branch2', 50.00, 4950.00),
(22, 'tw2', '5654878965', 'Shop', '2023-08-16', 'Branch2', 150.00, 4350.00),
(23, 'tw3', '4578895612', 'Order', '2023-08-14', 'Branch1', 0.00, 18500.00),
(24, 'tw4', '5247586923', 'Order', '2023-08-09', 'Branch1', 0.00, 11000.00),
(26, 'tw6', '5689784512', 'Order', '2023-08-17', 'Branch1', 0.00, 12800.00),
(27, 'tw7', '4578896545', 'Shop', '2023-08-02', 'Branch1', 500.00, 5500.00),
(28, 'tw8', '2547889654', 'Order', '2023-08-09', 'Branch2', 0.00, 14000.00),
(29, 'fg', '7889564512', 'Shop', '2023-08-10', 'Branch1', 500.00, 1000.00),
(30, 'th0', '2345788956', 'Shop', '2023-09-05', 'Branch1', 0.00, 1500.00),
(31, 'th1', '5645785623', 'Order', '2023-09-05', 'Branch2', 0.00, 18000.00),
(32, 'th32', '1584788956', 'Shop', '2023-09-06', 'Branch2', 300.00, 5700.00),
(33, 'th33', '2051845962', 'Order', '2023-09-06', 'Branch1', 0.00, 18500.00),
(34, 'th34', '5684510236', 'Order', '2023-09-06', 'Branch2', 0.00, 53000.00);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
