package begin.Ex;

import java.util.Scanner;

public class LoopEx1 {
    public static void main(String[] args) {
        /*
		 - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를
		  가로로 출력하고, 그 소수들의 개수를 구하는 로직을 작성합니다.

		 ex)
		 입력받은 수 -> 30
		 소수: 2 3 5 7 11 13 17 19 23 29
		 소수의 개수: 10개
		*/

        Scanner input = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = input.nextInt();
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            int soCnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    soCnt++;
                }
            }
            if (soCnt == 2) {
                System.out.print(i + " ");
                cnt++;
            }
        }
        System.out.println();
        System.out.println(num + "까지의 소수 갯수는 " + cnt + "개 입니다.");
    }
}
