import java.util.Scanner;

interface Hinh {
    float PI = 3.14f;
    void nhap();
    void xuat();
    float dienTich();
}

class HinhVuong  implements Hinh {
    private float canh;

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }

    public HinhVuong() {
        this.canh = 0.0F;
    }

    public HinhVuong(float canh) {
        this.canh = canh;
    }

    @Override
    public float dienTich() {
        return canh * canh;
    }

    @Override
    public void nhap() {
        Scanner hv = new Scanner(System.in);
        System.out.println("Nhap canh: ");
        this.canh = hv.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Canh: " + canh + ", Dien tich: " + dienTich());
    }
}
class HinhChuNhat implements Hinh {
    private float dai;
    private float rong;

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    public HinhChuNhat() {
        this.dai = 0.0F;
        this.rong = 0.0F;
    }

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    @Override
    public float dienTich() {
        return dai * rong;
    }

    @Override
    public void nhap() {
        Scanner hcn = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        this.dai = hcn.nextFloat();
        System.out.println("Nhap chieu rong: ");
        this.rong = hcn.nextFloat();
    }

    @Override
    public void xuat() {
        System.out.println("Chieu dai: " + dai + ", Chieu rong: " + rong + ", Dien tich: " + dienTich());
    }
}

    class HinhTron implements Hinh {
        private float banKinh;

        public float getBanKinh() {
            return banKinh;
        }

        public void setBanKinh(float banKinh) {
            this.banKinh = banKinh;
        }

        public HinhTron() {
            this.banKinh = 0.0F;
        }

        public HinhTron(float banKinh) {
            this.banKinh = banKinh;
        }

        @Override
        public float dienTich() {
            return PI * banKinh * banKinh;
        }

        @Override
        public void nhap() {
            Scanner htr = new Scanner(System.in);
            System.out.println("Nhap ban kinh: ");
            this.banKinh = htr.nextFloat();
        }

        @Override
        public void xuat() {
            System.out.println("Ban kinh: " + banKinh + ", Dien tich: " + dienTich());
        }
    }


public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong hinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        Hinh ds[] = new Hinh[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Chon loai hinh se nhap: ");
            System.out.println("1: hinh vuong");
            System.out.println("2: hinh chu nhat");
            System.out.println("3: hinh tron");
            int chon = 0;
            scanner.nextLine();
            switch (chon) {
                case 1:
                    ds[i] = new HinhVuong();
                    ds[i].nhap();
                    break;
                case 2:
                    ds[i] = new HinhChuNhat();
                    ds[i].nhap();
                    break;
                case 3:
                    ds[i] = new HinhTron();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Ban phai chon 1 trong 3 loai tren.");
            }
        }

        System.out.println("\nDanh sach hinh da nhap: ");
        for (Hinh hinh : ds) {
            hinh.xuat();
            System.out.println();
        }

        Hinh hinhDienTichLonNhat = ds[0];
        for (Hinh hinh : ds ) {
            if (hinh.dienTich() > hinhDienTichLonNhat.dienTich()) {
                hinhDienTichLonNhat = hinh;
            }
        }
        System.out.println("\nHinh co dien tich lon nhat: ");
        hinhDienTichLonNhat.xuat();
    }
}