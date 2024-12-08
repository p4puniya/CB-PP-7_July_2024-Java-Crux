package Lecture34;

import java.util.Arrays;

public class CountSort {

    public static int[] sort(int[] arr){
        int max= Arrays.stream(arr).max().getAsInt();
        int[] freq= new int[max+1];
        for(int i=0;i<arr.length;i++)
            freq[arr[i]]++;

        for(int i=1;i<freq.length;i++)
            freq[i]= freq[i-1]+freq[i];
        
        int[] ans= new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            int idx= arr[i];
            int val= freq[idx];
            ans[val-1]= idx;
            freq[idx]--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {2,3,4,2,1,9,0,8,8};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
