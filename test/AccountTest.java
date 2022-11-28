import Chapter2.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account("Justin Love", 200.00);
        System.out.println("Available balance is: " + account.getBalance());
        System.out.printf("Initial name is: %s%f%n", account.getAccountName(), account.getBalance());
        System.out.print("Enter deposit amount: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%n adding %.2f to account balance%n%n", depositAmount);
        account.deposit(depositAmount);
        System.out.printf("%s balance: $%.2f%n", account.getAccountName(), account.getBalance());
        System.out.print("Enter deposit amount");
        depositAmount = input.nextDouble();
        System.out.printf("%n adding %f to account balance %n%n", depositAmount);
        System.out.println("Your balance is: " + account.getBalance());

    }
}
