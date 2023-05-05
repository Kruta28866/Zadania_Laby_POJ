public class Cylinder extends Circle{

    double height = 4.0;
    double volume;

    public Cylinder(){

    }

    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder ( double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return volume = height * (super.getArea());
    }
}
