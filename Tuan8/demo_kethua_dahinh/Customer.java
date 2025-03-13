package demo_kethua_dahinh;

public class Customer extends Person{
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        System.out.println("Customer");
    }
}
