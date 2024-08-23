package etc.stream;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.comparingInt;

public class FindThing {
    public static void main(String[] args) {
        // 메뉴 목록에서 채식주의자가 먹을 수 있는 요리가 하나라도 존재하는가?
        boolean flag1 = menuList.stream()
                .anyMatch(Dish::isVegeterian);
        System.out.println(flag1);

        // 메뉴 목록에서 칼로리가 100 이하인 요리가 히니리도 하나라도 존재하는가?
        boolean flag2 = menuList.stream()
                .anyMatch(dish -> dish.getCalories() <= 100);
        System.out.println(flag2);

        // 음식 메뉴의 모든 요리가 1000칼로리 미만인가?
        boolean flag3 = menuList.stream()
                .allMatch(dish -> dish.getCalories() < 1000); // -> 리스트 안에 모든 객체를 검사해서 모두 일치히는지 확인 (다 true면 true)
        System.out.println(flag3);

        // 음식 메뉴의 모든 요리가 1000칼로리 미만이 아닌가?
        boolean flag4 = menuList.stream()
                .noneMatch(dish -> dish.getCalories() > 1000); // -> 리스트 안에 모든 객체를 검사해서 모두 불일치히는지 확인 (다 false면 true)
        System.out.println(flag4);

        // 음식 메뉴의 칼로리가 가장 적은 요리는?
        Dish dish = menuList.stream()
                .min(comparingInt(Dish::getCalories))
                .get();
        System.out.println(dish);
    }
}
