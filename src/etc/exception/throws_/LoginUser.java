package etc.exception.throws_;

import etc.exception.custom.InvalidLoginInputException;

public class LoginUser {
    private String acccount; // 가입시 계정
    private String password; // 가입시 비밀번호

    public LoginUser(String acccount, String password) {
        this.acccount = acccount;
        this.password = password;
    }

    public static final boolean SUCCESS = true;
    public static final boolean LOGIN_FAIL = false;

    // 로그인 검증
    public void loginValidate(String inputAccount, String inputPassword) throws Exception {
//        if (inputAccount.equals(this.acccount)) {
//            if (inputPassword.equals(this.password)) {
//                return SUCCESS;
//            }
//            return LOGIN_FAIL;
//        }
//        return LOGIN_FAIL;

        idValidate(inputAccount);
        pwValidate(inputPassword);
    }

    private void idValidate(String acccount) throws Exception {
        if (!acccount.equals(this.acccount)) {
            // 예외 만들기
            throw new InvalidLoginInputException("아이디가 일치하지 않습니다.");
        }
    }

    private void pwValidate(String password) throws Exception {
        if (!password.equals(this.password)) {
            throw new InvalidLoginInputException("비밀번호가 일치하지 않습니다.");
        }
    }


}
