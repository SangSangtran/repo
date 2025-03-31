interface Moveable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}

class MoveablePoint implements Moveable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("up point");
    }

    @Override
    public void moveDown() {
        System.out.println("down point");
    }

    @Override
    public void moveLeft() {
        System.out.println("left point");
    }

    @Override
    public void moveRight() {
        System.out.println("right point");
    }

    @Override
    public String toString() {
        return "X= " + x + "   Y= " + y + "  Speedx: " + xSpeed + "   Speedy: " + ySpeed;
    }
}

class MoveableCircle implements Moveable {
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(MoveablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        System.out.println("up circle");
    }

    @Override
    public void moveDown() {
        System.out.println("down circle");
    }

    @Override
    public void moveLeft() {
        System.out.println("left circle");
    }

    @Override
    public void moveRight() {
        System.out.println("right circle");
    }

    @Override
    public String toString() {
        return "center=" + center +
                "    radius=" + radius;
    }
}

public class Bai4 {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(1, 1, 1, 1);
        System.out.println(point);
        point.moveDown();
        point.moveUp();

        MoveableCircle circle = new MoveableCircle(point, 2);
        System.out.println(circle);
        circle.moveLeft();
        circle.moveRight();
    }
}