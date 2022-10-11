package javaprogrammimg;
// Declare two instance and two static variables.
public class FourPro {

    int a = 10;//Static Var.
    int b = 20;//Static Var.
    static int c=30;//Instance Var
    static int d=40;//Instance Var.

    public static void main(String[] args ){
        Method2();
        FourPro obj =  new FourPro();
        obj.Method1();

    }
    public void Method1 (){

        System.out.println(a);
        System.out.println(b);
        FourPro f = new FourPro();
        System.out.println(FourPro.c);
        System.out.println(FourPro.d);
    }

    public static void Method2(){
        FourPro fourPro  = new FourPro();
        System.out.println(fourPro.a);
        System.out.println(fourPro.b);
        System.out.println(c);
        System.out.println(d);

    }





}
