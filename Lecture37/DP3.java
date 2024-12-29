package Lecture37;

public class DP3 {
    public static int EditDist(String s, String t, int i, int j){
        if(i==s.length())
            return t.length()-j;
        if(j==t.length())
            return s.length()-i;
        int ans=0;
        if(s.charAt(i)==t.charAt(j))
            ans= EditDist(s, t, i+1, j+1); // Same letters 
        else{
            int D= EditDist(s, t, i+1, j); //Delete
            int I= EditDist(s, t, i, j+1); //Insert
            int R= EditDist(s, t, i+1, j+1); //Replace
            ans= 1+Math.min(D, Math.min(I,R));
        }
        return ans;
    }
    //64 : Homework
    //931
}
