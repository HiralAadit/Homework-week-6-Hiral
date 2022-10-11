package javaprogrammimg;

public class ThreePro {

    static int a = 20;//Static Var.
    int b=30;//Instance Var.

    public static void main(String[] args) {
        Method2();
        ThreePro obj =  new ThreePro();
        obj.Method1();
    }
    public void Method1 (){
        ThreePro threePro = new ThreePro();
        System.out.println(threePro.a);
        System.out.println(b);
    }

    public static void Method2(){
        System.out.println(a);
        ThreePro t = new ThreePro();
        System.out.println(t.b);


    }
}
