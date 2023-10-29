/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import Ban.Ban;
import CauHinh.Parse;
import Menu.FAndB;
import QuanLy.QuanLyBan;
import QuanLy.QuanLyFAndB;
import java.time.LocalDateTime;
import java.util.List;

/**
 *
 * @author space
 */
public class HoaDon {

    private KhachHang khachHang;
    private LocalDateTime thoiGianLapHoaDon;
    private static int maHD = 0;
    private Long thanhTien;

    {
        maHD++;
        this.maHD = maHD;
    }

    public HoaDon(KhachHang kh) {
        this.khachHang = kh;
        this.thoiGianLapHoaDon = Parse.current;
    }

    public void xuatHoaDon(QuanLyFAndB Menu, QuanLyBan danhSachBan) {
        long toal = 0;
        System.out.print("\n======================HoaDon=========================");
        System.out.printf("\n%-20s%-23s%-20s", "Ten mon ", "So luong", "Thanh Tien");
        for (FAndB fb : Menu.getListFAndB()) {
            for (int i = 0; i < this.khachHang.getThongTin().getTenThucAnVaNuocUong().size(); i++) {
                if (fb.getTen().contains(this.khachHang.getThongTin().getTenThucAnVaNuocUong().get(i))) {
                    HoaDon.xuatDinhDangGiaTrongHoaDon(i + 1, fb.getTen(), this.khachHang.getThongTin().getGhiChuSL().get(i), (Parse.chuyenTienThanhChuoi(fb.getGiaBan() * this.khachHang.getThongTin().getGhiChuSL().get(i))));
                    toal = toal + (fb.getGiaBan() * this.khachHang.getThongTin().getGhiChuSL().get(i));
                }
            }
        }
        this.thanhTien = toal;
        danhSachBan.capNhatLaiTrangThaiBanLaCoKhach(danhSachBan.timBan(this.khachHang.getThongTin().getMaBanDat()));
        System.out.print("\n====================Thong Tin Ban Dat================");
        danhSachBan.timBan(this.khachHang.getThongTin().getMaBanDat()).xuatThongTinBan();
        this.getKhachHang().xuatThongTinKhachHang();
        //Kiem Tra Khach hang co muon thanh toan hoa don hay khong
        if (this.khachHang.isThanhToan() == true) {
            System.out.print("\n================Thanh Toan Hoa Don===================");
            System.out.print("\nMa hoa don: " + HoaDon.maHD);
            System.out.print("\nThoi gian lap hoa don: " + this.getThoiGianLapHoaDon().format(Parse.dateOfBill));
            System.out.print("\nTong cong hoa don: " + Parse.chuyenTienThanhChuoi(thanhTien) + Parse.traVeDonViTienTe());
            System.out.println();
            danhSachBan.capNhatLaiTrangThaiBanLaTrong(danhSachBan.timBan(this.khachHang.getThongTin().getMaBanDat()));
        }
        else{
            System.out.println("\nKhach Hang khong dong y thanh toan, huy hoa don nay!!! ");
        }
        

    }

    public static void xuatDinhDangGiaTrongHoaDon(int stt, String tenmon, int sl, String chuoigia) {
        System.out.printf("\n%02d.%-20s%-23s%-22s", stt, tenmon, sl, chuoigia);
    }

    /**
     * @return the thanhTien
     */
    public long getThanhTien() {
        return thanhTien;
    }

    /**
     * @param thanhTien the thanhTien to set
     */
    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    /**
     * @return the maHD
     */
    public static int getMaHD() {
        return maHD;
    }

    /**
     * @param aMaHD the maHD to set
     */
    public static void setMaHD(int aMaHD) {
        maHD = aMaHD;
    }

    /**
     * @return the khachHang
     */
    public KhachHang getKhachHang() {
        return khachHang;
    }

    /**
     * @param khachHang the khachHang to set
     */
    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    /**
     * @return the thoiGianLapHoaDon
     */
    public LocalDateTime getThoiGianLapHoaDon() {
        return thoiGianLapHoaDon;
    }

    /**
     * @param thoiGianLapHoaDon the thoiGianLapHoaDon to set
     */
    public void setThoiGianLapHoaDon(LocalDateTime thoiGianLapHoaDon) {
        this.thoiGianLapHoaDon = thoiGianLapHoaDon;
    }

}
