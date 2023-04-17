public class Statment {

    public Statment() {
    }

    public void Truth(){
        System.out.println(String.format(" %-10s  %-10s  %-10s  %-10s  %-10s  %-10s ", "P", "Q", "AND", "OR" , "XOR" , "NOT"));
        System.out.println(String.format(" %-10s  %-10s  %-10s  %-10s  %-10s  %-10s ", "True", "True", "True", "True" , "False" , "False"));
        System.out.println(String.format(" %-10s  %-10s  %-10s  %-10s  %-10s  %-10s ", "True", "False", "False", "True" , "True" , "False"));
        System.out.println(String.format(" %-10s  %-10s  %-10s  %-10s  %-10s  %-10s ", "False", "True", "False", "True" , "True" , "True"));
        System.out.println(String.format(" %-10s  %-10s  %-10s  %-10s  %-10s  %-10s ", "False", "False", "False", "False" , "False" , "True"));
    }
}
