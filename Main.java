import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        System.out.println("Hours Counter Calculator");

        Scanner scanner1 = new Scanner(System.in);

        MainMenu(scanner1);

        scanner1.close();        
    }

    // Main Menu Method
    public static void MainMenu(Scanner scanner1){
        
        int input1 = 0;

        System.out.println("Main Menu");
        System.out.println("1. New Entry");
        System.out.println("2. View Entry");
        System.out.println("3. Write to File");
        input1 = scanner1.nextInt();
        
        if (input1 == 1){
            NewEntry(scanner1);
        }
        else if (input1 == 2){
            ViewEntry(scanner1);
        }
        else if (input1 == 3){
            WriteToFile();
        }
        else{
            System.out.println("Please enter a valid input.");
        }

        
    }

    // New Entry Method
    public static void NewEntry(Scanner scanner1){

        int input2 = 0;

        System.out.println("Does the shift span within one day, over midnight, or over multiple days?");
        System.out.println("1. Within one day");
        System.out.println("2. Over midnight");
        System.out.println("3. Over multiple days");
        input2 = scanner1.nextInt();

        if (input2 == 1){
            WithinOneDay(scanner1);
        }
        else if (input2 == 2){
            OverMidnight(scanner1);
        }
        else if (input2 == 3){
            OverMultipleDays(scanner1);
        }
        else{
            System.out.println("Please enter a valid input.");
        }          
    }

    // Within One Day Method
    public static void WithinOneDay(Scanner scanner1){
        int year1 = 0;
        int month1 = 0;
        int monthDay1 = 0;
        int day1 = 0;
        double hourStart = 0;
        double hourEnd = 0;
        double totalEnteredHours = 0;

        System.out.println("Enter current year: ");
        year1 = scanner1.nextInt();
        
        System.out.println("Enter current month (1-12): ");
        month1 = scanner1.nextInt();

        System.out.println("Enter current day of the month: ");
        monthDay1 = scanner1.nextInt();
    
        System.out.println("Enter current day of the week (1-7): ");
        day1 = scanner1.nextInt();

        System.out.println("Use the 24 hour clock format for the time inputs and use the equivalent decimal value for minutes (i.e. 1:30pm = 13.5)");
        System.out.println("Enter starting hour: ");
        hourStart = scanner1.nextDouble();

        System.out.println("Enter the ending hour: ");
        hourEnd = scanner1.nextDouble();
        scanner1.nextLine();

        totalEnteredHours = hourEnd - hourStart;
        System.out.println("Hours entered: " + totalEnteredHours); 
    }

    // Over Midnight Method
    public static void OverMidnight(Scanner scanner1){
        int year1 = 0;
        int year2 = 0;
        int month1 = 0;
        int month2 = 0;
        int monthDay1 = 0;
        int monthDay2 = 0;
        int day1 = 0;
        int day2 = 0;
        double hourStart = 0;
        double hourEnd = 0;
        double totalEnteredHours = 0;

        System.out.println("Enter the starting year: ");
        year1 = scanner1.nextInt();
        System.out.println("Enter the ending year: ");
        year2 = scanner1.nextInt();
        
        System.out.println("Enter the starting month (1-12): ");
        month1 = scanner1.nextInt();
        System.out.println("Enter the ending month (1-12): ");
        month2 = scanner1.nextInt();

        System.out.println("Enter the starting day of the month: ");
        monthDay1 = scanner1.nextInt();
        System.out.println("Enter the ending day of the month: ");
        monthDay2 = scanner1.nextInt();

        System.out.println("Enter the starting day of the week (1-7): ");
        day1 = scanner1.nextInt();
        System.out.println("Enter the ending day of the week (1-7): ");
        day2 = scanner1.nextInt();

        System.out.println("Use the 24 hour clock format for the time inputs and use the equivalent decimal value for minutes (i.e. 1:30pm = 13.5)");
        System.out.println("Enter the starting hour: ");
        hourStart = scanner1.nextDouble();

        System.out.println("Enter the ending hour: ");
        hourEnd = scanner1.nextDouble();
        scanner1.nextLine();

        totalEnteredHours = (hourEnd - hourStart) + 24;
        System.out.println("Hours entered: " + totalEnteredHours); 
    }

    // Over Multiple Days Method
    public static void OverMultipleDays(Scanner scanner1){
        int year1 = 0;
        int year2 = 0;
        int month1 = 0;
        int month2 = 0;
        int monthDay1 = 0;
        int monthDay2 = 0;
        int day1 = 0;
        int day2 = 0;
        double hourStart = 0;
        double hourEnd = 0;
        double totalEnteredHours = 0;

        System.out.println("Enter the starting year: ");
        year1 = scanner1.nextInt();
        System.out.println("Enter the ending year: ");
        year2 = scanner1.nextInt();
        
        System.out.println("Enter the starting month (1-12): ");
        month1 = scanner1.nextInt();
        System.out.println("Enter the ending month (1-12): ");
        month2 = scanner1.nextInt();

        System.out.println("Enter the starting day of the month: ");
        monthDay1 = scanner1.nextInt();
        System.out.println("Enter the ending day of the month: ");
        monthDay2 = scanner1.nextInt();

        System.out.println("Enter the starting day of the week (1-7): ");
        day1 = scanner1.nextInt();
        System.out.println("Enter the ending day of the week (1-7): ");
        day2 = scanner1.nextInt();

        System.out.println("Use the 24 hour clock format for the time inputs and use the equivalent decimal value for minutes (i.e. 1:30pm = 13.5)");
        System.out.println("Enter the starting hour: ");
        hourStart = scanner1.nextDouble();

        System.out.println("Enter the ending hour: ");
        hourEnd = scanner1.nextDouble();
        scanner1.nextLine();


    }




    // View entry by date
    public static void ViewEntry(Scanner scanner1){

    

    }

    // Write to file
    public static void WriteToFile(){
        
    }

}




// Hour Counter Program
// Author: Sergei Mochalov
// Created: 2023-07-15
// Updated: 2023-07-16
