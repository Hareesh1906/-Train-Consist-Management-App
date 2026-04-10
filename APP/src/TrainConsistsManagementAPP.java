import java.util.*;
import java.util.stream.*;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        // Map Bogie ID -> Capacity + Type
        HashMap<String, Integer> capacityMap = new HashMap<>();
        HashMap<String, String> typeMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Bogie ID: ");
            String id = sc.nextLine();

            if (capacityMap.containsKey(id)) {
                System.out.println("Duplicate Bogie ID not allowed!");
                i--;
                continue;
            }

            System.out.print("Enter Bogie Type (Passenger/Goods): ");
            String type = sc.nextLine();

            System.out.print("Enter Capacity: ");
            int capacity = sc.nextInt();
            sc.nextLine();

            typeMap.put(id, type);
            capacityMap.put(id, capacity);
        }

        // Sort Passenger bogies by capacity
        System.out.println("\nPassenger Bogies Sorted by Capacity:");

        capacityMap.entrySet()
                .stream()
                .filter(entry -> typeMap.get(entry.getKey()).equalsIgnoreCase("Passenger"))
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry ->
                        System.out.println(entry.getKey() + " -> " + entry.getValue())
                );

        sc.close();
    }
}