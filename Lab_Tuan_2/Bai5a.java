import java.util.Scanner;

class Student {
    private String stID;
    private String stName;
    private String stClass;

    public Student() {}
    public Student(String id, String name, String Class) {
        this.stID = id;
        this.stName = name;
        this.stClass =  Class;
    }
    public Student(Student st) {}

    public String getStID() {
        return stID;
    }

    public void setStID(String stID) {
        this.stID = stID;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStClass() {
        return stClass;
    }

    public void setStClass(String stClass) {
        this.stClass = stClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stID='" + stID + '\'' +
                ", stName='" + stName + '\'' +
                ", stClass='" + stClass + '\'' +
                '}';
    }
}

public class Bai5a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID: ");
        String stID = scanner.nextLine();
        System.out.println("Nhap name: ");
        String stName = scanner.nextLine();
        System.out.println("Nhap class: ");
        String stClass = scanner.nextLine();

        Student std = new Student(stID, stName, stClass);
        System.out.println(std.toString());
    }
}
