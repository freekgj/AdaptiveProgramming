package week3.opdracht2_16;

public class MoneyUtils {
    private static int countMoneyUtilsUsed;

    public static String bedrag(String value, double bedrag) {
        int standaardPrecisie = 2;
        return bedrag(value, bedrag, standaardPrecisie);
    }

    public static String bedrag(String value, double bedrag, int precisie) {
        String returnValue;
        if (value == "EUR") {
            returnValue = "€ ";
        } else if (value == "USD") {
            returnValue = "$ ";
        } else {
            returnValue = "Unknown value ";
        }
        String roundBedrag = String.format("%." + (precisie + 1) + "g%n", bedrag);
        countMoneyUtilsUsed++;
        return returnValue + roundBedrag;
    }

    public static int getCountMoneyUtilsUsed() {
        return countMoneyUtilsUsed;
    }
}

