package oop.inter.animal;

public class Duck extends Livings implements Huntable {

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void feed(String foodName) {

    }

    public void swim() {
        System.out.println("오리가 헤엄을 칩니다.");
    }

    @Override
    public void hunt(Animal animal) {

    }
}
