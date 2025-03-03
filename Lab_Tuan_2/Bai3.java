import java.sql.SQLOutput;
import java.util.Scanner;

class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diemLT = 0f;
        diemTH = 0f;
    }

    public SinhVien(int ma, String ten, float lt, float th) {
        this.maSV = ma;
        this.hoTen = ten;
        this.diemLT = lt;
        this.diemTH = th;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public double tinhDTrb() {
        return  (diemLT + diemTH) / 2;
    }

    @Override
    public String toString() {
        return maSV + " " + hoTen + " " + diemLT + " " + diemTH + " " + tinhDTrb();
    }
}
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(1250080160, "Tran Nguyen Tuan Sang", 10.f, 10.f);
        SinhVien sv2 = new SinhVien(7777, "Cristiano Ronaldo", 7.f,7.f);
        SinhVien sv3 = new SinhVien();

        System.out.println("Nhap ma so cua sinh vien sv3: ");
        sv3.setMaSV(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Nhap ho va ten cua sinh vien sv3: ");
        sv3.setHoTen(scanner.nextLine());
        System.out.println("Nhap diem ly thuyet cua sinh vien sv3: ");
        sv3.setDiemLT(scanner.nextFloat());
        System.out.println("Nhap diem thuc hanh cua sinh vien sv3: ");
        sv3.setDiemTH(scanner.nextFloat());

        System.out.println("MSSV          Hoten                          DiemLT      DiemTH      DiemTB");

        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
    }
}
