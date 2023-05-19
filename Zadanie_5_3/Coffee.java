import java.util.ArrayList;
import java.util.Iterator;

public class Coffee {
    public static void main(String[] args) {
        ArrayList<String> coffeeList = new ArrayList<>();


        coffeeList.add("espresso");
        coffeeList.add("latte");
        coffeeList.add("cappuccino");
        coffeeList.add("mocha");
        coffeeList.add("auLait");
        coffeeList.add("macchiato");


        System.out.println("Lista kaw:");
        for (String coffee : coffeeList) {
            System.out.println(coffee);
        }
        System.out.println();


        System.out.println("Użycie Iteratora:");
        Iterator<String> iterator = coffeeList.iterator();
        while (iterator.hasNext()) {
            String coffee = iterator.next();
            System.out.println(coffee);
        }
        System.out.println();


        System.out.println("Pętla foreach (duże litery):");
        for (String coffee : coffeeList) {
            System.out.println(coffee.toUpperCase());
        }
        System.out.println();


        System.out.println("Pierwsze 4 litery z każdego wyrazu:");
        for (String coffee : coffeeList) {
            if (coffee.length() >= 4) {
                System.out.println(coffee.substring(0, 4));
            }
        }
    }
}