package Lecture25;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTrees {
    public class  Node {
        int val;
        Node left;
        Node right;
    }

    Node root;
    Scanner sc= new Scanner(System.in);

    public BinaryTrees(){
        root = createTree();
    }

    public Node createTree(){
        System.out.println("Value: ");
        int item= sc.nextInt();
        Node nn= new Node();
        nn.val= item;

        System.out.println("Has Left?");
        boolean hlc= sc.nextBoolean();
        if(hlc)
            nn.left= createTree();
        System.out.println("Has Right?");
        boolean hrc= sc.nextBoolean();
        if(hrc)
            nn.right= createTree();
        return nn;
    }

    public void Display(){
        display(root);
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

    public int findMax(Node root){
        if(root==null) return -1;

        return Math.max(
            root.val,
            Math.max(findMax(root.left), findMax(root.right))
        );
    }

    public boolean find(Node root, int item){
        if(root==null) return false;
        if(root.val== item) return true;
        boolean left= find(root.left, item);
        boolean right= find(root.right, item);
        return (left||right);
    }

    public int height(Node root){
        if(root==null) return 0;

        int leftH= height(root.left);
        int rightH= height(root.right);

        return Math.max(leftH, rightH)+1;
    }

    public void infix(Node root){
        if(root==null) return;

        infix(root.left);
        System.out.print( root.val+" ");
        infix(root.right);
    }
    
    //Create Prefix & PostFix Yourself

    public void levelOrderTraversal(){
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv= q.remove();
            System.out.print(rv.val+" ");
            if(rv.left!=null)
                q.add(rv.left);
            if(rv.right!=null)
                q.add(rv.right);
        }
        System.out.println();
    }

}
