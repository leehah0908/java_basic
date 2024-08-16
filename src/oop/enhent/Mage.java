package oop.enhent;

public class Mage extends Player{
    int mp;

    public Mage(String nickname) {
        super(nickname);
        this.mp = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mp: " + this.mp);
    }
}
