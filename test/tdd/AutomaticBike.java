package tdd;

public class AutomaticBike {
    public static void main(String[] args) {
        int currentSpeed = 16;
        while (currentSpeed <= 10) {
            System.out.print(currentSpeed + " ");
            currentSpeed = currentSpeed + 10;
        }
    }
}
