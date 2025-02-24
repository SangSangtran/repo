import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner gtnn = new Scanner(System.in);
        System.out.println("Nhap: ");
        double a = gtnn.nextDouble();
        double b = gtnn.nextDouble();
        double c = gtnn.nextDouble();

        double so = Math.min(Math.min(a, b), c);

        System.out.println("Gia tri nho nhat: " + so);
    }
}
