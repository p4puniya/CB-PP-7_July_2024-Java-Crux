package Lecture05;

public class RotateArray {
    // reverse
   static void reverse(int[] nums, int i,int j){
        while(i<j){
            int temp=nums[i];
            nums[i]= nums[j];
            nums[j]= temp;
            i++;j--;
        }
    }
    public static void rotate(int[] nums, int k) {
        // reverse(nums,2,4);
        k%=nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        rotate(arr, 3);
        for(int i:arr)
        System.out.print(i);
    }
}
