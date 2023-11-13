-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 13, 2023 at 04:16 AM
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
  `date_release` date DEFAULT NULL,
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
  `user_id` int(11) NOT NULL,
  `date_added` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `logistic`
--

INSERT INTO `logistic` (`product_id`, `product_name`, `product_type`, `product_price`, `date_received`, `date_release`, `eu_po_number`, `po_ref_number`, `brand`, `description`, `model`, `supplier`, `quantity`, `customer`, `warranty`, `warranty_customer`, `user_id`, `date_added`) VALUES
(1, 'Inventory System', 'Software', '60000.00', '2023-10-23', NULL, 'EU111523', 'PO102323', 'N/A', 'Offline system using Java', 'N/A', 'TESDA Trainees - Antique (Group 3)', 1, 'Intellyx IT Solutions', '3 Months', 'Intellyx IT Solutions', 3, '2023-11-11'),
(2, 'Point of Sales', 'Software', '120000.00', '2023-11-06', '2023-11-13', 'EU111323', 'PO110623', 'N/A', 'Web-based online system', 'N/A', 'Intellyx IT Solutions', 1, 'Le Art Cafe', '6 Months', 'Le Art Cafe', 3, '2023-11-13'),
(3, 'Blog Website', 'Software', '150000.00', '2023-10-30', '2023-11-07', 'EU110723', 'PO103023', 'N/A', 'Web-based online system using Next.js', 'N/A', 'Intellyx IT Solutions', 1, 'Vulb Media', '6 Months', 'Vulb Media', 3, '2023-11-13'),
(4, 'Appointment System', 'Software', '130000.00', '2023-11-04', '2023-11-13', 'EU111323', 'PO110423', 'N/A', 'Online Application', 'N/A', 'Intellyx IT Solutions', 1, 'King Hotel', '6 Months', 'King Hotel', 5, '2023-11-13');

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
  `date_accomplished` date DEFAULT NULL,
  `last_update` date NOT NULL,
  `deadline` date NOT NULL,
  `user_id` int(10) NOT NULL,
  `date_added` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`sale_id`, `date`, `project_or_end_user`, `quantity`, `description`, `supplier`, `supplier_price`, `srp`, `remarks`, `date_accomplished`, `last_update`, `deadline`, `user_id`, `date_added`) VALUES
(1, '2023-10-23', 'Inventory System', 1, 'Java Standalone Application', 'TESDA Trainees - Antique (Group 3)', '60000.00', '60000.00', 'Offline', NULL, '2023-10-23', '2023-11-15', 2, '2023-11-11'),
(2, '2023-11-06', 'Point of Sales', 1, 'Web-based System', 'Intellyx IT Solutions', '120000.00', '100000.00', 'Online', '2023-11-13', '2023-11-13', '2023-11-13', 2, '2023-11-11'),
(3, '2023-10-30', 'Blog Website', 1, 'Built with Next.js', 'Intellyx IT Solutions', '150000.00', '130000.00', 'Online', '2023-11-07', '2023-10-07', '2023-11-08', 4, '2023-11-13'),
(4, '2023-11-04', 'Appointment System', 1, 'Java Standalone Application', 'Intellyx IT Solutions', '130000.00', '100000.00', 'Online', '2023-11-13', '2023-11-13', '2023-11-14', 4, '2023-11-13');

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
(1, 'Admin', 'Admin', 'Main', 'Malabon City', '09351688531', 'main.admin@gmail.com', 'admin', 'admin123'),
(2, 'Sales', '1', 'Sales', 'Tobias Fornier', '09658312243', 'sales1@gmail.com', 'sales1', 'sales123'),
(3, 'Logistics', '1', 'Logistic', 'San Jose', '09852416729', 'logistic1@gmail.com', 'logistic1', 'logistic123'),
(4, 'Sales', '2', 'Sales', 'Valderrama', '09719475332', 'sales2@gmail.com', 'sales2', 'sales123'),
(5, 'Logistics', '2', 'Logistic', 'Sibalom', '09947559305', 'logistic2@gmail.com', 'logistic2', 'logistic123');

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
  MODIFY `product_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

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
