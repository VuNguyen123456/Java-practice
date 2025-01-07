import java.util.NoSuchElementException;
import java.util.Arrays;

public class Container<T> {
    private T[] elements;
    private int count;

    @SuppressWarnings("unchecked")
    public Container(int initialCapacity) {
        this.elements = (T[]) new Object[initialCapacity] ;
        count = 0;
    }

    public void add(T element) {
        // If the Array is full, double the size
        for(int i =0; i < elements.length; i++){
            if(elements[i] == null){
                elements[i] = element; 
            }
            for(int j =0; j < elements.length; j ++){
                if(elements[j] != null){
                    count += 1;
                }
            }
            if(count == elements.length){
                T[] temp = (T[]) new Object[elements.length*2];
                for(int j = 0; j < elements.length; j ++){
                    temp[i] = elements[i];
                }
                elements = temp;
            }
        }
    }

    public T get(int index) {
        // Hint IndexOutOfBoundsException
        if(index>= 0&& index < count){
            return elements[index];
        }
        else{
            throw new IndexOutOfBoundsException("You entered the wrong number");
        }
    }

    public int size() {
        return count;
    }

    // public boolean remove(T element) {
    //     return true;
    // }
}
