public class Main {
    public static void main(String[] args) {
        Vechicle BMW = new Vechicle(5,50,13);
        Vechicle AUDI = new Vechicle(7,35,15);



        System.out.println("BMW Potrzebuje " + BMW.needFuel(200) + " litrów paliwa aby przejechać 200km ");
        System.out.println("AUDI Potrzebuje " + AUDI.needFuel(200) + " litrów paliwa aby przejechać 200km ");

    }
}