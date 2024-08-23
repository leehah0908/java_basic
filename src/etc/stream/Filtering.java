package etc.stream;

import java.util.Comparator;
import java.util.List;

import static etc.stream.Menu.menuList;

public class Filtering {

    public static void main(String[] args) {
        // 요리 중에 채식주의자가 먹을 수 있는 요리만 필터링
        List<Dish> dishList = menuList.stream()
                .filter(Dish::isVegeterian)
                .toList();

        dishList.forEach(System.out::println);

        System.out.println("===================================================");
        // 메뉴 목록중에 육류이면서 600 칼로리 미만인 요리 필터링
        menuList.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT && dish.getCalories() < 600)
                .toList()
                .forEach(System.out::println);

        System.out.println("===================================================");
        // 메뉴 목록중에 요리 이름이 4글자인 것만 필터링
        menuList.stream()
                .filter(dish -> dish.getName().length() == 4)
                .toList()
                .forEach(System.out::println);

        System.out.println("===================================================");
        // 칼로리가 300칼로리보다 큰 요리 중에 앞에 3개만 추출 (오름, 내림)
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories))
//                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3)
                .toList()
                .forEach(System.out::println);

        System.out.println("===================================================");
        // 칼로리가 300칼로리보다 큰 요리 3번째부터 출력
        menuList.stream()
                .filter(dish -> dish.getCalories() > 300)
                .skip(2)
                .toList()
                .forEach(System.out::println);

        System.out.println("===================================================");
        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 4, 5, 6);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .distinct()
                .toList()
                .forEach(System.out::println);
    }
}
