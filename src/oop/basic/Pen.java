package oop.basic;

public class Pen {
    String color;
    int price;
    int productId;

    void write() {
        System.out.println(color + "으로 글을 씁니다.");
    }

    void draw() {
        System.out.println(color + "으로 그림을 그립니다.");
    }

    void priceInfo() {
        System.out.println("제품번호: " + productId);
        System.out.println(color + " 펜의 가격은 " + price + "원 입니다.");
    }
}
