package demo_kethua_dahinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employyee e = new Employyee("asdf", "asdf 123", 123);
        e.display();
        Customer c = new Customer("wer", "ouwe 456", 456);
        c.display();
    }
}
