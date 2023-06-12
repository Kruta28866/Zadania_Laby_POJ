import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("czerwony ");
        linkedList.add("niebieski");
        linkedList.add("fioletowy");
        linkedList.add("zielony");

        System.out.println("Oryginalna lista: " + linkedList);

        String pierwszyElement = linkedList.removeFirst();
        String ostatniElement = linkedList.removeLast();

        System.out.println("Usunięte elementy: " + pierwszyElement + ", " + ostatniElement);

        System.out.println("Lista po usunięciu elementów: " + linkedList);
    }
}