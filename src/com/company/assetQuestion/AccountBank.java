package com.company.assetQuestion;

public class AccountBank {
    private String accountNumber;
    private int balance;

    AccountBank(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString(){
        return balance + "원 (계좌번호 =" + accountNumber.trim() + ")";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;
        if(!(obj instanceof AccountBank)) return false;
        AccountBank accountBank = (AccountBank) obj;

        return accountNumber.trim().equals(accountBank.accountNumber.trim());
    }
}