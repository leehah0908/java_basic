package oop.abs;

public class Cat extends Pet {
    public Cat(String kind, String name, int age) {
        super(kind, name, age);
    }

    @Override
    public void takeNap() {
        System.out.println("고양이는 낮잠을 캣타워에서 잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("고양이는 생선을 먹습니다.");
    }

    @Override
    public void walk() {
        System.out.println("고양이는 산책을 안합니다.");
    }
}
