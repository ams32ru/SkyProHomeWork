package homeWorkObjectClass;

public class Book {
    private String bookName;
    private Author bookAuthor;
    private int yearPublication;
    public Book(String bookName, Author bookAuthor, int yearPublication) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.yearPublication = yearPublication;
    }
    public String getBookName() {
        return this.bookName;
    }
    public Author getBookAuthor() {
        return this.bookAuthor;
    }
    public int getYearPublication() {
        return this.yearPublication;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}
