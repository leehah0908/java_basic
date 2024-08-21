package etc.api.lang.wrapper;

public class Wrapper {
    public static void main(String[] args) {
        int a = 100;
        boolean b = false;
        char c = 'A';
        double d = 3.4;

        // boxing -> 기본 데이터 타입을 객체 타입으로 변환 (옛날 방식)
//        Integer v1 = new Integer(a);

        // unboxing -> 객체 타입으로 포장된 값을 기본 데이터 타입으로 풀어내는 과정 (옛날 방식)
//        int i = v1.intValue();

        // autoboxing -> 기본 데이터 타입을 자동으로 객체 타입으로 변환
        Integer v1 = a;
        Boolean v2 = b;
        Character v3 = c;
        Double v4 = d;

        // autounboxing -> 객체 포장을 기본형으로 자동 해제 가능
        int i2 = v1;
        boolean b2 = v2;
        char c2 = v3;
        double d2 = v4;

        int result = Integer.parseInt("1305");
        System.out.println("result: " + result);
    }
}
