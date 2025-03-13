package demo_kethua_dahinh;

public class Employyee extends Person {
    private int salary;

    public Employyee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee");
    }
}
