package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());



    public static void main(String[] args) {
        //basicConsumer();
        //printStudents();
        //printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }

    private static void basicConsumer() {

        System.out.println("basicConsumer: ");
        Consumer<String> c1 = (s) -> System.out.println(s.toLowerCase());
        c1.accept("Java8");
    }

    private static void printStudents() {

        System.out.println("printStudents: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c2);
    }

    private static void printNameAndActivities() {

        System.out.println("printNameAndActivities: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c3.andThen(c4));
    }

    private static void printNameAndActivitiesUsingCondition() {

        System.out.println("printNameAndActivitiesUsingCondition: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                c3.andThen(c4).accept(student);
            }
        });
    }
}
