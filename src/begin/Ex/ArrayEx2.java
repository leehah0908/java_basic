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

        // 인덱스 돌면서 equal로 인덱스 찾고, 해당 인덱스를 기준으로 뒤에 있는 데이터 앞으로 당겨오기
        //   -> 못찾으면 이름이 없다고 print해주기 (flag로 변수가 있으면 true로 바꾸기 -> flag == false면 이름을 찾을 수 없습니다.
        // 어피치를 삭제하면 무지, 네오, 라이언, 제이지, 제이지 이런식으로 당겨오기
        // 새로운 배열을 만들어서 4번째까지만 넣어주기
        // 새로운 배열의 주소를 기존 배열의 주소로 덮어씌우고 새로 만든 배열은 null처리
    }
}
