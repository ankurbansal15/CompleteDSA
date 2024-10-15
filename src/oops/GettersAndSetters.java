package oops;

public class GettersAndSetters {

    public static void main(String[] args){

        Pen p1 = new Pen();

        System.out.println("Before modifying the values of the private variables");
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        System.out.println("After modifying the value of the private variables");
        p1.setColor("black");
        p1.setTip(10);

        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

    }
    
}

class Pen{
   private String color = "blue";
   private int tip = 5;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
