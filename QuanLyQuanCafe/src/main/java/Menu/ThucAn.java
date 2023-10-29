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
public class ThucAn extends FAndB {

    private Boolean chayHoacMan;

    public static int sLTA = 0;

    {
        sLTA++;
    }

    public ThucAn() {
    }

    public ThucAn(Boolean chayHoacMan, String t, long gb, boolean tt, String tdb, String tenDanhMuc) {
        super(t, gb, tt, tdb);
        this.chayHoacMan = chayHoacMan;
        this.danhMuc = tenDanhMuc;
    }

    @Override
    public void nhapFAndB() {
        super.nhapFAndB();
        System.out.print("\nChon Chay hoac Man: ");
        String s = Parse.sc.nextLine();
        if (s.equals("Chay")) {
            this.chayHoacMan = true;
        } else {
            this.chayHoacMan = false;
        }
        this.danhMuc = this.layTenDanhMuc();

    }

    @Override
    public void xuatFAndB() {
        super.xuatFAndB();
        if (this.chayHoacMan == true) {
            System.out.print("\nThuc an chay!!!");
        } else {
            System.out.print("\nThuc an man!!!");
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
        return "Thuc An";
    }
}
