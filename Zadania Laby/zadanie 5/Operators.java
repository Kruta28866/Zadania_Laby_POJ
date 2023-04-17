public class Operators {

    private int a;
    private int b;

    private int i;

    private boolean res;

    public Operators(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Operators() {
    }

    public void sum() {
        System.out.println("Dodawanie : " + a + " + " + b + " = " + (a + b));
    }

    public void sub() {
        System.out.println("Odejmowanie : " + a + " - " + b + " = " + (a - b));
    }

    public void multi() {
        System.out.println("Mnożenie : " + a + " * " + b + " = " + (a * b));
    }

    public void div() {
        System.out.println("Dzielenie : " + a + " / " + b + " = " + (a / b));
    }

    public void inc() {
        i++;
        System.out.println("Inkrementacja(i=0) i++ = " + i);
        i=0;
    }

    public void dec() {
        i--;
        System.out.println("Inkrementacja(i=0) i-- = " + i);
        i=0; 
    }
    public void rel(){
        res = a > b;
        System.out.println("Czy a jest większe od b: " + res);
        res = a < b;
        System.out.println("Czy a jest mniejsze od b: " + res);
        res = a == b;
        System.out.println("Czy a jest równe b: " + res);
        res = a != b;
        System.out.println("czy a jest różne od b: " + res);
        
    }
    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
