package week5.opdracht2_25;

import java.util.ArrayList;

public class Node {
    private String nodeName;
    private ArrayList<Node> listWithNodes = new ArrayList<>();
    private int diceNumber;

    public Node(String nameOfNode) {
        listWithNodes.clear();
        nodeName = nameOfNode;
    }

    public void setTransitions(Node transitionNode) {
        listWithNodes.add(transitionNode);
    }

    public void setEndNode(int diceNumb){
        diceNumber = diceNumb;
    }

    public void getNext() {
        double chooser = Math.random();
        if (!listWithNodes.isEmpty()) {
            if (chooser <= 0.5) {
                listWithNodes.get(0).getNext();
            } else {
                listWithNodes.get(1).getNext();
            }
        } else {
            System.out.println(diceNumber);
        }
    }
}