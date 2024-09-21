package Lecture03;
public class BinarySearch {
    //return the index of the element else -1(not found)
    static int binarySearch(int arr[], int num){
        int low= 0, high= arr.length-1;
        int mid=0;
        while(low<=high){
            mid=(low+high)/2;
            if(arr[mid]==num)
                return mid;
            else if(arr[mid]<num){
                low= mid+1;
            }else
                high= mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int num= 9;
        int[] arr = { 1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, num));

    }
}
