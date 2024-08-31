package oop.inter.good;

public class BoardList implements IBoardService{
    @Override
    public void excute() {
        System.out.println("글 조회 요청이 들어왔습니다.");
    }
}
