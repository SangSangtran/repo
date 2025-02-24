import java.util.Scanner;

public class Bai10 {
    int demSo (int n) {
        n = Math.abs(n);
        int dem = 0;
        while (n > 0) {
            dem++;
            n /= 10;
        }
        return dem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap: ");
        int n = scanner.nextInt();
        Bai10 bai10 = new Bai10();
        System.out.println(bai10.demSo(n));
    }
}
