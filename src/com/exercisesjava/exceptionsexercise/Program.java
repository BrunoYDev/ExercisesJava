package com.exercisesjava.exceptionsexercise;

import com.exercisesjava.exceptionsexercise.entities.Account;
import com.exercisesjava.exceptionsexercise.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data: ");
        System.out.print("Enter account Number: (Integer) ");
        Integer accNumber = sc.nextInt();
        System.out.print("Enter Account Holder Name: ");
        sc.nextLine();
        String holderName = sc.nextLine();
        System.out.print("Enter the initial Account balance: ");
        Double accBalance = sc.nextDouble();
        System.out.print("Enter Account withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        try{
            Account acc = new Account(accNumber, holderName, accBalance, withdrawLimit);

            System.out.print("Enter the amount for withdraw: ");
            Double withdrawAmount = sc.nextDouble();

            acc.Withdraw(withdrawAmount);

            System.out.println("New balance: " + acc.getBalance());

        }catch (WithdrawException we){
            System.out.println("Error in withdraw: " + we.getMessage());
        }catch (IllegalArgumentException ie){
            System.out.println(("Illegal Argument Passed: " + ie.getMessage()));
        }

        sc.close();
    }
}
