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

//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock
//        Add a capacity to the library and write a method to check if stock is full before adding a book.

//    Add a third class which interacts with the other two.
//    E.g. you could add a Borrower with a method that takes
//    a Book and moves to the Borrower's collection.
