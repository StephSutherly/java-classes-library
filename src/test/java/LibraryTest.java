import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book bookOne;
    private Book bookTwo;
    private Book bookThree;
    private Book bookFour;
    private Book bookFive;

    @Before
    public void setUp(){
        library = new Library(5);
        bookOne = new Book("Sense and Sensibility", "Jane Austen", "Classic");
        bookTwo = new Book("Pride and Prejudice", "Jane Austen", "Classic");
        bookThree = new Book("The Shining", "Stephen King", "Horror");
        bookFour = new Book("Winnie the Pooh", "A. A. Milne", "Children's");
        bookFive = new Book("Green Eggs & Ham", "Dr Seuss", "Children's");
    }

    @Test
    public void libraryStartsEmpty(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBooksToLibrary(){
        library.addBook(bookOne);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canCountBooksInLibrary(){
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void cannotAddBooksToLibraryIfAboveCapacity(){
        library.addBook(bookOne);
        library.addBook(bookTwo);
        library.addBook(bookThree);
        library.addBook(bookFour);
        library.addBook(bookFive);
        assertEquals(5, library.bookCount());
        library.addBook(bookOne);
        assertEquals(5, library.bookCount());
    }

}
