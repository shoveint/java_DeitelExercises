package Assignments;

public class Customer {
    private String firstName;
    private String lastName;
    private Wallet myWallet;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public double getPayment(double bill) {
        double payment = 2.0;
        if (myWallet != null) {
            if (Wallet.getTotalMoney() > bill) {
                Wallet theWallet = new Wallet();
                theWallet.subtractMoney(payment);
            }
        }
        return payment;
    }


    public Customer(double payment) {
        Customer myCustomer = new Customer(payment);
        double paidAmount = myCustomer.getPayment(payment);
        if (paidAmount == payment)
            System.out.println(paidAmount);


    }
}