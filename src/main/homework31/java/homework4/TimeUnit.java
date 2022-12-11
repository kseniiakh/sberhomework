package homework4;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeUnit {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeUnit(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeUnit(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        seconds = 0;
    }

    public TimeUnit(int hours) {
        this.hours = hours;
        minutes = 0;
        seconds = 0;
    }

    public void printTimeInFormat24hours() {

        LocalTime time = LocalTime.of(hours, minutes, seconds);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(formatter));
    }

    public void printTimeInFormat12hours() {
        LocalTime time = LocalTime.of(hours, minutes, seconds);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println(time.format(formatter));
    }

    public void addTime(int h, int m, int s) {
        LocalTime time = LocalTime.of(this.hours, this.minutes, this.seconds).plusHours(h).plusMinutes(m).plusSeconds(s);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(time.format(formatter));
    }
}
