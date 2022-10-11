package javaprogrammimg;
//Java program to convert a decimal number to binary number.
//Input Data:
// Input a Decimal Number : 5
//Expected Output
//Binary number is: 101

import java.util.Scanner;

public class Seventeen {
    int i = 5;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("input decimal number: ");
        int decimal = s.nextInt();
        System.out.println(Integer.toBinaryString( 5));
    }
}
