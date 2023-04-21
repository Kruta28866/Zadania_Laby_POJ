public class testCircle {

    public static void Main(String[] args){

        Circle circle = new Circle();
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(15 , "white");

        Circle circle4 = new Circle();
        circle4.setColor("blue");
        circle4.setRadius(5);

        System.out.println("The circle c1 has radius of " + circle.getRadius() + " and area of " + circle.getArea() + " and color of " + circle.getColor() + "\n" +
                "Circle : radius = " + circle.getRadius() + " color = " + circle.getColor() );

        System.out.println("The circle c2 has radius of " + circle1.getRadius() + " and area of " + circle1.getArea() + " and color of " + circle1.getColor() + "\n" +
                "Circle : radius = " + circle1.getRadius() + " color =" + circle1.getColor());

        System.out.println("The circle c2 has radius of " + circle2.getRadius() + " and area of " + circle2.getArea() + " and color of " + circle2.getColor() + "\n" +
                "Circle : radius = " + circle2.getRadius() + " color =" + circle2.getColor());

        System.out.println("The circle c2 has radius of " + circle4.getRadius() + " and area of " + circle4.getArea() + " and color of " + circle4.getColor() + "\n" +
                "Circle : radius = " + circle4.getRadius() + " color =" + circle4.getColor());
    }
}
