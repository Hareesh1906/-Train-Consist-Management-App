import java.util.*;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

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

            int capacity = 0;
            boolean valid = false;

            while (!valid) {
                try {
                    System.out.print("Enter Capacity for " + id + ": ");
                    capacity = sc.nextInt();
                    sc.nextLine();

                    if (capacity <= 0) {
                        throw new IllegalArgumentException("Capacity must be greater than 0!");
                    }

                    valid = true;

                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid Input: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Invalid Input: Please enter a number!");
                    sc.nextLine(); // clear buffer
                }
            }

            bogieMap.put(id, capacity);
            System.out.println("Bogie added successfully.");
        }

        // Display final data
        System.out.println("\nValid Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}