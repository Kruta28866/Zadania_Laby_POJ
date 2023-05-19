import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; numbers.size() < 50; i++) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Indeks: " + i + ", Liczba: " + numbers.get(i));
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000;

        System.out.println("Czas operacji: " + duration + " ms");
    }
}

