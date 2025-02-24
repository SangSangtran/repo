import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner nhietDo = new Scanner(System.in);
        System.out.println("Nhiet do F: ");
        double doF = nhietDo.nextDouble();
        double doC = (doF - 32.0) / 1.8;

        System.out.println("Do C: " + doC);
    }
}
