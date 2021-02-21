package kr.co.Lec_2;

public class Calculator {

    // static field
    static double pi = 3.14159;

    //static methods
    static int plus(int x, int y) {
        return x + y;
    }

    //static methods
    static int minus(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        double result1 = 10 * 10 * Calculator.pi;

        int result2 = Calculator.plus(10, 5);
        int result3 = Calculator.minus(10, 5);

        System.out.println(result2);
        System.out.println(result3);

    }
}
