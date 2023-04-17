package streams;

import java.util.Optional;
import java.util.OptionalLong;
import java.util.stream.IntStream;

public class StreamsMinMaxExample {

    public static long findMaxValue() {

        return IntStream.rangeClosed(6, 10)
                .asLongStream()
                .reduce(0, Long::max);
    }

    public static Optional<Long> findMaxValueWithOptional() {

        return Optional.of(IntStream.rangeClosed(6, 10)
                .asLongStream()
                .reduce(0, Long::max));
    }

    public static OptionalLong findMinValue() {

        return IntStream.rangeClosed(6, 10)
                .asLongStream()
                .reduce(Long::min);
    }

    public static void main(String[] args) {

        System.out.println("findMaxValue: " + findMaxValue());

        Optional<Long> maxValueWithOptional = findMaxValueWithOptional();
        if (maxValueWithOptional.isPresent()) {
            System.out.println("findMaxValueWithOptional: " + maxValueWithOptional.get());
        }

        System.out.println("findMinValue: " + findMinValue());
    }
}
