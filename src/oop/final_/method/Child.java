package oop.final_.method;

public class Child extends Parent{
    @Override
    void method1() {
        super.method1();
    }

    @Override
    void method2() {
        super.method2();
    }

    // final 메서드는 오버라이딩을 못합니다. (물려주는대로 써라)
//    @Override
//    void method3() {
//    }
}
