public class Day0_1 {
    //Create a swap function to swap 2 values inside an array
    static void swap(int[] arr, int i, int j){
        //
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseUsingSwap(int[] arr, int a, int b){
        for(int i=0,j=arr.length -1;i<j ;j--,i++){
            swap(arr, i, j);
            printArr(arr);
        }
    }
    static void printArr(int[] arr){
        //for each loop
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
    // Return the sum of your arr: 1,2,3,4,5
    static int sumArray(int[] arr, int a, int b){
        if(a>b || a<0 || b<0|| b>=arr.length)
            return 0;
        int sum=0;
        // for(int i:arr){
        //     sum+=i;
        // }
        for(int i=a;i<=b;i++)
            sum+= arr[i];
        return sum;
    }
    // Print an array in reverse order: 5,4,3,2,1
    static void printRev(int[] arr){
        for(int i=arr.length-1;i>=0;--i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    // Reverse the array(optional)
    static void reverse(int[] arr){
        int[] temp= new int[arr.length];
        for(int i=0;i<arr.length;i++)
            temp[i]=arr[arr.length-1 - i];
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7,8,9};
        printArr(arr);
        reverseUsingSwap(arr);
        printArr(arr);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
