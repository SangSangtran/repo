package demo1_kethua_dahinh;

import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

    public HinhTru() {
        this.ten = "Hinh tru. ";
    }
    public void nhapChieuCao() {
        Scanner chc = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        this.chieuCao = chc.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }

    @Override
    public void inChuVi() {
        System.out.println("Chu vi day: " + chuVi);
    }

    @Override
    public void inDienTich() {
        System.out.println("Dien tich day: " + dienTich);
    }

    @Override
    public void inTheTich() {
        System.out.println("The tich: " + theTich);
    }
}
