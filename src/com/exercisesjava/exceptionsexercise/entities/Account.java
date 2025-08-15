package com.exercisesjava.exceptionsexercise.entities;

import com.exercisesjava.exceptionsexercise.exceptions.WithdrawException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        if(balance < 0){
            throw new IllegalArgumentException("The balance cannot be negative!");
        }else if(withdrawLimit < 0){
            throw new IllegalArgumentException("The withdraw limit cannot be negative!");
        }
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        if(withdrawLimit < 0){
            throw new IllegalArgumentException("The withdraw limit cannot be negative!");
        }
        this.withdrawLimit = withdrawLimit;
    }

    public void DepositAmount(Double amount){
        balance += amount;
    }

    public void Withdraw(Double amount) throws WithdrawException {
        if(amount > withdrawLimit || balance <= 0){
            throw new WithdrawException("Cannot Withdraw this quantity! ( check your withdraw limit or your balance ) ");
        }
        balance -= amount;
    }

}
