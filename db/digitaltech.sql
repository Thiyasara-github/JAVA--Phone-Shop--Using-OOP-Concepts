-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Nov 20, 2022 at 01:55 PM
-- Server version: 5.7.36
-- PHP Version: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `digitaltech`
--

-- --------------------------------------------------------

--
-- Table structure for table `phones`
--

DROP TABLE IF EXISTS `phones`;
CREATE TABLE IF NOT EXISTS `phones` (
  `pno` int(20) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `brand` varchar(255) NOT NULL,
  `category` varchar(255) NOT NULL,
  `price` int(20) NOT NULL,
  PRIMARY KEY (`pno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `phones`
--

INSERT INTO `phones` (`pno`, `pname`, `brand`, `category`, `price`) VALUES
(222, 'Samsung', 'A04s', 'smart phone', 56000),
(555, 'Apple', '14plus', 'Tab', 80000),
(333, 'Nokia', 'C20', 'Smart Phone', 54000),
(444, 'Pixel 7', '7', 'Smart Phone', 50000),
(111, 'Redmi', 'Redmi 10', 'Smart Phone', 85000),
(666, 'OnePLus', 'Nord T2', 'ipad', 62000);

-- --------------------------------------------------------

--
-- Table structure for table `selecting`
--

DROP TABLE IF EXISTS `selecting`;
CREATE TABLE IF NOT EXISTS `selecting` (
  `id` int(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `option` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `selecting`
--

INSERT INTO `selecting` (`id`, `username`, `password`, `option`) VALUES
(444, 'mmp', '456', 'Cachier'),
(222, 'taylor', 'def', 'Cachier'),
(333, 'ssp', '123', 'Manager'),
(555, 'jesika', 'jesika', 'Cachier'),
(111, 'sam ', 'sam', 'Manager');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
