//A program that takes name, age, college, and pet name as input then prints a paragraph as output using java

import java.util.Scanner;

public class paragraph {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("What's your name? ");
        String name = scan.next();
        System.out.println("How old are you? ");
        String age = scan.next();
        System.out.println("What college do you go to? ");
        String college = scan.next();
        System.out.println("What's your pet's name? ");
        String pet = scan.next();
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old. I’m enjoying my time at " + college + ", though I miss my pet " + pet + " very much!");
    }
}
