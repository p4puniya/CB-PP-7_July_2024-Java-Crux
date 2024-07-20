package Solutions;

import java.util.Arrays;

public class File {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //System.out.println(arrSum(arr));
        //printRevArr(arr);
        System.out.println(Arrays.toString(revArr(arr)));
    }

    private static int arrSum(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum += i;
        }

        return sum;
    }

    private static void printRevArr(int[] arr) {
        for (int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] +" ");
        }
    }

    private static int[] revArr(int[] arr) {
        int[] reversedArr = new int[arr.length];
        int i = 0;
        int j = arr.length-1;

        while ((i <= arr.length-1 && j >= 0)) {
            reversedArr[i] = arr[j];
            i++;
            j--;
        }

        return reversedArr;
    }
}
