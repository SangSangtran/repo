package demo4;

import java.util.Scanner;

class HangHoa {
    String maHang;
    String tenHang;
    long gia;

    public HangHoa() {
        this.maHang = "";
        this.tenHang = "";
        this.gia = 0;
    }

    public HangHoa(String maHang, String tenHang, long gia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.gia = gia;
    }

    public long getGia() {
        return gia;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    @Override
    public String toString() {
        return "Ma hang: " + maHang + "   Ten hang: " + tenHang + "   Gia: " + gia;
    }
}

class HangDienMay extends HangHoa {
    int thoiGianBH;
    int dienAp;
    int congSuat;

    public HangDienMay() {
        this.thoiGianBH = 1;
        this.dienAp = 1;
        this.congSuat = 1;
    }

    public HangDienMay(String maHang, String tenHang, long gia, int congSuat, int dienAp, int thoiGianBH) {
        super(maHang, tenHang, gia);
        this.congSuat = congSuat;
        this.dienAp = dienAp;
        this.thoiGianBH = thoiGianBH;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getDienAp() {
        return dienAp;
    }

    public void setDienAp(int dienAp) {
        this.dienAp = dienAp;
    }

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thoi gian bao hanh: ");
        this.thoiGianBH = scanner.nextInt();
        System.out.println("Dien ap: ");
        this.dienAp = scanner.nextInt();
        System.out.println("Cong suat: ");
        this.congSuat = scanner.nextInt();
    }

    public void xuat() {
        super.toString();
        System.out.println("Thoi gian bao hanh: " + thoiGianBH);
        System.out.println("Dien ap: " + dienAp);
        System.out.println("Cong suat: " + congSuat);
    }
}

class HangThucPham extends HangHoa{
    String ngaySX;
    String ngayHH;

    public HangThucPham() {
        this.ngayHH = "";
        this.ngaySX = "";
    }

    public HangThucPham(String maHang, String tenHang, long gia, String ngayHH, String ngaySX) {
        super(maHang, tenHang, gia);
        this.ngayHH = ngayHH;
        this.ngaySX = ngaySX;
    }

    public String getNgayHH() {
        return ngayHH;
    }

    public void setNgayHH(String ngayHH) {
        this.ngayHH = ngayHH;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ngay san xuat: ");
        this.ngaySX = scanner.nextLine();
        System.out.println("Ngay het han: ");
        this.ngayHH = scanner.nextLine();
    }

    public void xuat() {
        super.toString();
        System.out.println("Ngay san xuat: " + ngaySX);
        System.out.println("Ngay het han: " + ngayHH);
    }
}
public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HangDienMay dienMay = new HangDienMay("DM001", "Tivi", 5000000, 100, 220, 12);
        dienMay.nhap();
        dienMay.xuat();

        HangThucPham thucPham = new HangThucPham("TP001", "Gao", 20000, "01/03/2025", "01/09/2025");
        thucPham.nhap();
        thucPham.xuat();
    }
}
