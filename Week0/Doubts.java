package Week0;
public class Doubts {
    public static void main(String args[]){
        //code here
        int a=7+1;//no. of rows
        int n=a/2;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i && j<n;j++)
                System.out.print("*");
            for(int k=2;k<=n-i;k++)// n-1, n-2, n-3, n-4
                System.out.print(" ");

            // System.out.print(" ");
            
            for(int k=1;k<=n-i;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i && j<n;j++)
                System.out.print("*");
            for(int k=2;k<=n-i;k++)// n-1, n-2, n-3, n-4
                System.out.print(" ");

            // System.out.print(" ");
            
            for(int k=1;k<=n-i;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        // System.out.println();

        // for(int i=2;i<=n;i++){
        //     for(int j=1;j<=i;j++)
        //         System.out.print("*");
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print(" ");

        //     // System.out.print(" ");
            
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print(" ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("*");
        //     System.out.println();
        // }
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











// int n=5;
        // for(int i=1; i<=n;i++){
        //     for(int k=1;k<=(n-i);k++)
        //         System.out.print(" ");
        //     for(int j=1;j<=(n-i+1);j++)
        //         System.out.print("*");
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1;i--){
        //     for(int k=1;k<=(n-i);k++)
        //         System.out.print(" ");
        //     for(int j=1;j<=(n-i+1);j++)
        //         System.out.print("*");
        //     System.out.println();
        // }




























        // int a=10;
        // int n= a/2;
        // for(int i=n;i>=1;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=(n-i);k++)
        //         System.out.print("  ");
        //     System.out.print("  ");
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // System.out.println();
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=(n-i);k++)
        //         System.out.print("  ");
        //     System.out.print("  ");
        //     for(int k=1;k<=n-i;k++)
        //         System.out.print("  ");
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }

