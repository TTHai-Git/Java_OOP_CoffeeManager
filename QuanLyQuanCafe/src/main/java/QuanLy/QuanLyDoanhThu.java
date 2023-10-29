/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy;

import CauHinh.Parse;
import DoanhThu.HoaDon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author space
 */
public class QuanLyDoanhThu {
    private List<HoaDon> danhSachHoaDon;

    /**
     *
     * @param danhSachHoaDon
     */
    public QuanLyDoanhThu(List<HoaDon> danhSachHoaDon) {
        this.danhSachHoaDon = new ArrayList<>();
        this.danhSachHoaDon = danhSachHoaDon;
        
    }
    
    public void themHoaDonVaoDanhSach(HoaDon hd){
        if (hd.getKhachHang().isThanhToan() == true) {
             this.danhSachHoaDon.add(hd);
        }
    }
    
    public void tinhDoanhThuTheoThang(int thang){
        long toal = 0;
        for(HoaDon hd: this.danhSachHoaDon){
            if(hd.getThoiGianLapHoaDon().getMonthValue() == thang){
                toal = toal + hd.getThanhTien();
            }
        }
        if (toal == 0) {
            System.out.printf("\nDoanh Thu thang %d hien chua co!!! ",thang);
        }
        else{
            System.out.printf("\n=========Doanh thu cua thang %d========\nTong doanh thu: %s %s",thang,Parse.chuyenTienThanhChuoi(toal),Parse.traVeDonViTienTe().toString());
        }
    }
    
    public void xuatHoaDonTheoThang(int thang,QuanLyFAndB Menu,QuanLyBan danhSachBan){
       this.danhSachHoaDon.stream().filter(x->x.getThoiGianLapHoaDon().getMonthValue() == thang).forEach(x->x.xuatHoaDon(Menu, danhSachBan));
    }

    /**
     * @return the danhSachHoaDon
     */
    public List<HoaDon> getDanhSachHoaDon() {
        return danhSachHoaDon;
    }

    /**
     * @param danhSachHoaDon the danhSachHoaDon to set
     */
    public void setDanhSachHoaDon(List<HoaDon> danhSachHoaDon) {
        this.danhSachHoaDon = danhSachHoaDon;
    }
}
