package Lecture11;

public class S_Builder {
    StringBuilder bs= new StringBuilder();
    
    public static void main(String[] args) {
        //Code
        StringBuilder sb= new StringBuilder();
        // sb.reverse();
        // sb.append("Hello");
        // sb.replace(2, 4,"Replaced");
        // sb.insert(2, "y. He");
        // sb.delete(2,5);
        sb.ensureCapacity(18);
        // sb.append("Bye");
        // System.out.println(sb);
        System.out.println(sb.capacity());
        // System.out.println(sb.length());
        // System.out.println(sb.capacity());
        // String s= new String("Hello");
        // int[] arr= new int[]{1,2,3};
        // System.out.println(arr);
        // char[] s= new char[]{1,2,3};
        // System.out.println(s);

    }
}
