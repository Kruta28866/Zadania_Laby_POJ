import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Osoba k = new Osoba("Kacper", "Ruta", 22,"informatyka");

       // System.out.println(k.toString());
        System.out.println("Zadanie 2.2 ________");
        System.out.println();
        System.out.println("Imie: " + k.getName());
        System.out.println("Nazwisko: " + k.getSurname());
        System.out.println("Grupa: " + k.getGroup());
        System.out.println("Kierunek: " + k.getSpec());
        System.out.println();
        System.out.println("Zadanie 2.3 ________");

        Osoba j = new Osoba();

        System.out.println("Podaj Imię: ");
        j.setName(scan.next());
        System.out.println("Podaj Nazwisko: ");
        j.setSurname(scan.next());
        System.out.println("Podaj Grupę: ");
        j.setGroup(scan.nextInt());
        System.out.println("Podaj Kierunek: ");
        j.setSpec(scan.next());
        System.out.println("Imie: " + j.getName());
        System.out.println("Nazwisko: " + j.getSurname());
        System.out.println("Grupa: " + j.getGroup());
        System.out.println("Kierunek: " + j.getSpec());
        System.out.println();




    }
}