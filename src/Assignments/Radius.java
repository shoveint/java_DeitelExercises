package Assignments;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter radius of Sphere: ");
        double radius = input.nextDouble();
        System.out.printf("Volume is %f%n", sphereVolume(radius));

    }

    private static double sphereVolume(double radius) {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
