package numericstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {

    public static int sumOfNNumbers() {

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        return integers.stream()
                .reduce(0, (x, y) -> x + y);
    }

    public static int sumOfNNumbersIntStream() {

        return IntStream.rangeClosed(1, 6)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("sumOfNNumbers: " + sumOfNNumbers());
        System.out.println("sumOfNNumbersIntStream: " + sumOfNNumbersIntStream());
    }
}
