package oop.modi.member.pac1;

public class A {

    public int f1;
    int f2;
    private int f3;

    public void m1() {};
    void m2() {};
    private void m3() {};

    public A(int a) {}
    A(double b) {}
    private A(boolean c) {}

    void test() {
        this.f1 = 10;
        this.f2 = 20;
        this.f3 = 30;

        m1();
        m2();
        m3();

        new A(10);
        new A(3.24);
        new A(false);
    }
}
