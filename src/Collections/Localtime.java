package Collections;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class Localtime {
    public static void main(String[] args){
        LocalTime now = LocalTime.now(); //Get the current time
        LocalTime specificTime = LocalTime.of(13,30);

        System.out.println("Current time: " + now);
        System.out.println("Specific time: " + specificTime);



        LocalDateTime Now = LocalDateTime.now(); //Get the current date-time
        LocalDateTime SpecificTime = LocalDateTime.of(2023, 1, 1, 13, 30);

        System.out.println("Current time: " + Now);
        System.out.println("Specific time: " + SpecificTime);
    }
}
