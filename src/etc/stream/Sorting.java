package etc.stream;

import java.util.Comparator;
import java.util.stream.Collectors;

import static etc.stream.Menu.menuList;

public class Sorting {
    public static void main(String[] args) {
        // 육류 요리의 칼로리를 오름차순으로 정리
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .sorted(Comparator.comparing(Dish::getCalories))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("===================================================");
        // 모든 메뉴들을 이름으로 내림차순 정령
        menuList.stream()
//                .sorted(Comparator.comparing((Dish d)-> d.getCalories()).reversed()) // -> 일반 람다식으로 사용할거면 Dish라고 명시를 해줘야 reverse()가 오류가 안남 (굳이?)
                .sorted(Comparator.comparing(Dish::getName).reversed())                // -> 참조식으로 고친 후에 reverse()를 사용해야 오류가 안남!
                .collect(Collectors.toList())
                .forEach(System.out::println);

        System.out.println("===================================================");
        // 칼로리가 300 칼로리보다 큰 요리 중 칼로리 낮은 순으로 앞에서 3개만 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
                .limit(3)
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
