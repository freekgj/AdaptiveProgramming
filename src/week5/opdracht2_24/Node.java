package week5.opdracht2_24_her;

import java.util.ArrayList;
import java.util.HashMap;

public class Node {
    private String nodeName;
    private HashMap<String, Node> transitions = new HashMap<>();
    private ArrayList<String> listWithUsedStates = new ArrayList<>();

    public Node(String nameOfNode){
        listWithUsedStates.clear();
        nodeName = nameOfNode;
    }

    public void setTransitions(String value, Node transitionNode){
        transitions.put(value, transitionNode);
    }

    public void getNext(String input){
        getNext(input, listWithUsedStates);
    }

    public void getNext(String input, ArrayList<String> listWithUsedStates) {
        listWithUsedStates.add(nodeName);
        if(!input.equals("")){
            String transition = input.substring(0, 1);
            String nextInput = input.substring(1);
            if (transitions.containsKey(transition)) {
                transitions.get(transition).getNext(nextInput, listWithUsedStates);
            } else {
                listWithUsedStates.add("X");
                System.out.println(listWithUsedStates);
                listWithUsedStates.clear();
            }
        } else {
            System.out.println(listWithUsedStates);
            listWithUsedStates.clear();
        }
    }
}