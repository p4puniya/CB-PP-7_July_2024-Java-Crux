package Lecture09;

import java.util.Locale;

public class StringPractice {
    
    public static void main(String[] args) {
        // Part 1
        // System.out.println("Hi");
        // String s1= "This is a Class";
        // // s1= s1.replace("Aditya", "Ankit");
        // // s1= s1.trim();
        // System.out.println(s1.toUpperCase());

        //Part 2: Regex
        // String s1= "This\sis\sa\sclass";
        // String s2= "This\tis\ta\ttab";
        // String s3= "This is line 1.\nThis is line 2.";
        // String s4= "This  is \rHey \r";
        // String s5= "Girls Rule \f";
        // char a= '\"';
        // String s6= "This is \\ Divide";
        // System.out.println(s6);

        //Part 3: Split function
        // String s1= "Hi, this is an example string.";
        // String[] arr= s1.split("\\s",4);
        // for(String i: arr)
        //     System.out.println(i);

        //Part 4: String Intern
        // String s1= "hello";
        // String s2= "hello";
        // String s3= new String("hello").intern();
        // String s4= "hello";
        // String s5= new String("hello").intern();
        // System.out.println(s5==s3);

        //Part 5: ValueOf
        double n= 5123;
        String s1= String.valueOf(n);
        s1+= "abc";
        System.out.println(s1);
        
    }
}
