-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2020 at 08:51 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `toko_buku`
--

-- --------------------------------------------------------

--
-- Table structure for table `administrator`
--

CREATE TABLE `administrator` (
  `username` varchar(10) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jenis_kelamin` char(10) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `tanggal_lahir` datetime(6) NOT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `administrator`
--

INSERT INTO `administrator` (`username`, `nama`, `jenis_kelamin`, `alamat`, `tanggal_lahir`, `password`) VALUES
('Alfarizi', 'Muhammad Alfarizi Tazkia', 'L', 'Jakarta Timur', '2000-10-24 00:00:00.000000', '123456'),
('khoirul', 'Khoirul Roziq', 'L', 'Pelindung Jaya', '1999-12-17 00:00:00.000000', 'Khoirul123'),
('rizqi', 'M. Khoirurrizqi', 'L', 'Bandar Lampung', '2000-10-20 00:00:00.000000', 'rizqi123');

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `isbn` varchar(20) NOT NULL,
  `judul_buku` varchar(80) NOT NULL,
  `pengarang` varchar(50) NOT NULL,
  `penerbit` varchar(30) NOT NULL,
  `tahun_terbit` int(11) NOT NULL,
  `tempat_terbit` varchar(30) NOT NULL,
  `harga` int(11) NOT NULL,
  `jumlah_stok` int(11) NOT NULL,
  `lokasi_penempatan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`isbn`, `judul_buku`, `pengarang`, `penerbit`, `tahun_terbit`, `tempat_terbit`, `harga`, `jumlah_stok`, `lokasi_penempatan`) VALUES
('123-223-2113-34-9', 'Belajar membaca', 'Miftah', 'child store', 2008, 'Bandung', 30000, 100, 'Lemari A'),
('123-223-2343-34-9', 'Programing', 'Khoirul amri', 'Nusa Jaya', 2018, 'Lampung', 100000, 50, 'Lemari D'),
('123-456-789-9', 'Percy Jackson', 'Rick Riordan', 'Mizan Fantasi', 2000, 'Swiss', 82000, 12, 'Lemari B'),
('223-221-2343-34-9', 'Bahasa C++', 'M Roziq ', 'Infokom', 2020, 'Lampung', 85000, 230, 'Lemari D'),
('234-432-555-9', 'Love Store', 'Lauren', 'Stories', 2019, 'Singapore', 76000, 500, 'Lemari B'),
('943-123-321-9', 'Bahasa java', 'M Ulil Amri', 'InfoJaya', 2013, 'Jakarta', 90000, 134, 'Lemari D'),
('978-345-8532-93-9', 'Animasi Pendidikan Menggunakan Flash', 'Priyanto Hidayatullah', 'Informatika', 2011, 'Jakarta', 90000, 140, 'Lemari D'),
('978-602-198-686-9', 'IPA Kelas 5', 'Irene', 'Erlangga', 2013, 'Jakarta', 80000, 20, 'Lemari A'),
('978-602-250-262-3', 'Jejak-Jejak Cinta', 'Toni Raharjo', 'Gema Insani', 2015, 'Bandung', 45000, 200, 'Lemari C'),
('978-602-8519-93-9', 'Pemrograman Database Delphi7', 'Abdul Kadir', 'Penerbit Andi', 2004, 'Malang', 65000, 350, 'Lemari D');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrator`
--
ALTER TABLE `administrator`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`isbn`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
