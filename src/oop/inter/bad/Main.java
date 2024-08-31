package oop.inter.bad;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("진행하실 번호를 입력해주세요: ");
        System.out.println("1. 글 작성 | 2. 글 조회 | 3. 글 수정 | 4. 글 삭제");
        int num = input.nextInt();

        if (num == 1) {
            BoradWrite wr = new BoradWrite();
            wr.write();
        } else if (num == 2) {
            BoardList list = new BoardList();
            list.select();
        } else if (num == 3) {
            BoardUpdate update = new BoardUpdate();
            update.update();
        } else if (num == 4) {
            BoardDelete delete = new BoardDelete();
            delete.delete();
        }

    }
}
