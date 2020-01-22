package week5.opdracht2_24_her;

public class Main {
    public static void main(String [] args){
        Node S0 = new Node("S0");
        Node S1 = new Node("S1");
        Node S2 = new Node("S2");
        Node S3 = new Node("S3");

        S0.setTransitions("A", S2);
        S0.setTransitions("B", S1);
        S1.setTransitions("A", S1);
        S1.setTransitions("B", S2);
        S2.setTransitions("B", S3);
        S3.setTransitions("A", S3);
        S3.setTransitions("B", S0);

        S0.getNext("BAABBBA");
        S0.getNext("ABBBBAA");
    }
}