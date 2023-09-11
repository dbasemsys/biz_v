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
-- Table structure for table `salary`
--

CREATE TABLE `salary` (
  `employee_id` int(11) NOT NULL,
  `salary_month` varchar(50) NOT NULL,
  `credited_date` varchar(50) NOT NULL,
  `salary` double(10,2) NOT NULL,
  `epf` double(10,2) NOT NULL,
  `payable_salary` double(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `salary`
--

INSERT INTO `salary` (`employee_id`, `salary_month`, `credited_date`, `salary`, `epf`, `payable_salary`) VALUES
(1, 'January', '2023-01-31', 10000.00, 800.00, 9200.00),
(2, 'January', '2023-02-02', 10000.00, 800.00, 9200.00),
(5, 'April', '2023-05-03', 11000.00, 880.00, 10120.00),
(6, 'May', '2023-05-31', 12000.00, 960.00, 11040.00),
(8, 'July', '2023-07-31', 10000.00, 800.00, 9200.00),
(9, 'July', '2023-08-01', 11000.00, 880.00, 10120.00),
(6, 'March', 'Wed Aug 16 21:15:27 IST 2023', 18000.00, 1800.00, 16200.00),
(2, 'February', 'Tue Aug 08 21:17:51 IST 2023', 15000.00, 1500.00, 13500.00),
(3, 'February', 'Mon Jul 03 21:18:06 IST 2023', 11000.00, 1100.00, 9900.00),
(7, 'March', 'Mon Jun 05 21:18:47 IST 2023', 12000.00, 1200.00, 10800.00),
(5, 'April', 'Wed Aug 09 21:19:01 IST 2023', 13000.00, 1300.00, 11700.00),
(7, 'August', 'Wed Sep 07 21:19:20 IST 2022', 14500.00, 1450.00, 13050.00),
(10, 'October', 'Mon Oct 10 21:19:39 IST 2022', 12500.00, 1250.00, 11250.00),
(8, 'November', 'Thu Jul 11 21:20:17 IST 2024', 17500.00, 1750.00, 15750.00),
(10, 'January', 'Tue Oct 08 21:20:45 IST 2024', 19000.00, 1900.00, 17100.00),
(3, 'February', 'Thu Mar 02 13:37:04 IST 2023', 15000.00, 1500.00, 13500.00),
(3, 'March', 'Mon May 01 13:39:31 IST 2023', 15000.00, 1500.00, 13500.00),
(3, 'April', 'Wed May 10 13:41:42 IST 2023', 15000.00, 1500.00, 13500.00),
(7, 'February', 'Wed Aug 02 14:19:31 IST 2023', 20000.00, 2000.00, 18000.00),
(10, 'February', 'Wed Aug 02 14:19:31 IST 2023', 10000.00, 1000.00, 9000.00),
(10, 'April', 'Wed Aug 02 14:22:34 IST 2023', 10000.00, 1000.00, 9000.00),
(5, 'February', 'Fri Aug 11 14:31:56 IST 2023', 10000.00, 1000.00, 9000.00),
(10, 'February', 'Wed Aug 03 13:39:19 IST 2022', 10000.00, 1000.00, 9000.00),
(9, 'March', 'Thu Aug 10 13:40:06 IST 2023', 15000.00, 1500.00, 13500.00),
(24, 'July', 'Wed Aug 03 13:40:29 IST 2022', 12000.00, 1200.00, 10800.00),
(15, 'January', 'Wed Aug 06 13:40:41 IST 2025', 11000.00, 1100.00, 9900.00),
(3, 'February', 'Tue Aug 13 13:40:54 IST 2024', 12000.00, 1200.00, 10800.00),
(20, 'January', 'Tue Aug 09 13:41:39 IST 2022', 20000.00, 2000.00, 18000.00),
(4, 'March', 'Tue Apr 04 21:16:01 IST 2023', 15000.00, 1500.00, 13500.00),
(4, 'September', 'Mon Oct 02 08:19:05 IST 2023', 12000.00, 1200.00, 10800.00),
(9, 'September', 'Mon Oct 02 08:27:59 IST 2023', 10000.00, 1000.00, 9000.00),
(8, 'April', 'Mon May 01 08:33:15 IST 2023', 18000.00, 1800.00, 16200.00),
(16, 'April', 'Fri May 13 21:54:14 IST 2022', 15000.00, 1500.00, 13500.00),
(9, 'September', 'Tue Oct 10 22:04:23 IST 2023', 10000.00, 1000.00, 9000.00);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
