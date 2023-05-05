public class Ford extends Car implements Purchase{
    int year;
    int manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    double getSalePrice(){
        if(manufacturerDiscount<0){
            manufacturerDiscount*=-1;
        }
        return super.getSalePrice() - manufacturerDiscount;
    }

    @Override
    public String getPurchaseInfo() {
        return "FORD: ";
    }

    @Override
    public String toString() {
        return "Ford{" +
                "year=" + year +
                ", manufacturerDiscount=" + manufacturerDiscount +
                ", speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
