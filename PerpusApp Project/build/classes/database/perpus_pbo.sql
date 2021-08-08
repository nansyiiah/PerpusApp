-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 18 Jul 2021 pada 15.09
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpus_pbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `admin`
--

CREATE TABLE `admin` (
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('adrian', 'adrian123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `akun`
--

CREATE TABLE `akun` (
  `nim` int(10) NOT NULL,
  `nama` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `akun`
--

INSERT INTO `akun` (`nim`, `nama`) VALUES
(19102009, 'Ricky Ridho Oetomo'),
(19102082, 'Nais Edi Purwoko'),
(19102224, 'Adrian Kurniawan '),
(19102238, 'Muslimin Dita Herianto'),
(19102268, 'Wira Ksatria Dika');

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku_ilmupengetahuan`
--

CREATE TABLE `buku_ilmupengetahuan` (
  `id_buku` int(5) NOT NULL,
  `judul_buku` varchar(30) NOT NULL,
  `penulis_buku` varchar(30) NOT NULL,
  `tahun_terbit` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku_ilmupengetahuan`
--

INSERT INTO `buku_ilmupengetahuan` (`id_buku`, `judul_buku`, `penulis_buku`, `tahun_terbit`) VALUES
(0, 'adrian', 'tes', 20001),
(1, 'Akuntansi Pengantar 1', 'Supardi', 2009),
(2, 'Master RPAL (Rangkuman Pengeta', 'LUCIA DANARWURI', 2018),
(3, 'ISLAM DAN ILMU PENGETAHUAN', 'Prof. Dr. H. Abuddin Nata, M.A', 2018),
(4, 'Kesehjateraan Sosial', 'Isbandi Rukminto Adi', 2015),
(5, 'Manajemen Penerbitan Jurnal Il', 'Lukman S', 2012);

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku_komik`
--

CREATE TABLE `buku_komik` (
  `id_buku` int(5) NOT NULL,
  `judul_buku` varchar(30) NOT NULL,
  `penulis_buku` varchar(30) DEFAULT NULL,
  `tahun_terbit` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku_komik`
--

INSERT INTO `buku_komik` (`id_buku`, `judul_buku`, `penulis_buku`, `tahun_terbit`) VALUES
(1, 'KOMIK NEXT G TETANGGA DARI KOR', 'GENDIS SEPTI DENAPUTRI', 2020),
(2, 'Komik Simfoni dalam Hudjan', 'Dyan', 1972),
(3, 'KOMIK KECIL-KECIL PUNYA KARYA:', 'MUTIARA SYABANI', 2019),
(4, 'KOMIK VOLT (LAHIRNYA SANG LEGE', 'MARCELINO LEFRANDT', 2021),
(5, 'KOMIK KKPK: MY SPECIAL FRIEND', 'KHANSA TABINA', 2020);

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku_novel`
--

CREATE TABLE `buku_novel` (
  `id_buku` int(11) NOT NULL,
  `judul_buku` varchar(35) DEFAULT NULL,
  `penulis_buku` varchar(35) DEFAULT NULL,
  `tahun_terbit` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku_novel`
--

INSERT INTO `buku_novel` (`id_buku`, `judul_buku`, `penulis_buku`, `tahun_terbit`) VALUES
(1, 'Distilasi Alkena', 'Wira Nagara', 2016),
(2, '11.11', 'Fiersa Besari', 2018),
(3, 'Tentang Kamu', 'Tere Liye', 2016),
(4, '5 cm', 'Donny Dhirgantoro', 2005),
(5, 'Rindu', 'Tere Liye', 2014),
(7, 'tesinsertbosku', 'wira', 2002);

-- --------------------------------------------------------

--
-- Struktur dari tabel `buku_teknologi`
--

CREATE TABLE `buku_teknologi` (
  `id_buku` int(5) NOT NULL,
  `judul_buku` varchar(30) NOT NULL,
  `penulis_buku` varchar(30) NOT NULL,
  `tahun_terbit` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `buku_teknologi`
--

INSERT INTO `buku_teknologi` (`id_buku`, `judul_buku`, `penulis_buku`, `tahun_terbit`) VALUES
(1, 'Pengantar Teknologi Informasi', 'Buhori Muslim', 2017),
(2, 'Pengenalan Sistem Informasi', 'Abdul Kadir', 2014),
(3, 'Buku Teknologi Informasi dan K', 'Hamdan Husein Batubara', 2017),
(4, 'Basis Data Revisi Kedua', 'Fathansyah', 2018),
(5, 'Panduan Karir di Dunia Tekno', 'Wiwit Siswoutomo', 2005);

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman`
--

CREATE TABLE `peminjaman` (
  `id_buku` int(5) NOT NULL,
  `nama_peminjam` varchar(30) NOT NULL,
  `judul_buku` varchar(30) NOT NULL,
  `nim_peminjam` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjaman`
--

INSERT INTO `peminjaman` (`id_buku`, `nama_peminjam`, `judul_buku`, `nim_peminjam`) VALUES
(1, 'Adrian Kurniawan', 'KOMIK NEXT G TETANGGA DARI KOR', '19102224'),
(2, 'Adrian Kurniawan', 'Komik Simfoni dalam Hudjan', '19102224'),
(3, 'Wira Ksatria Dika', 'KOMIK KECIL-KECIL PUNYA KARYA:', '19102268'),
(4, 'Adrian Kurniawan', 'KOMIK VOLT (LAHIRNYA SANG LEGE', '19102224'),
(5, 'Adrian Kurniawan', 'KOMIK KKPK: MY SPECIAL FRIEND', '19102224'),
(5, 'Wira Ksatria Dika', 'KOMIK KKPK: MY SPECIAL FRIEND', '19102268');

-- --------------------------------------------------------

--
-- Struktur dari tabel `peminjaman_buku`
--

CREATE TABLE `peminjaman_buku` (
  `id_buku` int(5) DEFAULT NULL,
  `nama_peminjam` varchar(30) DEFAULT NULL,
  `judul_buku` varchar(45) DEFAULT NULL,
  `nim_peminjam` int(10) DEFAULT NULL,
  `tanggal_pinjam` date DEFAULT NULL,
  `tanggal_kembali` date DEFAULT NULL,
  `id_pinjaman` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `peminjaman_buku`
--

INSERT INTO `peminjaman_buku` (`id_buku`, `nama_peminjam`, `judul_buku`, `nim_peminjam`, `tanggal_pinjam`, `tanggal_kembali`, `id_pinjaman`) VALUES
(5, 'Adrian Kurniawan', 'KOMIK KKPK: MY SPECIAL FRIEND', 19102224, '2021-06-24', '2021-07-01', 4),
(3, 'Adrian Kurniawan', 'KOMIK KECIL-KECIL PUNYA KARYA:', 19102224, '2021-06-24', '2021-07-01', 5),
(3, 'Adrian Kurniawan', 'KOMIK KECIL-KECIL PUNYA KARYA:', 19102224, '2021-06-24', '2021-07-01', 6),
(4, 'Adrian Kurniawan', 'KOMIK VOLT (LAHIRNYA SANG LEGE', 19102224, '2021-06-24', '2021-07-01', 7),
(3, 'Wira Ksatria Dika', 'Buku Teknologi Informasi dan K', 19102268, '2021-06-24', '2021-07-01', 8),
(5, 'Wira Ksatria Dika', 'Rindu', 19102268, '2021-06-24', '2021-07-01', 9),
(1, 'Wira Ksatria Dika', 'Akuntansi Pengantar 1', 19102268, '2021-06-24', '2021-07-01', 10),
(3, 'teslogin', 'ISLAM DAN ILMU PENGETAHUAN', 123, '2021-06-26', '2021-07-03', 11),
(3, 'Adrian Kurniawan ', 'ISLAM DAN ILMU PENGETAHUAN', 19102224, '2021-06-26', '2021-07-03', 12),
(3, 'Ricky Ridho Oetomo', 'KOMIK KECIL-KECIL PUNYA KARYA:', 19102009, '2021-07-06', '2021-07-13', 13),
(4, 'Adrian Kurniawan ', '5 cm', 19102224, '2021-07-18', '2021-07-25', 14);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`username`);

--
-- Indeks untuk tabel `akun`
--
ALTER TABLE `akun`
  ADD PRIMARY KEY (`nim`);

--
-- Indeks untuk tabel `buku_ilmupengetahuan`
--
ALTER TABLE `buku_ilmupengetahuan`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `buku_komik`
--
ALTER TABLE `buku_komik`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `buku_novel`
--
ALTER TABLE `buku_novel`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `buku_teknologi`
--
ALTER TABLE `buku_teknologi`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`id_buku`,`nim_peminjam`);

--
-- Indeks untuk tabel `peminjaman_buku`
--
ALTER TABLE `peminjaman_buku`
  ADD PRIMARY KEY (`id_pinjaman`),
  ADD KEY `nim_peminjam` (`nim_peminjam`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `peminjaman_buku`
--
ALTER TABLE `peminjaman_buku`
  MODIFY `id_pinjaman` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
