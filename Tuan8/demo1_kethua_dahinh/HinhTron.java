package demo1_kethua_dahinh;

import java.util.Scanner;

public class HinhTron extends HinhHoc{
    private float banKinh;

    public HinhTron() {
        this.ten = "Hinh tron. ";
    }

    public void nhapBanKinh() {
        Scanner bk = new Scanner(System.in);
        System.out.println("Nhap ban kinh: ");
        this.banKinh = bk.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }

    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }

    @Override
    public void inChuVi() {
        System.out.println("Chu vi: " + chuVi);
    }

    @Override
    public void inDienTich() {
        System.out.println("Dien tich: " + dienTich);
    }

    @Override
    public void inTheTich() {}
}
