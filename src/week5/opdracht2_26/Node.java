package week5.opdracht2_26;

import java.util.ArrayList;

public class Node{
    private String nodeName;
    private ArrayList<Node> listWithNodes = new ArrayList<>();
    private int diceNumber;
    private ArrayList<String> listWithUsedStates = new ArrayList<>();

    public Node(String nameOfNode){
        listWithNodes.clear();
        nodeName = nameOfNode;
    }

    public void setTransitions(Node transitionNode){
        listWithNodes.add(transitionNode);
    }

    public void setEndNode(int diceNumb){
        diceNumber = diceNumb;
    }

    public void getNext(int pad){
        getNext(pad, listWithUsedStates);
    }

    public void getNext(int pad, ArrayList<String> listWithUsedStates){
        double chooser = Math.random();
        listWithUsedStates.add(nodeName);
        if (!listWithNodes.isEmpty()){

            if (chooser <= 0.5){
                listWithNodes.get(0).getNext(pad, listWithUsedStates);
            } else {
                listWithNodes.get(1).getNext(pad, listWithUsedStates);
            }
        } else {
            System.out.println("pad " + pad + ": " + listWithUsedStates + " uitkomst: s = " + nodeName + " d = " + diceNumber);
        }
    }
}