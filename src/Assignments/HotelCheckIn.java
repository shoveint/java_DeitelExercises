package Assignments;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class HotelCheckIn {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Date> checkInDate = new ArrayList<>();
        ArrayList<String> descriptionList = new ArrayList<>();
        ArrayList<Double> roomCharges = new ArrayList<>();
        ArrayList<Integer> daySpent = new ArrayList<>();
        ArrayList<Integer> creditIn = new ArrayList<>();
        Date date =new Date();

        while (true){
//            System.out.println("Enter date: ");
//            Integer d = input.nextInt();
//            checkInDate.add(date);

            System.out.println("Enter description: ");
            String description = input.nextLine();
            descriptionList.add(description);
            System.out.println("Enter charges: ");
            double charges = input.nextDouble();
            roomCharges.add(charges);

            System.out.println("Enter amount paid: ");
            int credit = input.nextInt();
            creditIn.add(credit);

            System.out.println("Enter days spent: ");
            int days = input.nextInt();
            daySpent.add(days);

//            System.out.println("Enter numbers of days: ");
//            int daysSpent = input.nextInt();
//            daySpent.add(daysSpent);

            input.nextLine();
            System.out.println("Do you want to add another day?");
            String response = input.nextLine();


            double totalBalance = 0;
            for (int index = 0; index < roomCharges.size(); index++){
                totalBalance += daySpent.get(index) * roomCharges.get(index);
            }
            if (!response.equals("yes")){
                System.out.printf("%n%10s%20s%20s%20s%20s%n", "Date", "Description", "Charges", "Credits", "Balance");
                for (int index = 0; index < daySpent.size(); index++){
                    System.out.printf("%10d%20d%20.2f%20d%20.2f%n",daySpent.get(index), date.getTime(),
                            roomCharges.get(index), creditIn.get(index),
                            daySpent.get(index) * roomCharges.get(index));
                    if (index == daySpent.size()-1){
                        System.out.printf("%70s%20.2f", "Amount Due", totalBalance);
                    }
                }
                break;
            }

        }

    }
}
