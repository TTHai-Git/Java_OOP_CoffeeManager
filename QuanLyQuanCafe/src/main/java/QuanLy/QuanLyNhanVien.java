/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanLy;

import NhanVien.BaoVe;
import NhanVien.DauBep;
import NhanVien.NhanVien;
import NhanVien.PhaChe;
import NhanVien.PhucVu;
import NhanVien.ThuNgan;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author space
 */
public class QuanLyNhanVien {

    private List<NhanVien> listNhanVien;

    public QuanLyNhanVien() {
        listNhanVien = new ArrayList<>();

    }

    public List<NhanVien> traCuu(String kw) {
        return this.listNhanVien.stream().filter(x -> x.getQueQuan().contains(kw)
                || x.getHoVaTen().contains(kw) || x.getBoPhanTrucThuoc().getTenBoPhan().contains(kw)
                || x.getGioiTinh().contains(kw)).collect(Collectors.toList());
    }
    
    public void themNhanVien(NhanVien...nV){
        this.listNhanVien.addAll(Arrays.asList(nV));
    }

    public void themNhanVien(int sl, String bophan) {
        for (int i = 1; i <= sl; i++) {
            System.out.printf("\n=======Nhap thong tin sinh vien thu%2d=======", i);
            if (bophan.equalsIgnoreCase("Dau Bep")) {
                NhanVien nV = new DauBep();
                nV.nhapNhanVien();
                this.listNhanVien.add(nV);
            }
            if (bophan.equalsIgnoreCase("Phuc Vu")) {
                NhanVien nV = new PhucVu();
                nV.nhapNhanVien();
                this.listNhanVien.add(nV);

            }
            if (bophan.equalsIgnoreCase("Pha Che")) {
                NhanVien nV = new PhaChe();
                nV.nhapNhanVien();
                this.listNhanVien.add(nV);

            }
            if (bophan.equalsIgnoreCase("Thu Ngan")) {
                NhanVien nV = new ThuNgan();
                nV.nhapNhanVien();
                this.listNhanVien.add(nV);

            }
            if (bophan.equalsIgnoreCase("Bao Ve")) {
                NhanVien nV = new BaoVe();
                nV.nhapNhanVien();
                this.listNhanVien.add(nV);
            }

        }

    }

    public void xoaThongTin(String kw) {
        List<NhanVien> danhSachXoa = this.listNhanVien.stream().filter(nV -> nV.getHoVaTen().contains(kw) || nV.getMaNhanVien().contains(kw) || nV.getBoPhanTrucThuoc().getMaBoPhan().contains(kw)).collect(Collectors.toList());
        this.listNhanVien.removeAll(danhSachXoa);
    }

    public void capNhatThongTin(String kw) {
        for (NhanVien nV : this.listNhanVien) {
            if (nV.getHoVaTen().contains(kw) || nV.getMaNhanVien().contains(kw) || nV.getBoPhanTrucThuoc().getMaBoPhan().contains(kw)) {
                nV.nhapNhanVien();
            }
        }
    }

    public List<NhanVien> toChucSinhNhat() {
        return this.listNhanVien.stream().filter(x -> x.getNgaySinh().getMonthValue() == LocalDate.now().getMonthValue()).collect(Collectors.toList());
    }

    public void xuatDSNhanVien() {
        System.out.printf("%24s\n", "Danh sach nhan vien");
        System.out.printf("%24s", "===================");
        this.listNhanVien.forEach(x -> x.xuatNhanVien());
    }
}
