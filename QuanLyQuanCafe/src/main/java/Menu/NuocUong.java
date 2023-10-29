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
public class NuocUong extends FAndB {

    private Boolean coDaHayKhong;

    public static int slNU = 0;

    {
        slNU++;

    }

    public NuocUong() {
    }

    public NuocUong(Boolean coDaHayKhong, String t, long gb, boolean tt, String tdb, String tenDanhMuc) {
        super(t, gb, tt, tdb);
        this.coDaHayKhong = coDaHayKhong;
        this.danhMuc = tenDanhMuc;
    }

    @Override
    public void nhapFAndB() {
        super.nhapFAndB();
        System.out.print("\nChon Co da hay Khong co da: ");
        String s = Parse.sc.nextLine();
        if (s.equals("Co")) {
            this.coDaHayKhong = true;
        } else {
            this.coDaHayKhong = false;
        }
        this.danhMuc = this.layTenDanhMuc();

    }

    @Override
    public void xuatFAndB() {
        super.xuatFAndB();
        if (this.coDaHayKhong == true) {
            System.out.print("\nThuc uong lanh!!!");
        } else {
            System.out.print("\nThuc uong nong!!!");
        }
        System.out.print("\nThuoc danh muc: " + this.danhMuc);
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
    
    @Override
    public String layTenDanhMuc() {
        return "Nuoc Uong";
    }

}
