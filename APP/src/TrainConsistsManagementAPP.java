import java.util.HashSet;
import java.util.Scanner;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        // HashSet to store unique bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie ID: ");
            String id = sc.nextLine();

            // Try adding to HashSet
            if (bogieIDs.contains(id)) {
                System.out.println("Duplicate Bogie ID not allowed!");
            } else {
                bogieIDs.add(id);
                System.out.println("Bogie ID added successfully.");
            }
        }

        // Display all unique bogie IDs
        System.out.println("\nUnique Bogie IDs:");
        for (String id : bogieIDs) {
            System.out.println(id);
        }

        sc.close();
    }
}