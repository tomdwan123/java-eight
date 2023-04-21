package dates;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeZonesExample {

    public static void main(String[] args) {

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime: " + zonedDateTime);

        System.out.println("zoneOffset: " + zonedDateTime.getOffset());
        System.out.println("Zone Id: " + zonedDateTime.getZone());

        ZoneId.getAvailableZoneIds()
                .stream()
                .forEach(System.out::println);

        System.out.println("No of Zones: " + ZoneId.getAvailableZoneIds().size());

        System.out.println("Chicago CST: " + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("Detroit EST: " + ZonedDateTime.now(ZoneId.of("America/Detroit")));
        System.out.println("LA PST: " + ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
        System.out.println("Denver MST: " + ZonedDateTime.now(ZoneId.of("America/Denver")));

        System.out.println("ZonedDateTime using clock: "
                + ZonedDateTime.now(Clock.system(ZoneId.of("America/Denver"))));


        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("America/Chicago"));
        System.out.println("zonedDateTime1: " + zonedDateTime1);

        ZonedDateTime zonedDateTime2 = Instant.now().atZone(ZoneId.of("America/Chicago"));
        System.out.println("zonedDateTime2: " + zonedDateTime2);

        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.ofHours(-6));
        System.out.println("offsetDateTime: " + offsetDateTime);

    }
}
