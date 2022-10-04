import homeWorkObjectClass.Author;
import homeWorkObjectClass.Book;

public class Main {
    public static void main(String[] args) {
        Author bach = new Author("Richard", "Bach");
        //копия автора Бах, для проверки реализации метода equals
        Author bach2 = new Author("Richard", "Bach");
        Author dostoevsky = new Author("Fedor", "Dostoevsky");
        Book seagull = new Book("Jonathan Livingston Seagull", bach, 1970);
        Book idiot = new Book("Idiot", dostoevsky, 1868);
        //копия произведения "Идиот" для проверки реализации метода equals
        Book idiot2 = new Book("Idiot", dostoevsky, 1868);
        System.out.println("idiot.getYearPublication() = " + idiot.getYearPublication());
        idiot.setYearPublication(2022);
        System.out.println("idiot.getYearPublication() = " + idiot.getYearPublication());
        //вывел произведения для проверки метода toString
        System.out.println(idiot);
        System.out.println(seagull);
        //сравнил книги и авторов для проверки метода equals
        System.out.println(idiot.equals(idiot2));
        System.out.println(bach.equals(bach2));
        System.out.println(bach.equals(dostoevsky));
    }
}