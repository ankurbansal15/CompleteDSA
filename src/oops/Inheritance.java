package oops;

public class Inheritance {

    public static void main(String[] args) {

        Fish shark = new Fish();

        // inherited properties
        shark.skinColor = "blue";
        shark.eat();

        // self properties
        shark.fins = 5;

        Mammals whale = new Mammals();

        whale.skinColor = "black";
        whale.eat();

    }
}

class Animals {

    String skinColor;

    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breath");
    }
}


class Fish extends Animals {

    int fins;

    void swim() {
        System.out.println("Swims");
    }
}

class Mammals extends Fish {

    int milk;

    String size;

}