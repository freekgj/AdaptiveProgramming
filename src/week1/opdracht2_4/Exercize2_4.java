package week1.opdracht2_4;

import java.util.Scanner;

public class Exercize2_4 {
    public static void main (String [] args){
        Scanner reader = new Scanner(System.in);
        int squareSize = reader.nextInt();

        for (int counterVertical=1; counterVertical <= squareSize; counterVertical++){
            System.out.println("");
            for (int counterHorizontal=1; counterHorizontal <= squareSize; counterHorizontal++) {
                System.out.print("*");
            }
        }
    }
}