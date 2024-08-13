package begin;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // 선언을 하면 비어있는것이 아니라 각 타입별 기본값으로 채워짐
        // byte, int -> 0
        // double, float -> 0.0
        // String -> null
        // char -> 공백
        // boolean -> false
        int[] numbers;
        numbers = new int[5];

        // 길이 제한 없는 배열 만들기
        // 하지만 이 문법은 선안과 동시에 길이가 정해지기 때문에 더이상 추가가 되지 않음!
        int[] newNumbers = {1,2,3,4,5};
        // 그래서 아래와 같이 아예 새롭게 선언을 해줘야 함
        newNumbers = new int[] {1, 2, 3, 4, 5, 6};

        System.out.println("numbers의 주소값 : " + numbers);

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = (int) 3.14;
        numbers[3] = numbers[2] + 80;
        numbers[4] = 100;

        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("numbers[%d] = %d\n", i, numbers[i]);
        }

        for (int num : numbers) {
            System.out.println("num = " + num);
        }

        // 배열 전체 확인하기
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(newNumbers));
    }
}
