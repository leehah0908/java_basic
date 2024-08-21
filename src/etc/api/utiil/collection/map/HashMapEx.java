package etc.api.utiil.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        /*
        Map
            - key / value가 한 세트를 이루는 자료구조
            - key값을 통해 value를 참조하는 방식 (인덱스 x)
            - key는 중복 저장을 허용하지 않음
         */

        // Map은 Key, Value 쌍을 이루기 때문에 멀티 제네릭을 설적.
        Map<String, String > map = new HashMap<>();

        // Map에 데이터를 추가
        map.put("Spring", "Java");
        map.put("Airflow", "Python");
        map.put("Spark", "Python");
        System.out.println(map);

        // Key를 중복 사용하는 경우
        // 기존 Key에 메핑된 Value가 수정됨.
        map.put("Spark", "Scala");
        map.put("PySpark", "Python");
        System.out.println(map);

        System.out.println("===================================");
        // ContainsKey(Key): Key의 존제 유무를 확인하는 메서드
        System.out.println(map.containsKey("Airflow"));

        System.out.println("===================================");
        // 값 꺼내기
        String tool = "Airflow";
        if (map.containsKey(tool)) {
            String s = map.get(tool);
            System.out.println(tool + "의 언어는 " + s + "입니다.");
        } else {
            System.out.println("없습니다.");
        }

        System.out.println("===================================");
        for (String s : map.keySet()) {
            System.out.printf("key: %s, value: %s\n", s, map.get(s));
        }

        System.out.println("===================================");
        // remove(Key): Map의 객체를 삭제
        map.remove("Spark");
        System.out.println(map);

        map.clear();
        System.out.println(map);

        // Collections의 메서드는 Collection 인터페이스 타입을 전달받기 때문에 Map은 사용이 힘듭니다.

    }
}
