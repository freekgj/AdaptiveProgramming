package week3.opdracht2_16;

public class Main {
    public static void main(String [] args){
        System.out.print(MoneyUtils.bedrag("EUR", 3.1431592));
        System.out.println(MoneyUtils.bedrag("USD", 3.1431592, 1));
        System.out.println("Deze methode is " + MoneyUtils.getCountMoneyUtilsUsed() + " keer gebruikt");
    }
}
