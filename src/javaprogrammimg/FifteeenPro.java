package javaprogrammimg;
//a Java program to swap two variables.
public class FifteeenPro {


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("before swap");
        System.out.println("a = "+a );
        System.out.println("b = "+b);


        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }


}
