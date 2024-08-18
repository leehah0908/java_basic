package oop.Ex.productEx;

public class Store {
    /*
    2. 클래스 `Store` 생성
        - 속성:
            - `totalSales` (총 판매액, 정수형, private static 필드)
        - 메소드:
            - `addSale(int amount)`: 판매액을 총 판매액에 추가하는 static 메소드.
            - `getTotalSales()`: 현재까지의 총 판매액을 반환하는 static 메소드.
     */

    private static int totalSales;

    static void addSale(int amount) {
        totalSales += amount;
    }

    static int getTotalSales() {
        return totalSales;
    }
}
