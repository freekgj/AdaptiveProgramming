package week5.opdracht2_25;

public class Main {
    public static void main(String [] args) {
        Node S0 = new Node("S0");
        Node S1 = new Node("S1");
        Node S2 = new Node("S2");
        Node S3 = new Node("S3");
        Node S4 = new Node("S4");
        Node S5 = new Node("S5");
        Node S6 = new Node("S6");
        Node S7 = new Node("S7");
        Node S8 = new Node("S8");
        Node S9 = new Node("S9");
        Node S10 = new Node("S10");
        Node S11 = new Node("S11");
        Node S12 = new Node("S12");

        S0.setTransitions(S1);
        S0.setTransitions(S2);
        S1.setTransitions(S3);
        S1.setTransitions(S4);
        S2.setTransitions(S5);
        S2.setTransitions(S6);
        S3.setTransitions(S1);
        S3.setTransitions(S7);
        S4.setTransitions(S8);
        S4.setTransitions(S9);
        S5.setTransitions(S10);
        S5.setTransitions(S11);
        S6.setTransitions(S12);
        S6.setTransitions(S2);

        S7.setEndNode(1);
        S8.setEndNode(2);
        S9.setEndNode(3);
        S10.setEndNode(4);
        S11.setEndNode(5);
        S12.setEndNode(6);

        S0.getNext();
    }
}