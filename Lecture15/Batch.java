package Lecture15;

import java.sql.Date;

public class Batch {
    String batch_name;
    int cost;
    String topic;
    // String s= new String();
    //Constructor
    public Batch(){ //default constructor
        this.batch_name= "default_batch";
        this.cost= 95000;
        this.topic= "Java";
    }

    //Custom Constructor
    public Batch(
        String batch_name,
        int cost,
        String topic){
            this.batch_name= batch_name;
            this.cost= cost;
            this.topic= topic;
        }
}
