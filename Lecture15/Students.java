package Lecture15;

public class Students {
    int roll;
    String name;
    Batch enrolled_Batch;

    public Students(){//default Constructor
        this.roll= 0;
        this.name= "Unknown";
        this.enrolled_Batch= new Batch();
    }

    public Students(
        int roll,
        String name,
        String batch_name,
        int batch_cost,
        String batch_topic
    ){
        this.roll= roll;
        this.name= name;
        enrolled_Batch=new Batch(
            batch_name,
            batch_cost,
            batch_topic
        );
        // this.enrolled_Batch.batch_name= batch_name;
        // this.enrolled_Batch.cost= batch_cost;
        // this.enrolled_Batch.topic= batch_topic;
    }

    void study(){
        System.out.println(this.name+" is Studying");
    }
}
