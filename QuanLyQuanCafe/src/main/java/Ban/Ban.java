/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ban;

import CauHinh.Parse;

/**
 *
 * @author space
 */
public class Ban {

    private String maBan;
    private int sucChua;
    private boolean tinhTrang;
    private static int count = 0;
   

    {
        count++;
        this.setMaBan(String.format("B00%d", getCount()));
    }

    public Ban(String maBan, int sucChua, boolean tinhTrang) {
        this.maBan = maBan;
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }
    
    public Ban(int sucChua,boolean tinhTrang){
        this.sucChua = sucChua;
        this.tinhTrang = tinhTrang;
    }

    public Ban() {
    }

    
    /**
     * @return the maBan
     */
    public String getMaBan() {
        return maBan;
    }

    /**
     * @param maBan the maBan to set
     */
    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    /**
     * @return the sucChua
     */
    public int getSucChua() {
        return sucChua;
    }

    /**
     * @param sucChua the sucChua to set
     */
    public void setSucChua(int sucChua) {
        this.sucChua = sucChua;
    }

    /**
     * @return the tinhTrang
     */
    public boolean isTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    /**
     * @return the count
     */
    public static int getCount() {
        return count;
    }

    public void nhapThongTinBan() {
        System.out.print("\nNhap suc chua: ");
        int succhua = Parse.sc.nextInt();
        this.sucChua = succhua;
        String temp = Parse.sc.nextLine();
        System.out.print("\nNhap tinh trang: ");
        String s = Parse.sc.nextLine();
        if (s.trim().equals("Trong")) {
            this.tinhTrang = true;
        }
        else{
            this.tinhTrang = false;
        }
    }

    public void xuatThongTinBan(){
        System.out.print("\n=====Thong Tin cua ban " + this.maBan + "======");
        System.out.print("\nMa ban: " + this.maBan);
        System.out.print("\nSuc chua: " + this.sucChua);
        if (this.tinhTrang == true) {
            System.out.print("\nTinh trang: Trong");
        }
        else{
             System.out.print("\nTinh trang: Co Khach" );
        }
        System.out.println();
    }
    

}
