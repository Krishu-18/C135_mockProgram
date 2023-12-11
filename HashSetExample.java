import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");

        // Get the number of elements in the HashSet
        int numberOfElements = hashSet.size();

        // Print the number of elements
        System.out.println("Number of Elements in HashSet: " + numberOfElements);
    }
}
