-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 04, 2023 at 04:43 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 7.3.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory_system`
--

-- --------------------------------------------------------

--
-- Table structure for table `logistic`
--

CREATE TABLE `logistic` (
  `product_id` int(15) NOT NULL,
  `product_name` varchar(50) NOT NULL,
  `product_type` varchar(30) NOT NULL,
  `product_price` decimal(10,2) NOT NULL,
  `date_received` date NOT NULL,
  `date_release` date NOT NULL,
  `eu_po_number` varchar(30) NOT NULL,
  `po_ref_number` varchar(30) NOT NULL,
  `brand` varchar(50) NOT NULL,
  `description` varchar(255) NOT NULL,
  `model` varchar(50) NOT NULL,
  `supplier` varchar(100) NOT NULL,
  `quantity` int(10) NOT NULL,
  `customer` varchar(50) NOT NULL,
  `warranty` varchar(30) NOT NULL,
  `warranty_customer` varchar(50) NOT NULL,
  `user_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logistic`
--

INSERT INTO `logistic` (`product_id`, `product_name`, `product_type`, `product_price`, `date_received`, `date_release`, `eu_po_number`, `po_ref_number`, `brand`, `description`, `model`, `supplier`, `quantity`, `customer`, `warranty`, `warranty_customer`, `user_id`) VALUES
(1, 'Printer', 'Office Equipment', '30000.00', '2023-10-17', '2023-10-20', 'EU175893', 'PO839429', 'Epson', 'Brand New', 'Epson EcoTankL14150', 'Lee\'s Computer Hardware', 20, 'Virtual Assistant Experts PH', '1 Year', 'Virtual Assistant Experts PH', 3),
(2, 'Desktop Computer', 'Computer Hardware', '65000.00', '2023-10-31', '2023-11-04', 'EU198725', 'PO567499', 'Acer', 'Brand New', 'Aspire TC 1770 13th Gen', 'Tech Savy Inc.', 100, 'MJ Computer Hub', '1 Year', 'MJ Computer Hub', 3);

-- --------------------------------------------------------

--
-- Table structure for table `sale`
--

CREATE TABLE `sale` (
  `sale_id` int(15) NOT NULL,
  `date` date NOT NULL,
  `project_or_end_user` varchar(50) NOT NULL,
  `quantity` int(10) NOT NULL,
  `description` varchar(255) NOT NULL,
  `supplier` varchar(100) NOT NULL,
  `supplier_price` decimal(10,2) NOT NULL,
  `srp` decimal(10,2) NOT NULL,
  `remarks` varchar(255) NOT NULL,
  `date_accomplished` date NOT NULL,
  `last_update` date NOT NULL,
  `deadline` date NOT NULL,
  `user_id` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`sale_id`, `date`, `project_or_end_user`, `quantity`, `description`, `supplier`, `supplier_price`, `srp`, `remarks`, `date_accomplished`, `last_update`, `deadline`, `user_id`) VALUES
(1, '2023-10-17', 'Printer', 20, 'Brand New', 'Lee\'s Computer Hardware', '30000.00', '27495.00', 'Check for defects', '2023-10-20', '2023-10-19', '2023-10-21', 2),
(2, '2023-10-31', 'Desktop Computer', 100, 'Brand New', 'Tech Savy Inc.', '65000.00', '63649.00', 'Complete Set', '2023-11-03', '2023-11-04', '2023-11-06', 2);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `user_id` int(10) NOT NULL,
  `user_type` varchar(20) NOT NULL,
  `last_name` varchar(20) NOT NULL,
  `first_name` varchar(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `mobile_number` varchar(20) NOT NULL,
  `email_address` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_type`, `last_name`, `first_name`, `address`, `mobile_number`, `email_address`, `username`, `password`) VALUES
(1, 'Admin', 'Banquillo', 'Rieza', 'San Jose, Antique', '09539858289', 'rieza.banquillo@gmail.com', 'rieza', 'banquillo'),
(2, 'Sales', 'Virgo', 'Sunny', 'Tobias Fornier, Antique', '09759375104', 'sunny.virgo@gmail.com', 'sunny', 'virgo'),
(3, 'Logistics', 'Miguel', 'Edvenson', 'San Jose, Antique', '09746588718', 'edvenson.miguel@gmail.com', 'edvenson', 'miguel');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logistic`
--
ALTER TABLE `logistic`
  ADD PRIMARY KEY (`product_id`);

--
-- Indexes for table `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`sale_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `logistic`
--
ALTER TABLE `logistic`
  MODIFY `product_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `sale`
--
ALTER TABLE `sale`
  MODIFY `sale_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
