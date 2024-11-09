package Lecture26;

public class BST {
    class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    public BST(int[] arr){
        root = CreateTree(arr, 0, arr.length-1);
    }

    private Node CreateTree(int[] arr, int low, int high){
        if(low>high) return null;
        int mid= (low+high)/2;
        Node nn= new Node();
        nn.val= arr[mid];
        nn.left= CreateTree(arr, low, mid-1);
        nn.right= CreateTree(arr, mid+1, high);
        return nn;
    }

    
    private void display(Node nn){
        if(nn== null) return;
        String output= "";
        output= "<--"+ nn.val+"-->";

        if(nn.left==null)
            output= "Null"+ output;
        else
            output= nn.left.val+ output;

        if(nn.right==null)
            output+= "Null";
        else
            output+= nn.right.val;

        System.out.println(output);
        display(nn.left);
        display(nn.right);
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        BST bst = new BST(arr);
        bst.display(bst.root);
    }
}
