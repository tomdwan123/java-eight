package parallelstreams;

import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ParallelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integers) {

        long startTime = System.currentTimeMillis();
        Integer sum = integers
                .stream()
                .reduce(0, (x, y) -> x + y);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in Sequential Stream: " + duration);
        return sum;
    }

    public static int parallelSum(List<Integer> integers) {

        long startTime = System.currentTimeMillis();
        Integer sum = integers
                .parallelStream()
                .reduce(0, (x, y) -> x + y); // perform the unboxed from Integer to int
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in Parallel Stream: " + duration);
        return sum;
    }

    public static void main(String[] args) {

        List<Integer> integers = IntStream.rangeClosed(1, 100_000)
                .boxed()
                .collect(toList());

        sequentialSum(integers);
        parallelSum(integers);
    }
}
