package etc.exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        try {
            System.out.print("정수: ");
            int num = input.nextInt();

            int result = 100 / num;

            System.out.println(arr[result]);

            String s = null;
            s.equals("메롱");
        } catch (InputMismatchException | ArithmeticException e) {
            System.out.println("입력값이 잘못되었습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위가 맞지 않습니다.");
        } catch (NullPointerException e) {
            System.out.println("주소가 null입니다.");
        } catch (Exception e) {
            System.out.println("이외의 다른 예외가 발생했습니다.");
        } finally {
            // 보톨 close와 깉은 종료, 데이터 반환 등의 코드를 넣는 블록
            System.out.println("예외 발생 여부와 상관없이 항상 실행되는 블럭");
        }
    }
}
