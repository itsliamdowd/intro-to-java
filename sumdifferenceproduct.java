//A program that takes two float values as input and then calculates the sum, difference, and product of the float values using java

import java.util.Scanner;

public class sumdifferenceproduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the first float: ");
        float num1 = scan.nextFloat();
        System.out.println("Enter the second float: ");
        float num2 = scan.nextFloat();
        double added = num1 + num2;
        System.out.println("Sum: " + added);
        double difference = num1 - num2;
        System.out.println("Difference: " + difference);
        double product = num1 * num2;
        System.out.println("Product: " + product);
    }
}
