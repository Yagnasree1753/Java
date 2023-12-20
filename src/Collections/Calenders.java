package Collections;
import java.util.Calendar;

public class Calenders {
    public static void main(String[] args) {
        Calendar calender = Calendar.getInstance(); //Gets a calender using default time zone and locale
        calender.set(Calendar.YEAR, 2023);
        calender.set(Calendar.MONTH, Calendar.JANUARY);
        calender.set(Calendar.DAY_OF_MONTH, 1);

        System.out.println("Set the date of Calendar: " + calender.getTime());
    }
}