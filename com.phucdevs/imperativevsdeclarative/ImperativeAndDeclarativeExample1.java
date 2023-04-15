package imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeAndDeclarativeExample1 {

    public static void main(String[] args) {

        /*
         * Imperative - how style of programming
         */
         int sum1 = 0;
         for (int i = 0; i <= 100; i++) {
             sum1 += i;
         }
        System.out.println("Sum using Imperative approach: " + sum1);

        /*
         * Declarative - what style of programming
         */
        int sum2 = IntStream.rangeClosed(0, 100)
                .parallel()
                .sum();
        System.out.println("Sum using Declarative approach: " + sum2);
    }
}
