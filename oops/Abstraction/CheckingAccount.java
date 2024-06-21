package oops.Abstraction;

public class CheckingAccount   extends Account{

    public CheckingAccount(long accountNumber, String accountHolder, float balance, float overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "overdraftLimit=" + overdraftLimit +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }

    protected  float  overdraftLimit;
    public CheckingAccount(long accountNumber, String accountHolder, float balance) {
        super(accountNumber, accountHolder, balance);
    }

    @Override
    void withdraw(long amount) {

        if(balance >= amount)
        {
            balance-=amount;
            System.out.println(balance);
        }
        else {
            System.out.println("insufficient  balance");
        }
    }
    @Override
    void deposit(long amount) {

        balance +=amount;
        System.out.println(balance);

    }
        void checkFees(long amount) {
            double feeRate = 0.05;
            double fee = amount * feeRate;
            System.out.println("fees  will be : " + fee);
        }

    void getFees(long  amount) {
        double feeRate = 0.05;
        double fee = amount * feeRate;
        System.out.println("fees  are : " + fee);
    }
}

