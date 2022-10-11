package javaprogrammimg;

public class OneJavaPro {

    int a=30;//Instance Var.
    int b=40;//Instance Var.

    public static void main(String[] args){
        OneJavaPro obj = new OneJavaPro();
        obj.Method1();

    }
    //instance method


    public void Method1() {
        System.out.println(a);
        System.out.println(b);

    }
}
