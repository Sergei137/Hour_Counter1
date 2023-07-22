import java.util.List;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class TestClass {
    public static void ReadFileTest(Scanner scanner1, List<OneDayShift> shiftList1){
        try {
            File TestFile1 = new File("testFile.txt");
            Scanner fileScanner = new Scanner(TestFile1);
            
            // Read file, create objects, add objects to shiftList1
            while (fileScanner.hasNextLine()) {
                String data1 = fileScanner.nextLine();
                String[] data2 = data1.split(",");

                int year1 = Integer.parseInt(data2[0]);
                int month1 = Integer.parseInt(data2[1]);
                int monthDay1 = Integer.parseInt(data2[2]);
                int day1 = Integer.parseInt(data2[3]);
                double hourStart = Double.parseDouble(data2[4]);
                double hourEnd = Double.parseDouble(data2[5]);
                double totalEnteredHours = Double.parseDouble(data2[6]);

                OneDayShift shift1 = new OneDayShift(year1, month1, monthDay1, day1, hourStart, hourEnd, totalEnteredHours);
                shiftList1.add(shift1);

                System.out.println(data1);
            }
            
            fileScanner.close();

            
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }



    public static void WriteFileTest(Scanner scanner1, List<OneDayShift> shiftList1){

        for (OneDayShift shift : shiftList1){
            System.out.println(shift);


        }

        try {
            FileWriter testFile1 = new FileWriter("testFile.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(testFile1);

            for (OneDayShift shift : shiftList1){
                int year1 = shift.year;
                int month1 = shift.month;
                int monthDay1 = shift.monthDay;
                int day1 = shift.day;
                double hourStart = shift.hourStart;
                double hourEnd = shift.hourEnd;
                double totalEnteredHours = shift.totalEnteredHours;

                bufferedWriter.write(year1 + "," + month1 + "," + monthDay1 + "," + day1 + "," + hourStart + "," + hourEnd + "," + totalEnteredHours + "\n");

            }
            bufferedWriter.flush();
            bufferedWriter.close();

            
        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
