package homework8;

public class Atm {
    private double dollarBuy;
    private double dollarsSell;
    private static int countInstance = 0;

    public Atm(double dollarBuy, double dollarsSell) {
        if (dollarBuy > 0 && dollarsSell > 0) {
            this.dollarBuy = dollarBuy;
            this.dollarsSell = dollarsSell;
        } else {
            System.out.println("Введите значения больше нуля");
        }
        countInstance++;
    }

    public static int getCountInstance() {
        return countInstance;
    }

    public double converseRoublesInDollars(double roubles) {
        if (roubles > 0 && dollarsSell > 0) {
            return (int) ((roubles / dollarsSell) * 100) / 100.0;
        } else {
            return -1.0;
        }
    }

    public double converseDollarsInRoubles(double dollars) {
        if (dollars > 0 && dollarBuy > 0) {
            return (int) ((dollars * dollarBuy) * 100) / 100.0;
        } else {
            return -1.0;
        }
    }
}
