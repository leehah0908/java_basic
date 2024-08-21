package etc.api.lang.obj;

import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString(): 객체의 정보(필드)를 문자열 형태로 리턴
    @Override
    public String toString() {
        return "Person" +
                "\n이름: " + name +
                "\n나이: " + age;
    }

    // equals를 오버라이딩 할 때는 hashCode도 함께 오버라이딩을 진행해 주시는 것이 좋습니다.
    // equals를 재정의한다는 것은 내가 원하는 방식의 동등 비교를 하겠다는 것이기 때문에
    // hashcode의 값도 그에 맞게 같이 재정의가 되어야 합니다. (hash 주소를 equals에 맞게 정의)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Person) {
            Person p = (Person) obj;
            return p.age == this.age && p.name.equals(this.name);
        }
        return false;
    }

    // 내가 설정한 equals()의 기준에 따라서 해시코드를 같게 만드냐, 다르게 만드냐가 정해짐
    // 위에서 age, name 둘 다 같아야 true라고 했기 때문에 hash(name, age); 이런식으로 두개 변수가 다 들어가야 함
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // 객체 복사 메서드
    // Cloneable을 선언해야 함
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 생성된 객체가 소멸하는 시점에서 자동 호출 (gc가 실행될때)
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
