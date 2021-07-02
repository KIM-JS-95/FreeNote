package kr.co.Lec_3_Overload;

public class OverLoading {


    private static int plus(){
        int result = a+b;
        return result;
    }

    private static double plus(double a, double b) {
            double result = a + b;

            return result;
    }

    public static void main(String[] args){
        int a=2;
        int b=3;

        double c= 1.5;
        double d= 3.6;

        System.out.println( plus(a, b) );
        System.out.println( plus(c, d) );
    }
}
