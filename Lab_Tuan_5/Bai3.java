abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Shape shape = (Shape) obj;
        return filled == shape.filled && color.equals(shape.color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Hinh tron [radius=<" + radius +">,color=<" + color +">,filled=<" + filled + ">]";
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this.width = 0.0;
        this.length = 0.0;
    }

    public Rectangle(String color, boolean filled, double length, double width) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Hinh chu nhat [width=<" + width + ">, length=<" + length + ", color=<" + color + ">, filled=<" + filled + ">]";
    }
}

class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super("red", true, side,side);
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        this.length = side;
        this.width = side;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
        this.side = width;
    }

    @Override
    public void setLength(double length) {
        this.side = length;
        this.width = length;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Hinh vuong: side<" + side + ">, color<" + color + ">, filled<" + filled + ">";
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Circle circle = new Circle("blue", true, 5);
        Rectangle rectangle = new Rectangle("green", false, 6, 4);
        Square square = new Square(3, "yellow", true);
        System.out.println("Thong tin hinh tron: ");
        System.out.println(circle.toString());
        System.out.println("\nThong tin hinh chu nhat: ");
        System.out.println(rectangle.toString());
        System.out.println("\nThong tin hinh vuong: ");
        System.out.println(square.toString());

        System.out.println("\nKiem tra equals:");
        System.out.println("Circle va Rectangle co bang nhau khong? " + circle.equals(rectangle));
        System.out.println("Rectangle va Square co bang nhau khong? " + rectangle.equals(square));
    }
}