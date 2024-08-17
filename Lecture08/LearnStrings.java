package Lecture08;

public class LearnStrings {
    public static void main(String[] args) {
        // Part 1
        // String s1= "hello";
        // String s2= new String("hello");
        // String s3= s1;
        // String s4= new String(s1);
        // char[] c= {'h','e','l','l','o'};
        // String s5= new String(c);
        
        // // String s2= new String(c);
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(s5);
        // System.out.println(c);

        //Part 2
        // String s1= "tables";
        // String s2= s1;
        // s2+= "s";
        // String s5= "table";
        // String s3= new String(s1);
        // String s4= new String("table");
        // System.out.println(s1.substring(1,5));

        //Part 3
        // String s1= 5 + 6 + "BA"+ 3+ 5;
        // s1= s1.concat("BA");
        // String s2= "AA";
        // s2= s2+ "BA";
        // // String s2= new String("BA");
        // System.out.println(s1+" "+s2);

        // char[] c= {'a','b','c'};
        byte[] c= {71,70,23};
        String s= new String(c);
        System.out.println(s);
    }
}
