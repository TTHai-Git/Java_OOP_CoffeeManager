/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NhanVien;

import java.time.LocalDate;

/**
 *
 * @author space
 */
public class ThuNgan extends NhanVien {

    private static int sLTN = 0;

    {
        sLTN++;
    }

    public ThuNgan() {
    }
    
    public ThuNgan(String ten, String gt, String que, String ngayvaolam, String ngaysinh) {       
        super(ten, gt, que, ngayvaolam, ngaysinh);
        this.boPhanTrucThuoc = this.layBoPhan();
    }

    @Override
    public BoPhan layBoPhan() {
       return new BoPhan("Thu Ngan",String.format("TN_%02d", sLTN));
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
