package javaprogrammimg;
//a Java program to convert a given string into lowercase.
// Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
// Output: the quick brown fox jumps over the lazy dog

import java.util.Scanner;

public class NineteenPro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        line = line.toLowerCase();
        System.out.println(line);
    }
}
