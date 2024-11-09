package Lecture26;

import javax.swing.tree.TreeNode;

public class Trees_practice {
    //101: Symmetric Trees

    public boolean isSymmetric(TreeNode root) {
        return sym(root.left, root.right);
    }
    

    public boolean sym(TreeNode root1, TreeNode root2){
        if(root1== null && root2== null)
            return true;
        if(root1==null || root2==null) 
            return false;
        if(root1.val != root2.val)
            return false;
        boolean l= sym(root1.left, root2.right);
        boolean r= sym(root1.right, root2.left);
        return (l&&r);
    }
    //951: Flip Equivalent
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        if(root1==null && root2== null) return true;
        if(root1==null || root2== null) return false;
        if(root1.val != root2.val) return false;

        boolean case1= flipEquiv(root1.right, root2.left) && flipEquiv(root1.left, root2.right);
        boolean case2= flipEquiv(root1.left, root2.left) && flipEquiv(root1.right,root2.right);

        return case1||case2;
    }
    //112: Path Sum

    //129: Sum Root 2 leaf(Homework)

    // -x--BST--x-  
}
