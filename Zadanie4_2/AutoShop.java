public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(160,20000,"red", 10);
        Ford ford1 = new Ford(156,4452.0,"black",2005,10);
        Ford ford2 = new Ford(155,5000.0,"pink",1998,5);

        Truck truck = new Truck(200,5000.0,"gold",5000);

        System.out.println(sedan.toString());
        System.out.println(ford1.toString());
        System.out.println(ford2.toString());
        System.out.println(truck.toString());

        System.out.println(sedan.getPurchaseInfo() + sedan.getSalePrice());
        System.out.println(ford1.getPurchaseInfo() + ford1.getSalePrice());
        System.out.println(ford2.getPurchaseInfo() + ford2.getSalePrice());
        System.out.println(truck.getPurchaseInfo() + truck.getSalePrice());


    }
}
