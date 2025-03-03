import java.util.Scanner;

class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
     public HinhChuNhat(double dai, double rong) {
         this.chieuDai = dai;
         this.chieuRong = rong;
     }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double tinhChuVi() {
         return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
         return chieuDai * chieuRong;
    }

    @Override
    public String toString() {
         return "Chieu dai: " + chieuDai + ", " + "Chieu rong: " + chieuRong + "\n" + "Chu vi: " + tinhChuVi() + ", " + "Dien tich: " + tinhDienTich();
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai: ");
        double dai = scanner.nextDouble();
        System.out.println("Chieu rong: ");
        double rong = scanner.nextDouble();

        HinhChuNhat hcn = new HinhChuNhat(dai, rong);
        System.out.println(hcn.toString());
    }
}
