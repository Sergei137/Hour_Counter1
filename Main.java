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
        input1 = scanner1.nextInt();
        
       
        
        if (input1 == 1){
            NewEntry(scanner1);
        }

        
    }

    // New Entry Method
    public static void NewEntry(Scanner scanner1){

        int year1 = 0;
        String month1 = "";
        int monthDay1 = 0;
        String day1 = "";
        int totalHours = 0;
        int hourStart = 0;
        int hourEnd = 0;

        System.out.print("Enter current year: ");
        year1 = scanner1.nextInt();
        System.out.println("Enter current month: ");
        month1 = scanner1.nextLine();
        System.out.println("Enter current day of the month: ");
        monthDay1 = scanner1.nextInt();
        System.out.println("Enter current day of the week: ");
        day1 = scanner1.nextLine();
        System.out.println("Enter starting hour: ");
        hourStart = scanner1.nextInt();
        System.out.println("Enter the ending hour: ");




        

        System.out.println("Hours entered: ");
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
// Updated: 2023-07-15
