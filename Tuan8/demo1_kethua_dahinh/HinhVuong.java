package demo1_kethua_dahinh;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong() {
        this.ten = "Hinh vuong. ";
    }

    public void nhapCanh() {
        Scanner canh = new Scanner(System.in);
        System.out.println("Nhap canh: ");
        this.dai = this.rong = canh.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 4 * dai;
    }

    public void tinhDienTinh() {
        dienTich = dai * dai;
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
    public void inTheTich() {
        System.out.println("Hinh vuong khong co the tich");
    }
}
