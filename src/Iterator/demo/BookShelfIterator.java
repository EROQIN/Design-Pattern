package Iterator.demo;


public class BookShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index;
    BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }



    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
    
    
}
