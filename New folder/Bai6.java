import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner tg = new Scanner(System.in);
        System.out.println("Nhap: ");
        int a = tg.nextInt();
        int b = tg.nextInt();
        int c = tg.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Tam giac. ");
        } else {
            System.out.println("Khong phai. ");
        }
    }
}
