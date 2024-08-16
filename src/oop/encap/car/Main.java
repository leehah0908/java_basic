package oop.encap.car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("테슬라 모델3");

        car.engineStart();
        car.setMode('D');
        car.setSpeed(100);
        car.setSpeed(0);
        car.setMode('P');
        car.engineStop();

    }
}
