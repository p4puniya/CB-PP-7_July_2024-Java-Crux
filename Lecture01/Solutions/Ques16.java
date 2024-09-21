//Q16
public class PP {
    public static void main(String[]args){
        int n=5;
        for(int i=n;i>=1;i--){
            for(int k=1;k<=i-1;k++)
            System.out.print("  ");
            for(int j=1;j<=i;j++)
            System.out.print(" * ");
            System.out.println("");
        }
        for(int i=2;i<=n;i++){
            for(int k=1;k<=i-1;k++)
            System.out.print("  ");
            for(int j=1;j<=i;j++)
            System.out.print(" * ");
            System.out.println("");
        }
    }
}
        * * * * *
      * * * *  
    * * *
  * *
*
  * *
    * * *
      * * * *
        * * * * *  
