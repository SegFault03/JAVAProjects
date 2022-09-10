package JAVAAssignments.Assignments.Assignment2.Q6;

public class Date {
    int month, day, year;
    Date(int m, int d, int y)
    {
        month=m;
        day=d;
        year=y;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void displayDate()
    {
        System.out.print(day+"/"+month+"/"+year+"\n");
    }
}
