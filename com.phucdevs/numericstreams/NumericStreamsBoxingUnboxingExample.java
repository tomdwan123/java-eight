package numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    public static List<Integer> boxing() {

        return IntStream.rangeClosed(1, 10)
                // int primitive type
                .boxed()
                // Integer wrapper class
                .collect(Collectors.toList());
    }

    public static int unboxing(List<Integer> integers) {

        return integers.stream()
                // convert wrapper class -> primitive type
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {

        System.out.println("Boxing: " + boxing());
        List<Integer> integers = boxing();
        System.out.println("Unboxing: " + unboxing(integers));
    }
}
