package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse() {

        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    public static String optionalOrElseGet() {

        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    public static String optionalOrElseThrow() {

        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException());
        return name;
    }

    public static void main(String[] args) {

        System.out.println("optionalOrElse: " + optionalOrElse());
        System.out.println("optionalOrElseGet: " + optionalOrElseGet());
        System.out.println("optionalOrElseThrow: " + optionalOrElseThrow());
    }
}
