import java.util.ArrayList;
import java.util.Scanner;

abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected String trinhDo;
    protected double luongCoBan;

    public NhanVien() {
        this.maNhanVien = " ";
        this.tenNhanVien = " ";
        this.trinhDo = " ";
        this.luongCoBan = 1000000.0;
    }

    public NhanVien(String maNhanVien, String tenNhanVien, String trinhDo) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.trinhDo = trinhDo;
        this.luongCoBan = 1000000.0;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        this.maNhanVien = scanner.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        this.tenNhanVien = scanner.nextLine();
        System.out.println("Nhap trinh do: ");
        this.trinhDo = scanner.nextLine();
        scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ma nhan vien: " + maNhanVien + ", Ten nhan vien: " + tenNhanVien +  ", Trinh do: " + trinhDo + ", Luong co ban: " + luongCoBan);
    }

    public abstract double tinhLuong();
}

class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapCongViec;

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getPhuCapCongViec() {
        return phuCapCongViec;
    }

    public void setPhuCapCongViec(double phuCapCongViec) {
        this.phuCapCongViec = phuCapCongViec;
    }

    public QuanLy() {
        super();
        this.chuyenMon = " ";
        this.phuCapCongViec = 0.0;
    }

    public QuanLy(String maNhanVien, String tenNhanVien, String trinhDo, String chuyenMon, double phuCapCongViec) {
        super(maNhanVien, tenNhanVien, trinhDo);
        this.chuyenMon = chuyenMon;
        this.phuCapCongViec = phuCapCongViec;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chuyen mon: ");
        this.chuyenMon = scanner.nextLine();
        System.out.println("Phu cap cong viec: ");
        this.phuCapCongViec = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon + ", Phu cap cong viec: " + phuCapCongViec);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapCongViec;
    }
}

class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;

    public String getChuyenMon() {
        return chuyenMon;
    }

    public void setChuyenMon(String chuyenMon) {
        this.chuyenMon = chuyenMon;
    }

    public double getPhuCapDocHai() {
        return phuCapDocHai;
    }

    public void setPhuCapDocHai(double phuCapDocHai) {
        this.phuCapDocHai = phuCapDocHai;
    }

    public NghienCuu() {
        super();
        this.chuyenMon = " ";
        this.phuCapDocHai = 0.0;
    }

    public NghienCuu(String maNhanVien, String tenNhanVien, String trinhDo, String chuyenMon, double phuCapDocHai) {
        super(maNhanVien, tenNhanVien, trinhDo);
        this.chuyenMon = chuyenMon;
        this.phuCapDocHai = phuCapDocHai;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);;
        System.out.println("Chuyen mon: ");
        this.chuyenMon = scanner.nextLine();
        System.out.println("Phu cap doc hai: ");
        this.phuCapDocHai = scanner.nextDouble();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyen mon: " + chuyenMon + ", Phu cap doc hai: " + phuCapDocHai);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }
}

class PhucVu extends NhanVien {
    public PhucVu() {
        this.trinhDo = " ";
        this.luongCoBan = 0.0;
    }

    public PhucVu(String maNhanVien, String tenNhanVien, String trinhDo) {
        super(maNhanVien, tenNhanVien, trinhDo);
    }

    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

        QuanLy quanLy = new QuanLy("QL001", "Nguyen Van A", "Dai hoc", "Quan tri", 2000000);
        quanLy.xuat();
        quanLy.tinhLuong();
        System.out.println("Luong quan ly: " + quanLy.tinhLuong());

        NghienCuu nghienCuu = new NghienCuu("NC001", "Tran Thi B", "Thac si", "Hoa hoc", 1500000);
        nghienCuu.xuat();
        nghienCuu.tinhLuong();
        System.out.println("Luong nghien cuu: " + nghienCuu.tinhLuong());

        PhucVu phucVu = new PhucVu("PV001", "Le Van C", "Trung cap");
        phucVu.xuat();
        phucVu.tinhLuong();
        System.out.println("Luong phuc vu: " + phucVu.tinhLuong());

        danhSachNhanVien.add(quanLy);
        danhSachNhanVien.add(nghienCuu);
        danhSachNhanVien.add(phucVu);

        System.out.println("\nDanh sach nhan vien: ");
        for (NhanVien nv : danhSachNhanVien) {
            nv.xuat();
            System.out.println("Luong: " + nv.tinhLuong());
        }
    }
}