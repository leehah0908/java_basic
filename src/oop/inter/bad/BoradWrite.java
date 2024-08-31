package oop.inter.bad;

public class BoradWrite {
    public BoradWrite() {
        System.out.println("글 작성 요청 들어옴");
    }

    public void write() {
        System.out.println("글 작성 로직이 실행됩니다.");
        System.out.println("작성 내용을 가벼와서 검증 후 DB에 값을 넣고 등등..");
    }
}
