package demo4;

class Person {
    public String name;
    public String address;

    public Person(String address, String name) {
        this.address = address;
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "   Address: " + this.address;
    }
}

class Student extends Person {
    String program;
    int year;
    double fee;

    public Student(String address, String name, double fee, String program, int year) {
        super(address, name);
        this.fee = fee;
        this.program = program;
        this.year = year;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        super.toString();
        return "Program: " + this.program + "   Year: " + this.year + "   Fee: " + this.fee;
    }
}

class Staff extends Person{
    String school;
    double pay;

    public Staff(String address, String name, double pay, String school) {
        super(address, name);
        this.pay = pay;
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        super.toString();
        return "School: " + this.school + "   Pay: " + this.pay;
    }
}
public class Bai2 {
    public static void main(String[] args) {
        Person person = new Person("123 Le Van Sy", "Nguyen Van Phep");
        System.out.println(person.toString());

        Student student = new Student("456 Cong Hoa", "Nguyen Thi No", 5000.0, "Computer Science", 2);
        System.out.println(student.toString());

        Staff staff = new Staff("789 Cao Thang", "Anh Huynh", 60000.0, "Tech University");
        System.out.println(staff.toString());

        person.setAddress("Phong 202");
        student.setProgram("OOP");
        staff.setSchool("DTM");
    }
}
