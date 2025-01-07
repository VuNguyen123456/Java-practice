public class Main {
    public static void main(String[] args){
        Node node = new Node();
        Node head = null;

        head = node.insertNode(head, 10);
        head = node.insertNode(head, 13);
        head = node.insertNode(head, 17);
        head = node.insertNode(head, 29);
        head = node.insertNode(head, 9);
        head = node.insertNode(head, 27);
        head = node.insertNode(head, 19);
        System.out.println("The list after being interted");
        node.traverse(head);

    }
}
