package etc.api.utiil.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListDelete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> kakao = new ArrayList<>();
        Collections.addAll(kakao, "무지", "네오", "어파치", "라이언", "제이지", "춘식이");

        System.out.println("현재 저장된 친구들: " + kakao);
        System.out.print("삭제할 친구를 입력하세요: ");
        String name = input.nextLine();

        if (kakao.contains(name)) {
            kakao.remove(name);
            System.out.println("현재 저장된 친구들: " + kakao);
        } else {
            System.out.println("이름이 없습니다.");
        }

        /*
        - forEach에서 remove를 사용할 수 없습니다.
        - forEach(향상 for문)을 사용하여 반복문을 순회할 때 리스트의 크기를 마음대로 줄이거나 늘릴 수 없습니다.
        - 향상 for문은 반복문을 시작할 때 구조적으로 컬렉션의 크기 및 사용 가능한 요소들의 개수를 항상 파악하고 있기 때문에 값의 변경이 일어나면 예외를 발생시키도록 설계되어 있습니다.
        - 단, 삭제 후 break문으로 다음 작업을 실행하지 않는다면 오류없이 실행 가능합니다.
        */
    }
}