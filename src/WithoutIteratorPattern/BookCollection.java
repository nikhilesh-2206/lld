package WithoutIteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {

    List<Book>bookCollection= new ArrayList<>();

    public void addBook(Book book)
    {
        bookCollection.add(book);
    }

    public List<Book> getBookCollection()
    {
        return bookCollection;
    }


}
