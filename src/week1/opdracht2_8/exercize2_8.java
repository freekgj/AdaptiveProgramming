package week1.opdracht2_8;

import java.util.Scanner;

public class exercize2_8 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hoe groot? ");
        int groottePiramide = reader.nextInt();

        piramide(groottePiramide);
        }

    public static void piramide(int sizePiramide){
        String astrix = "*";
        String spacebar = " ";
        int counterMin = sizePiramide;
        int counterMin2 = sizePiramide;

        for(int counterPlus = 0; counterPlus < sizePiramide + 1; counterPlus ++){
            System.out.println(buildString(spacebar, counterMin) + buildString(astrix, counterPlus).toString());
            counterMin --;
        }
        for (int counterPlus2 = 0; counterPlus2 < sizePiramide + 1; counterPlus2 ++){
            System.out.println(buildString(spacebar, counterPlus2+1)+ buildString(astrix, counterMin2-1).toString());
            counterMin2 --;
        }
    }

    public static StringBuilder buildString(String character, int howManyChar){
        StringBuilder sb = new StringBuilder();
        for(int counter = 0; counter < howManyChar; counter++)
            sb.append(character);
        return sb;
    }
}
