package withIteratorPattern;

import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        BookCollectionV2 bookCollectionV2 = new BookCollectionV2();

        bookCollectionV2.addBook(new Book("c++"));
        bookCollectionV2.addBook(new Book("python"));

        Iterator<Book> iterator = bookCollectionV2.getIterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next().getTitle() );
        }
    }
}
