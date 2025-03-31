import java.util.Scanner;

class Nguoi {
    protected String hoTen;
    protected int namSinh;

    public Nguoi() {
        this.hoTen = " ";
        this.namSinh = 0;
    }

    public Nguoi(String hoTen, int namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap nam sinh: ");
        this.namSinh = scanner.nextInt();
        scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
    }
}

class HocVien extends Nguoi {
    private float diem1;
    private float diem2;
    private float diem3;

    public HocVien() {
        this.diem1 = 0.0F;
        this.diem2 = 0.0F;
        this.diem3 = 0.0F;
    }

    public HocVien(String hoTen, int namSinh, float diem1, float diem2, float diem3) {
        super(hoTen, namSinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
    }

    public float getDiem1() {
        return diem1;
    }

    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }

    public float getDiem2() {
        return diem2;
    }

    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }

    public float getDiem3() {
        return diem3;
    }

    public void setDiem3(float diem3) {
        this.diem3 = diem3;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem 1: ");
        this.diem1 = scanner.nextFloat();
        System.out.println("Nhap diem 2: ");
        this.diem2 = scanner.nextFloat();
        System.out.println("Nhap diem 3: ");
        this.diem3 = scanner.nextFloat();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Diem: " + diem1 + ", " + diem2 + ", " + diem3);
    }
}

class PhongKhoaBan {
    private String maPhongKhoaBan;
    private String tenPhongKhoaBan;

    public PhongKhoaBan() {
        this.maPhongKhoaBan = " ";
        this.tenPhongKhoaBan = " ";
    }

    public PhongKhoaBan(String maPhongKhoaBan, String tenPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public String getMaPhongKhoaBan() {
        return maPhongKhoaBan;
    }

    public void setMaPhongKhoaBan(String maPhongKhoaBan) {
        this.maPhongKhoaBan = maPhongKhoaBan;
    }

    public String getTenPhongKhoaBan() {
        return tenPhongKhoaBan;
    }

    public void setTenPhongKhoaBan(String tenPhongKhoaBan) {
        this.tenPhongKhoaBan = tenPhongKhoaBan;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma phong ban: ");
        this.maPhongKhoaBan = scanner.nextLine();
        System.out.println("Nhap ten phong ban: ");
        this.tenPhongKhoaBan = scanner.nextLine();
    }

    public
}