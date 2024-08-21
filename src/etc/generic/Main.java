package etc.generic;

public class Main {
    public static void main(String[] args) {
        /*
        - Object타입으로 선언하면 무엇이든 저장할 수는 있지만 반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야하는 문제가 발생합니다.
        - 잘못 형변환 했을시에는 예외가 발생할 수도 있습니다.

        # 제네릭
        - 클래스 내부에서 타입을 지정하는 것이 아니라 외부에서 객체를 생성할 때 타입이 지정될 수 있게 하는 문법.
        - 제네릭을 사용하면 객체로 생성할 때 사용할 타입을 지정할 수 있고 따로 타입을 체크하고 변환해줄 필요가 없습니다.
        - 관리가 용이하고 잘못된 타입이 들어올 수 있는 것을 방지하기 때문에 유지보수성, 코드의 재사용성이 높아집니다.
         */

        Box<String> box = new Box<>();
        box.setOdj("홍길동");
        int length = box.getOdj().length(); // -> 형변환이 따로 필요X

        Box<Person> pBox = new Box<>();
        pBox.setOdj(new Person());
        String name = pBox.getOdj().getName();
        System.out.println(name);

        Box<Integer> intBox = new Box<>();
        intBox.setOdj(20);
        int odj = intBox.getOdj();


        MultiBox<Integer, String > multi = new MultiBox<>(1, "홍길동");
        multi.put(10, "김춘식");
        System.out.println(multi);

    }
}
