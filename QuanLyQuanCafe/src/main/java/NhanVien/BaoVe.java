/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

/**
 *
 * @author space
 */
public class BaoVe extends NhanVien {

    private static int sLBV = 0;

    {
        sLBV++;
    }

    public BaoVe() {
    }

    public BaoVe(String ten, String gt, String que, String ngayvaolam, String ngaysinh) {
        super(ten, gt, que, ngayvaolam, ngaysinh);
        this.boPhanTrucThuoc = this.layBoPhan();
    }

    @Override
    public BoPhan layBoPhan() {
        return new BoPhan("Bao Ve", String.format("BV_%02d", sLBV));
    }

    @Override
    public void nhapNhanVien() {
        super.nhapNhanVien();
        this.setBoPhanTrucThuoc(this.layBoPhan());
    }

    @Override
    public void xuatNhanVien() {
        super.xuatNhanVien();
        this.getBoPhanTrucThuoc().xuatBoPhanTrucThuoc();
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
