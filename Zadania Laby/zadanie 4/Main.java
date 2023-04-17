public class Main {
    public static void main(String[] args) {
        Str str = new Str("napis","napis");

        if(str.getS1() == str.getS2()){
            System.out.println("str1 == str2:");
            System.out.println("true");
        }

        System.out.print("str1.equals(str2): ");
        System.out.println(str.getS1().equals(str.getS2()));

    }
}