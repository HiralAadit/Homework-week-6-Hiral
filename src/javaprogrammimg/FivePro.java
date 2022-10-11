package javaprogrammimg;

public class FivePro {
    //h addition, subtraction, multiplication
    //and division methods all with parameters and use string concatenation
    //methods.(Note: Two static and Two instance methods.)
    int a = 20;
    int b = 10;

    public static void main(String[] args) {
        Addition();
        Subtraction();
        FivePro obj = new FivePro();
        obj.Multiplication();
        obj.Division();
    }

    public static void Addition() {
        FivePro f = new FivePro();
        String s = (f.a) + (f.b) + "Addition";
        System.out.println(s);

        }

        public static void Subtraction(){
        FivePro f = new FivePro();
        String s =(f.a) - (f.b) + "Subtraction";
        System.out.println(s);

        }

        public void Multiplication(){
        FivePro f = new FivePro();
        String s =(f.a) * (f.b) + "Multiplication";
        System.out.println(s);

        }

        public void Division(){
        FivePro f = new FivePro();
        String s =(f.a) / (f.b) + "Division";
        System.out.println(s);


        }
}