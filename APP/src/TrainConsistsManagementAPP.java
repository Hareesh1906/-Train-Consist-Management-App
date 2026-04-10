import java.util.*;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        // Map Bogie ID -> Capacity (Seats)
        HashMap<String, Integer> bogieMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String id = sc.nextLine();

            if (bogieMap.containsKey(id)) {
                System.out.println("Duplicate Bogie ID not allowed!");
                i--;
                continue;
            }

            System.out.print("Enter Capacity (Seats) for " + id + ": ");
            int capacity = sc.nextInt();
            sc.nextLine();

            bogieMap.put(id, capacity);
        }

        // Calculate total seats
        int totalSeats = 0;

        for (int seats : bogieMap.values()) {
            totalSeats += seats;
        }

        // Display bogie details
        System.out.println("\nBogie Details (ID -> Seats):");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Display total seats
        System.out.println("\nTotal Seats in Train: " + totalSeats);

        sc.close();
    }
}