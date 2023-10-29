/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoanhThu;

import Menu.FAndB;
import QuanLy.QuanLyFAndB;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author space
 */
public class ThongTinDat {

    private List<String> tenThucAnVaNuocUong;
    private List<Integer> ghiChuSL;
    private String maBanDat;
    private String ghiChu;

    public ThongTinDat(List<String> tenThucAnVaNuocUong, List<Integer> ghiChuSL, String ma, String ghichu) {

        this.tenThucAnVaNuocUong = new ArrayList<>();
        this.tenThucAnVaNuocUong = tenThucAnVaNuocUong;
        this.ghiChuSL = new ArrayList<>();
        this.ghiChuSL = ghiChuSL;
        this.maBanDat = ma;
        this.ghiChu = ghichu;
    }
    
    /**
     * @return the tenThucAnVaNuocUong
     */
    public List<String> getTenThucAnVaNuocUong() {
        return tenThucAnVaNuocUong;
    }

    /**
     * @param tenThucAnVaNuocUong the tenThucAnVaNuocUong to set
     */
    public void setTenThucAnVaNuocUong(List<String> tenThucAnVaNuocUong) {
        this.tenThucAnVaNuocUong = tenThucAnVaNuocUong;
    }

    /**
     * @return the ghiChuSL
     */
    public List<Integer> getGhiChuSL() {
        return ghiChuSL;
    }

    /**
     * @param ghiChuSL the ghiChuSL to set
     */
    public void setGhiChuSL(List<Integer> ghiChuSL) {
        this.ghiChuSL = ghiChuSL;
    }

    /**
     * @return the maBanDat
     */
    public String getMaBanDat() {
        return maBanDat;
    }

    /**
     * @param maBanDat the maBanDat to set
     */
    public void setMaBanDat(String maBanDat) {
        this.maBanDat = maBanDat;
    }

    /**
     * @return the ghiChu
     */
    public String getGhiChu() {
        return ghiChu;
    }

    /**
     * @param ghiChu the ghiChu to set
     */
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
