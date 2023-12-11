import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the PriorityQueue
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(50);
        priorityQueue.add(10);

        // Print the original PriorityQueue
        System.out.println("Original PriorityQueue: " + priorityQueue);

        // Retrieve and remove the first element from the PriorityQueue
        Integer firstElement = priorityQueue.poll();

        // Print the first element
        if (firstElement != null) {
            System.out.println("First Element retrieved and removed: " + firstElement);
        } else {
            System.out.println("PriorityQueue is empty");
        }

        // Print the updated PriorityQueue
        System.out.println("Updated PriorityQueue: " + priorityQueue);
    }
}

