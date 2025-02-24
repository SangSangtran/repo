import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner diem = new Scanner(System.in);
        System.out.println("Ly(20): ");
        double ly = diem.nextDouble();
        System.out.println("Hoa: ");
        double hoa = diem.nextDouble();
        System.out.println("Sinh: ");
        double sinh = diem.nextDouble();
        System.out.println("Toan: ");
        double toan = diem.nextDouble();
        System.out.println("May tinh: ");
        double mayTinh = diem.nextDouble();

        double tong = 100;
        double tongSinhVien = ly + hoa + sinh + toan + mayTinh;

        double phanTram = (tongSinhVien / tong) * 100;

        System.out.println("Hang: ");
        if (phanTram > 90) {
            System.out.println("A");
        } else if (phanTram > 80) {
            System.out.println("B");
        } else if (phanTram > 70) {
            System.out.println("C");
        } else if (phanTram > 60) {
            System.out.println("D");
        } else if (phanTram > 40) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}
