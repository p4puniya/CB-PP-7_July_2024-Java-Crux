package Lecture01.Solutions;

// * * * * * * * * * 
//   * * * * * * * 
//     * * * * *
//       * * *
//         *

public class Ques10 {
    public static void main(String args[]){
        int m=5;
        for(int i=m;i>=1;i--){
            for(int k=0;k<(m-i);k++){
                System.out.print("  ");
            }
            
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}

