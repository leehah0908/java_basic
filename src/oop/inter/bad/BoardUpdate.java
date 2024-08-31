package oop.inter.bad;

public class BoardUpdate {
    public BoardUpdate() {
        System.out.println("글 수정 요청이 들어왔습니다.");
    }

    public void update() {
        System.out.println("글 수정 로직이 수행됩니다.");
        System.out.println("수정돤 값을 확인하고 DB에 저장하고 등등..");
    }
}
