package Assignments;

public class Wallet {
    private static double value;
    public static double getTotalMoney(){
        return value;
    }
    public void setTotalMoney(double newValue){
        value = newValue;
    }
    public void addMoney(double deposit){
        value += deposit;
    }
    public void subtractMoney(double debit){
        value -= debit;
    }
}
