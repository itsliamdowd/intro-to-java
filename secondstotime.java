//A program that takes the amount of time in seconds as input then says how many hours, minutes, and seconds it is using java

import java.util.Scanner;

public class secondstotime {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Time (seconds): ");
        int time = scan.nextInt();
        int hours = time / 3600;
        time = time - (hours * 3600);
        System.out.println("Hours: " + hours);
        int minutes = time / 60;
        time = time - (minutes * 60);
        System.out.println("Minutes: " + minutes);
        int seconds = time;
        System.out.println("Seconds: " + seconds);       
    }
}
