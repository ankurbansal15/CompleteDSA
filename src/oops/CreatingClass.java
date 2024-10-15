package oops;

public class CreatingClass {
    public static void main(String[] args) {

        Pen2 p1 = new Pen2();

        p1.setColor("Blue");

        p1.size(5);

        System.out.println(p1.color);
        System.out.println(p1.tip);

    }

}

class Pen2 {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void size(int newTip) {
        tip = newTip;
    }
}