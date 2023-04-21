package dates;

import java.time.Clock;
import java.time.ZoneId;
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



    }
}
