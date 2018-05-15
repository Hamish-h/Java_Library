import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BookTest {

//        Write a method to count the number of books in the library.
//        Write a method to add a book to the library stock
//        Add a capacity to the library and write a method to check if stock is full before adding a book.

     @Test
     public void hasNumberOfBooks(){
         Book book = new Book();
         book.addBook(book);
         assertEquals(1, book.countBooks());
     }

     @Test
     public void canAddBook(){
         Book book = new Book();
         book.addBook(book);
         assertEquals(1, book.countBooks());
    }

     @Test
     public void cannotAddBook(){
         Book book = new Book();
         //       for (int i = 1; i <= 6; i++)
         book.addBook(book);
         book.addBook(book);
         book.addBook(book);
         book.addBook(book);
         book.addBook(book);
         book.addBook(book);
         assertEquals(5, book.countBooks());
     }

}