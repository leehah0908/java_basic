package etc.lambda;

import java.util.ArrayList;
import java.util.List;

public class MappingApple {
    // 사과의 색상만 추출
    public static List<Color> mappingAppleByColor(List<Apple> apples) {
        List<Color> colorlist = new ArrayList<>();
        for (Apple apple : apples) {
            colorlist.add(apple.getColor());
        }
        return colorlist;
    }

    public static <X, Y>List<Y> map(List<X> list, GenericFunction<X, Y> mapper) {
        List<Y> mappedlist = new ArrayList<>();
        for (X x : list) {
            // X에서 Y를 추출하는 동작을 파라미터화 시키기
            Y y = mapper.apply(x);
            mappedlist.add(y);
        }
        return mappedlist;
    }
}
