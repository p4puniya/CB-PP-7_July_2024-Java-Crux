package Lecture16;

public class Home {
    public static void main(String[] args) {
        Cats c1= new Cats(
            "Billi",
            "Meow",
            "Black",
            4,
            true
        );
        c1.editName("Kalu");
        System.out.println(c1.callCat());
        
    }
}
