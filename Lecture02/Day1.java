import java.util.Arrays;
public class Day1 {

    static void printArr(int[] arr){
        //for each loop
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    //create a function to search for an element n in an array:
    static boolean linearSearch(int[] arr, int n){
        for(var i:arr)
            if(i==n) return true;
        return false;
    }
    static boolean binarySearch(int[] arr, int n){
        int i=0, j=arr.length-1;
        while(i<=j){
            int mid= (i+j)/2;
            if(arr[mid]==n) return true;
            else if(arr[mid]<n) i=mid+1;
            else j=mid-1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,9,5,7,10,5};
        Arrays.sort(arr);
        printArr(arr);
        System.out.println(binarySearch(arr, 51));
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
