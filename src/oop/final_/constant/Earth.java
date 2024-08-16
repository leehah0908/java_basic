package oop.final_.constant;

public class Earth {
    // 상수 선언
    // - 고정된 불변의 값 -> 어디에서 접근해도 같은 값이 나와야 하며, 값의 변경도 불가능해야 합니다.
    // - 자바에서는 static, final을 동시에 사용해서 상수를 표현합니다.
    // - 대문자로 작성하는 것이 관례입니다.
    // - 단어가 두개 이상이면 대문자로 작성하되, _를 사용해서 단어를 구분해줍니다.
    static final double RADIUS = 6400;
    static final double SURFACE_AREA;

    // 정적 초기화
    // 정적 변수들을 자동으로 초기화 해주는 static 블록
    // 정적 초기화는 내가 호출하는 것이 아니라, 클래스가 로딩되면 호출됩니다.
    // 클래스 로딩이란, 클래스의 이름으로 static 멤버를 호출 또는 참조하거나 객체가 생성되면 로딩됩니다.
    static {
        SURFACE_AREA = 4 * Math.PI * Math.pow(RADIUS, 2);
    }
}
