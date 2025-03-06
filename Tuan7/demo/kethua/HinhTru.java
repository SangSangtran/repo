package demo.kethua;

import java.util.Scanner;

public class HinhTru extends HinhTron{
    public float chieuCao;

    public HinhTru() {
        this.ten = "Hinh tru. ";
    }
    public void nhapChieuCao() {
        Scanner htr = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        this.chieuCao = htr.nextFloat();
    }

    public void tinhTheTich() {
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }
}
