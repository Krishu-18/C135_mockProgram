import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Given element
        int givenElement = 25;

        // Get the smallest element in the TreeSet greater than or equal to the given element
        Integer result = treeSet.ceiling(givenElement);

        // Print the result
        if (result != null) {
            System.out.println("Element in TreeSet greater than or equal to " + givenElement + ": " + result);
        } else {
            System.out.println("No element found in TreeSet greater than or equal to " + givenElement);
        }
    }
}

