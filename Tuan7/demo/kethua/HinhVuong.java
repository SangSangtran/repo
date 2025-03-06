package demo.kethua;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat{
    public HinhVuong() {
        this.ten = "Hinh vuong. ";
    }

    public void nhapCanh() {
        Scanner hv = new Scanner(System.in);
        System.out.println("Nhap canh: ");
        this.dai = this.rong = hv.nextFloat();
    }

    public void tinhChuVi() {
        chuVi = 4 * dai;
    }

    public void tinhDienTinh() {
        dienTich = dai * dai;
    }
}
