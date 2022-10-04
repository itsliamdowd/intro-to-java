//A program that takes the total amount of money you have as input and then outputs the amount of money you would need in each denomination to reach that amount

import java.util.Scanner;

public class coinsamount {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter your total: ");
        double completeTotal = scan.nextFloat();
        int total = (int) completeTotal;
        int ten = total / 10;
        total = total - (ten * 10);
        int billTotal = ten * 10;
        int five = total / 5;
        total = total - (five * 5);
        billTotal = billTotal + (five * 5);
        int two = total / 2;
        total = total - (two * 2);
        billTotal = billTotal + (two * 2);
        int one = total / 1;
        total = total - (one * 1);
        billTotal = billTotal + (one * 1);
        double coins = (double) completeTotal - (double) billTotal;
        coins = coins * 100;
        int coinsTotal = (int) coins;
        int quarters = coinsTotal / 25;
        coinsTotal = coinsTotal - (quarters * 25);
        int dimes = coinsTotal / 10;
        coinsTotal = coinsTotal - (dimes * 10);
        int nickels = coinsTotal / 5;
        coinsTotal = coinsTotal - (nickels * 5);
        int pennies = coinsTotal / 1;
        coinsTotal = coinsTotal - (pennies * 1);
        System.out.println("Tens: " + ten);
        System.out.println("Fives: " + five);
        System.out.println("Twos: " + two);
        System.out.println("Ones: " + one);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
