package Test;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

/**
 * Created by RENT on 2017-03-02.
 */
public class MathOperationTest {
    @Test
    public void divide_4by2() {

        //given -- podajemy dla jakich wartosci chcemy testowac

        double x = 4;
        double y = 2;

        //when
        double result = MathOperations.divide(x, y);

        //then --sprawdzamy czy wyniki wykonania sa prawidlowe
        assertEquals(result, 2, 0.0001);

//        double result = MathOperations.divide(4, 2);
//        assertEquals(result, 2.0d, 0.000001);

    }

    @Test
    public void divide_10000by33() {

        double x = 10000;
        double y = 33;

        double result = MathOperations.divide(x, y);

        assertEquals(result, 303.03, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    // ten przypadek bedzie oczekiwal z dostanie taki wyjatek i sie nie wywali
    public void divide_byZero() {

        double x = 1;
        double y = 0;

        MathOperations.divide(x, y);


    }

    @Test
    public void factorialSimpleCase() {


        int result = MathOperations.factorial(3);

        assertEquals(result, 6);
    }

    @Test
    public void factorialComplexCase() {


        int result = MathOperations.factorial(10);

        assertEquals(result, 3_628_800);
    }

    @Test
    public void factorialshoulReturnResultFor12() {


        int result = MathOperations.factorial(12);


        assertEquals(result, 479_001_600);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialshoulReturnResultFor13() {
        int x = 13;

        MathOperations.factorial(13);


    }

    @Test
    public void factorialshoulReturnResultFor0() {


        int result = MathOperations.factorial(0);


        assertEquals(result, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void factorialshoulReturnResultForNegative() {
        int x =-1;

        MathOperations.factorial(x);


    }



}