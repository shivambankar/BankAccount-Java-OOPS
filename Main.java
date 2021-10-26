/**
     DOCUMENTATION
     Author : Shivam Bankar
     Created on : 13-04-2021
     Company : xyz
    
     This is a program that performs basic bank related operations using oops.
     */


public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountHolderName = "SSB";
        bankAccount.setBalance(0);
        bankAccount.setPhoneNumber("1234567890");

        bankAccount.openAccount();
        bankAccount.checkBalance();

        bankAccount.addMoney(1000);
        bankAccount.withdrawMoney(500);

        bankAccount.checkBalance();
        bankAccount.withdrawMoney(2000);
    }
}
