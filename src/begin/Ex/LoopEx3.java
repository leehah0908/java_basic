package begin.Ex;

import java.util.Scanner;
import java.util.Stack;

public class LoopEx3 {
    public static void main(String[] args) {
        /*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		  소수: 약수가 1과 자기 자신만 있는 수.
		 */

        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = input.nextInt();
        int cnt = 0;

        for (int j = 1; j <= num; j++) {
            if (num % j == 0) {
                cnt++;
            }
        }

        if (cnt == 2) {
            System.out.println(num + "은 소수입니다. ");
        } else {
            System.out.println(num + "은 소수가 아닙니다. ");
        }

//        또 다른 간단한 알고리즘!
//        int k = 2;
//
//        while (num % k != 0) {
//            k++;
//        }
//
//        System.out.printf("%d는 %s\n", num, num == k ? "소수입니다." : "소수가 아닙니다.");

    }
}
