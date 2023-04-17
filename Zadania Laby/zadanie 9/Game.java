import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game {

    private char pass;
    private  int  gues;

    public Game(char pass) {
        this.pass = pass;
    }

    public Game() {
    }

    public void newGame() throws IOException {

        rndChar();
        System.out.println("Pomyślałem literę z przedziału od A do Z.");

        while (true){

            System.out.print("Odgadnij ją: ");
            gues = System.in.read();
            System.out.println();

            //System.out.println("Hasło: " + getPass());

            if(gues == pass){
                System.out.println("Brawo Odgadłeś Literę");
                break;
            }

            if(gues > pass ){
                System.out.println("Celujesz za wysoko");
            }
            if(gues < pass ){
                System.out.println("Celujesz za Nisko");
            }

        }
    }

    public void newGame2() throws IOException {

        rndChar();

        System.out.println("Pomyślałem literę z przedziału od A do Z.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Odgadnij ją: ");
            String guess = scanner.nextLine();

            if (guess.length() > 0) {
                char input = guess.charAt(0);

                if (input == pass) {
                    System.out.println("Brawo, odgadłeś literę!");
                    break;
                } else if (input > pass) {
                    System.out.println("Celujesz za wysoko.");
                } else {
                    System.out.println("Celujesz za nisko.");
                }
            }
        }

        scanner.close();
    }

    public void rndChar(){
        Random r = new Random();
        setPass((char)(r.nextInt('z' - 'a') + 'a'));

    }

    public char getPass() {
        return pass;
    }

    public void setPass(char pass) {
        this.pass = pass;
    }

    public int getGues() {
        return gues;
    }

    public void setGues(char gues) {
        this.gues = gues;
    }
}
