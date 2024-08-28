package oop.abs;

public class Main {
    public static void main(String[] args) {
         /*
         - 추상 클래스(추상 메서드)를 사용하면 오버라이딩이 강제화 되기 때문에 프로그래머의 오버라이딩 실수를 방지할 수 있습니다.
         - 부모 클래스에서 메서드를 선언할 때 메서드 내부에 어떤 내용을 써야 할 지 막연할 때도 구현하기가 편합니다.
         - 다형성을 적용시켰을 경우에도 안전하게 사용이 가능합니다.
         */

        // 추상 클래스는 스스로의 객체 생성이 불가능합니다.
        // 추상 클래스의 객체가 아예 생성되지 않는 것이 아니라, 자식 객체를 통해 실체화가 가능합니다. (super())
//        Pet pet1 = new Pet("d", "d", 1); (X)

        Pet goldFish = new GoldFish("잉어", "잉어킹", 3);
        Pet dog = new Dog("말티즈", "꼬미", 5);
        Pet cat = new Cat("먼치킨", "대박이", 1);

        Pet[] petlist = {dog, cat, goldFish};

        for (Pet pet : petlist) {
            pet.eat();
            pet.takeNap();
            pet.walk();
            System.out.println(pet.sayHello());
            System.out.println("===========================");
        }
    }
}
