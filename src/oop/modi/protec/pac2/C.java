package oop.modi.protec.pac2;

import oop.modi.protec.pac1.A;

public class C extends A{

    protected C(int a) {
        super(a);
    }

    void test() {
        super.f1 = 10;
        super.m1();

//        super.f2 = 20; // -> 상속받은 후에도 안됨
//        super.m2(); // -> 상속받은 후에도 안됨
    }
}
