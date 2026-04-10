import java.util.Arrays;
import java.util.Scanner;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieNames = new String[n];

        // Input bogie names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bogie Name: ");
            bogieNames[i] = sc.nextLine();
        }import java.util.Scanner;

        public class TrainConsitsMangementApp {

            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number of bogies: ");
                int n = sc.nextInt();
                sc.nextLine(); // consume newline

                String[] bogieIDs = new String[n];

                // Input bogie IDs
                for (int i = 0; i < n; i++) {
                    System.out.print("Enter Bogie ID: ");
                    bogieIDs[i] = sc.nextLine();
                }

                // Search element
                System.out.print("\nEnter Bogie ID to search: ");
                String searchID = sc.nextLine();

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

                sc.close();
            }
        }

        sc.close();
    }
}