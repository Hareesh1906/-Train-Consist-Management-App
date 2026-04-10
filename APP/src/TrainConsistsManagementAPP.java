import java.util.Scanner;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of bogies: ");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            if (n <= 0) {
                throw new IllegalArgumentException("Number of bogies must be greater than 0!");
            }

            String[] bogieIDs = new String[n];

            // Input bogie IDs
            for (int i = 0; i < n; i++) {
                System.out.print("Enter Bogie ID: ");
                bogieIDs[i] = sc.nextLine();
            }

            System.out.print("\nEnter Bogie ID to search: ");
            String searchID = sc.nextLine();

            if (searchID.isEmpty()) {
                throw new IllegalArgumentException("Search ID cannot be empty!");
            }

            boolean found = false;

            // Linear Search
            for (int i = 0; i < n; i++) {
                if (bogieIDs[i].equalsIgnoreCase(searchID)) {
                    System.out.println("Bogie ID FOUND at position: " + (i + 1));
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Bogie ID NOT FOUND!");
            }

        }
        catch (IllegalArgumentException e) {
            System.out.println("Input Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }
        finally {
            System.out.println("\nSearch operation completed (system cleanup done).");
            sc.close();
        }
    }
}