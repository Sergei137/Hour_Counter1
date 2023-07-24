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
        Menus.MainMenu(scanner1, ODSList1, newODSList, OMSList1, OMDSList1);
        ReadWriteFile.WriteFile(ODSList1, newODSList);
        scanner1.close();
    }
}




// Hour Counter Program
// Author: Sergei Mochalov
// Created: 2023-07-15
// Updated: 2023-07-23
