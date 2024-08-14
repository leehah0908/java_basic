package begin;

public class Method {
    public static void main(String[] args) {
        System.out.println(calcTotal(100));

        System.out.println("====================");
        System.out.println(calcTotal2(34, 96));

        System.out.println("====================");
        System.out.println(selectRandomFood());
        System.out.println(selectRandomFood());
        System.out.println(selectRandomFood());

        // 배열 선언 후 메서드 사용
        System.out.println("====================");
        int[] arr = {10, 30, 50, 70, 90, 110, 130};
        System.out.println(calAverage(arr));

        // 배열 선언없이 가변 파라미터로 매서드 사용
        System.out.println("====================");
        System.out.println(calAverage2(1,2,3,4,6,8,3,5,8,9,4,3,3,6,9,9,4));

        System.out.println("====================");
        int[] result = operatorTotal(30,6);
        for (int i : result) {
            System.out.println(i);
        }

        System.out.println("====================");
        divide(20, 4);
        divide(20, 0);
    }

    public static int calcTotal(int num) {
        int total = 0;
        for (int i = 1; i <= num; i++) {
            total += i;
        }
        return total;
    }

    public static int calcTotal2(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }

    public static String selectRandomFood() {
        double rn = Math.random();
        if (rn > 0.66) {
            return "치킨";
        } else if (rn > 0.33) {
            return "족발";
        } else {
            return "햄버거";
        }
    }

    public static double calAverage(int[] nums) {
        int total = 0;
        for ( int num : nums) {
            total += num;
        }
        return (double) total / nums.length;
    }

    // 가변 파라미터를 사용한 매개변수 설정
    // 콤마로 나열되어 있는 여러개의 값을 배열로 묶어서 매서드 내부로 보내는 방식
    public static double calAverage2(int... nums) {
        int total = 0;
        for ( int num : nums) {
            total += num;
        }
        return (double) total / nums.length;
    }

    public static int[] operatorTotal(int num1, int num2) {
        return new int[] {num1 + num2, num1 - num2, num1 * num2, num1 / num2};
    }

    public static void divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("0으로는 나눌 수 없습니다.\n");
            return;
        }
        int result = num1 / num2;
        System.out.printf("%d / %d = %d\n", num1, num2, result);

    }
}
