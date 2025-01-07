public class Main {
    public static void main(String[] args) {
        // Create a Container for integers
        Container<Integer> intContainer = new Container<>(5);
        intContainer.add(42);
        intContainer.add(56);
        System.out.println("First element: " + intContainer.get(0));
        System.out.println("Container size: " + intContainer.size());

        // Create a Container for strings
        Container<String> stringContainer = new Container<>(4);
        stringContainer.add("Hello");
        stringContainer.add("World");
        stringContainer.add("John");
        stringContainer.add("Doe");
        System.out.println("Second element: " + stringContainer.get(1));
        System.out.println("Container size: " + stringContainer.size());

    }
}
