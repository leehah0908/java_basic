package oop.abs;

public class Dog extends Pet {
    public Dog(String kind, String name, int age) {
        super(kind, name, age);
    }

    @Override
    public void takeNap() {
        System.out.println("강아지는 낮잠을 마당에서 잡니다.");
    }

    @Override
    public void eat() {
        System.out.println("강아지는 사료를 먹습니다.");
    }

    @Override
    public void walk() {
        System.out.println("강아지는 산책을 합니다.");
    }
}
