package oops;

public class Interfaces {

    public static void main(String[] args) {

        System.out.println("INTERFACE");
        Queen q1 = new Queen();
        q1.moves();

        System.out.println("MULTIPLE INHERITANCE");

        Bear b1 = new Bear();

        b1.eats();

    }

}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {

    public void moves() {
        System.out.println("right,left,up,down,diagonal ");
    }

}

class Rook implements ChessPlayer {

    public void moves() {
        System.out.println("right,left,up,down ");
    }
}

interface Herbivore {
    void eats();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {

    public void eats() {
        System.out.println("Eats meat and grass");
    }
}
