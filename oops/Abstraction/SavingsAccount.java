package oops.Abstraction;

public class SavingsAccount   extends Account{
    public SavingsAccount(long accountNumber, String accountHolder, float balance, long interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", savingAccountInterest=" + savingAccountInterest +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

    protected   long interestRate;
    final  double savingAccountInterest=7.15;

    public SavingsAccount(long accountNumber, String accountHolder, float balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void withdraw(long amount) {
        if(balance >= amount )
        {
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

    void   calculateInterest(long amount){
        double fee = amount * savingAccountInterest;
        System.out.println("Interest  will be : " + fee);

    }
    double getInterest(Long  amount){
            return  savingAccountInterest;
    }
}
