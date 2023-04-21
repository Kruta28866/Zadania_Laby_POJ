public class testAuthor {
    public static void Main(String[] args){
        Author Quentin = new Author("Quentin ","Tarantino ",60);
        Author Rowling = new Author("J.K. ","Rowling ",57);
        Author Mickiewicz  = new Author("Adam ","Adam ",60);
        Author Friedrich   = new Author("Friedrich ","Nietzsche ",109);

        System.out.println(Quentin.toString());
        System.out.println(Rowling.toString());
        System.out.println(Mickiewicz.toString());
        System.out.println(Friedrich.toString());


    }

}
