package oops;

public class SuperKeyword {

    public static void main(String[] args) {

        Ghoda g1 = new Ghoda();

    }

}

class Prani {
    String color = "blue";


    Prani() {
        System.out.println("Prani constructor is called");
        System.out.println(color);

    }
}

class Ghoda extends Prani {
    Ghoda() {
        super.color = "black";
        System.out.println("Ghoda constructor is called");
        System.out.println(color);
    }
}
