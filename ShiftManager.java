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
        int year1 = 0;
        int month1 = 0;
        int monthDay1 = 0;
        boolean shiftFound = false;

        System.out.print("Enter the year of the shift: ");
        year1 = scanner1.nextInt();
        System.out.print("Enter the month of the shift (1-12): ");
        month1 = scanner1.nextInt();
        System.out.print("Enter the day of the month of the shift: ");
        monthDay1 = scanner1.nextInt();

        for (OneDayShift shift : ODSList1) {
            if (shift.year == year1 && shift.month == month1 && shift.monthDay == monthDay1) {
                System.out.println("\n" + shift.toString() + "\n");
                shiftFound = true;
            }
        }
        if (shiftFound == false) {
            System.out.println("\nNo shift found for that date.\n");
        }
    }

    // Edit Shift
    public static void EditShift(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        int year1 = 0;
        int month1 = 0;
        int monthDay1 = 0;
        int day1 = 0;
        double hourStart1 = 0;
        double hourEnd1 = 0;
        double totalEnteredHours1 = 0;
        OneDayShift selectedShift = null;
        boolean shiftFound = false;

        System.out.print("Enter the year of the shift: ");
        year1 = scanner1.nextInt();
        System.out.print("Enter the month of the shift (1-12): ");
        month1 = scanner1.nextInt();
        System.out.print("Enter the day of the month of the shift: ");
        monthDay1 = scanner1.nextInt();

        for (OneDayShift shift : ODSList1) {
            if (shift.year == year1 && shift.month == month1 && shift.monthDay == monthDay1) {
                selectedShift = shift;
                System.out.println(shift.toString());

                System.out.println("Enter new year or 0 to keep current year: ");
                year1 = scanner1.nextInt();
                if (year1 != 0) {
                    selectedShift.year = year1;
                }

                System.out.println("Enter new month or 0 to keep current month: ");
                month1 = scanner1.nextInt();
                if (month1 != 0) {
                    selectedShift.month = month1;
                }

                System.out.println("Enter new day of the month or 0 to keep current month day: ");
                monthDay1 = scanner1.nextInt();
                if (monthDay1 != 0) {
                    selectedShift.monthDay = monthDay1;
                }

                System.out.println("Enter new day or 0 to keep current day: ");
                day1 = scanner1.nextInt();
                if (day1 != 0) {
                    selectedShift.day = day1;
                }

                System.out.println("Enter new starting hour or -1 to keep current starting hour: ");
                hourStart1 = scanner1.nextDouble();
                if (hourStart1 != -1) {
                    selectedShift.hourStart = hourStart1;
                }

                System.out.println("Enter new ending hour or -1 to keep current ending hour: ");
                hourEnd1 = scanner1.nextDouble();
                if (hourEnd1 != -1) {
                    selectedShift.hourEnd = hourEnd1;
                }
                totalEnteredHours1 = hourEnd1 - hourStart1;
                
                System.out.println();
                OneDayShift newShift = new OneDayShift(year1, month1, monthDay1, day1, hourStart1, hourEnd1, totalEnteredHours1);
                System.out.println("\n" + newShift.toString() + "\n");
                shift = newShift;
                shiftFound = true;
            }
        }
        if (shiftFound == false) {
            System.out.println("\nNo shift found for that date.\n");
        }
    }

    // Select shift to delete
    public static void DeleteShift(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        int year1 = 0;
        int month1 = 0;
        int monthDay1 = 0;
        OneDayShift selectedShift = null;
        boolean shiftFound = false;

        System.out.print("Enter the year of the shift: ");
        year1 = scanner1.nextInt();
        System.out.print("Enter the month of the shift (1-12): ");
        month1 = scanner1.nextInt();
        System.out.print("Enter the day of the month of the shift: ");
        monthDay1 = scanner1.nextInt();

        for (OneDayShift shift : ODSList1) {
            if (shift.year == year1 && shift.month == month1 && shift.monthDay == monthDay1) {
                selectedShift = shift;
                System.out.println("\n" + shift.toString());
                shiftFound = true;
            }
        }
        if (shiftFound == false) {
            System.out.println("\nNo shift found for that date.\n");
        }
        else if (shiftFound == true) {
            ConfirmDeleteShift(selectedShift, scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
        }
    }

    // Confirm delete shift
    public static void ConfirmDeleteShift(OneDayShift selectedShift, Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        String deleteShift = null;

        System.out.print("\nAre you sure you want to delete this shift? (y/n): ");
        deleteShift = scanner1.next();
        if (deleteShift.equals("y")) {
            ODSList1.remove(selectedShift);
            System.out.println("\nShift deleted.\n");
        }
        else {
            System.out.println("\nShift not deleted.\n");
        }
    }
}
