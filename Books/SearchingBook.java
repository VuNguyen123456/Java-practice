import java.util.List;
public class SearchingBook {
    public void binarySearch(List<Book> books, String title) {
        //CODE TO IMPLEMENT BINARY SEARCH WITH TOTAL STEPS COUNTED
        int count = 0;
        int head = 0;
        int tail = books.size()-1;
        while(head <= tail){
            int midpoint = (head + tail) / 2;
            int result = title.compareTo(books.get(midpoint).getTitle());
            count += 1;
            if(result == 0){
                System.out.println(title + "in " + count+" steps" );
                return;
            }
            else if(result < 0){
                tail = midpoint -1;
            }
            else if(result > 0){
                head = midpoint +1;
            }
        }
        System.out.println(title + " Can be found in " + count + " steps");
        return;
    }    
}
