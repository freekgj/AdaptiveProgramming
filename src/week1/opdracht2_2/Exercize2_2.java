package week1.opdracht2_2;

import java.util.Scanner;

public class Exercize2_2 {
    public static void main(String[] args) {
        int index = 0;
        Scanner reader = new Scanner(System.in);
        System.out.print("vul prefix in: ");
        String prefix = reader.next();
        System.out.print("vul het woord in: ");
        String word = reader.next();
        reader.close();
        String returnValue = prefix + " is een prefix van " + word;

        for (char letter : prefix.toCharArray()) {
            if (letter == word.charAt(index) & prefix.length() < word.length()){
                index++;
            } else {
                returnValue = (prefix + " is geen prefix van " + word);
                break;
            }
        }
        System.out.println(returnValue);
    }
}