package Lecture16;

import Lecture15.Animals;

//Inheritance
public class Cats extends Animals{
    private String name= "NA";
    String voice= "NA";
    String color= "NA";

    //getter
    public String callCat(){
        return this.name;
    }
    //setter
    public void editName(String name){
        this.name= name;
    }

    // default constructor
    public Cats(){}
    //parameterized Constructor
    public Cats(
        String name,
        String voice,
        String color, 
        int legs,
        boolean tail
    ){
        this.name= name;
        this.color= color;
        this.voice= voice;
        this.legs= legs; //protected member
        this.tail= tail; //default
    }



}
