import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner namNhuan = new Scanner(System.in);
        System.out.println("Nhap: ");
        double test = namNhuan.nextDouble();

        if ((test % 4 == 0) || (test % 400 == 0 && test % 100 == 0)) {
            System.out.println("Nam nhuan.");
        } else {
            System.out.println("Khong phai. ");
        }
    }
}
