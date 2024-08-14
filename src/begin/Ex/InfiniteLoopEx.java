package begin.Ex;

import java.util.Scanner;

public class InfiniteLoopEx {
    public static void main(String[] args) {
        /*
         1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
          지속적으로 문제를 출제한 후 정답을 입력받으세요.
          사용자가 0을 입력하면 반복문을 탈출시키세요.

         2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("*** 연산 퀴즈 ***");
        System.out.println("# 종료하시려면 0을 입력해 주세요.");

        int jung = 0;
        int oh = 0;
        while (true) {
            int num1 = (int) ((Math.random() * 100) + 1);
            int num2 = (int) ((Math.random() * 100) + 1);
            int cac = (int) ((Math.random() * 5) + 1);
            int result = 0;
            String strcac = "";

            switch (cac) {
                case 1:
                    strcac = "+";
                    result = num1 + num2;
                    break;
                case 2:
                    strcac = "-";
                    result = num1 - num2;
                    break;
                case 3:
                    strcac = "*";
                    result = num1 * num2;
                    break;
                case 4:
                    strcac = "/";
                    result = num1 / num2;
                    break;
                case 5:
                    strcac = "%";
                    result = num1 % num2;
                    break;
            }

            System.out.printf("%d %s %d = ???\n", num1, strcac, num2);

            System.out.print("정답을 적어주세요 : ");
            int correct = input.nextInt();

            if (correct == 0) {
                System.out.printf("정답 횟수 : %d, 오답 횟수 : %d\n", jung, oh);
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                if (result == correct) {
                    System.out.println("정답입니다.");
                    jung++;
                } else if (result != correct) {
                    System.out.println("틀렸습니다.");
                    oh++;
                }
            }
        }
    }
}
