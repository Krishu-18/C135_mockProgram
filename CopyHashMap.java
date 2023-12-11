import java.util.HashMap;
import java.util.Map;

public class CopyHashMap {
    public static void main(String[] args) {
        // Create the source HashMap
        Map<String, Integer> sourceMap = new HashMap<>();
        sourceMap.put("One", 1);
        sourceMap.put("Two", 2);
        sourceMap.put("Three", 3);

        // Create the destination HashMap
        Map<String, Integer> destinationMap = new HashMap<>();

        // Copy all mappings from the source to the destination
        destinationMap.putAll(sourceMap);

        // Print the original and copied HashMaps
        System.out.println("Original HashMap: " + sourceMap);
        System.out.println("Copied HashMap: " + destinationMap);
    }
}
