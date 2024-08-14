package oop.this_;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Player1");
        Player p2 = new Player("Player2");

        p1.attack(p2);
        p1.attack(p2);
        p1.attack(p1);
    }
}
