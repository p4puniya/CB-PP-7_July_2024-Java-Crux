public class Day0{
    //create a function named swap: Swap 2 values. 
    // create a function to print first n natural numbers
    // create a function to check if a number n is prime or not.
    // Return the inverse of a number n.n=0001549 return: 9451
    // Return number of digits present in a number n. n=1234 return: 4
    // Check if a number is armstrong or not.

    //create a function to print the whole array
    static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    /*
     * swap(int a, intb){
     * //code
     * }
     */
    static int countD(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }

    static boolean checkArm(int n){
        int d= countD(n);
        int sum=0;
        int temp=n;
        while(n!=0){
            sum+= Math.pow((n%10),d);
            n/=10;
        }
        return (sum==temp);
    }
    static int reverseNum(int n){
        int temp=0;
        while(n!=0){
            temp= temp*10+ n%10;
            n/=10;
        }
        return temp;
    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        // System.out.print(a+" "+b);
    }
    static boolean checkPrime(int n){
        //code
        for(int i=2;i<n;i++)
            if(n%i==0) return false;
        return true;
    }
    static void printN(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    static void sayHi(String s){
        //code
        System.out.println(s);
    }
    public static void main(String[] args){
        // sayHi("Hello Gaurav");
        // int a=123746, b=7;
        // printN(b);
        // int a=2;
        // int b= 3;
        // int c=(int)Math.pow(a,b);
        // // a+=b;// a= a+b
        // 
        // String arr= "";
        // 1 0 0 0 ...
        // arr+='a';
        int[] arr= new int[10];
        int[] nums= {1, 2, 3, 4, 5, 6};
        // nums=arr; //shallow copy
        arr[0]=1;
        arr[1]=2;
        for(int i=0;i<arr.length;i++)
            arr[i]=i+1;
        printArr(arr);
        // System.out.println(arr);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        // swap(a, b);
        // System.out.println(a+" "+b);
        // System.out.println("Hi");
    }
}