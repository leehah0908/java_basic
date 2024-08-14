package oop.constructor;

public class Phone {
    String model;
    String color;
    int price;

    Phone() {
        // 기본적으로 변수당 하나씩 값을 깔아놔야 오류에 유연함
        // 회원가입 예시 : ID, PW, 이름은 필수 항목이고/ 이메일, 전화번호는 선택사항일 때.
    }

    // 생성자 오버로딩
    Phone(String pModel, String pColer) {
        model = pModel;
        color = pColer;
        price = 1000000;
    }

    void showSpec() {
        System.out.println("===== 휴대폰의 정보 =====");
        System.out.println("모델명: " + model);
        System.out.println("색상: " + color);
        System.out.println("가격: " + price);

    }
}
