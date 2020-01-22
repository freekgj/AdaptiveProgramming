package week1.opdracht2_5;

import java.util.ArrayList;

public class exercize2_5 {
    public static void main (String [] args){
        for(int element : fibonacci(10)){
            System.out.println(element);
        }
    }
    public static ArrayList<Integer> fibonacci (Integer grenswaarde){
        ArrayList<Integer> listOfFibonacci = new ArrayList<>();
        int temp1 = 0;
        int temp2 = 1;
        listOfFibonacci.add(temp1);
        listOfFibonacci.add(temp2);
        for (int counter=0; counter < grenswaarde; counter++){
            int value = temp1 + temp2;
            temp1 = temp2;
            temp2 = value;
            listOfFibonacci.add(value);
        }
        return listOfFibonacci;
    }

}
