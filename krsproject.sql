-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 27 Jun 2021 pada 15.13
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `krsproject`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_krs`
--

CREATE TABLE `tb_krs` (
  `nim` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kelas` varchar(2) NOT NULL,
  `id_matakuliah` varchar(50) NOT NULL,
  `matakuliah` varchar(50) NOT NULL,
  `sks` int(2) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_krs`
--

INSERT INTO `tb_krs` (`nim`, `nama`, `kelas`, `id_matakuliah`, `matakuliah`, `sks`, `semester`, `dosen`) VALUES
('11200930000013', 'Azka Septia Rahman', 'A', 'FST6091304', 'ALGORITMA DAN STRUKTUR DATA', 4, '2 (Genap)', 'Zainul Arham, M.Si'),
('11200930000013', 'Azka Septia Rahman', 'A', 'UIN6032202', 'ISLAM DAN ILMU PENGETAHUAN', 3, '2 (Genap)', 'Rusdi Hamka Lubis, SEI, M.Si'),
('11200930000013', 'Azka Septia Rahman', 'A', 'FST6091103', 'PEMROGRAMAN LANJUT', 3, '2 (Genap)', 'Muhamad Nur Gunawan, MBA');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_mahasiswa`
--

CREATE TABLE `tb_mahasiswa` (
  `nim` varchar(50) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kelas` varchar(2) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_mahasiswa`
--

INSERT INTO `tb_mahasiswa` (`nim`, `nama`, `kelas`, `jurusan`, `semester`) VALUES
('11200930000013', 'Azka Septia Rahman', 'A', 'Sistem Informasi', '2 (Genap)'),
('11200930000011', 'Mar\'atus Sholihah', 'A', 'Sistem Informasi', '2 (Genap)'),
('11200930000012', 'Sallma Diana Putri', 'A', 'Sistem Informasi', '2 (Genap)'),
('11200930000014', 'Indah Nurhayati', 'A', 'Sistem Informasi', '2 (Genap)'),
('11200930000015', 'Lhutfia Ichsan', 'A', 'Sistem Informasi', '2 (Genap)');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_matakuliah`
--

CREATE TABLE `tb_matakuliah` (
  `id_matakuliah` varchar(50) NOT NULL,
  `mata_kuliah` varchar(50) NOT NULL,
  `bobot_sks` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `dosen` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_matakuliah`
--

INSERT INTO `tb_matakuliah` (`id_matakuliah`, `mata_kuliah`, `bobot_sks`, `semester`, `dosen`) VALUES
('FST6091103', 'PEMROGRAMAN LANJUT', '3', '2 (Genap)', 'Muhamad Nur Gunawan, MBA'),
('FST6091304', 'ALGORITMA DAN STRUKTUR DATA', '4', '2 (Genap)', 'Zainul Arham, M.Si'),
('UIN6032202', 'ISLAM DAN ILMU PENGETAHUAN', '3', '2 (Genap)', 'Rusdi Hamka Lubis, SEI, M.Si');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_user`
--

CREATE TABLE `tb_user` (
  `ID` int(10) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `Level` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_user`
--

INSERT INTO `tb_user` (`ID`, `Username`, `Password`, `Level`) VALUES
(1, 'Azka', 'admin', 'Administrator'),
(2, 'Lhutfia', 'admin', 'Administrator'),
(3, 'Indah', 'admin', 'Administrator'),
(4, 'Maratus', 'admin', 'Administrator'),
(5, 'Sallma', 'admin', 'Administrator'),
(10, 'admin', 'admin', 'Administrator');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
