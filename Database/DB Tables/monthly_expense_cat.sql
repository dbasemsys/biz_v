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
-- Table structure for table `monthly_expense_cat`
--

CREATE TABLE `monthly_expense_cat` (
  `expense_id` int(11) NOT NULL,
  `expense` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `monthly_expense_cat`
--

INSERT INTO `monthly_expense_cat` (`expense_id`, `expense`) VALUES
(1, 'Electricity Bill'),
(2, 'Rent'),
(3, 'Water Bill'),
(4, 'Telephone Bill'),
(5, 'Makeup Things'),
(6, 'Travel');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `monthly_expense_cat`
--
ALTER TABLE `monthly_expense_cat`
  ADD PRIMARY KEY (`expense_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
