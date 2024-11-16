package Lecture28;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        TreeSet<Integer> ts= new TreeSet<>();
        LinkedHashSet<Integer> ls= new LinkedHashSet<>();

        hs.add(2);
        hs.add(1);
        hs.add(-10);
        hs.add(20);
        hs.add(5);
        hs.add(3);

        ts.add(2);
        ts.add(1);
        ts.add(-10);
        ts.add(20);
        ts.add(5);
        ts.add(3);

        ls.add(2);
        ls.add(1);
        ls.add(-10);
        ls.add(20);
        ls.add(5);
        ls.add(3);
        ls.add(3);
        ls.remove(20);
        // if(ls.contains(10))

        for(int i: hs)
            System.out.print(i+" ");

        System.out.println(hs);
        System.out.println(ts);
        System.out.println(ls);
    }
}
