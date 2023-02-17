class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class Constr
{
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(9,12);
        System.out.println();
        myCylinder.setHeight(12);
        myCylinder.setRadius(9);
        System.out.println("Radius of Cylinder is: "+myCylinder.getRadius());
        System.out.println("Height of Cylinder is: "+myCylinder.getHeight());
        System.out.println("Surface area of Cylinder: "+myCylinder.surfaceArea());
        System.out.println("Volume of Cylinder is:"+myCylinder.volume());

    }
}