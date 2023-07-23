import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Main{
    public static void main(String[] args){
        System.out.println("\n<<< Hours Counter Calculator >>>\n");
        Scanner scanner1 = new Scanner(System.in);
        List<OneDayShift> ODSList1 = new ArrayList<OneDayShift>();
        List<OverMidnightShift> OMSList1 = new ArrayList<OverMidnightShift>();
        List<OverMultipleDaysShift> OMDSList1 = new ArrayList<OverMultipleDaysShift>();
        ReadWrite.ReadFile(ODSList1, OMSList1, OMDSList1);
        MainMenu(scanner1, ODSList1, OMSList1, OMDSList1);
        WriteToFile(ODSList1, newODSList);
        scanner1.close();
    }

    // Main Menu Method
    public static void MainMenu(Scanner scanner1, List<OneDayShift> ODSList1, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        int menuSelection1 = 0;
        int menuLoop1 = 0;
        while (menuLoop1 == 0){
            System.out.println("Main Menu");
            System.out.println("1. New Entry");
            System.out.println("2. View Shifts");
            System.out.println("3. Edit Shift Data");
            System.out.println("4. Test Class");
            System.out.println("0. Exit program");
            System.out.print("Enter selection: ");
            menuSelection1 = scanner1.nextInt();
            System.out.println();
            if (menuSelection1 == 1){
                menuSelection1 = 0;
                NewEntry(scanner1, ODSList1, OMSList1, OMDSList1);
            }
            else if (menuSelection1 == 2){
                menuSelection1 = 0;
                ViewShifts(scanner1, ODSList1, OMSList1, OMDSList1);
            }
            else if (menuSelection1 == 3){
                menuSelection1 = 0;
                // EditEntries(scanner1);
            }
            else if (menuSelection1 == 4){
                menuSelection1 = 0;
                TestClass(scanner1);
            }
            else if (menuSelection1 == 0){
                System.out.println("Exiting program...");
                menuLoop1 = -1;
            }
            else {
                menuSelection1 = 0;
                System.out.println("Please enter a valid input.");
            }
        }
    }

    // New Entry Menu Method
    public static void NewEntry(Scanner scanner1, List<OneDayShift> ODSList1, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        int newEntrySelection = 0;
        int menuLoop2 = 0;
        while (menuLoop2 == 0){
            System.out.println("Does the shift span within one day, over midnight, or over multiple days?");
            System.out.println("1. Within one day");
            System.out.println("2. UNAVAILABLE - Over midnight");
            System.out.println("3. UNAVAILABLE - Over multiple days");
            System.out.println("0. Return to main menu");
            System.out.print("Enter selection: ");
            newEntrySelection = scanner1.nextInt();
            System.out.println();
            if (newEntrySelection == 1) {
                newEntrySelection = 0;
                menuLoop2 = -1;
                WithinOneDay(scanner1);
            }
            else if (newEntrySelection == 2) {
                newEntrySelection = 0;
                System.out.println("Unavailable. Please enter available option.");
                // OverMidnight(scanner1);
            }
            else if (newEntrySelection == 3) {
                newEntrySelection = 0;
                System.out.println("Unavailable. Please enter available option.");
                // OverMultipleDays(scanner1);
            }
            else if (newEntrySelection == 0) {
                newEntrySelection = 0;
                menuLoop2 = -1;
            }
            else {
                newEntrySelection = 0;
                System.out.println("Please enter a valid input.\n");
            }
        }      
    }

    // View Entries Menu Method
    public static void ViewShifts(Scanner scanner1, List<OneDayShift> ODSList1, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        int ViewShiftsSelection = 0;
        int menuLoop3 = 0;
        while (menuLoop3 == 0){
            System.out.println("View Entries Menu");
            System.out.println("1. View all shifts");
            System.out.println("2. UNAVAILABLE - View entry by date");
            System.out.println("0. Return to main menu");
            System.out.print("Enter selection: ");
            ViewShiftsSelection = scanner1.nextInt();
            System.out.println();
            if (ViewShiftsSelection == 1){
                ViewShiftsSelection = 0;
                ViewAllShifts(scanner1, ODSList1, OMSList1, OMDSList1);
            }
            else if (ViewShiftsSelection == 2){
                ViewShiftsSelection = 0;
                ViewEntryByDate(scanner1, ODSList1, OMSList1, OMDSList1);
            }
            else if (ViewShiftsSelection == 0){
                menuLoop3 = -1;
            }
            else {
                ViewShiftsSelection = 0;
                System.out.println("Please enter a valid input.\n");
            }
        }
    }

    // Within One Day Method
    public static List<OneDayShift> newODSList = new ArrayList<OneDayShift>();
    public static void WithinOneDay(Scanner scanner1){
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

        newODSList.add(shift1);

        for (OneDayShift shift : newODSList) {
            System.out.println(shift.toString());
        }
    }

    // Over Midnight Method
    public static void OverMidnight(Scanner scanner1, List<OverMidnightShift> OMSList1){

    }

    // Over Multiple Days Method
    public static void OverMultipleDays(Scanner scanner1, List<OverMultipleDaysShift> OMDSList1){

    }

    // View all entries
    public static void ViewAllShifts(Scanner scanner1, List<OneDayShift> ODSList1, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1) {
        for (OneDayShift shift : ODSList1) {
            System.out.println(shift.toString());
        }
        System.out.println();
    }

    // View entry by date
    public static void ViewEntryByDate(Scanner scanner1, List<OneDayShift> ODSList1, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){

    }

    public static void EditEntries(Scanner scanner1, List<OneDayShift> ODSList1, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){

    }

    // Write to file
    public static void WriteToFile(List<OneDayShift> ODSList1, List<OneDayShift> newODSList) {
        ReadWrite.WriteFile(ODSList1, newODSList);
    }







    // Test Class
    public static void TestClass(Scanner scanner1) {
        
        System.out.println("1. Read File Test");
        System.out.println("2. Write File Test");
        System.out.print("Enter selection: ");
        int testSelection = 0;
        testSelection = scanner1.nextInt();

        if (testSelection == 1){
            TestClass.ReadFileTest(scanner1, newODSList);
        }
        else if (testSelection == 2){
            TestClass.WriteFileTest(scanner1, newODSList);
        }
        else {

        }
    }
}




// Hour Counter Program
// Author: Sergei Mochalov
// Created: 2023-07-15
// Updated: 2023-07-22
