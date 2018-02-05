-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 05, 2018 at 11:16 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbtubes`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--
-- Creation: Feb 03, 2018 at 08:57 AM
--

CREATE TABLE `login` (
  `USERNAME` varchar(16) NOT NULL,
  `PASSWORD` varchar(16) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELATIONS FOR TABLE `login`:
--

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`USERNAME`, `PASSWORD`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `member`
--
-- Creation: Feb 04, 2018 at 02:55 PM
--

CREATE TABLE `member` (
  `MEMBERID` smallint(6) NOT NULL,
  `NAMA` varchar(16) DEFAULT NULL,
  `ALAMAT` varchar(50) DEFAULT NULL,
  `TANGGAL` date DEFAULT NULL,
  `BAYAR` int(16) DEFAULT NULL,
  `TOTAL` int(16) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELATIONS FOR TABLE `member`:
--

-- --------------------------------------------------------

--
-- Table structure for table `pengeluaran`
--
-- Creation: Feb 05, 2018 at 10:11 AM
--

CREATE TABLE `pengeluaran` (
  `BARANGID` smallint(6) NOT NULL,
  `NAMABARANG` varchar(30) NOT NULL,
  `JUMLAH` int(10) DEFAULT NULL,
  `WAKTU` time DEFAULT NULL,
  `HBARANG` int(15) DEFAULT NULL,
  `SEWAID` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELATIONS FOR TABLE `pengeluaran`:
--

-- --------------------------------------------------------

--
-- Table structure for table `schedule`
--
-- Creation: Feb 05, 2018 at 10:07 AM
--

CREATE TABLE `schedule` (
  `SEWAID` smallint(6) NOT NULL,
  `NAMA` varchar(16) NOT NULL,
  `MEMBER` varchar(5) DEFAULT NULL,
  `TELEPON` varchar(13) DEFAULT NULL,
  `DP` varchar(5) NOT NULL,
  `JSEWA` time DEFAULT NULL,
  `JLAPANG` varchar(5) DEFAULT NULL,
  `BAKHIR` int(15) DEFAULT NULL,
  `TBAYAR` int(15) DEFAULT NULL,
  `MEMBERID` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- RELATIONS FOR TABLE `schedule`:
--

--
-- Dumping data for table `schedule`
--

INSERT INTO `schedule` (`SEWAID`, `NAMA`, `MEMBER`, `TELEPON`, `DP`, `JSEWA`, `JLAPANG`, `BAKHIR`, `TBAYAR`, `MEMBERID`) VALUES
(1, 'Fajar', 'Tidak', '081287002547', '1', '13:00:00', '2', 20000, 70000, 0),
(3, 'fajar', 'Ya', '0888121', '1', '14:00:00', '0', 0, 0, 0),
(4, 'Fajar', 'Ya', '2222222', '1', '14:00:00', '0', 0, 0, 0),
(5, '123', 'Ya', '123123', '1', '13:00:00', '0', 0, 0, 0),
(6, 'fajar', 'Ya', '0222222', '1', '00:12:00', '0', 0, 0, 0),
(7, 'fajar', 'Ya', '0222222', '1', '00:12:00', '1', 0, 0, 0),
(8, 'fajar', 'Ya', '123123', '1', '12:31:23', '1', 0, 0, 0),
(9, 'fajar', 'Ya', '123123', '1', '12:31:23', '2', 0, 0, 0),
(10, 'fajar', 'Ya', '08888', '1', '00:12:33', '1', 0, 0, 0),
(11, 'fajar', 'Ya', '08888', '1', '00:12:33', '1', 0, 0, 0),
(12, 'Fajar', 'Ya', '088812', '0', '00:13:22', '1', 0, 0, 0),
(13, 'Fajar', 'Ya', '21212', '0', '00:12:22', '1', 0, 0, 0),
(14, 'sss', 'Bukan', '088888', '0', '00:13:23', '1', 0, 0, 0),
(15, 'kkkk', 'Ya', '082090909', '0', '00:13:23', '2', 111110, 1111110, 0),
(16, 'Sasasasasasa', 'Ya', '000000000000', '0', '00:13:33', '1', 10, 10, 0),
(17, 'aaaa', 'Ya', 'aaa', '0', '00:12:30', '1', 100000, 10000, 0),
(18, 'aaaa', 'Ya', 'aaa', '0', '00:12:30', '1', 100000, 10000, 0),
(19, 'Fajar', 'Bukan', '082222222323', '', '00:14:26', '1', 10000, 10000, 0),
(20, 'aa', 'Ya', '00', '', '00:13:23', '1', 2000, 20000, 0),
(21, 'AAA', 'Ya', 'aaaa', '', '00:13:33', '1', 20000, 20000, 0),
(22, 'aaa', 'Ya', 'asdasd', 'DP', '00:22:32', '2', 10, 10, 0),
(23, 'aaa', 'Ya', 'asdasd', 'CASH', '00:22:32', '2', 10, 10, 0),
(24, 'skaskla', 'Ya', '34343', 'DP', '12:12:12', '1', 12120, 1212, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`USERNAME`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`MEMBERID`);

--
-- Indexes for table `pengeluaran`
--
ALTER TABLE `pengeluaran`
  ADD PRIMARY KEY (`BARANGID`);

--
-- Indexes for table `schedule`
--
ALTER TABLE `schedule`
  ADD PRIMARY KEY (`SEWAID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `member`
--
ALTER TABLE `member`
  MODIFY `MEMBERID` smallint(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `pengeluaran`
--
ALTER TABLE `pengeluaran`
  MODIFY `BARANGID` smallint(6) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `schedule`
--
ALTER TABLE `schedule`
  MODIFY `SEWAID` smallint(6) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
