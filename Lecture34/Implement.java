package Lecture34;

public class Implement {
    public static void main(String[] args) {
        Tries t= new Tries();
        t.insert("Nick");
        t.insert("Night");
        t.insert("Cat");
        t.insert("Knifes");
        System.out.println(t.search("Cat"));
        System.out.println(t.search("Cats"));
        System.out.println(t.search("Knife"));
        
    }

    
}
