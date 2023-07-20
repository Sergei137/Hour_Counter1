import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class TestClass {
    public static void readFileTest(Scanner scanner1) {
        try {
            File TestFile1 = new File("testFile.txt");
            Scanner fileScanner = new Scanner(TestFile1);
            
            // Read file
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
            fileScanner.close();

            // Proceed check. Probably a better way to do it/not needed.
            System.out.println("\nType and enter any character to proceed");
            var proceed = scanner1.nextLine();
            if (proceed != null) {
                System.out.println("Proceeding...");
            }
            else {
                System.out.println("Error: Invalid input. Proceeding anyways...");
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
