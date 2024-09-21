package Lecture18;

public class KeyPad {
    static String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void keyPress(String q,String ans){
        if(q.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=q.charAt(0);
        String press=arr[ch-'0'];
        for (int i = 0; i < press.length(); i++) {
            keyPress(q.substring(1), ans+press.charAt(i));
        }
    }   
    public static void main(String[] args) {
        keyPress("254", "");
    }
}
