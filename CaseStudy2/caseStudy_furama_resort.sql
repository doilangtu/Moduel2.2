drop database if exists case_study;
create database case_study;
use case_study;
-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: case_study
-- ------------------------------------------------------
-- Server version	8.0.18


--
-- Table structure for table `bophan`
--

DROP TABLE IF EXISTS `nhanvien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhanvien` (
  `IdNhanVien` int(11) NOT NULL,
  `HoTen` varchar(45) NOT NULL,
  `IdViTri` int(11) NOT NULL,
  `IdtrinhDo` int(11) NOT NULL,
  `IdBoPhan` int(11) NOT NULL,
  `NgaySinh` date NOT NULL,
  `SoCMTND` varchar(45) NOT NULL,
  `Luong` varchar(45) NOT NULL,
  `SDT` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `DiaChi` varchar(45) NOT NULL,
  PRIMARY KEY (`IdNhanVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhanvien`
--
DROP TABLE IF EXISTS `khachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khachhang` (
  `IdKhachHang` int(11) NOT NULL,
  `IdLoaiKhachHang` int(11) NOT NULL,
  `HoTen` varchar(45) NOT NULL,
  `NgaySinh` date NOT NULL,
  `SoCMTND` varchar(45) NOT NULL,
  `Luong` varchar(45) NOT NULL,
  `SDT` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `DiaChi` varchar(45) NOT NULL,
  PRIMARY KEY (`IdKhachHang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khachhang`
--

LOCK TABLES `khachhang` WRITE;
/*!40000 ALTER TABLE `khachhang` DISABLE KEYS */;
/*!40000 ALTER TABLE `khachhang` ENABLE KEYS */;
UNLOCK TABLES;
LOCK TABLES `nhanvien` WRITE;
/*!40000 ALTER TABLE `nhanvien` DISABLE KEYS */;
/*!40000 ALTER TABLE `nhanvien` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `hopdong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdong` (
  `IdHopDong` int(11) NOT NULL,
  `IdNhanVien` int(11) NOT NULL,
  `IdKhachHang` int(11) NOT NULL,
  `IdDichVu` int(11) NOT NULL,
  `NgayLamHopDong` date NOT NULL,
  `NgayKetThuc` date NOT NULL,
  `TienDatCoc` int(11) NOT NULL,
  `TongTien` int(11) NOT NULL,
  PRIMARY KEY (`IdHopDong`),
  KEY `IdNhanVien` (`IdNhanVien`),
  KEY `IdKhachHang` (`IdKhachHang`),
  CONSTRAINT `hopdong_ibfk_1` FOREIGN KEY (`IdNhanVien`) REFERENCES `nhanvien` (`IdNhanVien`),
  CONSTRAINT `hopdong_ibfk_2` FOREIGN KEY (`IdKhachHang`) REFERENCES `khachhang` (`IdKhachHang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdong`
--

LOCK TABLES `hopdong` WRITE;
/*!40000 ALTER TABLE `hopdong` DISABLE KEYS */;
/*!40000 ALTER TABLE `hopdong` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `bophan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bophan` (
  `IdBoPhan` int(11) NOT NULL,
  `TenBoPhan` varchar(45) NOT NULL,
  PRIMARY KEY (`IdBoPhan`),
  CONSTRAINT `bophan_ibfk_1` FOREIGN KEY (`IdBoPhan`) REFERENCES `nhanvien` (`IdNhanVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bophan`
--

LOCK TABLES `bophan` WRITE;
/*!40000 ALTER TABLE `bophan` DISABLE KEYS */;
/*!40000 ALTER TABLE `bophan` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvu` (
  `IdDichVu` int(11) NOT NULL,
  `TenDichVu` varchar(45) DEFAULT NULL,
  `DienTich` int(11) NOT NULL,
  `SoTang` int(11) NOT NULL,
  `SoNguoiToiDa` varchar(45) DEFAULT NULL,
  `ChiPhiThue` varchar(45) DEFAULT NULL,
  `IdKieuThue` varchar(45) DEFAULT NULL,
  `IdLoaiDichVu` varchar(45) DEFAULT NULL,
  `TrangThai` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdDichVu`),
  CONSTRAINT `dichvu_ibfk_1` FOREIGN KEY (`IdDichVu`) REFERENCES `hopdong` (`IdHopDong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvu`
--

LOCK TABLES `dichvu` WRITE;
/*!40000 ALTER TABLE `dichvu` DISABLE KEYS */;
/*!40000 ALTER TABLE `dichvu` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `loaidichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaidichvu` (
  `IdLoaiDichVu` int(11) NOT NULL,
  `TenLoaiDichVu` varchar(45) NOT NULL,
  PRIMARY KEY (`IdLoaiDichVu`),
  CONSTRAINT `loaidichvu_ibfk_1` FOREIGN KEY (`IdLoaiDichVu`) REFERENCES `dichvu` (`IdDichVu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaidichvu`
--

LOCK TABLES `loaidichvu` WRITE;
/*!40000 ALTER TABLE `loaidichvu` DISABLE KEYS */;
/*!40000 ALTER TABLE `loaidichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaikhachhang`
--

DROP TABLE IF EXISTS `loaikhachhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `loaikhachhang` (
  `IdLoaiKhachHang` int(11) NOT NULL,
  `TenLoaiKhach` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`IdLoaiKhachHang`),
  CONSTRAINT `loaikhachhang_ibfk_1` FOREIGN KEY (`IdLoaiKhachHang`) REFERENCES `khachhang` (`IdKhachHang`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loaikhachhang`
--

LOCK TABLES `loaikhachhang` WRITE;
/*!40000 ALTER TABLE `loaikhachhang` DISABLE KEYS */;
/*!40000 ALTER TABLE `loaikhachhang` ENABLE KEYS */;
UNLOCK TABLES;
--
-- Table structure for table `dichvu`
--



--
-- Table structure for table `dichvudikem`
--
DROP TABLE IF EXISTS `hopdongchitiet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hopdongchitiet` (
  `IdHopDongChiTiet` int(11) NOT NULL,
  `IdHopDong` int(11) NOT NULL,
  `Soluong` int(11) NOT NULL,
  PRIMARY KEY (`IdHopDongChiTiet`),
  CONSTRAINT `hopdongchitiet_ibfk_1` FOREIGN KEY (`IdHopDongChiTiet`) REFERENCES `hopdong` (`IdHopDong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hopdongchitiet`
--

LOCK TABLES `hopdongchitiet` WRITE;
/*!40000 ALTER TABLE `hopdongchitiet` DISABLE KEYS */;
/*!40000 ALTER TABLE `hopdongchitiet` ENABLE KEYS */;
UNLOCK TABLES;
DROP TABLE IF EXISTS `dichvudikem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dichvudikem` (
  `IdDichVuDiKem` int(11) NOT NULL,
  `TenDichVuDiKem` varchar(45) NOT NULL,
  `Gia` int(11) NOT NULL,
  `DonVi` int(11) NOT NULL,
  `TrangThaiKhaDung` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdDichVuDiKem`),
  CONSTRAINT `dichvudikem_ibfk_1` FOREIGN KEY (`IdDichVuDiKem`) REFERENCES `hopdongchitiet` (`IdHopDongChiTiet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dichvudikem`
--

LOCK TABLES `dichvudikem` WRITE;
/*!40000 ALTER TABLE `dichvudikem` DISABLE KEYS */;
/*!40000 ALTER TABLE `dichvudikem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hopdong`
--



--
-- Table structure for table `hopdongchitiet`
--



--
-- Table structure for table `khachhang`
--



--
-- Table structure for table `kieuthue`
--

DROP TABLE IF EXISTS `kieuthue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kieuthue` (
  `IdKieuThue` int(11) NOT NULL,
  `TenKieuthue` varchar(45) NOT NULL,
  `Gia` int(11) NOT NULL,
  PRIMARY KEY (`IdKieuThue`),
  CONSTRAINT `kieuthue_ibfk_1` FOREIGN KEY (`IdKieuThue`) REFERENCES `dichvu` (`IdDichVu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kieuthue`
--

LOCK TABLES `kieuthue` WRITE;
/*!40000 ALTER TABLE `kieuthue` DISABLE KEYS */;
/*!40000 ALTER TABLE `kieuthue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loaidichvu`
--



--
-- Table structure for table `nhanvien`
--


--
-- Table structure for table `trinhdo`
--

DROP TABLE IF EXISTS `trinhdo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trinhdo` (
  `IdTrinhDo` int(11) NOT NULL,
  `TenTrinhBo` varchar(45) NOT NULL,
  PRIMARY KEY (`IdTrinhDo`),
  CONSTRAINT `trinhdo_ibfk_1` FOREIGN KEY (`IdTrinhDo`) REFERENCES `nhanvien` (`IdNhanVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trinhdo`
--

LOCK TABLES `trinhdo` WRITE;
/*!40000 ALTER TABLE `trinhdo` DISABLE KEYS */;
/*!40000 ALTER TABLE `trinhdo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vitri`
--

DROP TABLE IF EXISTS `vitri`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vitri` (
  `IdVitri` int(11) NOT NULL,
  `TenViTri` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IdVitri`),
  CONSTRAINT `vitri_ibfk_1` FOREIGN KEY (`IdVitri`) REFERENCES `nhanvien` (`IdNhanVien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;


-- Dump completed on 2019-11-05  8:45:27

--Tark 1
SELECT * FROM case_study.nhanvien;
INSERT INTO `case_study`.`nhanvien` (`IdNhanVien`, `HoTen`, `IdViTri`, `IdtrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('0', 'Minh', '1', '1', '1', '2000-01-02', '230930892', '23023023', '0353036267', 'doilangtu123@gmail.com', 'thanh ');
INSERT INTO `case_study`.`nhanvien` (`IdNhanVien`, `HoTen`, `IdViTri`, `IdtrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('1', 'Thanh', '2', '2', '2', '2000-01-02', '230930892', '23023023', '0353036267', 'doilangtu123@gmail.com', 'thanh ');
INSERT INTO `case_study`.`nhanvien` (`IdNhanVien`, `HoTen`, `IdViTri`, `IdtrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('2', 'Khanh', '3', '3', '3', '2000-01-02', '230930892', '23023023', '0353036267', 'doilangtu123@gmail.com', 'thanh ');
INSERT INTO `case_study`.`nhanvien` (`IdNhanVien`, `HoTen`, `IdViTri`, `IdtrinhDo`, `IdBoPhan`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('3', 'Yen', '4', '4', '4', '2000-01-02', '230930892', '23023023', '0353036267', 'doilangtu123@gmail.com', 'thanh ');

--Tark 2;
select *from nhanvien where ((HoTen like 'H%') or (HoTen like 'T%') or (HoTen like 'K%'))and length(HoTen) <=15;
--Tark 3:
select * from nhanvien  where ((DiaChi = 'Da Nang') or (DiaChi = 'thanh an')) and  ROUND(DATEDIFF(CURDATE(), NgaySinh) / 365, 0) >=18 and ROUND(DATEDIFF(CURDATE(), NgaySinh) / 365, 0) <50;
--Tark 4:
SELECT * FROM case_study.loaikhachhang;
INSERT INTO `case_study`.`loaikhachhang` (`IdLoaiKhachHang`, `TenLoaiKhach`) VALUES ('01', 'Diamond');
INSERT INTO `case_study`.`loaikhachhang` (`IdLoaiKhachHang`, `TenLoaiKhach`) VALUES ('02', 'Gold');
INSERT INTO `case_study`.`loaikhachhang` (`IdLoaiKhachHang`, `TenLoaiKhach`) VALUES ('03', 'Platinum');

select * FROM case_study.khachhang;
INSERT INTO `case_study`.`khachhang` (`IdKhachHang`, `IdLoaiKhachHang`, `HoTen`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('1', '1', 'Manh', '1994-01-01', '230930892', '123212', '016532323', 'manhngao@gmail.com', 'Quang Tri');
INSERT INTO `case_study`.`khachhang` (`IdKhachHang`, `IdLoaiKhachHang`, `HoTen`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('2', '2', 'Nghien', '1994-01-01', '230930892', '123212', '016532323', 'manhngao@gmail.com', 'Quang Tri');
INSERT INTO `case_study`.`khachhang` (`IdKhachHang`, `IdLoaiKhachHang`, `HoTen`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('3', '1', 'Ton', '1994-01-01', '230930892', '123212', '016532323', 'manhngao@gmail.com', 'Quang Tri');
INSERT INTO `case_study`.`khachhang` (`IdKhachHang`, `IdLoaiKhachHang`, `HoTen`, `NgaySinh`, `SoCMTND`, `Luong`, `SDT`, `Email`, `DiaChi`) VALUES ('4', '1', 'Ha', '1994-01-01', '230930892', '123212', '016532323', 'manhngao@gmail.com', 'Quang Tri');

select khachhang.IdKhachHang,khachhang.HoTen,khachhang.NgaySinh,khachhang.SoCMTND,khachhang.SDT,khachhang.Email,loaikhachhang.TenLoaiKhach,count(khachhang.IdLoaiKhachHang) as 'so lan dat'
FROM khachhang,loaikhachhang
WHERE khachhang.IdLoaiKhachHang = loaikhachhang.IdLoaiKhachHang  and khachhang.IdLoaiKhachHang =1
group by HoTen
order by khachhang.IdLoaiKhachHang asc

--tark 5
 select khachhang.IdKhachHang,khachhang.HoTen,loaikhachhang.TenLoaiKhach,hopdong.IdHopDong,dichvu.TenDichVu,hopdong.NgayLamHopDong,hopdong.NgayKetThuc,hopdong.TongTien
  from khachhang,loaikhachhang,hopdong,dichvu,dichvudikem
  where khachhang.IdLoaiKhachHang = loaikhachhang.IdLoaiKhachHang 