import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by RENT on 2017-03-04.
 */
public class DateTest {


    @Test
    public void constructor_shouldFillFields() {

        int day = 5;
        int month = 10;
        int year = 2010;

        Date date = new Date(day, month, year) {
        };


        assertEquals(date.getDay(), day);
        assertEquals(date.getMonth(), month);
        assertEquals(date.getYear(), year);


    }

    @Test(expected = IllegalArgumentException.class)

    public void getTrueDate() {
        int day = 40;
        int month = 13;
        int year = 5000;

        new Date(day, month, year);
    }

    @Test

    public void getTrueFills() {
        int day = 10;
        Date date = new Date(1, 1, 1);
        date.setDay(day);
    }

    @Test

    public void getTrueMonth() {
        int month = 10;
        Date date = new Date(1, 1, 1);
        date.setMonth(month);
    }

    @Test

    public void getTrueYear() {
        int year = 2010;
        Date date = new Date(1, 1, 1);
        date.setYear(year);
    }

    @Test(expected = IllegalArgumentException.class)

    public void Month_Negative() {
        int month = -5;
        Date date = new Date(1, 1, 1);
        date.setMonth(month);
    }

    @Test

    public void addCorrectly() {
        int x = 5;
        int day = 1;
        int month = 1;
        int year = 2010;

        Date date = new Date(day, month, year) {
        };
        date.addMonth(x);


        assertEquals(date.getDay(), 1);
        assertEquals(date.getMonth(), 6);
        assertEquals(date.getYear(), 2010);

    }

    @Test

    public void addCorrectly_tooMuch() {
        int x = 5;
        int day = 1;
        int month=10;
        int year = 2010;
        Date date = new Date(day, month, year);
        date.addMonth(x);

        assertEquals(date.getDay(), 1);
        assertEquals(date.getMonth(), 3);
        assertEquals(date.getYear(), 2011);

    }

    @Test (expected = IllegalArgumentException.class)
    public void addCorrectly_Negative (){
        int x=-1;
        int day = 1;
        int month=1;
        int year = 2010;
        Date date = new Date(day, month, year);
        date.addMonth(x);



    }

    @Test

    public void addDayCorrectly() {
        int x = 5;
        int day = 1;
        int month = 1;
        int year = 2010;

        Date date = new Date(day, month, year) {
        };
        date.addDay(x);


        assertEquals(date.getDay(), 6);
        assertEquals(date.getMonth(), 1);
        assertEquals(date.getYear(), 2010);

    }

  //  @Test
//
//    public void addDayCorrectlyHard() {
//        int x = 1;
//        int day = 30;
//        int month = 11;
//        int year = 2010;
//
//        Date date = new Date(day, month, year) {
//        };
//        date.addDay(x);
//
//
//        assertEquals(date.getDay(), 1);
//        assertEquals(date.getMonth(), 12);
//        assertEquals(date.getYear(), 2010);
//
//    }
  //  @Test

//    public void addDayCorrectly_Year() {
//        int x = 365;
//        int day = 1;
//        int month = 4;
//        int year = 2010;
//
//        Date date = new Date(day, month, year) {
//        };
//        date.addDay(x);
//
//
//        assertEquals(date.getDay(), 1);
//        assertEquals(date.getMonth(), 4);
//        assertEquals(date.getYear(), 2011);
//
//    }


}