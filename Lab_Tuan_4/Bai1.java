package demo4;

class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Dien tich: " + getArea();
    }
}

class Cylinder extends Circle {
    public double height = 1.0;

    public Cylinder() {
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        super.toString();
        return "The tich: " + getVolume();
    }
}

public class Bai1 {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0, "blue");
        System.out.println(circle.toString());
        circle.getArea();

        Cylinder cylinder = new Cylinder(2.0, "green", 3.0);
        System.out.println(cylinder.toString());
        cylinder.getVolume();
    }
}