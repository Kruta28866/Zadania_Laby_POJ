public class TestCircleandCylinder {
    public static void Main(String[] args){
        Cylinder cylinder1 = new Cylinder();
        Circle circle1 = new Circle();




        cylinder1.radius = 2.0;
        circle1.radius = 2.0;

        System.out.println("^^^ CIRCLES ^^^");
        System.out.println("Radius = "+ circle1.getRadius());
        System.out.println("Area = "+ circle1.getArea());
        System.out.println(circle1.toString());
        System.out.println("Color = " + (circle1.color = "red"));

        System.out.println("^^^ Cylinders ^^^");
        System.out.println("Volume of Cylinder = " + cylinder1.getVolume());
        System.out.println();
    }
}
