import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ShiftManager {
    public static void WithinOneDay(Scanner scanner1, List<OneDayShift> newODSList){
        int year1 = 0;
        int month1 = 0;
        int monthDay1 = 0;
        int day1 = 0;
        double hourStart1 = 0;
        double hourEnd1 = 0;
        double totalEnteredHours1 = 0;

        System.out.print("Enter current year: ");
        year1 = scanner1.nextInt();
        System.out.print("Enter current month (1-12): ");
        month1 = scanner1.nextInt();
        System.out.print("Enter current day of the month: ");
        monthDay1 = scanner1.nextInt();
        System.out.print("Enter current day of the week (1-7): ");
        day1 = scanner1.nextInt();
        System.out.println("Use the 24 hour clock format for the time inputs and use the equivalent decimal value for minutes (i.e. 1:30pm = 13.5)");
        System.out.print("Enter starting hour: ");
        hourStart1 = scanner1.nextDouble();
        System.out.print("Enter the ending hour: ");
        hourEnd1 = scanner1.nextDouble();
        totalEnteredHours1 = hourEnd1 - hourStart1;
        System.out.println("\nHours entered: " + totalEnteredHours1); 

        OneDayShift shift1 = new OneDayShift(year1, month1, monthDay1, day1, hourStart1, hourEnd1, totalEnteredHours1);
        System.out.println(shift1.toString());
        newODSList.add(shift1);
        // order by date 
    }

    // Over Midnight Method
    public static void OverMidnight(Scanner scanner1, List<OverMidnightShift> OMSList1){
    }

    // Over Multiple Days Method
    public static void OverMultipleDays(Scanner scanner1, List<OverMultipleDaysShift> OMDSList1){

    }

    // View all entries
    public static void ViewAllShifts(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1) {
        System.out.println("Current Entries:");
        for (OneDayShift shift : ODSList1) {
            System.out.println(shift.toString());
        }
        System.out.println("\nNew Entries:");
        for (OneDayShift shift : newODSList) {
            System.out.println(shift.toString());
        }
        System.out.println();
    }

    // View entry by date
    public static void ViewShiftByDate(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){

    }

    // Edit Shifts
    public static void EditShifts(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){

    }

}
