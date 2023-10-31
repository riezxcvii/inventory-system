-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 31, 2023 at 02:28 PM
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

--
-- Dumping data for table `logistic`
--

INSERT INTO `logistic` (`product_id`, `product_name`, `product_type`, `product_price`, `date_received`, `date_release`, `eu_po_number`, `po_ref_number`, `brand`, `description`, `model`, `supplier`, `quantity`, `customer`, `warranty`, `warranty_customer`, `user_id`) VALUES
(2, 'pen', 'school supplies', 5434.00, '2023-10-06', '2023-10-20', 'kjgfjkhb', 'kjrdkfgd', 'kjrdjkfdgf', 'hahaha', 'ako ay isang model', 'kjvrdtjrftgfd', 232, 'mfjgf', 'knfgjg', 'hbvfhmddgcmf', 9);

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `sale`
--

INSERT INTO `sale` (`sale_id`, `date`, `project_or_end_user`, `quantity`, `description`, `supplier`, `supplier_price`, `srp`, `remarks`, `date_accomplished`, `last_update`, `deadline`, `user_id`) VALUES
(1, '2023-10-27', 'hehehe', 24, 'sha', 'ako', 23.00, 543.00, 'df,s', '2023-10-27', '2023-10-27', '2023-10-21', 6),
(2, '2023-10-11', 'jhvdfx', 34, 'njdf', 'jkgrfdjkgf', 32.00, 342.00, 'mfdjkdf', '2023-10-21', '2023-10-21', '2023-10-12', 4),
(7, '2023-10-12', 'fhgcdfh', 25, 'jhvdfdjk', 'jhdfs', 23.00, 23.00, 'kjbfdkxj', '2023-10-20', '2023-10-13', '2023-10-11', 4);

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
(1, 'Admin', 'admin', 'admin', 'luhdfgfkh', '0912345678', 'ndsjx@gffjd', 'admin', 'admin123'),
(4, 'Sales', 'Virgo', 'Sunny', 'Tobias Fornier, Antique', '0963547343', 'gfd23@gmail.com', 'sunny', 'virgo'),
(6, 'Sales', 'Zenin', 'Inumaki', 'jjk', '7564564654', 'hfdsgh@gjdfjgf.com', 'inu', 'maki'),
(7, 'Logistics', 'jedf', 'djsdfd', 'ysulat', '4546578', 'bkjfdxd', 'kjfds', 'bvfd'),
(8, 'Logistics', '1', 'Logistic', 'hgdffjdskj', '09647546564', 'jhrjdf@hgdshf.com', 'logis', 'tic'),
(9, 'Logistics', '2', 'Logistic', 'hrtdfgjfdj', '0965675643', 'dfh@ghdfjgdf.com', 'logistic', 'two');

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
  MODIFY `sale_id` int(15) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `user_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
