package defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodsExample {

    public static void main(String[] args) {

        /**
         * sort the list names in alphabetical order
         */
        List<String> strings = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * Prior Java 8
         */
        Collections.sort(strings);
        System.out.println("Sorted list using Collections.sort(): " + strings);

        /**
         * Java 8
         */
        strings.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using Collections.sort(): " + strings);
        strings.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using Collections.sort() reverse: " + strings);
    }
}
