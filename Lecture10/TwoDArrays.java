package Lecture10;
import java.util.*;
public class TwoDArrays {
    //Input
    static void populate(int[][] nums){
        int n=1;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=n;
                n++;
            }
        }
    }
    //Display
    static void display(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                System.out.print(nums[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    //Sum
    //Sort 2D Array: By Rows, By Cols, Whole 2D Array
    //Rows
    static void sortByRows(int[][] nums){
        for(int i=0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
    }
    //cols
    static void sortByCols(int[][] nums){
        Arrays.sort(nums,(a,b)->Integer.compare(a[0], b[0]));  
    }
    //Whole Matrix
    static void sortComplete(int[][] nums){
        int[] arr= flaten(nums);
        Arrays.sort(arr);
        fillArray(nums, arr);
    }
    static void fillArray(int[][] nums, int[] arr){
        int rows= nums.length;
        int cols= nums[0].length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                nums[i][j]=arr[cols*i + j];
            }
        }
    }
    static int[] flaten(int[][] nums){
        int rows= nums.length;
        int cols= nums[0].length;
        int[] arr= new int[rows * cols];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                arr[cols*i + j]= nums[i][j];
            }
        }
        return arr;
    }
    //Linear Search
    static int[] search(int[][] nums, int n){
        int[] ans= new int[2];
        //code
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]==n){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return ans;
    }
    //Transpose
    static void transpose(int[][] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums[0].length;j++){
                int temp= nums[i][j];
                nums[i][j]=nums[j][i];
                nums[j][i]= temp;
            }
        }
    }
    //Ques 74 & 240
    public static void main(String[] args) {
        //initialise a 2D array
        // int[][][][][] grid= new int[4][2][1][2][3];
        int[][] nums= {
            {1,4,3},
            {8,6,7},
            {2,5,9}
        };
        int[] arr= {1,2,3};
        // populate(nums);
        display(nums);
        // transpose(nums);
        sortComplete(nums);
        display(nums);
        // int[] indices= search(nums, 7);
        // System.out.println("i: "+indices[0]+" & j: "+ indices[1]);
        // int[][] nums= {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12}
        // };
        // int[] arr= new int[5];
        // System.out.println(grid);
        // System.out.println(nums[1]);        
        // System.out.println(nums[2]);
    }
}
