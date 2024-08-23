package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

// map : 리스트에서 원하는 데이터만 추출
// original : [ {}, {}, {}, {}, {} ]
// filter   : [ {}, {}, {} ]
// map      : [ "", "", "", "", "" ]
public class Mapping {
    public static void main(String[] args) {

        // 요리 이름만 추출
        menuList.stream()
                .map(Dish::getName)
                .toList()
                .forEach(System.out::println);

        System.out.println("===================================================");
        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );

        words.stream()
                .map(String::length) // String 클래스와 length 메서드를 매개변수에 적용
                .toList()
                .forEach(System.out::println);

        System.out.println("===================================================");
        // words에서 각 요소의 첫글자 추출
        List<Character> collect = words.stream()
                .map(w -> w.charAt(0))
                .collect(Collectors.toList());// 가변 리스트 리턴 (8 버전) -> 보통 더 많이 사용하긴 함.
//                .toList() // 불변 리스트 리턴 -> add, insert 불가! (16 버전부터)
        System.out.println(collect);

        System.out.println("===================================================");
        // 메뉴 목록에서 메뉴 이름과 칼로리만 추출해서 새로운 객체로 포장해서 받고 싶음.
        List<SimpleDish> simpleDish = menuList.stream()
                .map(SimpleDish::new)
                .collect(Collectors.toList());

        simpleDish.forEach(System.out::println);

        System.out.println("===================================================");
        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰 음식들을 필터링한 다음에 음식의 이름과 타입만 추출해서 출력해주세요.
            단, 타입은 MEAT의 경우 육류라고 저장, FISH는 어류라고 저장, OTHER는 기타라고 저장
        */
        List<DishDetail> detailList = menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishDetail::new)
                .collect(Collectors.toList());

        System.out.println(detailList);

        System.out.println("===================================================");
        // 메뉴 목록에 있는 요리들의 총 칼로리 구하기
        int sum = menuList.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println(sum);

        System.out.println("===================================================");
        // 육류 메뉴의 평균 칼로리 구하기
        double meatAvg = menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .mapToInt(Dish::getCalories) // 저장값 기준! (저장된 타입이 int이기 때문에)
                .average()
                .getAsDouble(); // -> 계산을 하니까 double로 되었기 때문에 getAsDouble() 사용해야 함!
        System.out.println(meatAvg);

    }
}
