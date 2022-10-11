package javaprogrammimg;

import java.util.Scanner;

public class NinePro1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lowStr;
        System.out.println("\nPlease enter Lowercase String = ");
        lowStr = scanner.nextLine();

        String lowStr2 = lowStr.toUpperCase();
        System.out.println("\nThe Uppercase String is "+ lowStr2);

    }
}

