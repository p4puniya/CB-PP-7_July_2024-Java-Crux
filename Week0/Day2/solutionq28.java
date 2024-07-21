package Week0.Day2;
public class solutionq28 {
    public static void main(String[] args) {
        int n = 5 ;
        for (int i=1 ; i<=n ; i++){
            int s=i;
            for (int k=1 ; k<=n-i ; k++){
                System.out.print("\t");
            }
            for (int j=0 ; j<=i-1 ; j++){
                System.out.print(j+i + "\t");
            }
            for (int j=2 ; j<=i ; j++){
                System.out.print(i+s-2 + "\t");
                s--;
            }
            System.out.println();
        } 
    }
}
/*                              1
                        2       3       2
                3       4       5       4       3
        4       5       6       7       6       5       4
5       6       7       8       9       8       7       6       5
*/