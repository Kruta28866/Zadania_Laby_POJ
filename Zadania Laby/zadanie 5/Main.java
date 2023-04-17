public class Main {
    public static void main(String[] args) {
        Operators operators = new Operators(2,2);

        operators.sum();
        operators.sub();
        operators.multi();
        operators.div();
        System.out.println();
        operators.inc();
        operators.dec();
        System.out.println();
        operators.rel();
    }
}