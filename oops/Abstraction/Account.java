package oops.Abstraction;

abstract class Account {

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public float getBalance() {
        return balance;
    }

    protected   long accountNumber;
    protected   String accountHolder ;
   protected   float  balance;


    public Account(long accountNumber, String accountHolder, float balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                '}';
    }


    protected  void getInfo() {
        System.out.println("Account Number =" + accountNumber);
        System.out.println("Account Holder =" + accountHolder);
        System.out.println("Balance ="+balance);
    }

    abstract  void withdraw(long amount);
    abstract  void deposit(long amount);

}

