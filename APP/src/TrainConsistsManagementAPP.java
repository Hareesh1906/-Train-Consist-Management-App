import java.util.*;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        HashMap<String, Integer> cargoMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of cargo entries: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {

            System.out.print("\nEnter Bogie ID: ");
            String id = sc.nextLine();

            int weight = 0;

            try {
                System.out.print("Enter Cargo Weight (in tons): ");
                weight = sc.nextInt();
                sc.nextLine();

                if (weight <= 0) {
                    throw new IllegalArgumentException("Weight must be greater than 0!");
                }

                cargoMap.put(id, weight);
                System.out.println("Cargo assigned successfully ✔");

            } catch (InputMismatchException e) {
                System.out.println("Invalid input: Please enter numeric weight!");
                sc.nextLine(); // clear buffer

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Finalizing entry for Bogie: " + id);
            }
        }

        // Display cargo details
        System.out.println("\nFinal Cargo Assignments:");
        for (Map.Entry<String, Integer> entry : cargoMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " tons");
        }

        sc.close();
    }
}