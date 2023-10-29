/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import CauHinh.Parse;
import java.time.LocalDate;

/**
 *
 * @author space
 */
public abstract class NhanVien {
    
    private String hoVaTen;
    private String gioiTinh;
    private String queQuan;
    private LocalDate ngaySinh;
    private LocalDate ngayVaoLam;
    private String maNhanVien;
    protected BoPhan boPhanTrucThuoc;
    private static int maNV = 0;
    
    {
        setMaNV(getMaNV() + 1);
        setMaNhanVien(String.format("NV_%d", maNV));
        
    }

    public NhanVien(){
        
    }

    public NhanVien(String hoVaTen, String gioiTinh, String queQuan, LocalDate ngaySinh, LocalDate ngayVaoLam, String maNhanVien, BoPhan boPhanTrucThuoc) {
        this.hoVaTen = hoVaTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
        this.ngayVaoLam = ngayVaoLam;
        this.maNhanVien = maNhanVien;
        this.boPhanTrucThuoc = boPhanTrucThuoc;
    }
    
    
    
    public NhanVien(String ten, String gt, String que, String ngayvaolam, String ngaysinh) {       
        this.hoVaTen = ten;
        this.gioiTinh = gt;
        this.queQuan = que;
        this.ngayVaoLam = Parse.traVeLocalDate(ngayvaolam);
        this.ngaySinh = Parse.traVeLocalDate(ngaysinh);
    }
    

    /**
     * @return the hoVaTen
     */
    public String getHoVaTen() {
        return hoVaTen;
    }

    /**
     * @param hoVaTen the hoVaTen to set
     */
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = Parse.traVeLocalDate(ngaySinh);
    }

    /**
     * @return the ngayVaoLam
     */
    public LocalDate getNgayVaoLam() {
        return ngayVaoLam;
    }

    /**
     * @param ngayVaoLam the ngayVaoLam to set
     */
    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = Parse.traVeLocalDate(ngayVaoLam);
    }

    /**
     * @return the maNhanVien
     */
    public String getMaNhanVien() {
        return maNhanVien;
    }

    /**
     * @param maNhanVien the maNhanVien to set
     */
    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    /**
     * @return the maNV
     */
    public static int getMaNV() {
        return maNV;
    }

    /**
     * @param aMaNV the maNV to set
     */
    public static void setMaNV(int aMaNV) {
        maNV = aMaNV;
    }

    
    /**
     * @return the boPhanTrucThuoc
     */
    public BoPhan getBoPhanTrucThuoc() {
        return boPhanTrucThuoc;
    }

    /**
     * @param boPhanTrucThuoc the boPhanTrucThuoc to set
     */
    public void setBoPhanTrucThuoc(BoPhan boPhanTrucThuoc) {
        this.boPhanTrucThuoc = boPhanTrucThuoc;
    }
    
    
    
    public void xuatNhanVien() {
//        System.out.print("\n=====Thong Tin Nhan Vien===========");
//        System.out.print("\nMa nhan vien: " + this.maNhanVien);
//        System.out.print("\nHo va ten: " + this.hoVaTen);
//        System.out.print("\nGioi tinh: " + this.gioiTinh);
//        System.out.print("\nNgay sinh: " + this.ngaySinh.format(Parse.formatter));
//        System.out.print("\nNgay vao lam: " + this.ngayVaoLam.format(Parse.formatter));
//        System.out.print("\nQue quan: " + this.queQuan);
        System.out.print(this);
    }
    
    public void nhapNhanVien() {
        System.out.print("\nHo va ten: ");
        String name = Parse.sc.nextLine();
        this.hoVaTen = name;
        
        System.out.print("\nNhap gioi tinh: ");
        String gt = Parse.sc.nextLine();
        this.gioiTinh = gt;
        
        System.out.print("\nNhap quen quan: ");
        String qq = Parse.sc.nextLine();
        this.queQuan = qq;
        
        System.out.print("\nNhap ngay sinh: ");
        String date = Parse.sc.nextLine();
        this.ngaySinh = Parse.traVeLocalDate(date);
        
        System.out.print("\nNhap ngay vao lam: ");
        String joinin = Parse.sc.nextLine();
        this.ngayVaoLam = Parse.traVeLocalDate(joinin);
        
    }
    
    public abstract BoPhan layBoPhan();
    
    @Override
    public String toString() {
        return String.format("\n%s\nMa Nhan Vien: %s\nHo Va Ten: %s\nGioi tinh: %s\nNgay sinh: %s\nNgay vao lam: %s\nQue Quan: %s\n", "=========Thong Tin Nhan Vien===========", this.maNhanVien, this.hoVaTen, this.gioiTinh, this.ngaySinh.format(Parse.formatter), this.ngayVaoLam.format(Parse.formatter), this.queQuan);
    }
    
}
