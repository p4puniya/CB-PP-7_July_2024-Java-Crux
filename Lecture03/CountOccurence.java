package Lecture03;
// Given: Sorted Array, int num
// Create Function named CountOccurence, 

public class CountOccurence {
    static int lowerBound(int[] arr, int num){
        int firstOccurence=-1;
        int low= 0,high= arr.length-1, mid=0;
        while(low<=high){
            mid= (low+high)/2;
            if(arr[mid]==num){
                firstOccurence=mid;
                high=mid-1;
            }else if(arr[mid]>num){
                high=mid-1;
            }else 
                low= mid+1;
        }
        return firstOccurence;
    }
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
    static int countOccourences(int[] arr, int num){
        int lB= lowerBound(arr, num);
        if(lB==-1) return 0;
        int uB= upperBound(arr, num);
        return uB-lB;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,6,6,6,6,6,7,8,9,9,9,9};
        System.out.println(countOccourences(arr,0));
    }
}
