package oop.poly.car;

public class Main {
    public static void main(String[] args) {
        Sonata s1 = new Sonata();
        Sonata s2 = new Sonata();
        Sonata s3 = new Sonata();

        Porsche p1 = new Porsche();
        Porsche p2 = new Porsche();
        Porsche p3 = new Porsche();

        Tesla t1 = new Tesla();
        Tesla t2 = new Tesla();
        Tesla t3 = new Tesla();
        Tesla t4 = new Tesla();

        // 직접 접근 (1000개면 어쩔겨??)
//        s1.run();s2.run();s3.run();
//        p1.run();p2.run();p3.run();
//        t1.run();t2.run();t3.run();t4.run();

        // for문 접근 (차종이 많으면 어쩔겨??)
//        Sonata[] sonatas = {s1, s2, s3};
//        Porsche[] porsches = {p1, p2, p3};
//        Tesla[] teslas = {t1, t2, t3, t4};

//        for (Sonata sonata : sonatas) {
//            sonata.run();
//        }

        // 다형성을 적용해서 서로 다른 타입들을 모아놓을 수 있다. (이종 모음의 배열 구현 가능)
        Car[] cars = {s1, s2, s3, p1, p2, p3, t1, t2, t3, t4};
        for (Car car : cars) {
            car.run();
        }

        System.out.println("====================================");
        Driver kim = new Driver();
        kim.drive(s1);
        kim.drive(p1);
        kim.drive(t1);

        System.out.println("====================================");
        Car newSonata = kim.buyCar("소나타");
        Car newPorsche = kim.buyCar("포르쉐");
        Car newTesla = kim.buyCar("테슬라");

        newSonata.run();
        newPorsche.run();
        newTesla.run();

    }
}
