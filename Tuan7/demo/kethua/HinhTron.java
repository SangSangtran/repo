package demo.kethua;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    public float banKinh;

    public HinhTron() {
        this.ten = "Hinh tron. ";
    }

    public void nhapBanKinh() {
        Scanner ht = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        this.banKinh = ht.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
