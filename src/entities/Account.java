package entities;

import model.exceptions.BusinessException;

import java.io.IOException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {

    }

    public Account(Integer number, String holder, Double initialDeposit, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.withdrawLimit = withdrawLimit;
        this.balance = initialDeposit;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        balance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()) {
            throw new BusinessException("Erro de saque: A quantia excede o limite de saque");
        }
        if (amount > getBalance()) {
            throw new BusinessException("Erro de saque: Saldo insuficiente");
        }
    }

    public String toString() {
        return "Account "
                + number
                + ", Holder: "
                + holder
                + ", Withdraw Limit"
                + withdrawLimit
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}