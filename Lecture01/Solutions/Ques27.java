package Lecture01.Solutions;
// QUESTION NUMBER 27
// n = 5
//                                  1
//                                1 2 1
//                              1 2 3 2 1
//                            1 2 3 4 3 2 1
//                          1 2 3 4 5 4 3 2 1

public class Ques27 {
    public static void main(String[] args) {
        int N=5;
        for(int i=1; i<=N;i++){
            for(int k=1; k<=N-i;k++){
                System.out.print("  ");
        }
        for(int j=1; j<=i; j++ ){
                System.out.print(j+" ");
        }
        for(int j=2; j<=i; j++ ){
                System.out.print((i-j+1)+" ");
        }
                System.out.println();
    }
  }
}
