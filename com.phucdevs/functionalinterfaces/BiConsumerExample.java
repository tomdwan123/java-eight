package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        exampleBasic();
        getNameAndActivities();
    }

    private static void exampleBasic() {
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("a: " + b + ", b: " + b);
        };

        biConsumer.accept("java 7", "java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication is: " + (a * b));
        };

        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("Division is: " + (a / b));
        };

        multiply.andThen(division).accept(10, 5);
    }

    private static void getNameAndActivities() {

        BiConsumer<String, List<String>> biConsumer =
                (name, activities) -> System.out.println(name + " : " + activities);

        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });
    }
}
