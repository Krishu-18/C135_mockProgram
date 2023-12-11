import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");

        // Print the original linked list
        System.out.println("Original Linked List: " + linkedList);

        // Get a list iterator starting from the end of the list
        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());

        // Iterate through the linked list in reverse order
        System.out.println("Linked List in Reverse Order:");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.println(element);
        }
    }
}
