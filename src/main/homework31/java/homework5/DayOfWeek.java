package homework5;

public class DayOfWeek {

    private byte serialNumberDay;
    private String dayOfWeek;

    public DayOfWeek(byte serialNumberDay) {
        this.serialNumberDay = serialNumberDay;

        switch (serialNumberDay) {
            case 1 -> dayOfWeek = "Monday";
            case 2 -> dayOfWeek = "Tuesday";
            case 3 -> dayOfWeek = "Wednesday";
            case 4 -> dayOfWeek = "Thursday";
            case 5 -> dayOfWeek = "Friday";
            case 6 -> dayOfWeek = "Saturday";
            case 7 -> dayOfWeek = "Sunday";
            default -> throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return serialNumberDay + " " + dayOfWeek;
    }
}
