package oop.Ex.encapEx;

public class Product {
    /*
    5. 제품 재고 관리 시스템
        - 제품의 이름(name), 가격(price), 재고 수량(quantity)을 관리하는 `Product` 클래스를 만드세요.
        - 모든 필드를 private로 선언하고, 제품 정보를 읽거나 수정할 수 있는 public 메소드를 구현하세요.
        - 재고를 감소시키는 메소드는 재고가 요청 수량보다 많을 때만 작동하도록 하세요.
    */

    private String name;
    private int price;
    private int stock;


    public void reduceStock(int reduceAmount) {
        if (stock < reduceAmount) {
            System.out.println("재고가 부족합니다.");
            return;
        }
        this.stock -= reduceAmount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int quantity) {
        this.stock = quantity;
    }
}
