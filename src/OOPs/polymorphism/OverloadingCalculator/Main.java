package polymorphism.OverloadingCalculator;

class Calculator{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public double add(double a, double b){
        return a+b;
    }
    public double sub(double a, double b){
        return a-b;
    }
    public double mul(double a, double b){
        return a*b;
    }
    public double div(double a, double b){
        return a/b;
    }
}
public class Main{
    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("Add 2 and 3: " + calc.add(2,3));
        System.out.println("Sub 2 and 3: " + calc.sub(2,3));
        System.out.println("Add 2, 3, 4: " + calc.add(2,3,4));
        System.out.println("Add 2.5, 4.2: " + calc.add(2.5, 4.2));
        System.out.println("Sub 5.678, 2.34567: " + calc.sub(5.678 , 2.34567));
        System.out.println("Mul 3.3333, 4.4444: " + calc.mul(3.3333 , 4.4444));
        System.out.println("Div 3.3333, 4.4444: " + calc.div(3.3333 , 4.4444));
        System.out.println("Mul 4 and 5: " + calc.mul(4,5));
        System.out.println("Div 4 and 5: " + calc.div(4,5));

    }
}
