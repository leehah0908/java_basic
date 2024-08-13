package begin.Ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
        System.out.println("현재 저장된 친구들 : " + Arrays.toString(kakao));
        System.out.print("삭제할 친구를 입력하세요 : ");
        String name = input.next();

        /*
         1. 삭제할 친구를 입력받아서 삭제를 진행하세요.
         2. 입력받은 이름이 없다면 없다고 얘기해 주세요.
         */


    }
}
