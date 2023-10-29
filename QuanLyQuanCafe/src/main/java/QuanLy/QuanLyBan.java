/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy;

import Ban.Ban;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author space
 */
public class QuanLyBan {
    
    private List<Ban> listBan;
    
    public QuanLyBan() {
        listBan = new ArrayList<>();
    }
    
    public void themBan(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("\n======Nhap thong tin cho ban thu " + i + "======");
            Ban b = new Ban();
            b.nhapThongTinBan();
            this.listBan.add(b);
        }
    }
    
    public void themBan(Ban...b){
        this.listBan.addAll(Arrays.asList(b));
    }
    
    public List<Ban> timBan() {
        System.out.print("\n======Ban con trong=======");
        return this.listBan.stream().filter(x -> x.isTinhTrang() == true).collect(Collectors.toList());
    }
    
    public List<Ban> timBan(int succhua) {
        System.out.printf("\n======Ban co suc chua%2d ========", succhua);
        return this.listBan.stream().filter(x -> x.getSucChua() == succhua).collect(Collectors.toList());
    }
    
    public Ban timBan(String ma) {
        return this.listBan.stream().filter(x -> x.getMaBan().contains(ma)).findFirst().get();
    }
    
    public void xuatDanhSachBan() {
        System.out.print("\n====Danh sach cac ban trong quan============");
        this.listBan.forEach(x -> x.xuatThongTinBan());
    }
    
    public void xoaThongTinBan(String kw) {
        List<Ban> danhSachXoa = this.listBan.stream().filter(b -> b.getMaBan().contains(kw)).collect(Collectors.toList());
        this.listBan.removeAll(danhSachXoa);
    }
    
    public void xoaThongTinBan(int succhua) {
        List<Ban> danhSachXoa = this.listBan.stream().filter(b -> b.getSucChua() == succhua).collect(Collectors.toList());
        this.listBan.removeAll(danhSachXoa);
    }
    
    public void xoaThongTinBan(int succhua, String ma) {
        Ban banxoa  = this.listBan.stream().filter(b -> b.getSucChua() == succhua && b.getMaBan().contains(ma)).findFirst().get();
        this.listBan.remove(banxoa);
    }
    
    public void capNhatLaiTrangThaiBanLaCoKhach(Ban b) {
        System.out.println("\n======Cap Nhat Lai Trang Thai Ban Thanh Cong============");
        b.setTinhTrang(false);
    }
     public void capNhatLaiTrangThaiBanLaTrong(Ban b) {
        System.out.println("\n======Cap Nhat Lai Trang Thai Ban Thanh Cong============");
        b.setTinhTrang(true);
    }
    
    
    public Boolean kiemTraBanConTrong(String ma)
    {
        for(Ban b:this.listBan){
            if (b.getMaBan().contains(ma) && b.isTinhTrang() == false) {
                return false;
            }
        }
        return true;
    }
}
