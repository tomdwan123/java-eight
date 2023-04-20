package parallelstreams;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {

        Sum sum = new Sum();
        IntStream.rangeClosed(1, 1_000)
                // 1,2,3 ... 1_000
                .parallel() // if you have an immutable variable, then do not use parallel stream
                .forEach(sum::performSum); // 500_500

        System.out.println(sum.getTotal());
    }
}
