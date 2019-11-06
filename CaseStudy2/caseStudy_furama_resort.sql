drop database if exists case_study;
create database case_study;
use case_study;
create table Vitri(
IDVitri int unique auto_increment not null primary key,
TenViTri nvarchar(45) not null
);
create table TrinhDo(
IDTrinhDo int unique auto_increment not null primary key,
TrinhDo nvarchar(45) not null
);
create table BoPhan(
IDBoPhan int unique auto_increment not null primary key,
TenBoPhan nvarchar(45) not null
);
create table LoaiKhach(
IDLoaiKhach int unique auto_increment not null primary key,
TenLoaiKhach nvarchar(45) not null
);
create table KieuThue(
IDKieuThue int unique auto_increment not null primary key,
TenKieuThue nvarchar(45) not null,
Gia decimal
);
create table LoaiDichVu(
IDLoaiDichVu int unique auto_increment not null primary key,
TenLoaiDichVu nvarchar(45) not null
);
create table DichVuDiKem(
IDDichVuDiKem int unique auto_increment not null primary key,
TenDichVuDiKem nvarchar(45) not null,
Gia decimal,
DonVi int,
TrangThaiKhaDung nvarchar(45)
);
create table NhanVien(
IDNhanVien int unique auto_increment not null primary key,
HoTen nvarchar(50) not null,
NgaySinh date not null,
SoCMTND int not null unique,
Luong decimal,
SDT int,
Email varchar(50),
DiaChi nvarchar(50),
IdVitri int,
IDTrinhDo int,
IDBoPhan int,
constraint IDVitri_fk foreign key(IdVitri) references Vitri(IDVitri),
constraint IDTrinhDo_fk foreign key(IDTrinhDo) references TrinhDo(IDTrinhDo),
constraint IDBoPhan_fk foreign key(IDBoPhan) references BoPhan(IDBoPhan)
);
create table KhachHang(
IDKhachHang int unique auto_increment not null primary key,
HoTen nvarchar(50) not null,
NgaySinh date not null,
SoCMTND int not null unique,
SDT int,
Email varchar(50),
DiaChi nvarchar(50),
IDLoaiKhach int,
constraint IDLoaiKhach_fk foreign key(IDLoaiKhach) references LoaiKhach(IDLoaiKhach)
);
create table DichVu(
IDDichVu int unique auto_increment not null primary key,
TenDichVu nvarchar(50) not null,
DienTich double not null,
SoTang tinyint ,
SoNguoiToiDa tinyint,
ChiPhiThue decimal,
TrangThai varchar(50) ,
IDKieuThue int,
IDLoaiDichVu int,
constraint IDKieuThue_fk foreign key(IDKieuThue) references KieuThue(IDKieuThue),
constraint IDLoaiDichVu_fk foreign key(IDLoaiDichVu) references LoaiDichVu(IDLoaiDichVu)
);
create table HopDong(
IDHopDong int unique auto_increment not null primary key,
NgayLamHopDong date not null,
NgayKetThuc date not null,
TienDatCoc decimal,
TongTien decimal,
IdNhanVien int,
IDKhachHang int,
IDDichVu int,
constraint IdNhanVien_fk foreign key(IdNhanVien) references NhanVien(IdNhanVien),
constraint IDKhachHang_fk foreign key(IDKhachHang) references KhachHang(IDKhachHang),
constraint IDDichVu_fk foreign key(IDDichVu) references DichVu(IDDichVu)
);
create table HopDongChiTiet(
SoLuong int,
IDHopDong int,
IDDichVuDiKem int,
constraint IDHopDongChiTiet primary key(IDHopDong,IDDichVuDiKem),
constraint IDHopDong_fk foreign key(IDHopDong) references HopDong(IDHopDong),
constraint IDDichVuDiKem_fk foreign key(IDDichVuDiKem) references DichVuDiKem(IDDichVuDiKem)
);
insert into bophan(tenbophan) values ('Buồng phòng'),('Lễ tân'),('Nhà hàng'),('An ninhh'),('Văn phòng');
insert into vitri(tenvitri) values ('Giam Đốc'),('Trưởng Phòng'),('Quản Lý'),('Nhan Vien');
insert into trinhdo(trinhdo) values ('Cao học'),('Đại Học'),('Cao đẳng'),('Trung cấp');
insert into NhanVien(HoTen, NgaySinh, SoCMTND, Luong, SDT, Email, DiaChi, IDVitri, IDTrinhDo, IDBoPhan)
values('Hoàng Văn A','1990-01-24', 012312345, 7000000.00, 076121212, 'abc1@gamil.com', 'Quảng Trị',4 ,3 ,2 ),
('Đặng Văn B', '1970-07-12', 012312346, 20000000.00, 0932121234, 'abc2@gamil.com', 'Đà Nẵng',1 ,1 ,5 ),
('Trần C', '1991-02-14', 012312347, 9000000.00, 033121256, 'abc3@gamil.com', 'Quảng Bình',2 ,2 ,3),
('Khánh Trang', '1994-10-12', 012312348, 7000000.00, 044121278, 'Trang@gamil.com', 'Quảng Trị',4 ,3 ,1),
('Nguyễn Thị Trang', '1992-11-11', 012312398, 15000000.00, 0231213412, 'ab23@gamil.com', 'Đà Nẵng',3 ,1 ,2),
('Hoàng Thị Ngọc Quỳnh', '1994-08-06', 012312432, 15000000.00, 012123434, 'abewq4@gamil.com', 'Huế',2 ,2 ,5),
('Trần Thị Thu Út', '1980-06-19', 012312567, 9000000.00, 02324356, 'abqwe@gamil.com', 'Đà Nẵng',3 ,2 ,3),
('Lê Văn C', '1982-05-21', 012845743, 7000000.00, 0821212345, 'abqq223@gamil.com', 'Quảng Nam',4 ,2 ,2),
('Hoàng Ngọc G', '1981-04-14', 012324183, 15000000.00, 094121278, 'abcwqe224@gamil.com', 'Hà Nội',2 ,3 ,4),
('Trần Long Hoàng Ngọc', '1979-02-15', 012324179, 15000000.00, 0541212986, 'abdsad4@gamil.com', 'Quảng Trị',2 ,1 ,5);
insert into loaikhach(tenloaikhach)
values ('Diamond'),('Platinium'),('Gold'),('Silver'),('Member');
insert into khachhang(HoTen, NgaySinh, SoCMTND, SDT, Email, DiaChi,IDloaiKhach)
values ('Hoàng Long', '1970-03-15', 098765432, 023567344, 'zxcs@gmail.com', 'Quảng Trị', 1),
('Trần Văn A', '1968-09-15', 098712322, 023567865, 'zxwqe232cs@gmail.com', 'Đà Nẵng', 1),
('Nguyễn Ngọc B', '1990-07-15', 06755432, 023567432, 'zx23cs@gmail.com', 'Quảng Trị', 3),
('Lê Văn C', '1969-06-15', 098734534, 023567423, '5asd6@gmail.com', 'Quảng Trị', 5),
('Nguyễn Hà', '1983-05-15', 09886652, 023549676, 'zxmkucs@gmail.com', 'Đà Nẵng', 2),
('Hoàng Văn C', '1985-11-25', 094355432, 023565624, 'zxqwecs@gmail.com', 'Vinh', 1),
('Trần B', '1995-04-25', 098765232, 023567631, 'zxcs@gmail.com', 'Quảng TNgãi', 1),
('Đoàn A', '1993-06-24', 098765412, 023567231, 'fdsd@gmail.com', 'Quảng Trị', 2),
('Hoàng D', '1982-01-23', 098767332, 023847324, 'zghghgxcs@gmail.com', 'Đà Nẵng', 1),
('Lê Văn K', '1965-02-04', 097123132, 098367344, 'zxwewcs@gmail.com', 'Quảng Trị', 4);
insert into kieuthue(TenKieuThue,Gia) values ('Năm',100000000.00),
('Tháng',15000000.00),('Ngày',1000000.00),('Gio',200000.00);
insert into loaidichvu(TenLoaiDichVu) values ('Villa'),('House'),('Room');
insert into dichvu(TenDichVu,DienTich,SoTang,SoNguoiToiDa,ChiPhiThue,IDKieuThue,IDLoaiDichVu)
values('Villa1',100.00,3,3,1000000.00,2,1),
('House1', 50.00, 2 , 3, 750000.00, 3, 2),
('House2', 60.00, 2 , 5, 850000.00, 4, 2),
('Room1', 30.00, 1 , 3, 300000.00, 3, 3),
('Villa2', 150.00, 4 , 5, 1500000.00, 3, 1),
('House3', 50.00, 1 , 3, 500000.00, 2, 2),
('Romm2', 25.00, 1 , 2, 150000.00, 4, 3),
('Villa3', 100.00, 2 , 2, 600000.00, 2, 1),
('Room3', 20.00, 2 , 1, 100000.00, 4, 3);
insert into dichvudikem(TenDichVuDiKem,Gia,DonVi,TrangThaiKhaDung)
values('Massage',500000.00,1,'Tốt'),
('Car',400000.00,1,'Tốt'),
('Thức ăn',150000,2,'Tốt'),
('Nước uống',100000,2,'Tốt'),
('Karaoke',5000000,5,'Tốt');
insert into hopdong(NgayLamHopDong,NgayKetThuc,TienDatCoc,IDKhachHang,IDDichVu)
values('2019-09-24','2019-10-01','5000000.00',1,3),
('2019-10-24','2019-10-30',2000000.00, 4, 1),
('2019-01-31','2019-02-24',10000000.00, 9,2),
('2019-02-12','2019-02-20',2000000.00, 1,6),
('2019-04-12','2019-04-15', 1000000.00, 1,4),
('2019-01-12','2019-01-15',1000000.00, 7,4),
('2019-02-20','2019-03-01',2000000.00,9,7),
('2019-03-15','2019-04-12',1000000.00,6,4);


select *from nhanvien where ((HoTen like 'H%') or (HoTen like 'T%') or (HoTen like 'K%'))and length(HoTen) <=15;

select * from nhanvien  where ((DiaChi = 'Đà Nẵng') or (DiaChi = 'Quảng Trị')) and  ROUND(DATEDIFF(CURDATE(), NgaySinh) / 365, 0) >=18 and ROUND(DATEDIFF(CURDATE(), NgaySinh) / 365, 0) <50;

select khachhang.IDKhachHang,khachhang.HoTen,khachhang.NgaySinh,khachhang.SoCMTND,khachhang.SDT,khachhang.Email,LoaiKhach.TenLoaiKhach,count(khachhang.IdLoaiKhachHang) as 'so lan dat'
FROM khachhang,LoaiKhach
WHERE khachhang.IdLoaiKhachHang = loaikhachhang.IdLoaiKhachHang  and khachhang.IdLoaiKhachHang =1
group by HoTen
order by khachhang.IdLoaiKhachHang asc;




select HoTen,TenLoaiKhach,tendichvu,NgayLamHopDong,NgayKetThuc,sum(DichVu.ChiPhiThue +hopdongchitiet.soluong*dichvudikem.gia) as "tong tien"
from LoaiKhach
left join KhachHang on KhachHang.IDLoaiKhach = LoaiKhach.IDLoaiKhach
left join hopdong on HopDong.IDKhachHang = KhachHang.IDKhachHang
left join DichVu on  dichvu.IDLoaiDichVu =  hopdong.IDDichVu
left join LoaiDichVu on  LoaiDichVu.IDLoaiDichVu =DichVu.IDLoaiDichVu
left join hopdongchitiet on HopDongChiTiet.IDHopDong =hopdong.IDHopDong
left join DichVuDiKem on  DichVuDiKem.IDDichVuDiKem =HopDongChiTiet.IDDichVuDiKem
group by KhachHang.IDKhachHang


