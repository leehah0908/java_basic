package oop.poly.Player;

public class Hunter extends Player {
    String pet;

    public Hunter(String nickname, String pet) {
        super(nickname);
        this.pet = pet;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# pet: " + this.pet);
    }
}
