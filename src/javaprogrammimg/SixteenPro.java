package javaprogrammimg;

import java.util.Scanner;

public class SixteenPro {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("please enter first binary number:");
            String b1 = s.nextLine();
            System.out.println("Please enter second binary number");
            String b2 = s.nextLine();

            int num1 = Integer.parseInt(b1,2);
            int num2 = Integer.parseInt(b2,2);
            int output  = num1 + num2;

            System.out.println("\n The sum of given binary number is : ");
            System.out.println(Integer.toBinaryString(output));

        }

   }


