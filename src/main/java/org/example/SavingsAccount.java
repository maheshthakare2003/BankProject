package org.example;

public class SavingsAccount {
    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    double balance;
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
//            balance -= 1;
            System.out.println(amount + " rupees withdrawn successfully and now the balance is "+balance);
        }
        else {
            System.out.println("Your account doesn't have sufficient balance");
        }
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Account deposited successfullly with "+ amount + " and now the balance is "+ balance);
    }

    public double getBalance(){
        System.out.println("The balance is "+balance);
        return balance;

    }
}