import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(revArr(arr)));
    }

    public static int[] revArr(int[] arr) {
        int[] arr2 = new int[arr.length];
        int j = arr.length-1;
        int i = 0;

        while (i<=arr.length-1 && j>=0) {
            arr2[j] = arr[i];
            i++;
            j--;
        }

        return arr2;
    }
}
