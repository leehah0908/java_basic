package oop.inter.good;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 다형성 적용을 위해 인터페이스 타입의 변수를 하나 선언
        IBoardService sv;

        Scanner input = new Scanner(System.in);
        System.out.println("진행하실 번호를 입력해주세요: ");
        System.out.println("1. 글 작성 | 2. 글 조회 | 3. 글 수정 | 4. 글 삭제");
        int num = input.nextInt();

        if (num == 1) {
            sv = new BoardWrite();
        } else if (num == 2) {
            sv = new BoardList();
        } else if (num == 3) {
            sv = new BoardUpdate();
        } else {
            sv = new BoardDelete();
        }

        sv.excute();
    }
}
