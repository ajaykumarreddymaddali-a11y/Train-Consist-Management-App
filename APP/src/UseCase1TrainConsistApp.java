import java.util.ArrayList;
import java.util.List;

/**
 * UseCase1TrainConsistApp
 *
 * Entry point for the Train Consist Management Application.
 * Initializes the train consist and displays the initial state.
 *
 * @author User
 * @version 1.0
 */
public class UseCase1TrainConsistApp {

    public static void main(String[] args) {
        // Welcome message
        System.out.println("=== Train Consist Management App ===\n");

        // Initialize train consist as an empty list of bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial bogie count
        System.out.println("Initial bogie count: " + trainConsist.size());

        // Program continues
        System.out.println("\nTrain consist initialized and ready for further operations.");
    }
}