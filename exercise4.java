package homeWorks;

public class exercise4 {
    public static void main(String[] args) {
        ShapeExercise4[] shapes = {
                new CircleExercise4("red", true, 5),
                new RectangleExercise4("blue", false, 3, 4),
                new SquareExercise4("green", true, 5)
        };
        for (ShapeExercise4 shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
abstract class ShapeExercise4 {
    private String color;
    private boolean isFilled;
    public ShapeExercise4(String color, boolean isFilled ) {
        this.color = "green";
        this.isFilled = false;
    }
    public void ShapeExcercise4(String color, boolean isFille) {
        this.color = color;
        this.isFilled = isFilled ;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return this.isFilled;
    }
    public void setFilled(boolean filled) {
        isFilled  = filled;
    }
    public abstract float getArea();
    public abstract float getPerimeter();

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s", color,
                isFilled  ? "filled" : "not filled");
    }
}

class CircleExercise4 extends ShapeExercise4 {
    private float radius;
    public CircleExercise4(String color, boolean isFilled, float radius) {

        super(color,isFilled );
        this.radius = radius;
    }
    public float getRadius() {
        return this.radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }
    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }
    @Override
    public String toString() {
        return String.format("A Circle with radius = %f, which is a subclass of %s",
                radius, super.toString());
    }
}

class RectangleExercise4 extends ShapeExercise4{
    protected double width, length;
    public RectangleExercise4(String color, boolean isFilled , double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public float getArea() {
        return (float) (width * length);
    }
    @Override
    public float getPerimeter() {
        return (float) (2 * width + 2 * length);
    }
    @Override
    public String toString() {
        return String.format("A Rectangle with width = %f and length = %f, " +
                        "which is a subclass of %s",
                width, length, super.toString());
    }
}
class SquareExercise4 extends RectangleExercise4 {
    public SquareExercise4(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public String toString() {
        return String.format("A Square with side = %f, which is a subclass of %s",
                width, length, super.toString());
    }
}
