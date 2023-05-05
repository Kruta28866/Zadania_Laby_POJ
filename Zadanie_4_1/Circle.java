public class Circle {
     double radius = 1.0;
     String color = "blue";

    private double area;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area = Math.pow(radius, 2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + color + '\'' +
                ", area=" + getArea() +
                '}';
    }
}
