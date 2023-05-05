public class Sedan extends Car implements Purchase{

    int length;

    public Sedan(int speed, double regularPrice, String color, int length){
        super(speed, regularPrice, color);
        this.length = length;
    }

    double getSalePrice(){
        Double salePrice = super.getSalePrice();
        if (length>20){
            //20%
            salePrice = salePrice * 0.95;
        }
        else{
            salePrice = salePrice * 0.9;
        }
        return salePrice;
    }

    @Override
    public String getPurchaseInfo() {
        return "SEDAN: ";
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "length=" + length +
                ", speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
