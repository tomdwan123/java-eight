package numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsAggregateExample {

    public static void main(String[] args) {

        int sum = IntStream.rangeClosed(1, 50).sum();
        System.out.println("Sum is: " + sum);
        OptionalInt optionalInt = IntStream.rangeClosed(1, 50).max();
        if (optionalInt.isPresent()) {
            System.out.println("max value is: " + optionalInt.getAsInt());
        }

        OptionalDouble optionalDouble = IntStream.rangeClosed(0, 50).average();
        System.out.println(optionalDouble.isPresent() ? optionalDouble.getAsDouble() : 0.0);
    }
}
