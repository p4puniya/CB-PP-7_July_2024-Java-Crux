package Lecture22;
import java.util.Stack;
public class Stk {
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();
        // System.out.println(stk.empty());
        stk.push(1);
        stk.push(2);
        stk.push(3);
        // System.out.println(stk.peek());
        // System.out.println(stk.pop());
        System.out.println(stk.search(1));
        stk.setSize(10);
    }
}
