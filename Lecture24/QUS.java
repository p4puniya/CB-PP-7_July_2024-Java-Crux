package Lecture24;
import java.util.Iterator;
import java.util.Stack;

public class QUS {
    private Stack<Integer> stk;
    public QUS(){
        stk= new Stack<>();
    }

    public int size(){
        return stk.size();
    }

    public boolean isEmpty(){
        return stk.isEmpty();
    }

    public void enqueue(int item){
        //Implement it Yourself 
        Stack<Integer> helperStack= new Stack<>();

        while(!stk.isEmpty())
            helperStack.push(stk.pop());

        stk.push(item);
        while (!helperStack.isEmpty()) 
            stk.push(helperStack.pop());
    }

    public int dequeue(){
        return stk.pop();
    }

    public int getFront(){
        return stk.peek();
    }

    public void Display(){
        Iterator value= stk.iterator();
        while(value.hasNext())
            System.out.print(value.next()+" ");
        
        System.out.println();
    }

    public void displayReverse() {
        displayReverseHelper(stk);
        System.out.println();
    }
    
    private void displayReverseHelper(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int value = stack.pop();        
        System.out.print(value + " ");   
        displayReverseHelper(stack);
        stack.push(value);               
    }
    
    public static void main(String[] args) {
        QUS queue= new QUS();
        queue.enqueue(02);
        queue.enqueue(12);
        queue.enqueue(22);
        queue.dequeue();
        queue.enqueue(30);
        queue.Display();
        queue.displayReverse();
    }

}
