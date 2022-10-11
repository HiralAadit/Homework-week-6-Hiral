package javaprogrammimg;

//. Write a program to insert any temperature value in degree Fahrenheit and
//convert to degree Celsius ((F − 32) × 5/9 = 0°C).

import java.util.Scanner;

public class SevenPro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter degree Fahrenheit: ");
        float Fahrenheit = scanner.nextFloat();
        float Celsius = ((Fahrenheit-32)*5/9);
        System.out.println("Fahrenheit to degree Celsius is = " + Celsius);

    }





}
