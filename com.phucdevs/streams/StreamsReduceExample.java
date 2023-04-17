package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integers) {

        return integers.stream()
                // 1
                // 3
                // 5
                // 7
                // a = 1, b (from stream) => result 1 is returned
                // a = 1, b = 3 (from stream -> result 3 is returned)
                // a = 3, b = 5 (from stream -> result 15 is returned)
                // a = 15, b = 7 (from stream -> result is 105 is returned)
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers) {

        return integers.stream()
                .reduce((a, b) -> a * b);
    }

    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        System.out.println("performMultiplication: " + performMultiplication(integers));
        Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
        System.out.println("performMultiplication: " + result.isPresent());
        System.out.println("performMultiplication: " + result.get());

    }
}
