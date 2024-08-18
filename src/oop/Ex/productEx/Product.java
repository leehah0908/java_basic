package oop.Ex.productEx;

import static oop.Ex.productEx.Store.addSale;

public class Product {
    /*
    1. 클래스 `Product` 생성
        - 속성:
            - `productName` (제품 이름, 문자열)
            - `price` (제품 가격, 정수형)
        - 메소드:
            - 생성자: `productName`과 `price`를 매개변수로 받아 초기화합니다.
            - `sellProduct()`: 제품을 판매하고 `Store`의 총 판매액을 업데이트합니다.
     */

    String productName;
    int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    void sellProduct() {
        addSale(this.price);
    }
}
