package oop.inter.animal;

public interface inter {
    // 인터페이스에서 변수를 선언하면 상수(static final)로 인식합니다. -> 상수는 모두 대문자로 선언, static final 생략 가능
    int NUM = 5;

//    Inter () {
//        인터페이스는 생성자를 가질 수 없습니다. (객체화될 수 없는 개념입니다.)
//    }

    // 인터페이스에서 메서드를 선언하면 추상 메서드로 지정됩니다.
    void method1();

    public static void staticMethod(){
        System.out.println("public static으로는 메서드 선언이 가능합니다.");
    }



}
