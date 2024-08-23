package etc.api.utiil.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        /*
         ArrayList
             - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
             - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
             - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
        */

        // <> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
        List<String> nick = new ArrayList<>();

        // add(객체): 리스트에 객체를 추가하는 메서드
        nick.add("안녕");
        nick.add("Hello");
        nick.add("니하오");
        nick.add("안녕");
        nick.add(3, "곤니찌와");

        System.out.println(nick);

        // get(인덱스): 리스트 내부의 객체를 참조
        String name = nick.get(3);
        System.out.println(name);
        System.out.println(name.length());

        // size(): 리스트의 크기 반환
        System.out.println(nick.size());

        // set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정
        nick.set(1, "헬로");
        System.out.println(nick);

        // remove(인덱스), remove(객체): 리스트 내부의 객체를 삭제
        // iter문에서는 삭제 불가능!
        nick.remove(2);
        nick.remove("곤니찌와");
        System.out.println(nick);
        // 두개가 있으면 첫번째로 나온 객체만 삭제
        nick.remove("안녕");
        System.out.println(nick);
        System.out.println("===============================");

        // 리스트 반복문 처리
        for (int i = 0; i < nick.size(); i++) {
            System.out.println(nick.get(i));
        }

        for (String s : nick) {
            System.out.println(s);
        }

        System.out.println("===============================");
        // contains(객체): 리스트 내의 객체의 존재 유무를 파악
        System.out.println(nick.contains("안녕"));

        // indexOf(객체): 특정 객체의 인덱스 탐색, 없으면 -1 리턴
        int idx = nick.indexOf("안녕");
        System.out.println(idx);

        System.out.println("===============================");
        // clear(): 리스트 내부요소 전체 삭제
        nick.clear();
        System.out.println(nick);

        System.out.println("===============================");
        // isEmpty(): 리스트가 비어있는지 확인
        System.out.println(nick.isEmpty());
        System.out.println(nick.size() == 0);

        System.out.println("===============================");
        // 리스트 생성과 동시에 객체 초기화
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8); // -> 불변 리스트 -> 삽입, 삭제 안됨, 수정은 됨
        System.out.println(list);

        // 컬렉션 객체들은 Collections의 기능을 사용할 수 있습니다.
        // Collections는 컬렉션 객체들의 부가 기능들을 지원합니다.
        List<Integer> score = new ArrayList<>();
        score.add(83);

        // 한번에 객체 여러개 추가
        Collections.addAll(score, 8, 3, 38, 83);
        System.out.println(score);

        System.out.println("===============================");
        // 컬렉션 내의 객체의 개수 구하기
        System.out.println("83점 학생 수: " + Collections.frequency(score, 83));

        System.out.println("===============================");
        // 최대값, 최소값
        System.out.println("최대값: " + Collections.max(score));
        System.out.println("최소값: " + Collections.min(score));

        System.out.println("===============================");
        // 오름차순 정렬
        Collections.sort(score);
        System.out.println(score);

        // 내림차순 정렬
        // Collections.reverse(score); -> 정렬은 아니고, 그냥 뒤집는거기 때문에 오름찬순 정렬 후 실행해야 내림차순이 됨!
        Collections.sort(score, Collections.reverseOrder());
        System.out.println(score);

        // swap(리스트, i, j): 두 요소의 위치를 교체
        Collections.swap(score, 3, 7);
        System.out.println(score);

        // shuffle(리스트): 리스트내의 요소들 무작위로 섞기
        Collections.shuffle(score);
        System.out.println(score);

        // fill(리스트, 값): 원하는 값으로 전부 초기화
        Collections.fill(score, 100);
        System.out.println(score);


    }
}
