package oop.modi.cls.pac1;

// default (pakage friendly) 제한자
//    -> 같은 패키지 내에서만 접근 가능
class A {
    // 클래스 A는 default이니까 같은 패키지 내부의 클래스에는 접근을 허용
    A a = new A();

    // 클래스 B는 public이니까 접근 가능
    B b = new B();
}
