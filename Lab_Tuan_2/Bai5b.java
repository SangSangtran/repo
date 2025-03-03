import java.util.Scanner;

class Book {
    private String boCode;
    private String boTitle;
    private String boAuthor;

    public Book() {}

    public Book(String boCode, String boTitle, String boAuthor) {
        this.boCode = boCode;
        this.boTitle = boTitle;
        this.boAuthor = boAuthor;
    }

    public Book(Book st) {}

    public String getBoCode() {
        return boCode;
    }

    public String getBoTitle() {
        return boTitle;
    }

    public String getBoAuthor() {
        return boAuthor;
    }
}
public class Bai5b {
    public static void main(String[] args) {
        Book book = new Book("a1", "Java", "name");
        System.out.println("Ma sach: " + book.getBoCode());
        System.out.println("Ten sach: " + book.getBoTitle());
        System.out.println("Tac gia: " + book.getBoAuthor());
    }
}
