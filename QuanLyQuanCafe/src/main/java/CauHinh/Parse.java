/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CauHinh;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author space
 */
public class Parse {

    public static Locale localeVN = new Locale("vi", "VN");
    public static NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
    public static final Scanner sc = new Scanner(System.in);
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
    public static DateTimeFormatter dateOfBill = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
    public static LocalDateTime current = LocalDateTime.now();

    public static String chuyenTienThanhChuoi(Long tien) {
        return currencyVN.format(tien);
    }

    public static Currency traVeDonViTienTe() {
        return currencyVN.getCurrency();
    }

    public static LocalDate traVeLocalDate(String s) {
        return LocalDate.parse(s, formatter);
    }

    public static String traVeThoiGianHienTai() {
        return current.format(dateOfBill);
    }
}
