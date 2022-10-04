//A program to convert miles to kilometers using java

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the distance in miles: ");
        float miles = scan.nextFloat();
        double kilometers = miles / 1.60935;
        System.out.println("Kilometers: " + kilometers);
    }
}
