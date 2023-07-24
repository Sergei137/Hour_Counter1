import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main{
    // Start of program
    public static void main(String[] args){
        System.out.println("\n<<< Hours Counter Calculator >>>\n");
        Scanner scanner1 = new Scanner(System.in);
        List<OneDayShift> ODSList1 = new ArrayList<OneDayShift>();
        List<OneDayShift> newODSList = new ArrayList<OneDayShift>();
        List<OverMidnightShift> OMSList1 = new ArrayList<OverMidnightShift>();
        // need to create newOMSList here
        List<OverMultipleDaysShift> OMDSList1 = new ArrayList<OverMultipleDaysShift>();
        // need to create newOMDSList here
        ReadWriteFile.ReadFile(ODSList1, OMSList1, OMDSList1);
        MainMenu(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
        ReadWriteFile.WriteFile(ODSList1, newODSList);
        scanner1.close();
    }

    // Main Menu method
    public static void MainMenu(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList ,List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        int menuSelection1 = 0;
        int menuLoop1 = 0;
        while (menuLoop1 == 0){
            System.out.println("Main Menu");
            System.out.println("1. New Entry");
            System.out.println("2. View Shifts");
            System.out.println("3. Edit Shift Data");
            System.out.println("4. Delete Shift");
            System.out.println("5. UNAVAILABLE - Test Class");
            System.out.println("0. Exit program");
            System.out.print("Enter selection: ");
            menuSelection1 = scanner1.nextInt();
            System.out.println();
            if (menuSelection1 == 1){
                menuSelection1 = 0;
                NewEntry(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
            }
            else if (menuSelection1 == 2){
                menuSelection1 = 0;
                ViewShifts(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
            }
            else if (menuSelection1 == 3){
                menuSelection1 = 0;
                ShiftManager.EditShift(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
            }
            else if (menuSelection1 == 4){
                menuSelection1 = 0;
                ShiftManager.DeleteShift(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
            }
            else if (menuSelection1 == 5){
                menuSelection1 = 0;
                // TestClass(scanner1);
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

    // New Entry Menu method
    public static void NewEntry(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
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
                ShiftManager.WithinOneDay(scanner1, newODSList);
            }
            else if (newEntrySelection == 2) {
                newEntrySelection = 0;
                System.out.println("Unavailable. Please enter available option.");
                // ShiftManager.OverMidnight(scanner1, OMSList1);
            }
            else if (newEntrySelection == 3) {
                newEntrySelection = 0;
                System.out.println("Unavailable. Please enter available option.");
                // ShiftManager.OverMultipleDays(scanner1, OMDSList1);
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

    // View Shifts Menu method
    public static void ViewShifts(Scanner scanner1, List<OneDayShift> ODSList1, List<OneDayShift> newODSList, List<OverMidnightShift> OMSList1, List<OverMultipleDaysShift> OMDSList1){
        int ViewShiftsSelection = 0;
        int menuLoop3 = 0;
        while (menuLoop3 == 0){
            System.out.println("View Entries Menu");
            System.out.println("1. View all shifts");
            System.out.println("2. View shift by date");
            System.out.println("0. Return to main menu");
            System.out.print("Enter selection: ");
            ViewShiftsSelection = scanner1.nextInt();
            System.out.println();
            if (ViewShiftsSelection == 1){
                ViewShiftsSelection = 0;
                ShiftManager.ViewAllShifts(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
            }
            else if (ViewShiftsSelection == 2){
                ViewShiftsSelection = 0;
                ShiftManager.ViewShiftByDate(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
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

    // Test Class
    // public static void TestClass(Scanner scanner1) {
        
    //     System.out.println("1. Read File Test");
    //     System.out.println("2. Write File Test");
    //     System.out.print("Enter selection: ");
    //     int testSelection = 0;
    //     testSelection = scanner1.nextInt();

    //     if (testSelection == 1){
    //         TestClass.ReadFileTest(scanner1, newODSList);
    //     }
    //     else if (testSelection == 2){
    //         TestClass.WriteFileTest(scanner1, newODSList);
    //     }
    //     else {

    //     }
    // }
}




// Hour Counter Program
// Author: Sergei Mochalov
// Created: 2023-07-15
// Updated: 2023-07-23
