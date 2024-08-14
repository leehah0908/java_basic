package begin.Ex;

import java.util.Arrays;
import java.util.SimpleTimeZone;
import java.util.logging.Level;

public class MethodEx {
    public static String[] foods = {"치킨", "파스타", "피자"};

    public static void main(String[] args) {
        printFoods();

//        if (isclude("소고기")) {
//            System.out.println("존재합니다.");
//        } else {
//            System.out.println("존재하지 않습니다.");
//        }
//
//        int idx = indexOf("피자");
//        System.out.println(idx);

        push("소고기");
        printFoods();

        pop("피자");
        printFoods();
    }

    public static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    public static boolean isclude(String searchTarget) {
        // -1이 오면 false return, 인덱스값이 오면 true return
        return indexOf(searchTarget) != -1;
    }

    public static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void push(String newFood) {
        String[] temp = copyArray(1);
        temp[temp.length - 1] = newFood;

        foods = temp;
        temp = null;
    }

    public static void pop(String newFood) {
        int isIndex = indexOf(newFood);
        if (isIndex == -1) {
            return;
        } else {
            foods = copyArray(-1);
        }
    }

    private static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }

    private static String[] copyArray(int size) {
        String[] temp = makeNewArray(size);

        if (foods.length < temp.length) {
            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }
        } else {
            for (int i = 0; i < temp.length; i++) {
                temp[i] = foods[i];
            }
        }

        // 더 간단한 코드!!
        // int loopCount = size >= 0 ? foods.length : temp.length;
        // for (int i = 0; i < loopCount; i++) {
        //     temp[i] = foods[i];
        // }

        return temp;
    }
}
