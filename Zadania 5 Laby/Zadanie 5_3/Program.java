import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;

    public Ksiazka(String tytul, String autor, int liczbaStron) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getLiczbaStron() {
        return liczbaStron;
    }

    public void setLiczbaStron(int liczbaStron) {
        this.liczbaStron = liczbaStron;
    }
}

class Ebook extends Ksiazka {
    private int rozmiar;
    private String format;

    public Ebook(String tytul, String autor, int liczbaStron, int rozmiar, String format) {
        super(tytul, autor, liczbaStron);
        this.rozmiar = rozmiar;
        this.format = format;
    }

    public int getRozmiar() {
        return rozmiar;
    }

    public void setRozmiar(int rozmiar) {
        this.rozmiar = rozmiar;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

class KsiazkaPapierowa extends Ksiazka {
    private int rokWydania;

    public KsiazkaPapierowa(String tytul, String autor, int liczbaStron, int rokWydania) {
        super(tytul, autor, liczbaStron);
        this.rokWydania = rokWydania;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    public void setRokWydania(int rokWydania) {
        this.rokWydania = rokWydania;
    }
}

public class Program {
    public static void main(String[] args) {
        List<Ksiazka> listaKsiazek = new ArrayList<>();

        Ksiazka ksiazka1 = new Ebook("Java Basics", "John Smith", 300, 1024, "PDF");
        Ksiazka ksiazka2 = new KsiazkaPapierowa("Clean Code", "Robert Martin", 400, 2008);
        Ksiazka ksiazka3 = new Ebook("Python for Beginners", "Jane Doe", 250, 512, "EPUB");
        Ksiazka ksiazka4 = new KsiazkaPapierowa("The Pragmatic Programmer", "Andy Hunt, Dave Thomas", 352, 199);
    }
}