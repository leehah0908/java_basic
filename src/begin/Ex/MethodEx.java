package begin.Ex;

import java.util.Arrays;

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

        pop();
        printFoods();

        insert(2, "족발");
        printFoods();

        modify(1, "치치킨");
        printFoods();

        remove("족발");
        printFoods();

        clear();
        printFoods();

        push("짜장면");
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

    public static void pop() {
        foods = copyArray(-1);
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

    static void insert(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) return;

        String[] emptyArray = copyArray(1);

        for (int i = foods.length; i > targetIndex; i--) {
            emptyArray[i] = emptyArray[i - 1];
        }

        emptyArray[targetIndex] = newFoodName;

        foods = emptyArray;
        emptyArray = null;
    }

    static void modify(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) return;

        foods[targetIndex] = newFoodName;
    }

    public static boolean isOutOfBounds(int targetIndex) {
        return targetIndex > foods.length || targetIndex < 0;

        // 좀 더 복잡한 코드
//        if (targetIndex > foods.length || targetIndex < 0) {
//            return true;
//        }
//        return false;
    }

    public static void remove(String deleteTarget) {
        int index = indexOf(deleteTarget);
        if (index == -1) {
            return;
        }

        for (int i = index; i < foods.length - 1; i++) {
            foods[i] = foods[i + 1];
        }

        String[] temp = copyArray(-1);
        foods = temp;
        temp = null;
    }

    public static void clear() {
        foods = new String[]{};
    }


}
