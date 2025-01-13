package Exercicios.trycatch;

import entities.Account;
import model.exceptions.BusinessException;

import java.io.IOException;
import java.util.Scanner;
import java.text.ParseException;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    try {
        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial Balance: ");
        double balance = sc.nextDouble();
        System.out.print("WWithdraw limit: ");
        double withdraw = sc.nextDouble();

        Account conta1 = new Account(number, holder, balance,withdraw);
        System.out.println(conta1.toString());

        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();
        System.out.println("");
        conta1.withdraw(amount);

        System.out.print("New balance: " + conta1.getBalance());
    }catch (BusinessException e){
        System.out.println(e.getMessage());

    }





    }

}
