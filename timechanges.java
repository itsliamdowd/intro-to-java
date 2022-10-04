//A program that takes different time amounts as input then outputs the total amount of time in seconds

import java.util.Scanner;

public class timechanges {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Hours: ");
        int hours = scan.nextInt();
        System.out.print("Minutes: ");
        int minutes = scan.nextInt();
        System.out.print("Seconds: ");
        int seconds = scan.nextInt();
        int total = 0;
        total = total + (hours * 3600);
        total = total + (minutes * 60);
        total = total + seconds;
        System.out.print("The total time in seconds is: " + total);
    }
}
