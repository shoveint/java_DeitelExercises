package Chapter2;


public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double deposit) {

        this.accountName = accountName;
        if (deposit > 0.0){
            balance = balance + deposit;
        }
    }

    public void setAccountName(String justin_love) {
        this.accountName = justin_love;
    }

    public String getAccountName() {

        return accountName;
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance = balance + depositAmount;
        }

    }

    public void withdrawMoney(double withdrawMoney) {
        if (balance >= withdrawMoney ){
            balance = balance - withdrawMoney;
        }

    }

    public double getBalance() {
        return balance;
    }
}
