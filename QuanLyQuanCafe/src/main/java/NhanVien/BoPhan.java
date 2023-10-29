/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import CauHinh.Parse;

/**
 *
 * @author space
 */
public class BoPhan {

    private String maBoPhan;
    private String tenBoPhan;

    public BoPhan(String ten, String ma) {
        tenBoPhan = ten;
        maBoPhan = ma;
    }
    
    

    public BoPhan() {
    }

    /**
     * @return the maBoPhan
     */
    public String getMaBoPhan() {
        return maBoPhan;
    }

    /**
     * @param maBoPhan the maBoPhan to set
     */
    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    /**
     * @return the tenBoPhan
     */
    public String getTenBoPhan() {
        return tenBoPhan;
    }

    /**
     * @param tenBoPhan the tenBoPhan to set
     */
    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public void nhapBoPhanTrucThuoc(){
        System.out.print("\nNhap ten bo phan: ");
        this.tenBoPhan = Parse.sc.nextLine();
    }
    
    public void xuatBoPhanTrucThuoc() {
        System.out.print("\nTen bo phan: " + this.tenBoPhan);
        System.out.print("\nMa Bo phan: " + this.maBoPhan);
    }

}
