package oop.inter.good;

public class BoardWrite implements IBoardService{

    @Override
    public void excute() {
        System.out.println("글 작성 요청 들어옴");
    }
}
