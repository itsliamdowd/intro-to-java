// A program that uses the scanner to get three numbers from the user, adds them, and then prints out the average

import java.util.Scanner;

public class FindAverageUsingScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the first integer: ");
        int num1 = scan.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scan.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scan.nextInt();
        double added = num1 + num2 + num3;
        added = added/3;
        System.out.print(added);
    }
}
