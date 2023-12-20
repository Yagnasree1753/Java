package Collections;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class locale {
    public static void main(String[] args){
        Locale locale =  new Locale("fr", "FR");  //French in france
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);
        String date = dateFormat.format(new Date());
        System.out.println("Date in french Format "+ date);
    }
}
