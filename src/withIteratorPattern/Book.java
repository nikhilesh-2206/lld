package withIteratorPattern;

public class Book {
    public String title;

    public Book( String title)
    {
        this.title=title;
    }

    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }


}
