import java.util.Scanner;

public class Bai8 {
    static int soDau(int n) {
        while (n >= 10) {
            n /= 10;
        }
        return n;
    }

    static int soCuoi (int n) {
        return n % 10;
    }
    public static void main(String[] args) {
        Scanner so = new Scanner(System.in);
        System.out.println("Nhap: ");
        int n = so.nextInt();

        Bai8 chuSo = new Bai8();
        System.out.println("So dau: " + Bai8.soDau(n));
        System.out.println("So cuoi: " + Bai8.soCuoi(n));
    }
}
