package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime: " + localTime);

        LocalTime localTime1 = LocalTime.of(23, 23);
        System.out.println("localTime1: " + localTime1);

        LocalTime localTime2 = LocalTime.of(23, 23, 33);
        System.out.println("localTime2: " + localTime2);

        LocalTime localTime3 = LocalTime.of(23, 33, 33, 980980980);
        System.out.println("localTime3: " + localTime3);

        System.out.println("getHour: " + localTime.getHour());
        System.out.println("getMinute: " + localTime.getMinute());

        System.out.println("minusHours: " + localTime.minusHours(2));
        System.out.println("ChronoUnit.HOURS: " + localTime.minus(2, ChronoUnit.HOURS));
        System.out.println("LocalTime.MIDNIGHT: " + localTime.with(LocalTime.MIDNIGHT));

        LocalDate localDate = LocalDate.of(2019, 01, 01);
        System.out.println("atTime: " + localDate.atTime(23, 33));

        LocalTime localTime4 = LocalTime.of(23, 39);
        System.out.println("atDate: " + localTime4.atDate(localDate));

        LocalDateTime localDateTime = localTime.atDate(localDate);
        System.out.println("toLocalDate: " + localTime.atDate(localDate));
    }
}
