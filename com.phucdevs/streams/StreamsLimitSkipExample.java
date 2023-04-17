package streams;

import java.util.OptionalLong;
import java.util.stream.IntStream;

public class StreamsLimitSkipExample {

    public static OptionalLong limit() {

        return IntStream.rangeClosed(6, 10)
                .asLongStream()
                .limit(3) // 6, 7, 8
                .reduce(Long::sum);
    }

    public static OptionalLong skip() {

        return IntStream.rangeClosed(6, 10)
                .asLongStream()
                .skip(3) // 9, 10
                .reduce(Long::sum);
    }

    public static void main(String[] args) {

        OptionalLong limitResult = limit();
        if (limitResult.isPresent()) {
            System.out.println("limit: " + limitResult.getAsLong());
        }

        OptionalLong skipResult = skip();
        if (skipResult.isPresent()) {
            System.out.println("skip: " + skipResult.getAsLong());
        }
    }
}
