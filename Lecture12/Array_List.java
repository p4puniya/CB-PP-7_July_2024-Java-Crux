package Lecture12;
import java.util.ArrayList;
import java.util.Collections;
public class Array_List {
    public static void main(String[] args) {
        // 1. Syntax
        ArrayList<Integer> nums= new ArrayList<>();
        int[] arr= {30,30,30,10,20,10,1,40,40};
        nums= findSubArray(arr, 3);
        System.out.println(nums);
        // // 2. Add
        // arr.add(100);
        // arr.add(20);
        // arr.add(3200);
        // // 3. Get
        // System.out.println(arr.get(0));
        // // 4. Remove
        
        // // System.out.println(arr.size());
        // // arr.remove(1);
        // // 5. Update
        // // arr.set(1,100);
        // // 6. Size
        // // 7. Display
        // System.out.println(arr);
        // // 8. Sort
        // Collections.sort(arr);
        // // 9. Insert
        // arr.add(1, 50);
        // arr.clear();
        // System.out.println(arr);
    }

    //Create a function to find the maximum sum subarray of size k
    //[30,30,30,10,20,10,1,40,40]: k=2
    //{40,40}

    static ArrayList<Integer> findSubArray(int[] arr, int k){
        int start=0;
        int end= k-1;
        int maxSum=0;
        for(int i=0;i<=end;i++)
            maxSum+=arr[i];
        int currSum=maxSum;
        int index= 0;
        while(end<arr.length-1){
            currSum-= arr[start];
            start++;
            end++;
            currSum+= arr[end];
            if(maxSum<currSum){
                index= start;
                maxSum= currSum;
            }
        }

        ArrayList<Integer> nums= new ArrayList<>();

        for(int i=index; i<index+k;i++){
            nums.add(arr[i]);
        }

        return nums;
    }
}
