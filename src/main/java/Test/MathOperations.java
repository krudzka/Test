package Test;

/**
 * Created by RENT on 2017-03-02.
 */
public class MathOperations {

    public static double divide(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Could not divide by zero");
        }
        return x / y;
    }

    public static int factorial(int x) {
        int factorial = 1;
        for (int i = 2; i <= x; i++) {
           factorial*=i;

        }

        if(x>=13 | x<0){
            throw new IllegalArgumentException("Too big number");
        }
        return factorial;

    }



}

