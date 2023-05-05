public class Truck extends Car implements Purchase{
    int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice(){
        double x = super.getSalePrice();

        if ( weight>2000){
            x *= 0.9;
        }
        return x;
    }

    @Override
    public String getPurchaseInfo() {
        return "Truck: ";
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
