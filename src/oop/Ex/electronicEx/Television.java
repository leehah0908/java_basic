package oop.Ex.electronicEx;

public class Television extends ElectronicProduct{
    /*
    2. 서브 클래스 `Television` 생성
        - `ElectronicProduct`의 서브 클래스입니다.
        - 추가 속성:
            - `screenSize` (화면 크기, 정수형)
        - 메소드:
            - 생성자: 기본 클래스의 속성과 `screenSize`를 초기화합니다.
            - `displayInfo()` 메소드를 오버라이드하여 화면 크기 정보도 포함하여 출력합니다.
    */

    int screenSize;

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("화면 크기: " + this.screenSize + " inches");
    }

    public Television(String productName, double price, String manufacturer, int screenSize) {
        super(productName, price, manufacturer);
        this.screenSize = screenSize;
    }
}
