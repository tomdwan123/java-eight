package functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p1 = i -> i % 2 == 0;
    static Predicate<Integer> p2 = i -> i % 5 == 0;

    public static void main(String[] args) {
        exampleBasic();
        predicateAnd();
        predicateOr();
        predicateNegative();
    }

    private static void exampleBasic() {
        System.out.println(p1.test(10));
    }

    private static void predicateAnd() {
        System.out.println("Predicate And result is: " + p1.and(p2).test(10));
        System.out.println("Predicate And result is: " + p1.and(p2).test(9));
    }

    private static void predicateOr() {
        System.out.println("Predicate Or result is: " + p1.or(p2).test(10));
        System.out.println("Predicate Or result is: " + p1.or(p2).test(9));
    }

    private static void predicateNegative() {
        System.out.println("Predicate Negative result is: " + p1.or(p2).negate().test(8));
    }
}
