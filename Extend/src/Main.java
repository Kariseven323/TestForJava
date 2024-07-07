class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d, %s)", super.getX(), super.getY(), this.color);
    }
}

/**
 * @author KAR1SEVEN
 */
public class Main {
    public static void main(String[] args) {
        Point point = new Point(3, 4);
        Point colorPoint = new ColorPoint(1, 2, "red");

        // 多态，同一个类的实例，调用相同的函数，运行结果不同
        System.out.println(point.toString());
        System.out.println(colorPoint.toString());
    }
}