package dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateExample {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2018, 07, 17);
        System.out.println("localDate: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2018, 365);
        System.out.println("localDate2: " + localDate2);

        /**
         * Get values from LocalDate
         */
        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getMonthValue: " + localDate.getMonthValue());
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear: " + localDate.getDayOfYear());
        System.out.println("Day of month using get: "
                + localDate.get(ChronoField.DAY_OF_MONTH));
    }
}
