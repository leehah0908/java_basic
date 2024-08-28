package oop.poly.player;

public class Player {
    String nickName;
    int level;
    int hp;

    Player() {
        level = 1;
        hp = 50;
    }

    Player(String nickname) {
        this();
        this.nickName = nickname;
    }

    public Player(int hp, String nickname) {
        this(nickname);
        this.hp = hp;
    }

    public Player(String nickname, int level, int hp) {
        this(hp, nickname);
        this.level = level;
    }

    void attack(Player target) {
        if (this == target) {
            System.out.println("타겟이 잘못 설정되었습니다.");
            return;
        }
        System.out.printf("%s이(가) %s을(를) 공격합니다.\n", this.nickName, target.nickName);
        target.hp -= 10;
        this.hp -= 3;
        System.out.printf("%s님의 남은 체력: %d\n", target.nickName, target.hp);
        System.out.printf("%s님의 남은 체력: %d\n", this.nickName, this.hp);
    }

    public void showStatus() {
        System.out.println("\n======= Character's Info ========");
        System.out.println("# name: " + this.nickName);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}