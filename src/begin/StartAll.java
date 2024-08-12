package begin;

public class StartAll {
    public static void main(String[] args) {
//      기본 타입 (int, double, String만 잘 쓰면 됨!)
        int i = 10;
        long L = 2323451231242323L;
        double d = 3.14123123123213;
        float f = 3.1412312312313123131F;
        char c = 'L';
        String str = "LHH";
        boolean b = true;

        System.out.println("int = " + i);
        System.out.println("long = " + L);
        System.out.println("double = " + d);
        System.out.println("float = " + f);
        System.out.println("char = " + c);
        System.out.println("string = " + str);
        System.out.println("boolean = " + b);
        System.out.println("===========================");

//      ==============================================================================================================================
//      자동 형변환 (작은 크기 -> 큰 크기)
        byte by = 10;
        i = by; // byte -> int
        System.out.println("by = " + i);

        c = '가';
        i = c; // char -> int
        System.out.println("'가'의 문자 번호 : " + i);

        i = 500;
        d = i; // int -> double
        System.out.println("d = " + d);
        System.out.println("===========================");

//      ==============================================================================================================================
//      명시적 형변환 (큰 크기 -> 작은 크기)
        i = 72;
        c = (char) i; // int -> char
        System.out.println("c = " + c);

        d = 72.214;
        c = (char) d; // double -> char
        System.out.println("c = " + c);
        System.out.println("===========================");

//      ==============================================================================================================================
//      논리 연산자
        int x = 10, y = 20;

        System.out.println(x > 10 && (y / 0 == 10));  // &&연산은 좌항이 거짓이라면 우항은 계산하지 않고, false를 뱉어냄
        System.out.println(x == 10 || (y / 0 == 10)); // ||연산은 좌항이 참이라면 우항은 계산하지 않고, truw를 뱉어냄

//        System.out.println(x > 10 & (y / 0 == 10));  // &연산은 좌항의 결과에 상관없이 좌항, 우항을 모두 계산을 함
//        System.out.println(x == 10 | (y / 0 == 10)); // |연산은 좌항의 결과에 상관없이 좌항, 우항을 모두 계산을 함
        System.out.println("===========================");

//      ==============================================================================================================================
//      난수 만들기
//      1 ~ 10
        int rn1 = (int) (Math.random() * 9) + 1;
        System.out.println(rn1);

//      1 ~ 100
        int rn2 = (int) (Math.random() * 99) + 1;
        System.out.println(rn2);
        System.out.println("===========================");

//      ==============================================================================================================================
//      출력함수
        System.out.print("Hello");
        System.out.println(" world");

        /*
		 %d: 부호가 있는 정수 데이터 (decimal)
		 %f: 실수 데이터 (floation point)
		 %s: 문자열 (String)
		 */

        int month = 12;
        int day = 25;
        String anni = "크리스마스";
        double rate = 64.126;

        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni); //printf는 줄개행이 안되기 떄문에 \n을 사용
        System.out.printf("합격률은 %.2f%%입니다.", rate); // 몇자리까지??
    }
}
