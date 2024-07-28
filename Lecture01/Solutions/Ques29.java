package Lecture01.Solutions;

import java.util.Scanner;

public class Ques29 {
    public static void main(String[] args) {
        // q29 pattern 
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=n-i;k++){
        //         System.out.print("\t");
        //     }
        //     for(int j=1;j<=i;j++){
        //         if(j==1){
        //             System.out.print(i+"\t");
        //         }
        //         else
        //             System.out.print("0\t");

        //     }
        //     for(int j=1;j<=i-1;j++){
        //         int a=1;
        //         if(j==i-1){
        //             System.out.print(i+"\t");
        //         }
        //         else
        //             System.out.print("0\t");
                
        //     }
        //     System.out.println();
        // }

        //                   1 
        //                 2 0 2 
        //               3 0 0 0 3
        //             4 0 0 0 0 0 4
        //           5 0 0 0 0 0 0 0 5

        //this one is more flexible and efficient 
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 1 ; i <= num ; i++){
                for(int k = num-i ; k > 0 ; k--){
                    System.out.print(" \t");
                }
                System.out.print(i+"\t");
                for(int j = 1 ; j <= 2*(i-1)-1 ; j++ ){
                    System.out.print(0+"\t");
                }
                if(i>1){
                    System.out.print(i);
                }
                System.out.println();
            }
}
}
