package begin.Ex;

import java.util.Scanner;

public class IfEx1 {
    public static void main(String[] args) {
         /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해 보세요.
        # max, mid, min이라는 변수를 미리 선언하셔서
         판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
         마지막에 한번에 출력하시면 되겠습니다.
        */

        Scanner input = new Scanner(System.in);

        System.out.print("각각 다른 정수 3개를 입력하세요 : ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max, mid, min;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b > c) {
            max = b;
        } else {
            max = c;
        }

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }

        mid = a + b + c - min - max;

        System.out.println("가장 큰 값은 " + max + "입니다.");
        System.out.println("가장 작은 값은 " + min + "입니다.");
        System.out.println("중간 값은 " + mid + "입니다.");
    }
}
