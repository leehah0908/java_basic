package oop.inter.good;

public class BoardUpdate implements IBoardService{
    @Override
    public void excute() {
        System.out.println("글 수정 요청이 들어왔습니다.");
    }
}
