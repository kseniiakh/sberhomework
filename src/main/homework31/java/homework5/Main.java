package homework5;

/**
 5. Необходимо реализовать класс DayOfWeek для хранения порядкового номера
 дня недели (byte) и названия дня недели (String).
 Затем в отдельном классе в методе main создать массив объектов DayOfWeek
 длины 7. Заполнить его соответствующими значениями (от 1 Monday до 7
 Sunday) и вывести значения массива объектов DayOfWeek на экран.
 Пример вывода:
 1 Monday
 2 Tuesday
 …
 7 Sunday
 */

public class Main {

    public static void main(String[] args) {

        DayOfWeek[] dayOfWeeks = new DayOfWeek[7];


        for (int i = 0; i < dayOfWeeks.length; i++) {
            dayOfWeeks[i] = new DayOfWeek((byte) (i + 1));
        }

        for (DayOfWeek day : dayOfWeeks) {
            System.out.println(day);
        }

    }
}
