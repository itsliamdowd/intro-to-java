//A proram that takes the amounts of each coins as input and then prints the total amount of money you have using java

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Pennies: ");
        int pennies = scan.nextInt();
        System.out.print("Nickels: ");
        int nickels = scan.nextInt();
        System.out.print("Dimes: ");
        int dimes = scan.nextInt();
        System.out.print("Quarters: ");
        int quarters = scan.nextInt();
        double total = 0;
        total = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);
        System.out.print("$" + total);
    }
}
