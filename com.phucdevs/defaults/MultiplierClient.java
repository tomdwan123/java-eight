package defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

    public static void main(String[] args) {

        Multiplier multiplier = new MultiplierImpl();
        List<Integer> integers = Arrays.asList(1, 3, 5);

        System.out.println("Result is: " + multiplier.multiply(integers));
        System.out.println("Default method size is: " + multiplier.size(integers));
        System.out.println("Static method empty is: " + Multiplier.isEmpty(integers));
    }
}
