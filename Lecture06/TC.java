public class TC {
    public static void main(String[] args) {
        int N=100;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j+=i)
                System.out.println("HI");
        }
        //n2=20
        //nlogn= 2 Correct
        //log n= 1
        // n= 0

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i*i;j++){
                for(int k=1;k<=N/2;k++)
                    System.out.println("Hi");
            }
        }

        // N^2 logN= 2
        // N^2 * 2^N= 1
        // N^3 logN= 3
        // N^3 = 4
        // N^4 = 4

        for(int i=1;i<=N;i++)
            for(int j=1;j<=i;j++)
                System.out.println("Hi");
    }
}
