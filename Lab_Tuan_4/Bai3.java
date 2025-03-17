package demo4;

class Shape {
    private String color = "red";
    private boolean filled = true;

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

    @Override
    public String toString() {
        return "Color: " + this.color;
    }
}

class Circl extends Shape{
    double radius = 1.0;

    public Circl() {
        this.radius = 1.0;
    }

    public Circl(String color, boolean filled, double radius) {
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
    public String toString() {
        super.toString();
        return "Radius: " + this.radius;
    }
}

class Rectangle extends Shape{
    double width = 1.0;
    double length = 1.0;

    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color) {
        super(color, true);
        this.length = length;
        this.width = width;
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

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        super.toString();
        return "Width: " + this.width + "   Length: " + length + "    Color: " + getColor();
    }
}

class Square extends Rectangle{
    double side = 1.0;
    public Square() {
        this.width = 1.0;
        this.length = 1.0;
    }

    public Square(double side) {
        super(side,side);
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
        super.toString();
        return "Side: " + this.side;
    }
}

public class Bai3 {
    public static void main(String[] args) {
        Shape shape = new Shape("blue", false);
        System.out.println(shape.toString());

        Circl circle = new Circl("green", true, 2.0);
        System.out.println(circle.toString());
        circle.getArea();
        circle.getPerimeter();

        Rectangle rectangle = new Rectangle(4.0, 3.0, "yellow");
        System.out.println(rectangle.toString());
        rectangle.getArea();
        rectangle.getPerimeter();

        Square square = new Square(2.5, "purple", true);
        System.out.println(square.toString());
        square.getArea();
        square.getPerimeter();
    }
}