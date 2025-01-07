import java.util.LinkedList;

public class Node {

    private int data;
    private Node next;
    
    public Node() {    
    }
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Function to insert a new node at the end of the linked list using recursion. You can customize the parameter
    public Node insertNode(Node head, int data) {
        if(head == null){
            return new Node(data, null);
        }
        else{
            head.next = insertNode(head.next, data);
        }
        return head;
    }
    // print list
    public void traverse(Node head) {
        if(head == null){
            return;
        }
        else{
        System.out.println(head.data + " ");
        traverse(head.next);
    }
    }
    // return the length of the list
    public int getListLength(Node head) {
        int length = 0;
        while(head != null){
            length += 1;
            head = head.next;

        }
    return length;
    }
    
    // Function to delete a node from the linked list using recursion. You can customize the parameter.
    public Node deleteNode(Node head, Node initialHead, int currentPosition, int deletedPosition) {
        if(head == null){
            return new Node(data, null);
        }
        else{
            head.next = initialHead;
            if(currentPosition == deletedPosition){
                
            }
        }
        return head;
        
    }
    // print list in a reverse order
    public void reverseTraverse(Node head) {
        if(head == null){
            return;
        }
        else{
            reverseTraverse(head.next);
            System.out.println(head.data + " ");
        }
    }
}
