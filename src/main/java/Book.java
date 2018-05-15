import java.util.ArrayList;

public class Book {

    private ArrayList<Book> book;
    int capacity = 5;

    public Book(){
        this.book = new ArrayList<>();
    }

    public int countBooks(){
        return this.book.size();
    }

    public void addBook(Book book) {
        if (this.book.size() < capacity) {
            this.book.add(book);
        }
    }

}
