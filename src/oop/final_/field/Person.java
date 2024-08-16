package oop.final_.field;

public class Person {

    // final 변수는 불변의 값을 가지기 때문에 반드시 초기화가 필요
    // 초기화는 직접하는 방법과, 생성자를 이용하는 방법이 있음
    //
    final String name; // 생성자를 이용한 초기화
    final String nation = "대한민국"; // 직접 초기화
    int age;

    public Person(String name) {
        this.name = name;
    }
}
