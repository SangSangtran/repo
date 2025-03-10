import java.util.Scanner;

class Student {
    private int maSo;
    private String hoTen;
    private float diemTrb;

    public Student() {
        this.maSo = 7;
        this.hoTen = null;
        this.diemTrb = 0.0f;
    }

    public Student(int maSo, String hoTen, float diemTrb) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemTrb = diemTrb;
    }

    public Student(Student tmp) {
        this.maSo = tmp.maSo;
        this.hoTen = tmp.hoTen;
        this.diemTrb = tmp.diemTrb;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemTrb() {
        return diemTrb;
    }

    public void setDiemTrb(float diemTrb) {
        this.diemTrb = diemTrb;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        this.maSo = scanner.nextInt();
        System.out.println("Nhap ho ten: ");
        scanner.nextLine();
        this.hoTen = scanner.nextLine();
        System.out.println("Nhap diem trung binh: ");
        this.diemTrb = scanner.nextFloat();
    }

    @Override
    public String toString() {
        return maSo + " - " + hoTen + " - " + diemTrb;
    }
}

class ListSt {
    private Student st[];
    private int soLuong;

    public ListSt() {
        this.soLuong = 0;
        this.st = new Student[soLuong];
    }

    public void nhapDS() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong: ");
        this.soLuong = scanner.nextInt();
        st = new Student[soLuong];
        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap thong tin hoc sinh " + (i + 1));
            st[i] = new Student();
            st[i].input();
        }
    }

    public void xuatDS() {
        System.out.println("Danh sach hoc sinh la: ");
        for (int i = 0; i < soLuong; i++)
            System.out.println(st[i].toString());
    }

    public void sapXep() {
        for (int i = 0; i < soLuong; i++) {
            for (int a = i + 1; a < soLuong; a++) {
                if (st[i].getDiemTrb() < st[a].getDiemTrb()) {
                    Student tmp = st[i];
                    st[i] = st[a];
                    st[a] = tmp;
                }
            }
        }
    }
}
class Demo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input();
        System.out.println(s1.toString());
        Student s2 = new Student(1250, "Chi", 7);
        System.out.println(s2.toString());
        Student s3 = new Student(s2);
        s3.setHoTen("Ronaldo");
        System.out.println(s3.toString());

        float max = s1.getDiemTrb();
        String name = s1.getHoTen();
        String name2 = null;
        if (s2.getDiemTrb() > max) {
            max = s2.getDiemTrb();
            name = s2.getHoTen();
        } else if (s2.getDiemTrb() == max && name != s2.getHoTen()) {
            name2 = s2.getHoTen();
        }
        if (s3.getDiemTrb() > max) {
            max = s3.getDiemTrb();
            name = s3.getHoTen();
            name2 = null;
        } else if (s3.getDiemTrb() == max && name != s3.getHoTen()) {
            name2 = s3.getHoTen();
        }

        if (name2 == null) {
            System.out.println("Hoc sinh " + name + " diem trung binh cao nhat: " + max);
        } else {
            System.out.println("Hoc sinh " + name + " va " + name2 + " diem trung binh cao nhat: " + max);
        }
    }
}

    class Demo2 {
        public static void main(String[] args) {
            ListSt danhsach = new ListSt();
            danhsach.nhapDS();
            danhsach.xuatDS();
            danhsach.sapXep();
            System.out.println("Danh sach sau sap xep. ");
            danhsach.xuatDS();
        }
    }


public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Demo1: ");
        Demo1.main(args);

        System.out.println("\nDemo2: ");
        Demo2.main(args);
    }
}
