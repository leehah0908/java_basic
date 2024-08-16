package oop.modi.protec.pac1;

public class B {

    void test() {
        A a = new A(10);
        A a2 = new A(3.14);

        a.f1 = 10;
        a.f2 = 20;

        a.m1();
        a.m2();
    }
}
