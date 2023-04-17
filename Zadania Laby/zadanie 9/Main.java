import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int i = 0;

        Game game = new Game();
        Scanner scan = new Scanner(System.in);


        System.out.println("Aby wybrać pierwszą werjsę gry proszę wybrać 1.");
        System.out.println("Aby wybrać pierwszą werjsę gry proszę wybrać 2.");
        i = scan.nextInt();


        switch(i){
            case 1:
                game.newGame();
                break;
            case 2:
                game.newGame2();

        }
    }
}