import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book A", "Author 1", "Science Fiction"));
        


       // ADD MORE BOOKS
        books.add(new Book("Book B", "Author 2", "Science Fiction"));
        books.add(new Book("Book C", "Author 3", "Action"));
        books.add(new Book("Book D", "Author 4", "Thriller"));
        // Sort the list of books using the custom sorting logic
        Collections.sort(books, new BookGenreComparator());

        //Code here to display the sorted list of books
        for(Book dis : books){
            System.out.println(dis.getTitle());
        }
       
        
        
        //Task 2
        //Add 6 more books, as in the previous list contains four entries already
        books.add(new Book("Book E", "Author 5", "Science Fiction"));
        books.add(new Book("Book F", "Author 6", "Action"));
        books.add(new Book("Book G", "Author 4", "Thriller"));
        books.add(new Book("Book H", "Author 8", "Science Fiction"));
        books.add(new Book("Book I", "Author 9", "Action"));
        books.add(new Book("Book K", "Author 10", "Thriller"));
        //Sort if necessary
        Collections.sort(books, (book1, book2) -> book1.getTitle().compareTo(book2.getTitle()));
        //Select a book
        String selectedBook = "Book I"; 
        //Search the book 
        SearchingBook search = new SearchingBook();
        search.binarySearch(books, selectedBook);
    
}
}
