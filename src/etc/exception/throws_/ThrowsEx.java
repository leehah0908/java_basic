package etc.exception.throws_;

public class ThrowsEx {
    static String[] greetings = {"안녕", "Hello", "나하오"};

    static void greet(int idx)  throws Exception{
        System.out.println(greetings[idx]);
    }

    public static void main(String[] args) {
        try {
            greet(1);
        } catch (Exception e) {
            System.out.println("메서드의  매개값이 잘못됨.");
        }

        System.out.println("==========================");
        LoginUser user = new LoginUser("abb1234", "aaa1111");

        try {
            user.loginValidate("abb1234", "aaa1111");
            System.out.println("로그인 성공");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
