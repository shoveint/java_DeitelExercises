package tdd;


public class Account {
    private int balance;

    public Account(int withdrawMoney) {
    }

    public void deposit(int amount) {
            if (amount > 0) balance = balance + amount;
        }

    public int getBalance() {
        return balance;
    }
}
