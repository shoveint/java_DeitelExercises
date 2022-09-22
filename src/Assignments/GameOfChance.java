package Assignments;

import Assignments.GameStatus;

import java.security.SecureRandom;
import java.util.Scanner;

public class GameOfChance {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static GameStatus status;

    public static int point;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // to win - 7, 11
        // to lose - 2, 3, and 12
        // to crap - 4, 5, 6, 8, 9, and 10
        System.out.println("Press 1 to roll dice OR 0 to quit: ");
        int num = input.nextInt();
        if (num == 1) {
            int sum = rollDice();

            switch (sum) {
                case 7:
                case 11:
                    status = GameStatus.WIN;
                    System.out.println("Player WINS");
                    break;
                case 2:
                case 3:
                case 12:
                    status = GameStatus.LOSE;
                    System.out.println("Player LOSES");
                    break;
                default:
                    status = GameStatus.CONTINUE;
                    int point = sum;
                    System.out.printf("Game continue, you must roll %d again", sum);
                    break;
            }

                while (status == GameStatus.CONTINUE) {
                    System.out.println("\n\nPress 1 to roll dice OR 0 to quit: ");
                    num = input.nextInt();

                    if (num == 0) {
                        System.out.println("Player quits... LOSER!");
                        break;
                    }
                    int sum2 = rollDice();
                    if (sum2 == 7 || sum2 == 11) {
                        status = GameStatus.LOSE;
                        System.out.println("Player LOSES, Game over!");
                        break;

                    } else if (sum2 == point) {
                        status = GameStatus.WIN;
                        System.out.println("Player WINS");
                        break;
                    } else {
                        status = GameStatus.CONTINUE;
                        System.out.println("Game continue");
                    }

                }
            }
        }


    public static int rollDice() {
        int num1 = 1 + randomNumbers.nextInt(6);
        int num2 = 1 + randomNumbers.nextInt(6);

        System.out.printf("You rolled %d and %d to make total of %d%n", num1, num2, (num1 + num2));
        return num1 + num2;
    }
}
