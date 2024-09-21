package Lecture09;

public class StringPractice2 {
    /*
    //Q1. Function To reverse a string
        Eg: potato => otatop
    //q2. Function to Check if a string is Pallindrome or Not
        Eg: detartrated=> True 
    //q3. find the Maximum Occuring element in a Sorted String
        Eg: aaabbbbcdd => b
    //q4. find the Maximum Occuring Element in a String
        Eg: aababcdabca =>a
    //q5. Function to reverse the words of a string.
        Eg: the bird is flying => flying is bird the
    //Homework Ques. 424 on Leetcode
    */  
    static String reverse(String s1){
        String s2="";
        for(int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        return s2;
    }
    static boolean checkPal(String s){
        int i=0, j= s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;j--;
        }
        return true;
    }

    static char findMaxOcc1(String s){
        int countMaxElement=0;
        char maxElement= '*';
        int countCurrElement=0;
        char currElement= '*';
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=currElement){
                if(countCurrElement>countMaxElement){
                    countMaxElement= countCurrElement;
                    maxElement= currElement;
                }
                currElement= s.charAt(i);
                countCurrElement=1;
            }else{
                countCurrElement++;
            }
        }
        if(countCurrElement>countMaxElement){
            countMaxElement= countCurrElement;
            maxElement= currElement;
        }
        return maxElement;
    }

    static char findMaxOcc2(String s){
        int[] arr= new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[index]<arr[i]){
                index=i;
            }
        }
        return (char)('a'+index);
    }

    static void reverseWords(String s){
        String[] arr= s.split("\\s");
        System.out.print("!");
        String temp="";
        for(int i=arr.length-1;i>=0;i--){
            temp+=arr[i]+" ";
        }
        temp=temp.trim();
        System.out.print(temp);
        System.out.print("!");
    }
    public static void main(String[] args) {
        String original= "I am Batman";
        // String rev= reverse(original);
        reverseWords(original);
    }
}
