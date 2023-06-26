package homeWorks;


import java.sql.SQLOutput;

public class exercise1 {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1, 2);
        point2D.setXY(3, 4);
        System.out.println(point2D);
        Point3D point3D = new Point3D(1, 2, 3);
        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D);
    }
}

class Point2D {
    protected float x, y;

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;

    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%f, %f)", x, y);
    }
}
class Point3D extends Point2D {
    private float z;
    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public float getZ() {
        return z;
    }
    public void setZ(float z) {
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{x, y, z};
    }
    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    @Override
    public String toString() {
        return String.format("(%f, %f, %f)", x, y, z);
    }
}