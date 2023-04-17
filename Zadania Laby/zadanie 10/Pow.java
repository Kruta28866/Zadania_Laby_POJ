public class Pow {
    private int a;
    private int b=0;
    private int j;


    public Pow(int a, int b, int j) {
        this.a = a;
        this.b = b;
        this.j = j;
    }

    public Pow() {

    }

    public void sPow(){

        for(int i =0;i <= 11 ; i++){

            System.out.println("2 Do potęgi " + i + " wynosi: " + (int) Math.pow(2 , b)  );
            b++;
        }

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

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
