package Week0.Solutions;

public class Ques29 {
    public static void main(String[] args) {
        // q29 pattern 
        int n=5;
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print("\t");
            }
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print(i+"\t");
                }
                else
                    System.out.print("0\t");

            }
            for(int j=1;j<=i-1;j++){
                int a=1;
                if(j==i-1){
                    System.out.print(i+"\t");
                }
                else
                    System.out.print("0\t");
                
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
