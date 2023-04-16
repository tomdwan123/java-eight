package functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomething = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {

        System.out.println("Result is: " + function.apply("java8"));
        System.out.println("Result is: " + function.andThen(addSomething).apply("java8"));
        System.out.println("Result is: " + function.compose(addSomething).apply("java8"));
    }
}
