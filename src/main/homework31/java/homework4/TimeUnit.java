package homework4;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 4. Необходимо реализовать класс TimeUnit с функционалом, описанным ниже
 * (необходимые поля продумать самостоятельно). Обязательно должны быть
 * реализованы валидации на входные параметры.
 * Конструкторы:
 * ● Возможность создать TimeUnit, задав часы, минуты и секунды.
 * ● Возможность создать TimeUnit, задав часы и минуты. Секунды тогда
 * должны проставиться нулевыми.
 * ● Возможность создать TimeUnit, задав часы. Минуты и секунды тогда
 * должны проставиться нулевыми.
 * Публичные методы:
 * ● Вывести на экран установленное в классе время в формате hh:mm:ss
 * ● Вывести на экран установленное в классе время в 12-часовом формате
 * (используя hh:mm:ss am/pm)
 * ● Метод, который прибавляет переданное время к установленному в
 * TimeUnit (на вход передаются только часы, минуты и секунды).
 */


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
