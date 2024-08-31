package oop.inter.good;

public class BoardDelete implements IBoardService{

    @Override
    public void excute() {
        System.out.println("글 삭제 요청이 들어왔습니다.");
    }
}
