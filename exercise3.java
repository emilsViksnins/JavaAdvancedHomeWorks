package homeWorks;

public class exercise3 {
public static void main(String[] args) {
    Shape shape = new Shape("blue", false);
    System.out.println(shape);

    Shape circle = new Circle("green", true, 5.5F);
    System.out.println(circle);

    Shape rectangle = new Rectangle("red", true, 1.0, 2.0) {
        @Override
        public void setWidth(double width) {

        }

        @Override
        public void setLength(double width) {

        }
    };
    System.out.println(rectangle);

    Shape square = new Square("yellow", false, 6.6);
    System.out.println(square);
    }
}

class Shape {
    private String color;
    private boolean isFilled;
    public Shape() {
        this.color = "green";
        this.isFilled = false;
    }
    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return isFilled;
    }
    public void setFilled(boolean filled) {
        isFilled = filled;
    }
    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s",
                color, isFilled ? "filled" : "not filled");
    }
}

class Circle extends Shape {
    private float radius;
    public Circle(String color, boolean isFilled, float radius) {
        super(color, isFilled);
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
    @Override
    public String toString() {
        return String.format("A Circle with radius = %f, which is a subclass of %s",
                radius, super.toString());
    }
}

abstract class Rectangle extends Shape {
    protected double width, length;
    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getArea() {
        return (float) (width * length);
    }
    public float getPerimeter() {
        return (float) (2 * (width + 2 + length));
    }

    public abstract void setWidth(double width);

    public abstract void setLength(double width);

    @Override
    public String toString() {
        return String.format("A Rectangle with width = %f and length = %f, " +
                        "which is a subclass of %s",
                width, length, super.toString());
    }
}
class Square extends Rectangle {
    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }
    @Override
    public void setWidth(double width) {
        super.width = width;
        super.length = width;
    }
    @Override
    public void setLength(double width) {
        super.width = length;
        super.length = width;
    }
    @Override
    public String toString() {
        return String.format("A Square with side = %f, which is a subclass of %s",
                width,length,  super.toString());
    }
}

