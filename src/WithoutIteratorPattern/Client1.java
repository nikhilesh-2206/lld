package WithoutIteratorPattern;

public class Client1 {

/*
now what if we want to change the implementation of books such that instead of array we want to have a ll
then we would haver to   change the code in this class as well meaning tightly coupled
 */
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        bookCollection.addBook(new Book("c++ book"));
        bookCollection.addBook(new Book("java book"));
        bookCollection.addBook(new Book("python book"));


        for( int i=0;i<bookCollection.getBookCollection().size();i++)
        {
            System.out.println(bookCollection.getBookCollection().get(i));
        }

    }
}
