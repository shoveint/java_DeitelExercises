package EStore;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    static ArrayList<String> list = new ArrayList<>();
    private static Scanner input2;

    public static void item() {
        System.out.println("Enter quantity: ");
        String item = input2.nextLine();
        list.add(item);
    }
}
