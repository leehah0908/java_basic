package oop.encap.good;

public class MyBirth {
    // 정보 은닉 사용!!
    // 데이터 보호의 목적으로 사용하는 기술 중 하나.

    // 외부에서 변수에 직접 접근할 수 없게 필드에 private 제한을 붙임.
    private int year;
    private int month;
    private int day;

    /*
     - 정보 은닉은 데이터에 접근 제한을 걸어서 정보를 보호하는 것이 목적이지만
      private을 설정했더니 데이터 접근 자체가 불가능해집니다.

     - 따라서 데이터의 유효성을 검증할 수 있는 제어문이 포함된
      메서드를 사용하여 데이터의 접근을 허용하도록 설계하는데,
      이 때 사용하는 메서드를 getter / setter 메서드라고 부릅니다.
      -> 막 넣지 말고 나한테 검사받고 넣어.

    ============================================================
      # setter method

     1. setter는 숨겨진 변수에 값을 저장하기 위한 메서드 입니다.

     2. 메서드 내부에 데이터 유효성 검증 로직을 작성하여
      적절한 데이터만 멤버변수에 저장시키고, 접근제한자는
      public으로 설정하여 외부에서 누구나 사용할 수 있게 합니다.

     3. 메서드 이름은 일반적으로 set + 멤버변수이름 으로 설정합니다.

     ============================================================
     # getter method

     1. getter는 숨겨진 변수의 값을 참조할 때 사용하는 메서드입니다.

     2. setter와 마찬가지로 public제한을 통해 외부에 메서드를 공개하고,
      이름은 일반적으로 get + 멤버변수이름 으로 지정합니다.
     */

    // ============================================== setter ==============================================
    public void setYear(int year) {
        if (year < 1900 || year > 2024) {
            System.out.println("잘못된 연도입니다.");
            return;
        }
        this.year = year;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("잘못된 월입니다.");
            return;
        }
        this.month = month;
    }

    public void setDay(int day) {
        if (day < 1 || day > 31) {
            System.out.println("잘못된 일입니다.");
        } else {
            if (this.month == 0) {
                System.out.println("일자를 입혁하기 위해서는 월 입력이 되어야 합니다.");
                return;
            }else if (!isValidate(day)){
                System.out.println("월에 따른 날짜가 잘못 입력되었습니다.");
                return;
            }
            this.day = day;
        }
    }

    // ============================================== getter ==============================================
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // ============================================== Info ==============================================
    public void birthInfo() {
        if (year == 0 || month == 0 || day == 0) {
            System.out.println("날짜 필드 중에 초기화되지 않은 데이터가 있습니다.");
            return;
        }
        System.out.printf("내 생일은 %d년 %d월 %d일 입니다.\n", year, month, day);
    }

    private boolean isValidate(int day) {
        switch (this.month) {
            case 2:
                if (day > 28) {
                    return false;
                }
            case 4, 6, 9, 11:
                if (day > 30) {
                    return false;
                }
            default:
                return true;
        }
    }
}
