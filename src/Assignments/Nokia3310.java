package Assignments;

import java.util.Scanner;

public class Nokia3310 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("""
                               
                        Press menu to list options
                    Press 1. PHONE BOOK
                    Press 2. SETTING
                    Press 3. GAMES
                    Press 4. MESSAGE
                    Press 5. RING TONE
                    press 6. RADIO
                    Press 7. CALCULATOR
                    press 8. CLOCK      
                              
                    """);
            int Menu1 = input.nextInt();
            System.out.println("Press 99 to return back menu");
            switch (Menu1) {
                case 1 -> {
                    System.out.println("""
                                1. PHONE BOOK
                                2. Search
                                3. Dail Number
                                4. Missed  Calls
                                5. Bared Calls
                                6. Received Calls
                                7. Call Settings
                                
                            """);

                    int phoneBook = input.nextInt();
                    switch (phoneBook) {
                        case 1:
                            System.out.println("Enter number, Name, Letter");
                            break;
                        case 2:
                            System.out.println("Dial Number");
                            break;
                        case 3:
                            System.out.println("Received Calls");
                            break;
                        case 4:
                            System.out.println("Missed Calls");
                            break;
                        case 5:
                            System.out.println("Bared calls");
                            break;
                        case 6:
                            System.out.println("Call settings");
                            break;
                    }
                    int setting = input.nextInt();
                    switch (setting) {
                        case 1:
                            System.out.println("SETTING");
                            break;
                        case 2:
                            System.out.println("Sound setting");
                            break;
                        case 3:
                            System.out.println("Call setting");
                            break;
                        case 4:
                            System.out.println("Configuration");
                            break;
                        case 5:
                            System.out.println("Network Setting");
                            break;

                    }
                    int Message = input.nextInt();
                    switch (Message) {
                        case 1:
                            System.out.println("MESSAGE");
                            break;
                        case 2:
                            System.out.println("Inbox");
                            break;
                        case 3:
                            System.out.println("Draft");
                            break;
                        case 4:
                            System.out.println("Out box");
                            break;
                        case 5:
                            System.out.println("""
                                    1. compose message
                                    2. Type Your Message
                                    """);
                            break;
                        case 6:
                            System.out.println("Message Setting");
                            break;
                    }
                        int Game = input.nextInt();
                        switch (Game) {
                            case 1:
                                System.out.println("GAME");
                                break;
                            case 2:
                                System.out.println("Snake Highland");
                                break;
                            case 3:
                                System.out.println("Game Setting");
                                break;
                        }
                        int ringTone = input.nextInt();
                        switch (ringTone) {
                            case 1:
                                System.out.println("RING TONE");
                                break;
                            case 2:
                                System.out.println("Come feel me");
                                break;
                            case 3:
                                System.out.println("settings");
                                break;
                        }
                        int Radio = input.nextInt();
                        switch (Radio) {
                            case 1:
                                System.out.println("RADIO");
                                break;
                            case 2:
                                System.out.println("Tuner");
                                break;
                            case 3:
                                System.out.println("FM");
                                break;
                            case 4:
                                System.out.println("AM");
                                break;
                            case 5:
                                System.out.println("Setting");
                                break;
                        }
                        int Calculator = input.nextInt();
                        switch (Calculator) {
                            case 1:
                                System.out.println("Add Two Number");
                                break;
                            case 2:
                                System.out.println("Subtract Tow Number");
                                break;
                            case 3:
                                System.out.println("Multiply Two Number");
                                break;
                            case 4:
                                System.out.println("Sum Total");
                                break;
                            case 5:
                                System.out.println("Square Number");
                            case 6:
                                System.out.println("Square Root of Number");
                                break;

                        }
                    }

                }
            }
        }