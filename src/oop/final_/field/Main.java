package oop.final_.field;

public class Main {
    public static void main(String[] args) {
        Person kim = new Person("김철수");

        // final 변수이기 때문에 수정할 수 없음!
//        kim.name = "김마이클";
//        kim.nation = "미국";

        Person park = new Person("박영희");

    }
}
