import java.util.Scanner;

class TamGiac {
    private float canh1;
    private float canh2;
    private float canh3;

    public TamGiac(float canh1, float canh2, float canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public float getCanh1() {
        return canh1;
    }

    public void setCanh1(float canh1) {
        this.canh1 = canh1;
    }

    public float getCanh2() {
        return canh2;
    }

    public void setCanh2(float canh2) {
        this.canh2 = canh2;
    }

    public float getCanh3() {
        return canh3;
    }

    public void setCanh3(float canh3) {
        this.canh3 = canh3;
    }

    public float tinhChuVi() {
        return canh1 + canh2 + canh3;
    }

    public float tinhDienTich() {
        double p = tinhChuVi() / 2.0;
        double dienTich = Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
        return (float)dienTich;
    }

    public String loaiTamGiac() {
        if (canh1 <= 0 || canh2 <= 0 || canh3 <= 0 || canh1 + canh2 <= canh3 || canh2 + canh3 <= canh1 || canh3 + canh1 <= canh2) {
           return "Khong phai. ";
        }
        if (canh1 == canh2 && canh2 == canh3) {
            return "Tam giac deu. ";
        } else if (canh1 == canh2 || canh2 == canh3 || canh3 == canh1) {
            return "Tam giac can. ";
        } else if (canh1 * canh1 + canh2 * canh2 == canh3 * canh3 || canh2 * canh2 + canh3 * canh3 == canh1 * canh1 || canh3 * canh3 + canh1 * canh1 == canh2 * canh2) {
            return "Tam giac vuong. ";
        } else {
            return "Tam giac thuong. ";
        }
    }
}
public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Canh 1: ");
        float a = scanner.nextFloat();
        System.out.println("Canh 2: ");
        float b = scanner.nextFloat();
        System.out.println("Canh 3: ");
        float c = scanner.nextFloat();;
        TamGiac tg1 = new TamGiac(a, b, c);
        System.out.println("Chu vi: " + tg1.tinhChuVi());
        System.out.println("Dien tich: " + tg1.tinhDienTich());
        System.out.println("Loai: " + tg1.loaiTamGiac());
    }
}
