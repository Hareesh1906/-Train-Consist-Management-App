import java.util.Scanner;

public class TrainConsitsMangementApp {

    // Validate Train ID (Example: TR-1234)
    public static boolean isValidTrainID(String trainID) {
        return trainID.matches("TR-\\d{4}");
    }

    // Validate Cargo Code (Example: CG-ABC123)
    public static boolean isValidCargoCode(String cargoCode) {
        return cargoCode.matches("CG-[A-Z]{3}\\d{3}");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Train ID validation
        System.out.print("Enter Train ID (Format TR-1234): ");
        String trainID = sc.nextLine();

        if (isValidTrainID(trainID)) {
            System.out.println("Valid Train ID ✔");
        } else {
            System.out.println("Invalid Train ID ✖");
        }

        // Cargo Code validation
        System.out.print("\nEnter Cargo Code (Format CG-ABC123): ");
        String cargoCode = sc.nextLine();

        if (isValidCargoCode(cargoCode)) {
            System.out.println("Valid Cargo Code ✔");
        } else {
            System.out.println("Invalid Cargo Code ✖");
        }

        sc.close();
    }
}