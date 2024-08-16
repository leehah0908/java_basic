package oop.static_.method;

public class Count {
    public int a;
    public static int b;

    /*
    # 인스턴스 메서드: 객체를 생성하여 주소값을 통해 접근한 후 호출하는 메서드
    - 인스턴스 메서드 안에서는 정적(static) 변수와 인스턴스 변수를 모두 사용할 수 있습니다.
     */
    public int method() {
        return this.a + Count.b;
    }

    /*
    - static 블록(메서드, 정적 초기화자) 내부에서는 static이 붙은 변수나 메서드만 사용할 수 있습니다.
    - this는 사용할 수 없습니다. -> 나타낼 주소값이 없기 때문 -> 객체 생성 없이도 호출이 가능하기 때문.
    - static 블록 내부에서 non-static 멤버를 참조하려면 반드시 객체를 생성해서 주소값을 통해 참조해야 합니다.
     */
    public static int method2() {
        // this는 생성된 객체의 주소를 나타냄 -> static은 애초에 객체를 만들지 않기 때문에 주소가 없는디?
//        return this.a + Count.b;

        // a는 객체 생성이 되어야지만 사용할 수 있으므로 굳이 쓰고 싶으면 객체를 만들고 사용해야 함.
        Count temp = new Count();
        return temp.a + Count.b;
    }
}
