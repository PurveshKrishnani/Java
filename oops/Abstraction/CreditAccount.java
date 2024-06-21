package oops.Abstraction;

public class CreditAccount extends Account{

    final  long creditLimit = 100000;
    protected long outstandingBalance;


    public long getOutstandingBalance() {
        return outstandingBalance;
    }

    @Override
    public String toString() {
        return "CreditAccount{" +
                "creditLimit=" + creditLimit +
                ", outstandingBalance=" + outstandingBalance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }



    public CreditAccount(long accountNumber, String accountHolder, float balance, long outstandingBalance) {
        super(accountNumber, accountHolder, balance);
        this.outstandingBalance = 0;
    }

    @Override
    void withdraw(long amount) {
        if(balance >= amount ) {
            balance -=amount;
        }
        else {
            System.out.println("insufficient  balance");
        }
    }

    @Override
    void deposit(long amount) {
        balance +=  amount;
    }

    void  checkCredit(long amount){
        if (amount > creditLimit - outstandingBalance) {
            System.out.println("Amount exceeds credit limit.");
        } else {
            outstandingBalance += amount;
            System.out.println("Amount within credit limit. New outstanding balance: " + outstandingBalance);
        }
    }


    public long getCreditLimit() {
        return creditLimit;
    }

}
