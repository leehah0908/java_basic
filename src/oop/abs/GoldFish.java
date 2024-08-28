package oop.abs;

public class GoldFish extends Pet {
    public GoldFish(String kind, String name, int age) {
        super(kind, name, age);
    }

    @Override
    public void takeNap() {
        System.out.println("금붕어는 낮잠을 물에서 잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("금붕어는 물고기 사료을 먹습니다.");
    }
}
