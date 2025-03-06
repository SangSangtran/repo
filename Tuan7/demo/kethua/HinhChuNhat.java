package demo.kethua;

import java.util.Scanner;

public class HinhChuNhat extends HinhHoc{
    public float dai;
    public float rong;

    public HinhChuNhat() {
        this.ten = "Hinh chu nhat. ";
    }

    public void nhapChieuDai() {
        Scanner hcn = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        this.dai = hcn.nextFloat();
    }

    public void nhapChieuRong() {
        Scanner hcn = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        this.rong = hcn.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich() {
        dienTich = dai * rong;
    }

}
