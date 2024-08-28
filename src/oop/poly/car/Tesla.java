package oop.poly.car;

public class Tesla extends Car{
    @Override
    public void run() {
        System.out.println("테슬라가 달립니다!");
    }

    public void activeAuthpilot() {
        System.out.println("자율주행이 시작됩니다.");
    }
}
