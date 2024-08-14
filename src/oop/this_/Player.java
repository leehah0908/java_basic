package oop.this_;

public class Player {

    String nickname;
    int level;
    int hp;

    Player() {
        level = 1;
        hp = 50;
    }

    Player(String nickname) {
        // 기본 생성자의 값을 사용하기 위해 선언해서 기본값을 넣고, 매개변수로 받은 데이터가 있다면 덮어 씌우는 방식
        // 내 다른 생성자를 호출
        this();

        // this -> 이 생성자를 사용해서 맨든 객체의 주소
        // 없으면 좌항 우항의 변수명이 같아서 충돌을 일으킴
        this.nickname = nickname;
    }

    public Player(int hp, String nickname) {
        // 값을 두개 받는 생성자를 만들어서 사용하고 싶을 때, 이전의 같은 코드(this.nickname = nickname;)를 중복 사용하는 것은 좋지 않음
        //   -> 중복 코드가 담긴 생성자를 선언하고, 현재 생성자에서"만" 하는 새로운 코드(this.hp = hp;)를 추가로 작성
        this(nickname); // 닉네임 설정하는 생성자는 있잖아? -> 너가 해
        this.hp = hp; // 체력을 설정하는 생성자는 없네 -> 내가 할게
    }

    public Player(String nickname, int level, int hp) {
        this(hp, nickname); // 닉네임이랑 hp 설정하는 생성자는 있잖아? -> 너가 해
        this.level = level; // 레벨을 설정하는 생성자는 없네 -> 내가 할게

        // 근데 사실 전체 값이 들어오는거면 이렇게 해도 됨
        // this.nickname = nickname;
        // this.hp = hp;
        // this.level = level;
    }

    void attack(Player target) {
        if (this == target) {
            System.out.println("타겟이 잘못 설정되었습니다.");
            return;
        }
        System.out.printf("%s이(가) %s을(를) 공격합니다.\n", this.nickname, target.nickname);
        target.hp -= 10;
        this.hp -= 3;
        System.out.printf("%s님의 남은 체력: %d\n", target.nickname, target.hp);
        System.out.printf("%s님의 남은 체력: %d\n", this.nickname, this.hp);

    }

    // 객체 내부의 속성을 문자열 형태로 확인하기 위한 메서드
    @Override
    public String toString() {
        return "Player{" +
                "nickname='" + nickname + '\'' +
                ", level=" + level +
                ", hp=" + hp +
                '}';
    }
}