package oop.poly.Player;


public class Warrior extends Player {
    int rage;

    public void dash() {
        System.out.println("돌진 스킬을 사용합니다.");
    }

    Warrior(String nickName) {
        super(nickName);
        rage = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# rage: " + rage);
    }
}
