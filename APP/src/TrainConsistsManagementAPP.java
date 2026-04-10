import java.util.Scanner;
import java.util.LinkedHashSet;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        // LinkedHashSet preserves insertion order & ensures uniqueness
        LinkedHashSet<String> bogieIDs = new LinkedHashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String id = sc.nextLine();

            // Add and check duplicate
            if (!bogieIDs.add(id)) {
                System.out.println("Duplicate Bogie ID not allowed!");
            } else {
                System.out.println("Bogie ID added successfully.");
            }
        }

        // Display bogie IDs in insertion order
        System.out.println("\nBogie IDs (Insertion Order):");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        sc.close();
    }
}