import java.util.Scanner;

public class Bai12 {
    int daoNguoc (int n) {
        int dao = 0;
        n = Math.abs(n);
        while (n > 0) {
            dao = dao * 10 + n % 10;
            n /= 10;
        }
        return dao;
    }

    void doiXung(int n) {
        if (n == daoNguoc(n)) {
            System.out.println("Doi xung. ");
        } else {
            System.out.println("Khong doi xung. ");
        }
    }
    public static void main(String[] args) {
        Scanner soDao = new Scanner(System.in);
        System.out.println("Nhap: ");
        int n = soDao.nextInt();

        Bai12 bai12 = new Bai12();
        bai12.doiXung(n);
    }
}
