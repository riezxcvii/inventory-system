-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 09, 2023 at 10:11 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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
  `user_id` int(10) NOT NULL,
  `date_added` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`sale_id`, `date`, `project_or_end_user`, `quantity`, `description`, `supplier`, `supplier_price`, `srp`, `remarks`, `date_accomplished`, `last_update`, `deadline`, `user_id`, `date_added`) VALUES
(2, '2023-11-10', 'srbgdfd', 432, 'mdfs', 'hgjess', 23.00, 23.00, 'mbndfss', '2023-11-10', '2023-11-10', '2023-11-10', 4, '2023-11-09'),
(3, '2023-11-17', 'r,mtfd', 43, 'mrds', 'hdf', 243.00, 434.00, 'bfmnddfx', '2023-11-10', '2023-11-10', '2023-11-10', 4, '2023-11-09'),
(4, '2023-11-10', 'jkfjcg', 343, 'gjdnfh', 'jrtrdf', 34.00, 564.00, 'gf', '2023-11-10', '2023-11-10', '2023-11-10', 5, '2023-11-09');

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`user_id`, `user_type`, `last_name`, `first_name`, `address`, `mobile_number`, `email_address`, `username`, `password`) VALUES
(1, 'Admin', 'Admin', 'Default', 'Philippines', '099999999999', 'your.email@gmail.com', 'admin', 'admin123'),
(4, 'Sales', 'virgo', 'sunny', 'gjredtf', '0946564566', 'gkjrd@gmail.com', 'sunny', 'virgo'),
(5, 'Sales', 'one', 'sale', 'gjhdf', '096456465', 'kgjrtds@gmIL.COM', 'sale', 'one');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `logistic`
--
ALTER TABLE `logistic`
  ADD PRIMARY KEY (`product_id`),
  ADD KEY `logistic` (`user_id`);

--
-- Indexes for table `sale`
--
ALTER TABLE `sale`
  ADD PRIMARY KEY (`sale_id`),
  ADD KEY `userId` (`user_id`);

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
  MODIFY `product_id` int(15) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `sale`
--
ALTER TABLE `sale`
  MODIFY `sale_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `logistic`
--
ALTER TABLE `logistic`
  ADD CONSTRAINT `logistic` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `sale`
--
ALTER TABLE `sale`
  ADD CONSTRAINT `userId` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
