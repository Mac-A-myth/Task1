import java.util.*;

public class InventorySystem {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();

        items.add("Laptop");
        items.add("Mouse");
        items.add("Laptop");   // duplicate
        items.add("Keyboard");
        items.add("Mouse");    // duplicate

        // Find unique items
        Set<String> uniqueItems = new HashSet<>(items);

        System.out.println("All Items: " + items);
        System.out.println("\nUnique Items with Count:");

        // For each unique item, count its occurrences in the list
        for (String item : uniqueItems) {
            int count = 0;
            for (String i : items) {
                if (i.equals(item)) {
                    count++;
                }
            }
            System.out.println(item + " -> " + count);
        }
    }
}
