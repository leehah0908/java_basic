package oop.basic;

public class Main {
    public static void main(String[] args) {
        Pen redPen = new Pen();
        redPen.color = "빨간색";
        redPen.price = 1000;
        redPen.productId = 1;

        Pen bluePen = new Pen();
        bluePen.color = "파란색";
        bluePen.price = 1500;
        bluePen.productId = 2;

        Pen yellowPen = new Pen();
        yellowPen.color = "노란색";
        yellowPen.price = 1300;
        yellowPen.productId = 3;

        Pen[] penList = {redPen, bluePen, yellowPen};
        for (Pen pen : penList) {
            pen.write();
        }

        System.out.println("============================");
        for (Pen pen : penList) {
            pen.priceInfo();
        }
    }
}
