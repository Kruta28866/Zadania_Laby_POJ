import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Pierwszy");
        set.add("Drugi");
        set.add("Trzeci");
        set.add("Czwarty");

        System.out.println("Zawartość zbioru: " + set);

        String[] array = set.toArray(new String[0]);

        System.out.println("Zawartość tablicy: ");
        for (String element : array) {
            System.out.println(element);
        }
    }
}






