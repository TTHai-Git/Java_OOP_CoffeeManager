/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import CauHinh.Parse;
import QuanLy.QuanLyBan;
import QuanLy.QuanLyFAndB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author space
 */
public class KhachHang {

    private String maKH;
    private static int sLKH = 0;
    private ThongTinDat thongTin;
    private boolean thanhToan;
    private QuanLyFAndB Menu;
    private QuanLyBan danhSachBan;

    {
        sLKH++;
        this.maKH = String.format("KH_%02d", sLKH);
    }

    public KhachHang(QuanLyFAndB Menu,QuanLyBan Ban){
        this.Menu = Menu;
        this.danhSachBan = Ban;
    }

    public void datMonVaBan(){

        List<String> goiMon = new ArrayList<>();
        List<Integer> soLuong = new ArrayList<>();

        boolean check;
        boolean kiemTraTinhTrangThucPham;
        do {
            do {
                kiemTraTinhTrangThucPham = false;
                String temp = Parse.sc.nextLine();
                System.out.print("\nNhap ten thuc an hoac nuoc uong muon dat: ");
                String s = Parse.sc.nextLine();
                kiemTraTinhTrangThucPham = getMenu().kiemTraTinhTrangThucPham(s);
                if (kiemTraTinhTrangThucPham == false) {
                    System.out.printf("\n%s da ban het trong menu, vui long dat mon khac!!!(Nhan phim Enter de tiep tuc)",s);
                } else {
                    System.out.print("\nNhap so luong: ");
                    int sl = Parse.sc.nextInt();
                    String temp1 = Parse.sc.nextLine();
                    goiMon.add(s);
                    soLuong.add(sl);
                }

            } while (kiemTraTinhTrangThucPham == false);

            System.out.print("\nBan co muon dat tiep(Co/Khong): ");
            String choice = Parse.sc.nextLine();
            System.out.print("\n(Nhan Enter de tiep tuc!!!)");
            if (choice.equalsIgnoreCase("Co")) {
                check = true;
            } else {
                check = false;
            }

        } while (check == true);
        
        System.out.println("\n=====Dat mon thanh con!!!=======");
        
        boolean kiemTraTinhTrangBan;
        String ma;
        do {
            kiemTraTinhTrangBan = false;
            System.out.print("\nNhap ma ban muon chon: ");
            ma = Parse.sc.nextLine();
            kiemTraTinhTrangBan = getDanhSachBan().kiemTraBanConTrong(ma);
            if (kiemTraTinhTrangBan == false) {
                System.out.printf("\n%s da co khach, vui long chon ban khac!!!", ma);
            } else {
                System.out.print("\nGhi chu them: ");
                String note = Parse.sc.nextLine();
                this.thongTin = new ThongTinDat(goiMon, soLuong, ma, note);
            }
        } while (kiemTraTinhTrangBan == false);
        System.out.println("\n======Dat Ban Thanh Cong!!!=======");
        System.out.print("\nBan co chap nhan thanh toan (Co/Khong): ");
        String accept = Parse.sc.nextLine();
        if (accept.equalsIgnoreCase("Co")) {
            this.setThanhToan(true);
            System.out.print("\n====Thanh Toan Thanh Cong!!!====");
            danhSachBan.capNhatLaiTrangThaiBanLaTrong(danhSachBan.timBan(ma));
        }
        else{
            this.setThanhToan(false);
            
        }
    }

    public void xuatThongTinKhachHang() {
        System.out.print("\nMa Khach hang: " + this.maKH);
        System.out.print("\nGhi chu them: " + this.thongTin.getGhiChu());
    }

    /**
     * @return the thongTin
     */
    public ThongTinDat getThongTin() {
        return thongTin;
    }

    /**
     * @param thongTin the thongTin to set
     */
    public void setThongTin(ThongTinDat thongTin) {
        this.thongTin = thongTin;
    }

    

    /**
     * @return the maKH
     */
    public String getMaKH() {
        return maKH;
    }

    /**
     * @param maKH the maKH to set
     */
    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    /**
     * @return the sLKH
     */
    public static int getsLKH() {
        return sLKH;
    }

    /**
     * @param asLKH the sLKH to set
     */
    public static void setsLKH(int asLKH) {
        sLKH = asLKH;
    }

    /**
     * @return the thanhToan
     */
    public boolean isThanhToan() {
        return thanhToan;
    }

    /**
     * @param thanhToan the thanhToan to set
     */
    public void setThanhToan(boolean thanhToan) {
        this.thanhToan = thanhToan;
    }

    /**
     * @return the Menu
     */
    public QuanLyFAndB getMenu() {
        return Menu;
    }

    /**
     * @param Menu the Menu to set
     */
    public void setMenu(QuanLyFAndB Menu) {
        this.Menu = Menu;
    }

    /**
     * @return the danhSachBan
     */
    public QuanLyBan getDanhSachBan() {
        return danhSachBan;
    }

    /**
     * @param danhSachBan the danhSachBan to set
     */
    public void setDanhSachBan(QuanLyBan danhSachBan) {
        this.danhSachBan = danhSachBan;
    }
    
    

}
