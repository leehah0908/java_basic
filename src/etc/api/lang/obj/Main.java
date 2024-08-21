package etc.api.lang.obj;

public class Main {
    public static void main(String[] args) {
        Person kim = new Person("김춘식", 30);
        Person hong = new Person("홍길동", 25);

        // 객체타입의 변수를 출력하거나 값을 얻을 때는 뒤에 자동으로.toString()이 붙어서 진행됨 (Object가 불러주는 매서드)
        System.out.println(kim);
        System.out.println(hong);

        System.out.println("====================");
        // 객체가 달라도, 이름이랑 나이가 같으면 같은 객체라고 인식하도록 equals()를 오버리이딩했기 때문에 true
        System.out.println(kim.equals(hong));

        System.out.println("====================");
        Person park = new Person("박영희", 20);

        try {
            Person clonePerson = (Person) park.clone();
            System.out.println("피복제인간");
            System.out.println("park = " + park);
            System.out.println("복제인간");
            System.out.println("clonePerson = " + clonePerson);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
