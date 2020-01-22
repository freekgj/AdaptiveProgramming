package week1.opdracht2_6;

import java.util.Scanner;

public class exercize2_6 {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args){
        int n_rabbits = Integer.parseInt(reader.next());
        System.out.println(ears(n_rabbits));
    }

    private static int ears(int rabbits){
        if (rabbits <= 1) {
            return rabbits * 2;
        } else {
                return 2 + ears(rabbits - 1);
            }
    }
}