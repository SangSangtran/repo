import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double dai, double rong) {
        chieuDai = dai;
        chieuRong = rong;
    }

    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai: ");
        double dai = scanner.nextDouble();
        System.out.println("Chieu rong: ");
        double rong = scanner.nextDouble();

        HinhChuNhat n = new HinhChuNhat(dai, rong);
        System.out.println("Chu vi: " + n.tinhDienTich());
    }
}