package numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {

    public static void main(String[] args) {

        System.out.println("Range Count: " + IntStream.range(1, 50).count());
        IntStream.range(0, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();

        System.out.println("Range Closed Count: " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(0, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();

        System.out.println("Long Stream Range Closed Count: " + LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(0, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();

        IntStream.rangeClosed(0, 50).asDoubleStream().forEach(value -> System.out.print(value + ","));
    }
}
