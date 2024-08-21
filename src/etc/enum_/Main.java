package etc.enum_;

public class Main {

    public static void main(String[] args) {
        Developer kim = new Developer();
        kim.name = "김춘식";
        kim.career = 3;
        kim.lang = Language.JAVA;

        Developer hong = new Developer();
        hong.name = "홍길동";
        hong.career = 10;
        hong.lang = Language.PYTHON;

        Developer park = new Developer();
        park.name = "박영희";
        park.career = 5;
        park.lang = Language.JAVASCRIPT;

        System.out.println(kim.name + "의 주력 언어: " + kim.lang);
        System.out.println(hong.name + "의 주력 언어: " + hong.lang);

        System.out.println(kim.name + "의 주력 언어: " + kim.lang.getName());
        System.out.println(hong.name + "의 주력 언어: " + hong.lang.getName());

        System.out.println(kim.name + "의 주력 언어는 컴파일 언어인가?: " + kim.lang.isCompileLang());
        System.out.println(hong.name + "의 주력 언어는 컴파일 언어인가?: " + hong.lang.isCompileLang());

        System.out.println("====================================");
        Language[] values = Language.values();
        for (Language value : values) {
            System.out.println(value);
            System.out.println(value.getName());
            System.out.println(value.isCompileLang());
            System.out.println("=============");
        }

        System.out.println("====================================");
        // ordinal(): 열거형 타입에 열거되어 있는 순서를 정수값으로 리턴
        System.out.println(park.lang.ordinal());

        System.out.println("====================================");
        // valueOf(문자열): 매개값으로 전달된 문자열과 일치하는 요소를 리턴
        System.out.println(Language.valueOf("CPP"));
    }
}
