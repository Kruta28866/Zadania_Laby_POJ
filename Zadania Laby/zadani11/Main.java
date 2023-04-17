public class Main {
    public static void main(String[] args) {
        Vechicle BMW = new Vechicle(5,50,13);
        Vechicle AUDI = new Vechicle(5,35,15);



        System.out.println("BMW przewozi " + BMW.getPassagers() + " osób");
        System.out.println("Zasięg BMW (km): " + BMW.range());
        System.out.println("AUDI przewozi " + AUDI.getPassagers() + " osób");
        System.out.println("Zasięg AUDI (km): " + AUDI.range());
    }
}