import java.time.Year;

/**
 * Created by RENT on 2017-03-04.
 */
public class Date {

    public static final int MIN_DAY = 1;
    public static final int MIN_MONTH = 1;
    public static final int MIN_YEAR = 1;
    public static final int MAX_MONTH = 12;
    public static final int MAX_DAY = 31;
    public static final int[] DAYS_PER_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int DAYS_OF_YEAR= 365;

    private int day;
    private int month;
    private int year;

    public void addDay(int x) {
        int firstDay = getDay();
        int firstMonth = getMonth();
        int firstYear = getYear();

        if (firstDay + x > DAYS_PER_MONTH[firstMonth - 1]) {
            setYear((firstYear + (firstDay + x)-1) / DAYS_OF_YEAR);
            setMonth((firstMonth + ((firstDay + x)-1) % DAYS_OF_YEAR));
            setDay((firstDay + x-2) % DAYS_PER_MONTH[firstMonth - 1]+1);
        } else {
            setDay(firstDay + x);
        }
    }

    public void addMonth(int x) {

        int firstMonth = getMonth();
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        if (getMonth() + x > MAX_MONTH) {
            int firstYear = getYear();
            setYear((firstYear + ((firstMonth + x)-1) / MAX_MONTH));
            setMonth((firstMonth + x-1) % MAX_MONTH+1);


        } else {
            setMonth(firstMonth + x);
        }


    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {

        if (day >= MIN_DAY && day <= MAX_DAY) {
            this.day = day;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getMonth() {

        return month;
    }


    public void setMonth(int month) {

        if (month >= MIN_MONTH && month <= MAX_MONTH) {
            this.month = month;
        } else {
            throw new IllegalArgumentException();
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year >= MIN_YEAR) {
            this.year = year;
        } else {
            throw new IllegalArgumentException();
        }
    }


    public Date(int day, int month, int year) {
        setDay(day);

        setMonth(month);

        setYear(year);
    }
}
