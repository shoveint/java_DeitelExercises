package Chapter8;

import java.sql.Time;

public class Time1Test {
    public static void main(String[] args) throws IllegalAccessException {
        Time1 time = new Time1();
        displayTime("After time is created", time);
        System.out.println();
        time.setTime(13,37, 8);
        displayTime("After calling setTime", time);
        System.out.println();

        try{
            time.setTime(99, 99, 99);
        }
        catch (IllegalAccessException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }
        displayTime("After calling setTime with invalid values", time);
    }

    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n", header, t.toString());
    }
}
