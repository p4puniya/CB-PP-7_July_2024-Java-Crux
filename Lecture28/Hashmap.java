package Lecture28;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hp= new HashMap<>();
        TreeMap<Integer,Integer> tp= new TreeMap<>();
        LinkedHashMap<Integer,Integer> lp= new LinkedHashMap<>();
        
        hp.put(3,30);
        hp.put(5,50);
        hp.put(10,100);
        hp.put(2,20);
        hp.put(1,10);
        hp.put(-11,110);
        hp.put(-10,-110);
        hp.put(-5,-50);

        tp.put(3,30);
        tp.put(5,50);
        tp.put(10,100);
        tp.put(2,20);
        tp.put(1,10);
        tp.put(-5,-50);

        lp.put(3,30);
        lp.put(5,50);
        lp.put(10,100);
        lp.put(2,20);
        lp.put(1,10);
        lp.put(-5,-50);

        System.out.println(hp);
        System.out.println(tp);
        System.out.println(lp);
    }
    
}
