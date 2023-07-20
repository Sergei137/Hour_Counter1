import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        System.out.println("\n<<< Hours Counter Calculator >>>");
        Scanner scanner1 = new Scanner(System.in);
        MainMenu(scanner1);
        scanner1.close();
    }

    // Main Menu Method
    public static void MainMenu(Scanner scanner1){
        int menuSelection1 = 0;
        int menuLoop1 = 0;
        while (menuLoop1 == 0){
            System.out.println("\nMain Menu");
            System.out.println("1. New Entry");
            System.out.println("2. View Entry");
            System.out.println("3. Write to File");
            System.out.println("4. Test Class");
            System.out.println("0. Exit program");
            System.out.print("Enter selection: ");
            menuSelection1 = scanner1.nextInt();
            System.out.println();
            
            if (menuSelection1 == 1){
                menuSelection1 = 0;
                NewEntry(scanner1);
            }
            else if (menuSelection1 == 2){
                menuSelection1 = 0;
                ViewEntry(scanner1);
            }
            else if (menuSelection1 == 3){
                menuSelection1 = 0;
                WriteToFile();
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

    // New Entry Method
    public static void NewEntry(Scanner scanner1){
        int newEntrySelection = 0;

        System.out.println("Does the shift span within one day, over midnight, or over multiple days?");
        System.out.println("1. Within one day");
        System.out.println("2. Over midnight");
        System.out.println("3. Over multiple days");
        System.out.print("Enter selection: ");
        newEntrySelection = scanner1.nextInt();

        if (newEntrySelection == 1) {
            WithinOneDay(scanner1);
        }
        else if (newEntrySelection == 2) {
            OverMidnight(scanner1);
        }
        else if (newEntrySelection == 3) {
            OverMultipleDays(scanner1);
        }
        else {
            System.out.println("Please enter a valid input.");
        }          
    }

    // Within One Day Method
    public static List<OneDayShift> shiftList1 = new ArrayList<OneDayShift>();
    public static void WithinOneDay(Scanner scanner1){
        
        int year1 = 0;
        int month1 = 0;
        int monthDay1 = 0;
        int day1 = 0;
        double hourStart = 0;
        double hourEnd = 0;
        double totalEnteredHours = 0;

        System.out.print("\nEnter current year: ");
        year1 = scanner1.nextInt();
        
        System.out.print("Enter current month (1-12): ");
        month1 = scanner1.nextInt();

        System.out.print("Enter current day of the month: ");
        monthDay1 = scanner1.nextInt();
    
        System.out.print("Enter current day of the week (1-7): ");
        day1 = scanner1.nextInt();

        System.out.println("Use the 24 hour clock format for the time inputs and use the equivalent decimal value for minutes (i.e. 1:30pm = 13.5)");
        System.out.print("Enter starting hour: ");
        hourStart = scanner1.nextDouble();

        System.out.print("Enter the ending hour: ");
        hourEnd = scanner1.nextDouble();

        totalEnteredHours = hourEnd - hourStart;
        System.out.println("\nHours entered: " + totalEnteredHours); 

        OneDayShift shift1 = new OneDayShift(year1, month1, monthDay1, day1, hourStart, hourEnd, totalEnteredHours);

        shiftList1.add(shift1);

        for (OneDayShift shift : shiftList1) {
            System.out.println(shift.toString());
        }

        
    }

    // Over Midnight Method
    public static void OverMidnight(Scanner scanner1){

    }

    // Over Multiple Days Method
    public static void OverMultipleDays(Scanner scanner1){

    }

    // View entry by date
    public static void ViewEntry(Scanner scanner1) {
    }

    // Write to file
    public static void WriteToFile() {
        
    }

    // Test Class
    public static void TestClass(Scanner scanner1) {
        int testSelection = 0;
        if (testSelection == 1){
            TestClass.ReadFileTest(scanner1);
        } else if (testSelection == 2){
            
        } else {

        }
    }

}




// Hour Counter Program
// Author: Sergei Mochalov
// Created: 2023-07-15
// Updated: 2023-07-19
