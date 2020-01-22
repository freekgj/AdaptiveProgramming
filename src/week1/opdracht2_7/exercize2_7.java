package week1.opdracht2_7;

public class exercize2_7 {
   public static int counter;
    public static void main(String[] args) {
        int variableA = 900;
        int variableB = 280;

        findGCD(variableA, variableB);
    }

    private static int findGCD(int a, int b) {

        if (a == b) {
            System.out.println("de code wordt " + counter + " keer uitgevoerd");
            return a;
        } else if (a > b) {
            counter++;
            return findGCD(a - b, b);
        } else {
            counter++;
            return findGCD(a, b - a);

        }
    }
}
