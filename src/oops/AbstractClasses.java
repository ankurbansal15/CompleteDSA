package oops;

public class AbstractClasses {

    public static void main(String[] args) {

        Horse h1 = new Horse();
        System.out.println(h1.color);
        h1.walk();
        h1.eat();

        System.out.println();

        Hen p1 = new Hen();

        p1.changeColor();
        System.out.println(p1.color);
        p1.eat();
        p1.walk();

    }

}

abstract class Animal {

    String color;

    Animal() {
        color = "brown";
    }

    abstract void walk();
}

class Horse extends Animal{

    void eat(){
        System.out.println("Eats grass");
    }

    void walk(){
        System.out.println("Walks on four legs");
    }

}

class Hen extends Animal{

    void eat(){
        System.out.println("Eats insects");
    }

    void walk(){
        System.out.println("Walks on 2 legs");
    }

    void changeColor(){
        color = "blue";
    }
}


