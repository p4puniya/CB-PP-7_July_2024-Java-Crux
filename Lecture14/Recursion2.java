package Lecture14;

public class Recursion2 {
    // int count=0;
    //Fibonacci & Working Tree
    static int fibonacci(int n){
        if(n==0 || n==1) return n;
        int fib1= fibonacci(n-1);
        int fib2= fibonacci(n-2);
        return fib1+fib2;
    }
    //Subsequences
    static void generateSubSequence(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans);
            return;
        }
        generateSubSequence(ques.substring(1), ans+ques.charAt(0));
        generateSubSequence(ques.substring(1), ans);
    }
    //Coin Toss
    static void coinToss(int num, String ans){
        if(num==0){
            System.out.println(ans);
            return;
        }
        coinToss(num-1, ans+"H");
        coinToss(num-1, ans+"T");
    }
    //Changed CoinToss
    static int countCoinToss(int num){
        if(num==0 )
            return num;
        if(num==1)
            return 2;

        int l= countCoinToss(num-1);
        int r= countCoinToss(num-1);
        return l+r;
    }
    //Count Subsequences
    static int countSubSequence(String ques, int ans){
        if(ques.length()==0)
            return ans;
        return countSubSequence(ques.substring(1),2*ans);
    }
    //Generate Valid Paranthesis
    static void generateParanthesis(
        int n,
        String ans,
        int l,
        int r
    ){
        if(l==n && r==n){
            System.out.println(ans);
            return;
        }
        if(l<n)
            generateParanthesis(n, ans+"{", l+1, r);
        if(r<l)
            generateParanthesis(n, ans+"}", l, r+1);
    }
    //Ques 22 LC

    public static void main(String[] args) {
        // System.out.println(fibonacci(10));
        // generateSubSequence("CAR", "");
        // coinToss(3, "");
        generateParanthesis(3, "", 0, 0);
    }
}
