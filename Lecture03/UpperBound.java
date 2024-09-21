package Lecture03;

public class UpperBound {
    static int upperBound(int[] arr, int num){
        int ans=-1;
        int low=0, high=arr.length-1, mid=0;
        while(low<=high){
            mid=(high+low)/2;
            if(arr[mid]==num){
                ans=mid+1;
                low=mid+1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else
                low=mid+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int num= 9;
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        System.out.println(upperBound(arr, num));
    }
}
