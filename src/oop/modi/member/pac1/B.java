package oop.modi.member.pac1;

public class B {
    void test() {
        A a1 = new A(50);
        A a2 = new A(5.55);
        // private로 선언했기 때문에 사용할 수 없음.
//        A a3 = new A(true);


        a1.f1 = 20;
        a1.f2 = 30;
        // private로 선언했기 때문에 사용할 수 없음.
//        a1.f3 = 40;

        a1.m1();
        a1.m2();
        // private로 선언했기 때문에 사용할 수 없음.
//        a1.m3();
    }
}
