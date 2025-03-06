package demo.kethua1;

public class Customer extends Person {
    private int balance;

    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Balance: " + balance);
    }
}
