import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class OneDayShift {
    int year;
    int month;
    int monthDay;
    int day;
    double hourStart;
    double hourEnd;
    double totalEnteredHours;

    public OneDayShift(int year, int month, int monthDay, int day, double hourStart, double hourEnd, double totalEnteredHours){
        this.year = year;
        this.month = month;
        this.monthDay = monthDay;
        this.day = day;
        this.hourStart = hourStart;
        this.hourEnd = hourEnd;
        this.totalEnteredHours = totalEnteredHours;
    }

    @Override
    public String toString(){
        return "Year: " + year + " Month: " + month + " Month Day: " + monthDay + " Day: " + day + " Hour Start: " + hourStart + " Hour End: " + hourEnd + " Total Entered Hours: " + totalEnteredHours;
    }
}






