package Assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingMall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        ArrayList<String> itemList = new ArrayList<>();
        ArrayList<Integer> quantityList = new ArrayList<>();
        ArrayList<Double> priceList = new ArrayList<>();


        while (true){
            System.out.println("Enter item: ");
            String item = input2.nextLine();
            itemList.add(item);

            System.out.println("Enter quantity: ");
            int quantity = input.nextInt();
            quantityList.add(quantity);

            System.out.println("Enter price: ");
            double price = input.nextDouble();
            priceList.add(price);


            String moreItem = "";
            while (true) {

                System.out.println("Are you buying more item?: ");
                moreItem = input2.nextLine().toLowerCase();

                if (!moreItem.equals("yes") && !moreItem.equals("no")) {

                    System.out.println("invalid input");
                }
                else {
                    break;
                }
            }

            double grandTotal = 0;
            for (int index = 0; index < priceList.size(); index++){
                grandTotal += quantityList.get(index) * priceList.get(index);
            }
            if (moreItem.equals("no")){
                System.out.printf("%n%10s%20s%20s%20s%n", "Item", "Quantity", "Price", "Total");
                for (int index = 0; index < itemList.size(); index++){
                    System.out.printf("%10s%20d%20.2f%20.2f%n", itemList.get(index), quantityList.get(index),
                            priceList.get(index), quantityList.get(index) * priceList.get(index));
                    if (index == itemList.size()-1){
                        System.out.printf("%50s%20.2f","Grand total", grandTotal);
                    }
                }
                break;
            }
        }

    }
}
