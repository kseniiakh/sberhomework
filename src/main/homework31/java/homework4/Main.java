package homework4;

public class Main {

    public static void main(String[] args) {

        TimeUnit timeUnit = new TimeUnit(14,28);

        timeUnit.printTimeInFormat24hours();
        timeUnit.printTimeInFormat12hours();
        timeUnit.addTime(4,2,0);
    }
}
