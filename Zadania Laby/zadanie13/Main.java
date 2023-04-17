public class Main {
    public static void main(String[] args) {
        Vechicle BMW = new Vechicle(5,50,13);
        Vechicle AUDI = new Vechicle(7,35,15);



        System.out.println("BMW przewozi " + BMW.getPassagers() + " osób na odległość do " + BMW.range() + " kilometrów.");
        System.out.println("AUDI przewozi " + AUDI.getPassagers() + " osób na odległość do " + AUDI.range() + " kilometrów.");

    }
}