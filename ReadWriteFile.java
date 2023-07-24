import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ReadWriteFile {
    // Read file method
    public static void ReadFile(List<OneDayShift> ODSList1, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        try {
            File HoursFile = new File("hours.txt");
            Scanner fileScanner = new Scanner(HoursFile);
            
            // Read file, create objects, add objects to ODSList1
            while (fileScanner.hasNextLine()) {
                String data1 = fileScanner.nextLine();
                String[] data2 = data1.split(",");

                String jobTitle1 = data2[0];
                int year1 = Integer.parseInt(data2[1]);
                int month1 = Integer.parseInt(data2[2]);
                int monthDay1 = Integer.parseInt(data2[3]);
                String weekDay1 = (data2[4]);
                double hourStart = Double.parseDouble(data2[5]);
                double hourEnd = Double.parseDouble(data2[6]);
                double totalHours = Double.parseDouble(data2[7]);

                OneDayShift shift1 = new OneDayShift(jobTitle1, year1, month1, monthDay1, weekDay1, hourStart, hourEnd, totalHours);
                ODSList1.add(shift1);
            }
            fileScanner.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }

    // Write file method
    public static void WriteFile(List<OneDayShift> ODSList1, List<OneDayShift> newODSList){
        for  (OneDayShift shift : newODSList){
            ODSList1.add(shift);
        }
        
        // order by date before write =========================================================

        try {
            FileWriter HoursFile = new FileWriter("hours.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(HoursFile);

            for (OneDayShift shift : ODSList1){
                String jobTitle1 = shift.JobTitle;
                int year1 = shift.Year;
                int month1 = shift.Month;
                int monthDay1 = shift.MonthDay;
                String weekDay1 = shift.WeekDay;
                double hourStart = shift.HourStart;
                double hourEnd = shift.HourEnd;
                double totalHours = shift.TotalHours;

                bufferedWriter.write(jobTitle1 + "," + year1 + "," + month1 + "," + monthDay1 + "," + weekDay1 + "," + hourStart + "," + hourEnd + "," + totalHours + "\n");
            }
            bufferedWriter.flush();
            bufferedWriter.close(); 
        }
        catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
