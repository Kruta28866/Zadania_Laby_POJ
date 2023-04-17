import java.text.DecimalFormatSymbols;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Roller {

    private int r;

    private int h;
    private double v;

    Scanner scan = new Scanner(System.in);

    public Roller(int r, int h, double v) {
        this.r = r;
        this.h = h;
        this.v = v;
    }

    public Roller() {
    }

    public void rData(){
        System.out.println("Podaj promień walca: ");
        setR(scan.nextInt());
        System.out.println("Podaj wysokość walca: ");
        setH(scan.nextInt());
        rVolume();

    }
    public void rVolume(){
        double pi = 3.14159;
        setV(pi*(getR()*getR())*getH());
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.##", symbols);
        System.out.println("Pojemność walca wynosi " + df.format(getV()));
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
