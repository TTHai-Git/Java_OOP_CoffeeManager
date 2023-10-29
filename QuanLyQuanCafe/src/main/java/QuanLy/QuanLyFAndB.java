/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy;

import Menu.FAndB;
import Menu.NuocUong;
import Menu.ThucAn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author space
 */
public class QuanLyFAndB {

    private List<FAndB> listFAndB;

    public QuanLyFAndB() {
        listFAndB = new ArrayList<>();
    }
    
    /**
     * @return the listFAndB
     */
    public List<FAndB> getListFAndB() {
        return listFAndB;
    }

    /**
     * @param listFAndB the listFAndB to set
     */
    public void setListFAndB(List<FAndB> listFAndB) {
        this.listFAndB = listFAndB;
    }

    public void themThucPhamVaoMenu(int sL, String luaChon) {

        for (int i = 1; i <= sL; i++) {
            System.out.printf("\n=====Nhap thong tin mon an hoac nuoc uong thu %2d=====", i);
            if (luaChon.equalsIgnoreCase("Thuc An")) {
                FAndB fb = new ThucAn();
                fb.nhapFAndB();
                this.listFAndB.add(fb);
            }
            if (luaChon.equals("Nuoc Uong")) {
                FAndB fb = new NuocUong();
                fb.nhapFAndB();
                this.listFAndB.add(fb);
            }
        }
        
    }
    
    public void themThucPhamVaoMenu(FAndB...fB){
        this.listFAndB.addAll(Arrays.asList(fB));
    }

    public void xuatMenu() {
        System.out.println("=========Menu Thuc An Va Nuoc Uong==============");
        this.listFAndB.forEach(x -> x.xuatFAndB());
    }

    public List<FAndB> timTheo(String kw) {
        System.out.print("\n=========Xuat Theo Danh Muc Hoac Ten " + kw + "==========");
        return this.listFAndB.stream().filter(x -> x.getDanhMuc().contains(kw)|| x.getTen().contains(kw)).collect(Collectors.toList());
    }

    public List<FAndB> timTheo(long giaDau, long giaCuoi) {
        return this.listFAndB.stream().filter(x -> ((x.getGiaBan() >= giaDau) && (x.getGiaBan() <= giaCuoi))).collect(Collectors.toList());
    }
    
    public void sapXepGiaGiamDan() {
        this.getListFAndB().sort((o1, o2) -> {
            double gia1 = o1.getGiaBan();
            double gia2 = o2.getGiaBan();
            if (gia1 > gia2) {
                return 1;
            } else if (gia1 < gia2) {
                return -1;
            }
            return 0;
        });
    }

    public void xapXepGiaTangDan() {
        this.getListFAndB().sort((o1, o2) -> {
            double gia1 = o1.getGiaBan();
            double gia2 = o2.getGiaBan();
            if (gia1 < gia2) {
                return 1;
            } else if (gia1 > gia2) {
                return -1;
            }
            return 0;
        });
    }

    public void xoa(String kw) {
        List<FAndB>danhSachXoa = this.listFAndB.stream().filter(fandb->fandb.getTen().contains(kw) || fandb.getDanhMuc().contains(kw)).collect(Collectors.toList());
        this.getListFAndB().removeAll(danhSachXoa);
    }

    public void xoa(double giaDau, double giaCuoi) {
        List<FAndB> danhSachXoa = this.listFAndB.stream().filter(fandb->fandb.getGiaBan() >= giaDau && fandb.getGiaBan() <= giaCuoi).collect(Collectors.toList());
        this.getListFAndB().removeAll(danhSachXoa);
    }
    
    public void capNhat(String kw)
    {
        System.out.print("\n======Cap Nhat Lai Thong Tin Thuc Pham===============");
        this.listFAndB.stream().filter(x->x.getTen().contains(kw)).findFirst().get().nhapFAndB();
    }
    
    public Boolean kiemTraTinhTrangThucPham(String tenthucpham){
        for(FAndB fb:this.listFAndB){
            if (fb.getTen().contains(tenthucpham) && fb.isTinhTrang() == false) {
                return false;
            }
        }
        return true;
    }
}
