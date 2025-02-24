import java.util.Scanner;

public class Bai9 {
    int tinhTong (int n) {
        int tong = 0;
        while (n > 0) {
            tong += n % 10;
            n /= 10;
        }
        return tong;
    }

    int tinhTich (int n) {
        int tich = 1;
        while (n > 0) {
            tich *= n % 10;
            n /= 10;
        }
        return tich;
    }
    public static void main(String[] args) {
        Scanner tongTich = new Scanner(System.in);
        System.out.println("Nhap: ");
        int n = tongTich.nextInt();

        Bai9 ham = new Bai9();
        System.out.println("Tong: " + ham.tinhTong(n));
        System.out.println("Tich: " + ham.tinhTich(n));
    }
}
