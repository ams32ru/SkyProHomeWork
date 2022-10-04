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

    @Override
    public String toString() {
        return "Произведение: " + this.bookName + "\n" + getBookAuthor() + "Год публикиции книги: " + yearPublication + "\n+++++++++++++++++++++++++++++++++++";
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book b1 = (Book) other;
        return bookName.equals(b1.bookName) && getBookAuthor().equals(b1.getBookAuthor());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookName, bookAuthor);
    }
}
