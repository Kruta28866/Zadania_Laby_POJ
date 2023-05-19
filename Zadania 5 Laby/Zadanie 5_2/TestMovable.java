public class TestMovable {
    public static void main(String[] args) {
        MovablePoint mov = new MovablePoint(30,4);
        System.out.println("Pozycja początkowa: " + mov);

        mov.moveDown();
        System.out.println("Dół: " + mov);
        mov.moveLeft();
        System.out.println("Lewo: " + mov);
        mov.moveUp();
        System.out.println("Góra: " + mov);
        mov.moveRight();
        System.out.println("Prawo: " + mov);

        System.out.println("Pozycja po zmianach: " + mov);
    }
}