package Iterator.demo;

import java.util.ArrayList;

/**
 * BookShelf
 */
public class BookShelf implements Aggregate {

    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<Book>();
    }
    public void appendBook(Book book) {
        this.books.add(book);
    }
    public Book getBookAt(int index) {
        return this.books.get(index);
    }
    public int getLength() {
        return this.books.size();
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
    
}