import java.util.Scanner;

public class Bai11 {
    int daoNguoc (int n) {
        int dao = 0;
        n = Math.abs(n);
        while (n > 0) {
            dao = dao * 10 + n % 10;
            n /= 10;
        }
        return dao;
    }

    public static void main(String[] args) {
        Scanner soDao = new Scanner(System.in);
        System.out.println("Nhap: ");
        int n = soDao.nextInt();

        Bai11 bai11 = new Bai11();
        System.out.println("So dao: " + bai11.daoNguoc(n));
    }
}
