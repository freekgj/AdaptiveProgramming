package week1.opdracht2_3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class exercize2_3 {
    public static void main(String[] args) {
        List<Boolean> trueAndFalse = new LinkedList<Boolean>();
        trueAndFalse.add(true);
        trueAndFalse.add(true);
        trueAndFalse.add(true);
        trueAndFalse.add(true);
        trueAndFalse.add(true);
        trueAndFalse.add(true);
        trueAndFalse.add(false);
        trueAndFalse.add(true);
        trueAndFalse.add(false);
        trueAndFalse.add(false);
        trueAndFalse.add(true);
        trueAndFalse.add(false);
        trueAndFalse.add(false);
        trueAndFalse.add(true);
        trueAndFalse.add(true);
        trueAndFalse.add(false);

        System.out.println(trueFalseCheck(trueAndFalse));
    }

    public static String trueFalseCheck(List<Boolean> listWithTrueFalse) {
        String returnValue = "Het aantal true waarden is groter dan het aantal false waarden, en er zijn niet meer dan 12 false waarden.";
        int countTrue = Collections.frequency(listWithTrueFalse, true);
        int countFalse = Collections.frequency(listWithTrueFalse, false);

        if (countTrue < countFalse && countFalse > 12){
            returnValue = "De lijst voldoet niet (helemaal) aan de volgende eisen: \n" +
                    "- Het aantal true waarden is groter dan het aantal false waarden\n" +
                    "- Er zijn niet meer dan 12 false waarden.";
        }
        return returnValue;
    }
}