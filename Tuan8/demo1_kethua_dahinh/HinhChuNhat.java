package demo1_kethua_dahinh;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;

    public HinhChuNhat() {
        this.ten = "Hinh chu nhat. ";
    }

    public void nhapChieuDai() {
        Scanner cd =  new Scanner(System.in);
        System.out.println("Chieu dai: ");
        this.dai = cd.nextFloat();
    }

    public void nhapChieuRong() {
        Scanner cr = new Scanner(System.in);
        System.out.println("Chieu rong: ");
        this.rong = cr.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dienTich = dai * rong;
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
