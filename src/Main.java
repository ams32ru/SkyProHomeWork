import homeWorkObjectClass.Author;
import homeWorkObjectClass.Book;

public class Main {
    public static void main(String[] args) {
        Author bach = new Author("Richard", "Bach");
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Book seagull = new Book("Jonathan Livingston Seagull", bach, 1970);
        Book idiot = new Book("Idiot", dostoevsky, 1868);
        System.out.println("idiot.getYearPublication() = " + idiot.getYearPublication());
        idiot.setYearPublication(2022);
        System.out.println("idiot.getYearPublication() = " + idiot.getYearPublication());


    }
}