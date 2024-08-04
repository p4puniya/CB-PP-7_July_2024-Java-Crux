package Lecture05;

public class NSE {
    static int[] nser(int[] arr){
        int[] NSER= new int[arr.length];
        int minEle= Integer.MAX_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            if(minEle==Integer.MAX_VALUE)
                NSER[i]=0;
            else
            NSER[i]= minEle;
            minEle= Math.min(minEle, arr[i]);
        }
        return NSER;
    }
    static int[] nsel(int[] arr){
        int[] NSER= new int[arr.length];
        int minEle= Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(minEle==Integer.MAX_VALUE)
                NSER[i]=0;
            else
            NSER[i]= minEle;
            minEle= Math.min(minEle, arr[i]);
        }
        return NSER;
    }
    public static void main(String[] args) {
        int[] arr={9,6,4,1,7,3,5,2,8};
        int[] NSER= nser(arr);
        for(int i:NSER)
            System.out.print(i+" ");
    }
}
