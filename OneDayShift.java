
public class OneDayShift {
    String JobTitle;
    int Year;
    int Month;
    int MonthDay;
    String WeekDay;
    double HourStart;
    double HourEnd;
    double TotalHours;

    public OneDayShift(String jobTitle, int year, int month, int monthDay, String weekDay, double hourStart, double hourEnd, double totalHours){
        this.JobTitle = jobTitle;
        this.Year = year;
        this.Month = month;
        this.MonthDay = monthDay;
        this.WeekDay = weekDay;
        this.HourStart = hourStart;
        this.HourEnd = hourEnd;
        this.TotalHours = totalHours;
    }

    @Override
    public String toString(){
        return "Job Title: " + JobTitle + " Year: " + Year + " Month: " + Month + " Month Day: " + MonthDay + " Day: " + WeekDay + " Starting Hour: " + HourStart + " Ending Hour: " + HourEnd + " Total Shift Hours: " + TotalHours;
    }
}






