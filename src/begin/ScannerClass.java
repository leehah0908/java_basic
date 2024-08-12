package begin;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int i = input.nextInt();
        input.nextLine();

        System.out.print("문자열을 입력하세요 : ");
        String str = input.nextLine();

        System.out.println("입력한 정수 : " + i);
        System.out.println("입력한 문자열 : " + str);

//      스캐너로 받은 입력값을 메모리에서 삭제
//      코드 실행이 끝나면 알아서 정리가 되지만, 실제 프로그램을 실행할땐 코드 종료가 안되는 경우가 생김 -> 메모리 낭비를 막기 위해 close를 해주는 습관은 좋음
        input.close();

    }
}
