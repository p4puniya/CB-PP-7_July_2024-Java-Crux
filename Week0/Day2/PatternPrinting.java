import java.util.Scanner;
class PatternPrinting{
    public static void main(String[] args) {
        //Q1: Take an integer n as input and print a * n times.
        // 5 : * * * * *
        // 6 : * * * * * *
        
        // System.out.println(i);
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=n;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        //Right facing triangle
        int n=6;
        
        // for(int i=n;i>=1;i--){
        //     for(int k=1;k<=(n-i);k++)
        //         System.out.print("    "); // Use 2 space
        //     for(int j=1;j<=i;j++)
        //         System.out.print("* ");
        //     System.out.println();
        // }
        // Empty Square:

            // for(int i=1;i<=n;i++){
            //     for(int j=1;j<=n;j++){
            //         if(i==1 || i==n || j==1 || j==n)
            //             System.out.print("* ");
            //         else
            //             System.out.print("  ");
            //     }
            //     System.out.println();
            // }

        //omission
        for(int i=1;i<=n;i++){
            // first tri
            for(int k=1;k<=(n-i);k++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            // second tri
            for(int j=1;j<=i-1 && j<=n;j++)
                System.out.print("* ");

            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            // first tri
            for(int k=1;k<=(n-i);k++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            // second tri
            for(int j=1;j<=i-1 && j<=n;j++)
                System.out.print("* ");

            System.out.println();
        }

        //print all natural numbers upto 10 starting from i
        // int i;
        // Scanner sc= new Scanner(System.in);
        // // i=sc.nextInt();
        // for(int i=sc.nextInt(),j=10; i<10 || j<6 && i+j==10 && j!=7;i++ , j--){
        //     System.out.println(i+" "+j);
        // }

        // // 
        // do{
        //     System.out.println(i);
        //     //change statement
        //     i++;
        // }while(i<=10);
        // sc.close();
    }
}