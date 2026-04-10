import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        // HashMap to map Bogie ID -> Capacity
        HashMap<String, Integer> bogieMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String id = sc.nextLine();

            // Check duplicate bogie ID
            if (bogieMap.containsKey(id)) {
                System.out.println("Duplicate Bogie ID not allowed!");
                i--; // retry same index
                continue;
            }

            System.out.print("Enter Capacity for " + id + ": ");
            int capacity = sc.nextInt();
            sc.nextLine(); // consume newline

            bogieMap.put(id, capacity);
            System.out.println("Bogie added successfully.");
        }

        // Display bogie and capacity
        System.out.println("\nBogie Details (ID -> Capacity):");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}