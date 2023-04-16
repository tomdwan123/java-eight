package lambdas;

import java.util.function.Consumer;

public class LambdaVariable2Example {

    static int value  = 4; // local variable

    public static void main(String[] args) {

        Consumer<Integer> c1 = i -> {
            // value++; not modify in lambda body
            value++;
            System.out.println(value + i);
        };

        value = 6;

        c1.accept(4);
    }
}
