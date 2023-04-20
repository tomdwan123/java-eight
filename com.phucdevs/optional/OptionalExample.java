package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {

        Student student =
                StudentDataBase.studentSupplier.get();

        if (student != null) {
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {

        Optional<Student> studentOptional =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName); // Optional<String>
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        System.out.println("Length of the student name: " + getStudentName().length());
        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent()) {
            System.out.println("Length of the student name: " + stringOptional.get().length());
        } else {
            System.out.println("Name not found");
        }
    }
}
