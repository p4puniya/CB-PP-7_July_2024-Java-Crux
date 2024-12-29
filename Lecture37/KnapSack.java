package Lecture37;

import java.util.Arrays;

public class KnapSack {
    static int[][] dp;
    public static int knapSack01(int[] weights, int[] value, int total){
        // a function to return the max possible value
        dp= new int[total+1][weights.length+1];
        for(int[] i: dp)
            Arrays.fill(i,-1);
        return knapSack01RTD(weights, value, total, weights.length);
    }

    public static int knapSack01RTD(int[] weights, int[] values, int total, int n) {
        // Base case: no items left or total weight capacity is 0
        if (n == 0 || total == 0) {
            return 0;
        }
        if(dp[total][n]!=-1)
            return dp[total][n];
        // If the weight of the current item exceeds the total capacity, exclude it
        if (weights[n - 1] > total) {
            return knapSack01RTD(weights, values, total, n - 1);
        } else {
            // Include the current item or exclude it and take the maximum value
            return dp[total][n]=Math.max(
                values[n - 1] + knapSack01RTD(weights, values, total - weights[n - 1], n - 1),
                knapSack01RTD(weights, values, total, n - 1)
            );
        }
    }
    

    public static void main(String[] args) {
        int weight= 10;
        int[] weights={1,2,3,4,5};
        int[] value= {2,1,2,1,3};
        System.out.println(knapSack01(weights, value, weight));
    }
}