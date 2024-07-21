package Week0.Solutions;

public class Ques33 {
    public static void main(String[] args) {
        // q33 pattern 
        int m=10;
        for (int i = 1; i <=m; i++) {
            for(int k=1;k<=m-i;k++){
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                if(i==j) System.out.print(0+" ");
                else System.out.print(m-i+j+" ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(m-j+1+" ");
            }
            System.out.println();
        }        
        //                   0 
        //                 9 0 9 
        //               8 9 0 9 8
        //             7 8 9 0 9 8 7
        //           6 7 8 9 0 9 8 7 6
        //         5 6 7 8 9 0 9 8 7 6 5
        //       4 5 6 7 8 9 0 9 8 7 6 5 4
        //     3 4 5 6 7 8 9 0 9 8 7 6 5 4 3
        //   2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2
        // 1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1
}
}
