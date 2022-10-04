//A program that takes fahrenheit as the input and then converts it to celsius using java

import java.util.Scanner;

public class temperatureconverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the temperature in Fahrenheit: ");
        float temperature = scan.nextFloat();
        temperature = temperature - 32;
        temperature = 5 * temperature;
        double finalTemperature = temperature / 9;
        System.out.println("Celsius: " + finalTemperature);
    }
}
