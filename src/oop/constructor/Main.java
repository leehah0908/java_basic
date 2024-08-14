package oop.constructor;

public class Main {
    public static void main(String[] args) {
        Phone basic = new Phone();
        basic.showSpec();

        Phone Galaxy = new Phone("갤럭시 s24", "블랙");
        Galaxy.showSpec();

        Phone iPhone = new Phone("아이폰 16", "스페이스 블랙");
        iPhone.showSpec();
    }
}
