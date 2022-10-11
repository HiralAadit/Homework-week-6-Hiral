package javaprogrammimg;

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class FourteenPro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of the rectangle");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the rectangle");
        double height = scanner.nextDouble();
        double area =  width * height ;
        System.out.println("area of rectangle is:" +area);
        double perimeter =  2 * (width + height);
        System.out.println("perimeter of Rectangle: "+perimeter);

        //double area width * height;

        //System.out.println("Perimeter is 2*(%1f +  %2f \\n");

        //System.out.println("Area is %1f \n, width, height, area");
    }
}
