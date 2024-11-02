package Lecture23;
import java.util.Stack;
public class Stack2 {
    static void display(int[] arr){
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    public static void main(String[] args) {
        Stack<Integer> stk= new Stack<>();
        stk.add(10);
        stk.add(20);
        stk.add(30);
        stk.add(40);
        NGE(new int[]{1,3,4,2,3,3,2});
    }

    public static void NGE(int[] arr){
        Stack<Integer> stk= new Stack<>();
        int[] ans= new int[arr.length];

        for(int i=0;i<arr.length;i++){
            while(!stk.empty() && arr[i]> arr[stk.peek()])
                ans[stk.pop()]= arr[i];
            stk.push(i);
        }

        while(!stk.empty())
            ans[stk.pop()]=-1;
        
        display(ans);
    }
}
