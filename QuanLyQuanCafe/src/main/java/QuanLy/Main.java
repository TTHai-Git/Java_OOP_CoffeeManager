/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy;

import Ban.Ban;
import CauHinh.Parse;
import Menu.FAndB;
import NhanVien.NhanVien;
import DoanhThu.HoaDon;
import DoanhThu.KhachHang;
import Menu.NuocUong;
import Menu.ThucAn;
import NhanVien.BaoVe;
import NhanVien.DauBep;
import NhanVien.PhaChe;
import NhanVien.ThuNgan;
import NhanVien.PhucVu;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author space
 */
public class Main {

    public static void main(String[] args) {
        //Tao DT de kiem tra input va output
        QuanLyNhanVien danhSachNhanVien = new QuanLyNhanVien();
        QuanLyBan danhSachBan = new QuanLyBan();
        QuanLyFAndB Menu = new QuanLyFAndB();
        List<HoaDon> doanhThuThang12 = new ArrayList<>();
        QuanLyDoanhThu danhSachDoanhThu = new QuanLyDoanhThu(doanhThuThang12);

        //Tao San Doi Tuong De Test
        Menu.themThucPhamVaoMenu(new ThucAn(false, "Pho", 50000, true, "Ca ngay", "Thuc An"), new NuocUong(true, "Cafe Da", 25000, true, "Ca ngay", "Nuoc Uong"), new NuocUong(true, "Tra Sua", 30000, true, "Ca ngay", "Nuoc Uong"), new ThucAn(true, "Mi Quang", 35000, true, "Ca ngay", "Thuc An"), new ThucAn(false, "Hu Tieu", 50000, false, "Ca ngay", "Thuc An"), new NuocUong(true, "Cafe Sua", 20000, true, "Ca ngay", "Nuoc Uong"), new NuocUong(false, "Cafe Trung", 35000, true, "Ca ngay", "Nuoc Uong"), new ThucAn(false, "Banh Canh Cua", 55000, true, "Ca ngay", "Thuc An"), new ThucAn(false, "Cao Lau", 60000, true, "Ca ngay", "Thuc An"), new NuocUong(true, "Sinh To Dau", 27000, true, "Ca ngay", "Nuoc Uong"),new NuocUong(true, "Nuoc Cam", 22000, false, "Ca ngay", "Nuoc Uong"),new ThucAn(false, "Bun Ca", 69000, true, "Ca ngay", "Thuc An"),new ThucAn(false, "Banh Mi Chao", 25000, false, "Ca ngay", "Thuc An"),new NuocUong(true, "Capuchino", 39000, true, "Ca ngay", "Nuoc Uong"),new NuocUong(true, "Tra Dao Cam Thao", 52000, true, "Ca ngay", "Nuoc Uong"),new NuocUong(true, "Matcha Machiato", 45000, false, "Ca ngay", "Nuoc Uong"),new NuocUong(true, "Matcha Latte", 59000, true, "Ca ngay", "Nuoc Uong"),new NuocUong(true, "Espresso Latte", 45000, false, "Ca ngay", "Nuoc Uong"),new NuocUong(true, "Tra Sua Mac Ca Tran Chau Trang", 45000, false, "Ca ngay", "Nuoc Uong"),new ThucAn(false, "Com Chien Duong Chau", 36000, true, "Ca ngay", "Thuc An"),new ThucAn(true, "Com Chien Ca Man", 25000, true, "Ca ngay", "Thuc An"),new ThucAn(false, "Bun Bo Hue", 50000, false, "Ca ngay", "Thuc An"),new ThucAn(true, "Soi Gac", 15000, true, "Ca ngay", "Thuc An"),new ThucAn(true, "Banh Cuon", 30000, false, "Ca ngay", "Thuc An"));
        danhSachNhanVien.themNhanVien(new DauBep("Trinh Thanh Hai", "Nam", "HCM", "11/12/2022", "22/12/2003"), new PhaChe("Ngo Thanh Van", "Nu", "Hai Duong", "09/08/2022", "15/12/2008"), new ThuNgan("Dinh Manh Dung", "Nam", "Binh Dinh", "10/02/2022", "05/12/2001"), new BaoVe("Dinh Cong Manh", "Nam", "Hai Phong", "10/10/2020", "17/07/1995"), new PhucVu("Thy Ngoc", "Nu", "Quang Nam", "01/02/2021", "08/12/2001"), new DauBep("Nguyen Tien Dung", "Nam", "Ha Noi", "11/12/2022", "07/07/1997"), new PhaChe("Tran Thi B", "Nu", "Dak Nong", "13/03/2022", "11/01/1991"), new ThuNgan("Truong Van Huy", "Nam", "Quang Ninh", "01/12/2019", "11/11/1993"), new BaoVe("Ngo Thi D", "Nu", "Tay Ninh", "08/07/2021", "01/11/1995"), new PhucVu("Do Minh Quan", "Nam", "Ho Chi Minh", "26/05/2021", "07/11/2003"), new DauBep("Nguyen Van A", "Nu", "An Giang", "11/12/2022", "18/12/2000"), new PhaChe("Mai Thanh Tam", "Nam", "Ho Chi Minh", "13/03/2019", "11/12/2000"), new ThuNgan("Thao Van", "Nu", "Da Lat", "18/09/2021", "27/07/1999"), new BaoVe("Hoai Linh", "Nam", "Can Tho", "25/05/2021", "14/12/2004"), new PhucVu("Xuan Trang", "Nu", "Ho Chi Minh", "12/02/2019", "27/12/1997"));
        danhSachBan.themBan(new Ban(4, true), new Ban(8, false), new Ban(4, true), new Ban(6, true), new Ban(4, false), new Ban(2, true), new Ban(4, true),new Ban(6, true),new Ban(8, true),new Ban(10, true),new Ban(4, false),new Ban(2, false),new Ban(6, false),new Ban(4, true),new Ban(2, true),new Ban(4, true));
        int choice;
        do {
            choice = 0;
            System.out.print("\n====Chuon Trinh Quan Ly Quan Coffee=========");
            System.out.print("\n1.Quan Ly Nhan Vien");
            System.out.print("\n2.Quan Ly Ban");
            System.out.print("\n3.Quan Ly Menu");
            System.out.print("\n4.Quan Ly Khach Hang");
            System.out.print("\n5.Thong ke doanh thu theo thang: ");
            System.out.print("\n6.Thoat");
            System.out.print("\nChon: ");
            choice = Parse.sc.nextInt();

            switch (choice) {
                case 1 -> {
                    int choice1_1;
                    do {
                        choice1_1 = 0;
                        System.out.print("=====Quan Ly Nhan Vien=====");
                        System.out.print("\n1.Them NV");
                        System.out.print("\n2.Xem danh sach nhan vien ");
                        System.out.print("\n3.Tra cuu theo tu khoa: ");
                        System.out.print("\n4.Cap nhap thong tin nhan vien: ");
                        System.out.print("\n5.Xoa thong tin nhan vien: ");
                        System.out.print("\n6.Danh sach to chuc sinh nhat: ");
                        System.out.print("\n7.Thoat: ");
                        System.out.print("\nChon: ");
                        choice1_1 = Parse.sc.nextInt();
                        switch (choice1_1) {
                            case 1 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap bo phan muon them: ");
                                String vitri = Parse.sc.nextLine();
                                System.out.print("\nNhap so luong nhan vien muon them: ");
                                int soluong = Parse.sc.nextInt();
                                String temp2 = Parse.sc.nextLine();
                                danhSachNhanVien.themNhanVien(soluong, vitri);
                            }

                            case 2 -> {
                                danhSachNhanVien.xuatDSNhanVien();
                            }

                            case 3 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap tu khoa muon tra cuu: ");
                                String kword = Parse.sc.nextLine();
                                List<NhanVien> listTraCuu = danhSachNhanVien.traCuu(kword);
                                listTraCuu.forEach(x -> x.xuatNhanVien());
                            }
                            case 4 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap tu khoa muon cap nhat: ");
                                String kword = Parse.sc.nextLine();
                                danhSachNhanVien.capNhatThongTin(kword);
                            }
                            case 5 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap tu khoa muon xoa: ");
                                String kword = Parse.sc.nextLine();
                                danhSachNhanVien.xoaThongTin(kword);
                            }
                            case 6 -> {

                                List<NhanVien> danhSachSinhNhat = danhSachNhanVien.toChucSinhNhat();
                                System.out.printf("%43s%d", "Nhan vien co sinh nhat trong thang ", LocalDate.now().getMonthValue());
                                System.out.printf("\n%24s\n", "===================");
                                danhSachSinhNhat.forEach(x -> x.xuatNhanVien());
                            }
                            case 7 -> {
                                break;
                            }

                            default -> {
                                throw new AssertionError();
                            }

                        }

                    } while (choice1_1 >= 1 && choice1_1 <= 6);
                }

                case 2 -> {
                    int choice2_1;
                    do {
                        choice2_1 = 0;
                        System.out.print("\n=====Quan Ly Ban=====");
                        System.out.print("\n1.Them ban: ");
                        System.out.print("\n2.Tim kiem ban theo suc chua: ");
                        System.out.print("\n3.Tim ban theo ma: ");
                        System.out.print("\n4.Xem danh sach ban trong: ");
                        System.out.print("\n5.Cap nhat thong tin ban: ");
                        System.out.print("\n6.Xoa thong tin ban theo ma: ");
                        System.out.print("\n7.Xoa thong tin ban theo suc chua:");
                        System.out.print("\n8.Xoa thong tin ban theo ma va suc chua: ");
                        System.out.print("\n9.Xem danh sach ban: ");
                        System.out.print("\n10.Thoat");
                        System.out.print("\nChon: ");
                        choice2_1 = Parse.sc.nextInt();
                        switch (choice2_1) {
                            case 1 -> {
                                System.out.print("\nNhap so luong ban muon them vao danh sach: ");
                                int soluong = Parse.sc.nextInt();
                                danhSachBan.themBan(soluong);
                            }
                            case 2 -> {
                                System.out.print("\nNhap suc chua ban muon tim kiem: ");
                                int schua = Parse.sc.nextInt();
                                List<Ban> banTheoSucChua = danhSachBan.timBan(schua);
                                banTheoSucChua.forEach(x -> x.xuatThongTinBan());
                            }
                            case 3 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap ma ban: ");
                                String ma = Parse.sc.nextLine();
                                Ban b = (Ban) danhSachBan.timBan(ma);
                                b.xuatThongTinBan();

                            }
                            case 4 -> {
                                List<Ban> banTrong = danhSachBan.timBan();
                                banTrong.forEach(x -> x.xuatThongTinBan());
                            }
                            case 5 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap ma ban: ");
                                String ma = Parse.sc.nextLine();
                                danhSachBan.capNhatLaiTrangThaiBanLaCoKhach(danhSachBan.timBan(ma));
                            }

                            case 6 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap ma ban muon xoa: ");
                                String ma = Parse.sc.nextLine();
                                danhSachBan.xoaThongTinBan(ma);
                            }

                            case 7 -> {
                                //String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap suc chua ban muon xoa: ");
                                int succhua = Parse.sc.nextInt();
                                danhSachBan.xoaThongTinBan(succhua);
                                //String temp2 = Parse.sc.nextLine();
                            }

                            case 8 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap ma ban: ");
                                String ma = Parse.sc.nextLine();
                                System.out.print("\nNhap suc chua: ");
                                int succhua = Parse.sc.nextInt();
                                danhSachBan.xoaThongTinBan(succhua, ma);
                            }

                            case 9 -> {
                                danhSachBan.xuatDanhSachBan();
                            }
                            case 10 -> {
                                break;
                            }

                            default -> {
                                throw new AssertionError();
                            }

                        }
                    } while (choice2_1 >= 1 && choice2_1 <= 9);

                }
                case 3 -> {
                    int choice3_1;
                    do {
                        choice3_1 = 0;
                        System.out.print("\n===============Quan Ly Menu=================");
                        System.out.print("\n1.Them thuc an hoac nuoc uong: ");
                        System.out.print("\n2.Tim thuc an va nuoc uong theo khoang gia: ");
                        System.out.print("\n3.Tim thuc an va nuoc uong theo danh muc hoac ten: ");
                        System.out.print("\n4.Sap xep menu giam dan theo gia: ");
                        System.out.print("\n5.Sap xem menu tang dan theo gia: ");
                        System.out.print("\n6.Xoa mot thuc an hoac nuoc uong theo ten hoac danh muc: ");
                        System.out.print("\n7.Xoa mot thuc an hoac nuoc uong theo khoang gia: ");
                        System.out.print("\n8.Cap nhat lai thong tin mon an: ");
                        System.out.print("\n9.Thoat ");
                        System.out.print("\nChon: ");
                        choice3_1 = Parse.sc.nextInt();
                        switch (choice3_1) {
                            case 1 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap lua chon (Thuc An / Nuoc Uong): ");
                                String luachon = Parse.sc.nextLine();
                                System.out.print("\nNhap so luong muon them: ");
                                int sl = Parse.sc.nextInt();
                                String temp1 = Parse.sc.nextLine();
                                Menu.themThucPhamVaoMenu(sl, luachon);

                            }
                            case 2 -> {
                                List<FAndB> danhSachTheoGia = new ArrayList<>();
                                System.out.print("\nNhap khoang gia bat dau: ");
                                long g1 = Parse.sc.nextLong();
                                System.out.print("\nNhap khoang gia ket thuc: ");
                                long g2 = Parse.sc.nextLong();
                                danhSachTheoGia = Menu.timTheo(g1, g2);
                                danhSachTheoGia.forEach(x -> x.xuatFAndB());
                            }
                            case 3 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap ten thuc an hoac nuoc uong: ");
                                String t = Parse.sc.nextLine();
                                List<FAndB> danhSachTheoTen = new ArrayList<>();
                                danhSachTheoTen = Menu.timTheo(t);
                                danhSachTheoTen.forEach(x -> x.xuatFAndB());
                            }
                            case 4 -> {
                                Menu.xapXepGiaTangDan();
                                Menu.xuatMenu();
                            }
                            case 5 -> {
                                Menu.sapXepGiaGiamDan();
                                Menu.xuatMenu();
                            }

                            case 6 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap ten hoac danh muc cua  thuc an hoac nuoc uong ban muon xoa: ");
                                String ten = Parse.sc.nextLine();
                                Menu.xoa(ten);
                            }

                            case 7 -> {

                                System.out.print("\nNhap khoang gia bat dau: ");
                                long g1 = Parse.sc.nextLong();
                                System.out.print("\nNhap khoang gia ket thuc: ");
                                long g2 = Parse.sc.nextLong();
                                Menu.xoa(g1, g2);

                            }
                            case 8 -> {
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap ten mon an muon cap nhan: ");
                                String tenmon = Parse.sc.nextLine();
                                Menu.capNhat(tenmon);
                            }
                            case 9 -> {
                                break;
                            }

                            default -> {
                                throw new AssertionError();
                            }

                        }
                    } while (choice3_1 >= 1 && choice3_1 <= 8);
                }
                case 4 -> {
                    KhachHang kh = new KhachHang(Menu,danhSachBan);
                    kh.datMonVaBan();
                    HoaDon hd = new HoaDon(kh);
                    hd.xuatHoaDon(Menu, danhSachBan);
                    danhSachDoanhThu.themHoaDonVaoDanhSach(hd);

                }
                case 5 -> {
                    int choice5_1;
                    do {
                        choice5_1 = 0;
                        System.out.print("\n======Quan Ly Doanh Thu==========");
                        System.out.print("\n1.Xem Doanh Thu Theo Thang: ");
                        System.out.print("\n2.Xem Hoa Don Trong Thang: ");
                        System.out.print("\n3.Thoat: ");
                        System.out.print("\nChon: ");
                        choice5_1 = Parse.sc.nextInt();
                        switch (choice5_1) {
                            case 1->{
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap thang muon xem doanh thu: ");
                                int t = Parse.sc.nextInt();
                                danhSachDoanhThu.tinhDoanhThuTheoThang(t);
                            }
                            case 2->{
                                String temp = Parse.sc.nextLine();
                                System.out.print("\nNhap thang muon xem hoa don trong thang do: ");
                                int t = Parse.sc.nextInt();
                                danhSachDoanhThu.xuatHoaDonTheoThang(t,Menu,danhSachBan);
                            }
                            case 3 -> {
                                break;
                            }

                            default -> {
                                throw new AssertionError();
                            }

                        }
                    } while (1 <= choice5_1 && choice5_1 <= 2);

                }
                case 6 -> {
                    break;
                }
                default -> {
                    throw new AssertionError();
                }
            }

        } while (choice >= 1 && choice <= 5);
    }
}
