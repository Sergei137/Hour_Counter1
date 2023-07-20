import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class TestClass {
    public static void ReadFileTest(Scanner scanner1){
        try {
            File TestFile1 = new File("testFile.txt");
            Scanner fileScanner = new Scanner(TestFile1);
            
            // Read file
            while (fileScanner.hasNextLine()) {
                String data = fileScanner.nextLine();
                System.out.println(data);
            }
            fileScanner.close();

            
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    public static void writeFileTest(){

    }
}
