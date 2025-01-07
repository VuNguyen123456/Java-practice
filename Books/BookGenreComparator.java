import java.util.ArrayList;
import java.util.Comparator;
public class BookGenreComparator implements Comparator<Book> {
     @Override
    public int compare(Book book1, Book book2) {
        //CODE TO CUSTOMIZE YOUR LOGIC
        int compareGenre = book1.getGenre().compareTo(book2.getGenre());
        if(compareGenre == 0){
            return book1.getTitle().compareTo(book2.getTitle());
        }
        return compareGenre;
    }
    
}
