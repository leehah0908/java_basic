package oop.inter.animal;

public class Bear extends Livings implements BadAnimal{

    @Override
    public boolean sleep() {
        return false;
    }

    @Override
    public void feed(String foodName) {
        System.out.println(foodName + "을 먹습니다.");
    }

    @Override
    public void hunt(Animal animal) {

    }

    @Override
    public void angry() {

    }

    @Override
    public void fight() {

    }
}
