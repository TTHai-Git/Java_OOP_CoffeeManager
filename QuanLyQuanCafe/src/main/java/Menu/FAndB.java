/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import CauHinh.Parse;

/**
 *
 * @author space
 */
public abstract class FAndB {

    private String ten;
    private long giaBan;
    private Boolean tinhTrang;
    private String thoiDiemBan;
    protected String danhMuc;

    public FAndB(String t, long gb, boolean tt, String tdb) {
        this.ten = t;
        this.giaBan = gb;
        this.tinhTrang = tt;
        this.thoiDiemBan = tdb;
    }

    public FAndB() {

    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the giaBan
     */
    public long getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(long giaBan) {
        this.giaBan = giaBan;
    }

    /**
     * @return the tinhTrang
     */
    public Boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the thoiDiemBan
     */
    public String getThoiDiemBan() {
        return thoiDiemBan;
    }

    /**
     * @param thoiDiemBan the thoiDiemBan to set
     */
    public void setThoiDiemBan(String thoiDiemBan) {
        this.thoiDiemBan = thoiDiemBan;
    }


    /**
     * @return the danhMuc
     */
    public String getDanhMuc() {
        return danhMuc;
    }

    /**
     * @param danhMuc the danhMuc to set
     */
    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public void nhapFAndB() {
        System.out.print("\nNhap ten thuc an hoac nuoc uong: ");
        String t = Parse.sc.nextLine();
        this.ten = t;

        System.out.print("\nNhap gia ban: ");
        long g = Parse.sc.nextLong();
        this.giaBan = g;
        
        String temp = Parse.sc.nextLine();
        System.out.print("\nNhap tinh trang(Con/Het): ");
        String tinhtrang = Parse.sc.nextLine();

        if (tinhtrang.equalsIgnoreCase("Con")) {
            this.tinhTrang = true;
        } else {
            this.tinhTrang = false;
        }
        
        System.out.print("\nNhap thoi diem ban: ");
        String tdb = Parse.sc.nextLine();
        this.thoiDiemBan = tdb;
    }

    public void xuatFAndB() {

//        System.out.print("\nTen thuc an hoac nuoc uong: " + this.getTen());
//        System.out.print("\nGia: " + Parse.chuyenTienThanhChuoi(this.giaBan) + Parse.traVeDonViTienTe());
//        System.out.print("\nThoi diem ban: " + this.thoiDiemBan);
        System.out.print(this);
        if (this.tinhTrang == true) {
            System.out.print("\nTinh trang: Con");
        } else {
            System.out.print("\nTinh Trang: Het");
        }

    }

    @Override
    public String toString() {
        return String.format("\nTen thuc an hoac nuoc uong: %s\nGia: %s %s\nThoi diem ban: %s ", this.ten, Parse.chuyenTienThanhChuoi(this.giaBan), Parse.traVeDonViTienTe().toString(), this.thoiDiemBan);
    }

    public abstract String layTenDanhMuc();

}
