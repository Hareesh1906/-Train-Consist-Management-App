import java.util.*;

public class TrainConsitsMangementApp {

    public static void main(String[] args) {

        // Map Bogie ID -> (Type + Weight)
        HashMap<String, String> typeMap = new HashMap<>();
        HashMap<String, Integer> weightMap = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Bogie ID: ");
            String id = sc.nextLine();

            if (typeMap.containsKey(id)) {
                System.out.println("Duplicate Bogie ID not allowed!");
                i--;
                continue;
            }

            System.out.print("Enter Bogie Type (Passenger/Goods): ");
            String type = sc.nextLine();

            System.out.print("Enter Weight (in tons): ");
            int weight = sc.nextInt();
            sc.nextLine();

            typeMap.put(id, type);
            weightMap.put(id, weight);
        }

        System.out.println("\nSafety Compliance Report (Goods Bogies):");

        for (String id : typeMap.keySet()) {

            String type = typeMap.get(id);
            int weight = weightMap.get(id);

            if (type.equalsIgnoreCase("Goods")) {

                if (weight <= 100) {
                    System.out.println(id + " -> SAFE ✔ (Weight: " + weight + ")");
                } else {
                    System.out.println(id + " -> NOT SAFE ✖ (Weight: " + weight + ")");
                }
            }
        }

        sc.close();
    }
}