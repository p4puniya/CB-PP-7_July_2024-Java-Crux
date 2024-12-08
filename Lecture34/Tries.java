package Lecture34;

import java.util.HashMap;

public class Tries {
    class Node{
        char val;
        boolean isTerminal;
        HashMap<Character, Node> child= new HashMap<>();
    }

    private Node root;

    public Tries(){
        Node nn = new Node();
        nn.val= '*';
        root= nn;
    }

    public void insert(String word){
        Node curr= root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch)){
                //move to this child node
                curr= curr.child.get(ch);
            }else{
                //create a new node ans add it to the map
                Node nn= new Node();
                nn.val= ch;
                curr.child.put(ch, nn);
                curr= nn;
            }
        }
        curr.isTerminal= true;
    }

    public boolean search(String word){
        Node curr= root;
        for(int i=0;i<word.length();i++){
            char ch= word.charAt(i);
            if(curr.child.containsKey(ch))
                curr= curr.child.get(ch);
            else
                return false;
        }
        return curr.isTerminal;
    }
}
