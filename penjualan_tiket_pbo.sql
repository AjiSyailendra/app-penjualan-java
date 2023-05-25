-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 25 Bulan Mei 2023 pada 06.14
-- Versi server: 10.4.24-MariaDB
-- Versi PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `penjualan_tiket_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_film`
--

CREATE TABLE `tbl_film` (
  `id_film` int(11) NOT NULL,
  `judul` varchar(50) NOT NULL,
  `deskripsi` varchar(255) NOT NULL,
  `sutradara` varchar(30) NOT NULL,
  `produser` varchar(30) NOT NULL,
  `tahun_rilis` int(4) NOT NULL,
  `min_umur` int(3) NOT NULL,
  `harga_jual` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_film`
--

INSERT INTO `tbl_film` (`id_film`, `judul`, `deskripsi`, `sutradara`, `produser`, `tahun_rilis`, `min_umur`, `harga_jual`) VALUES
(2, 'Avatar', 'Avatar adalah film manusia biru', 'a', 'a', 0, 18, 60000),
(6, 'Gilbert Gay', 'anu', '', '', 0, 10, 60000),
(7, 'Dulloh', 'anu', 'Endro', 'Aida', 2022, 18, 60000),
(8, 'Harry Potter', 'aaa', 'Endra', 'Aida', 2006, 15, 50000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_pelanggan`
--

CREATE TABLE `tbl_pelanggan` (
  `id_pelanggan` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `umur` int(3) NOT NULL,
  `jenis_kelamin` char(2) NOT NULL,
  `no_phone` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_pelanggan`
--

INSERT INTO `tbl_pelanggan` (`id_pelanggan`, `nama`, `alamat`, `umur`, `jenis_kelamin`, `no_phone`) VALUES
(5, 'Endra', 'Mojosongo', 17, 'P', 628311814139),
(10, 'Aida', 'Pajang', 17, 'P', 628311814139);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_penjualan`
--

CREATE TABLE `tbl_penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `no_transaksi` varchar(20) DEFAULT NULL,
  `id_film` int(11) DEFAULT NULL,
  `id_pelanggan` int(11) DEFAULT NULL,
  `id_user` int(11) DEFAULT NULL,
  `harga_satuan` int(20) DEFAULT NULL,
  `harga_total` int(20) DEFAULT NULL,
  `jumlah` int(5) DEFAULT NULL,
  `diskon` int(5) DEFAULT NULL,
  `tanggal` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_penjualan`
--

INSERT INTO `tbl_penjualan` (`id_penjualan`, `no_transaksi`, `id_film`, `id_pelanggan`, `id_user`, `harga_satuan`, `harga_total`, `jumlah`, `diskon`, `tanggal`) VALUES
(10, '202303211410', 4, 5, 14, 40000, 180000, 5, 10, '2023-03-21'),
(11, '202303211411', 2, 5, 14, 60000, 300000, 5, 0, '2023-03-21'),
(12, '202303211412', 7, 5, 14, 60000, 285000, 5, 5, '2023-03-21'),
(13, '202303211413', 7, 5, 14, 60000, 270000, 5, 10, '2023-03-21'),
(14, '202303211414', 7, 5, 14, 60000, 180000, 3, 0, '2023-03-21'),
(15, '202303211415', 2, 5, 14, 60000, 360000, 6, 0, '2023-03-21'),
(16, '202303211416', 2, 5, 14, 60000, 300000, 5, 0, '2023-03-21'),
(17, '202303211417', 2, 5, 14, 60000, 600000, 10, 0, '2023-03-21'),
(18, '202303211418', 4, 5, 14, 40000, 0, 0, 0, '2023-03-21'),
(19, '202303211419', 4, 5, 14, 40000, 400000, 10, 0, '2023-03-21'),
(20, '202303211620', 7, 10, 16, 60000, 300000, 5, 0, '2023-03-21'),
(21, '202303221621', 2, 10, 16, 60000, 300000, 5, 0, '2023-03-22');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_stok`
--

CREATE TABLE `tbl_stok` (
  `id_stok` int(11) NOT NULL,
  `id_film` int(5) NOT NULL,
  `jumlah` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_stok`
--

INSERT INTO `tbl_stok` (`id_stok`, `id_film`, `jumlah`) VALUES
(7, 2, 5),
(9, 7, 0);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_users`
--

CREATE TABLE `tbl_users` (
  `id_user` int(11) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `level` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_users`
--

INSERT INTO `tbl_users` (`id_user`, `nama`, `username`, `password`, `level`) VALUES
(12, 'Aji Syailendra', 'syailendra', 'syailendra', 'Super Admin'),
(13, 'Aida', 'Aida', 'Aida123', 'Super Admin'),
(14, 'admin', 'admin', 'admin', 'Super Admin'),
(15, 'user', 'user', 'user', 'User'),
(16, 'endra', 'endra', 'endra', 'Super Admin');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tbl_film`
--
ALTER TABLE `tbl_film`
  ADD PRIMARY KEY (`id_film`);

--
-- Indeks untuk tabel `tbl_pelanggan`
--
ALTER TABLE `tbl_pelanggan`
  ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indeks untuk tabel `tbl_penjualan`
--
ALTER TABLE `tbl_penjualan`
  ADD PRIMARY KEY (`id_penjualan`);

--
-- Indeks untuk tabel `tbl_stok`
--
ALTER TABLE `tbl_stok`
  ADD PRIMARY KEY (`id_stok`);

--
-- Indeks untuk tabel `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `tbl_film`
--
ALTER TABLE `tbl_film`
  MODIFY `id_film` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `tbl_pelanggan`
--
ALTER TABLE `tbl_pelanggan`
  MODIFY `id_pelanggan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT untuk tabel `tbl_penjualan`
--
ALTER TABLE `tbl_penjualan`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT untuk tabel `tbl_stok`
--
ALTER TABLE `tbl_stok`
  MODIFY `id_stok` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT untuk tabel `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
