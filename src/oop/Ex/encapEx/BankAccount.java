package oop.Ex.encapEx;

public class BankAccount {
    /*
    1. 은행 계좌 클래스 만들기
        - 은행 계좌를 관리하는 `BankAccount` 클래스를 만드세요.
        - 계좌 잔액(balance), 계좌 번호(accountNumber), 계좌 주인의 이름(accountHolder) 필드를 private로 선언하세요.
        - 잔액 조회, 입금, 출금 메소드를 public으로 만들어 외부에서 접근할 수 있게 하세요.
        - 출금 메소드는 잔액이 출금하려는 금액보다 클 때만 돈을 출금할 수 있도록 하세요.
    */

    private int balance;
    private String accountNumber;
    private String accountHolder;

    public BankAccount(String accountNumber, String accountHolder, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // 잔액조회
    public int getBalance() {
        return this.balance;
    }

    // 입금
    public void deposit(int depositAmount) {
        this.balance += depositAmount;
    }

    // 출금
    public void withdraw(int withdrawAmount) {
        if (this.balance < withdrawAmount) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.balance -= withdrawAmount;
    }


}
