package oop.poly.Player;

public class Main {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("전사1");
        Warrior w2 = new Warrior("전사2");
        Mage m1 = new Mage("마법사1");
        Mage m2 = new Mage("마법사2");
        Hunter h1 = new Hunter("사냥꾼1", "강아지");
        Hunter h2 = new Hunter("사냥꾼2", "고양이");

        m1.blizzard(w1, w2, m2, h1, h2);
    }
}
