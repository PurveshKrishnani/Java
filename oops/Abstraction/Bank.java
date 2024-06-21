package oops.Abstraction;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void openAccount(String accountType, String accountHolder, float balance, int accountNumber) {
        switch (accountType.toLowerCase()) {
            case "checking":
                accounts.add(new CheckingAccount(accountNumber, accountHolder, balance, 1000));
                break;
            case "savings":
                accounts.add(new SavingsAccount(accountNumber, accountHolder, balance, 7));
                break;
            case "credit":
                accounts.add(new CreditAccount(accountNumber, accountHolder, balance, 1000));
                break;
            default:
                System.out.println("Invalid account type.");
                break;
        }
    }

    public void  depositIntoAccount (long accountNumber  , long amount){

        for(Account account : accounts)
        {
            if(account.getAccountNumber() ==  accountNumber)
            {
                account.deposit(amount);
                System.out.println("amount is credited");
                return;

            }
        }
        System.out.println("account  not  found");

    }

    public  void  withdrawFromAccount(long accountNumber  , long amount){

        for(Account account : accounts)
        {
            if(account.getAccountNumber() ==  accountNumber)
            {
                account.withdraw(amount);
                System.out.println("amount is deducted");
                return;
            }
        }
        System.out.println("account  not  found");

    }





    public  static  void main(String args[]) {

        Bank bank=  new Bank();


        try{
            bank.openAccount("credit" , "krishnani" ,4000, 10003);
            System.out.println("Account is created ");
        }
        catch (Exception e){
            System.out.println("some thing  went  wring  while  creating an  acount ");

        }



        try{
            bank.openAccount("checking" , "puru" ,3000, 10002);
            System.out.println("Account is created ");
        }
        catch (Exception e){
            System.out.println("some thing  went  wring  while  creating an  acount ");

        }


        try{
            bank.openAccount("savings" , "Purvesh" ,2000, 10001);
        System.out.println("Account is created ");
        }
        catch(Exception e){
            System.out.println("some thing  went  wring  while  creating an  acount ");
        }
        bank.depositIntoAccount(10001,1000);
        bank.withdrawFromAccount(10001,1000);

    }






}
