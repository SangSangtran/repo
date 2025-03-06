package demo.kethua1;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("chi", "123", 777);
        Customer cus = new Customer("Chi", "1234", 7);

        emp.display();
        cus.display();
    }
}
