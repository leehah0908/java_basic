package oop.static_.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();

        s.method1();
        s.method2();
    }
}
