import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;

public class DateExtract {
    public static void main(String[] args) {
        Mydate date1 = new Mydate();
        Mydate date2 = new Mydate(34355555133101L);
        Mydate date3 = new Mydate(5, 5, 2005);

        System.out.println("Date1: " + date1.getMonth() + " " + date1.getDay() + ", " + date1.getYear());
        System.out.println("Date2: " + date2.getMonth() + " " + date2.getDay() + ", " + date2.getYear());
        System.out.println("Date3: " + date3.getMonth() + " " + date3.getDay() + ", " + date3.getYear());
    }
}

class Mydate {
    long elapsedTime;
    int month;
    int day;
    int year;


    Mydate() {
        // Get current date
        LocalDateTime now = LocalDateTime.now();
        this.month = now.getMonthValue();
        this.day = now.getDayOfMonth();
        this.year = now.getYear();
    }

    Mydate(long elapsedTime) {
        this.elapsedTime = elapsedTime;
        // Convert elapsed time (milliseconds) to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.ofInstant(
            Instant.ofEpochMilli(elapsedTime),
            ZoneId.systemDefault()
        );
        this.month = dateTime.getMonthValue();
        this.day = dateTime.getDayOfMonth();
        this.year = dateTime.getYear();
    }

    public void setDate(long elapsedTime) {
        this.elapsedTime = elapsedTime;
        // Convert elapsed time (milliseconds) to LocalDateTime
        LocalDateTime dateTime = LocalDateTime.ofInstant(
            Instant.ofEpochMilli(elapsedTime),
            ZoneId.systemDefault()
        );
        this.month = dateTime.getMonthValue();
        this.day = dateTime.getDayOfMonth();
        this.year = dateTime.getYear();
    }

    Mydate(int month, int day, int year) {
        this.month = 6;
        this.day = 17;
        this.year = 2011;
    }

    public String getMonth() {
        return Month.of(month).name();
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }
}