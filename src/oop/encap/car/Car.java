package oop.encap.car;

public class Car {

    private String model;
    private int speed;
    private char mode;
    private boolean start;

    // setModel이 없으므로 한번 생성하면 나중에 변경하지 못함. -> 생성할때 지정하도록 강제
    public Car(String model) {
        this.model = model;
        System.out.println("모델명: " + model);
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0 || speed > 300) {
            System.out.println("잘못된 속도입니다.");
            return;
        } else if (!start) {
            System.out.println("시동이 걸리지 않았습니다.");
            return;
        } else if (mode == 'D' || mode == 'R') {
            if (mode == 'R' && speed > 40) {
                System.out.println("후진은 40km를 넘을 수 없습니다.");
                return;
            }
            System.out.println("속도를 " + speed + "로 맞춥니다.");
            this.speed = speed;
        } else {
            System.out.println("변속기 위치를 확인하세요!");
        }
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D', 'R', 'N', 'P':
                this.mode = mode;
                break;
            default:
                System.out.println("올바르지 않은 변속기 모드입니다.");
        }
    }

    public boolean isStart() {
        return start;
    }

    //시동 버튼 누르는 행위
    public void engineStart() {
        System.out.println("시동버튼을 눌렀습니다.");
        injectOil();
        injectGasoline();
        this.start = true;
        moveCylinder();
        System.out.println("시동이 걸렸습니다.");
    }

    //엔진오일이 주입되는 기능
    private void injectOil() {
        System.out.println("엔진오일이 순환합니다.");
    }

    //엔진에 연료가 주입되는 기능
    private void injectGasoline() {
        System.out.println("연료가 엔진에 주입됩니다.");
    }

    //실린더가 움직이는 기능
    private void moveCylinder() {
        if (start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("실린더가 움직이지 않습니다.");
        }
    }

    //시동을 끄는 행위
    public void engineStop() {
        if (speed > 0) {
            System.out.println("주행중에는 시동을 끌 수 없습니다.");
            return;
        } else if (mode != 'P') {
            System.out.println("P모드로 먼저 변경해주세요.");
            return;
        } else {
            this.start = false;
        }
        System.out.println("시동이 꺼졌습니다.");
    }
}

