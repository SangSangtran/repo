import java.util.Scanner;

class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
        this.tu = 0;
        this.mau = 1;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tu so: ");
        this.tu = scanner.nextInt();
        System.out.println("Mau so: ");
        int mauInput = scanner.nextInt();
    }

    public void xuatPhanSo() {
        System.out.println(this.tu + "/" + this.mau);
    }

    private int UCLN(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private PhanSo rutGon() {
        int ucln = UCLN(this.tu, this.mau);
        int tu1 = this.tu / ucln;
        int mau1 = this.mau / ucln;
        if (mau1 < 0) {
            tu1 = -tu1;
            mau1 = - mau1;
        }
        return new PhanSo(tu1, mau1);
    }
    public PhanSo cong(PhanSo n) {
        int tu1 = this.tu * n.mau + n.tu * this.mau;
        int mau1 = this.mau * n.mau;
        PhanSo ketQua = new PhanSo(tu1, mau1);
        return ketQua.rutGon();
    }

    public PhanSo tru(PhanSo n) {
        int tu1 = this.tu * n.mau - n.tu * this.mau;
        int mau1 = this.mau * n.mau;
        PhanSo ketQua = new PhanSo(tu1, mau1);
        return ketQua.rutGon();
    }

    public PhanSo chia(PhanSo n) {
        if (n.tu == 0) {
            System.out.println("Khong the. ");
            return new PhanSo(0, 1);
        }
        int tu1 = this.tu * n.mau;
        int mau1 = this.mau * n.tu;
        PhanSo ketQua = new PhanSo(tu1, mau1);
        return ketQua.rutGon();
    }

    public PhanSo nhan(PhanSo n) {
        int tu1 = this.tu * n.tu;
        int mau1 = this.mau * n.mau;
        PhanSo ketQua = new PhanSo(tu1, mau1);
        return ketQua.rutGon();
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhanSo p1 = new PhanSo();
        System.out.println("Phan so 1:");
        p1.xuatPhanSo();
        System.out.println("Nhap phan so 1:");
        p1.nhapPhanSo();
        System.out.print("Phan so 1: ");
        p1.xuatPhanSo();

        PhanSo p2 = new PhanSo(4, 16);
        System.out.print("P2: ");
        p2.xuatPhanSo();

        PhanSo p3 = new PhanSo(); // Tạo trước, sau đó nhập
        System.out.println("Nhap p3:");
        p3.nhapPhanSo();
        System.out.print("P3: ");
        p3.xuatPhanSo();

        PhanSo ketQuaCong = p1.cong(p3);
        System.out.print("Ket qua p1 + p3: ");
        ketQuaCong.xuatPhanSo();

        PhanSo p4 = new PhanSo(ketQuaCong);
        System.out.print("Phan so p4: ");
        p4.xuatPhanSo();

        PhanSo ketQuaNhan = p4.nhan(p2);
        System.out.print("Ket qua p4 nhan p2: ");
        ketQuaNhan.xuatPhanSo();
    }
}
