package Lecture35;

public class DP1 {
    static int fibonacci(int n){// add another parameter
        if(n==0 || n==1) return n;
        //Statement to return prev. stored value
        int fib1= fibonacci(n-1);
        int fib2= fibonacci(n-2);
    
        return fib1+fib2;// Edit it to stored data
    }

    static int fiboDP(int n, int[] dp){
        if(n==0||n==1) return n;
        
        if(dp[n]!=0) return dp[n];

        int fib1= fiboDP(n-1, dp);
        int fib2= fiboDP(n-2,dp);

        return dp[n]= fib1+fib2;
    }

    static int fiboBU(int n){
        int[] dp= new int[n+1];
        dp[0]= 0;
        dp[1]= 1;
        for(int i=2;i<=n;i++)
            dp[i]= dp[i-1]+dp[i-2];
        
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
        System.out.println(fiboDP(6,new int[100]));
        System.out.println(fiboBU(6));
    }
}
