package oop.modi.member.pac2;

import oop.modi.member.pac1.A;

public class C {
    void test() {
        A a1 = new A(100);
        // default로 선언했기 때문에 사용할 수 없음.
//        A a2 = new A(4.44);
        // private로 선언했기 때문에 사용할 수 없음.
//        A a3 = new A(false);

        a1.f1 = 10;
        // default로 선언했기 때문에 사용할 수 없음.
//        a1.f2 = 10;
        // private로 선언했기 때문에 사용할 수 없음.
//        a1.f3 = 10;

        a1.m1();
        // default로 선언했기 때문에 사용할 수 없음.
//        a1.m2();
        // private로 선언했기 때문에 사용할 수 없음.
//        a1.m3();
    }

}
