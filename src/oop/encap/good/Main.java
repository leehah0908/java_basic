package oop.encap.good;

public class Main {
    public static void main(String[] args) {

        MyBirth my = new MyBirth();
        my.setYear(1997);
        my.setMonth(9);
        my.setDay(8);

        my.birthInfo();
    }
}
