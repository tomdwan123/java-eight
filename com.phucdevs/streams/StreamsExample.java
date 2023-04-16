package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> gradeLevelPredicate = s -> s.getGradeLevel() >= 3;
        Predicate<Student> gpaPredicate = s -> s.getGpa() >= 3.9;

        Map<String, List<String>> streams =
                StudentDataBase.getAllStudents()
                        .stream()
                        .peek(student -> {
                            System.out.println(student);
                        })
                        .filter(gradeLevelPredicate)
                        .peek(student -> {
                            System.out.println("After 1st filter: " + student);
                        })
                        .filter(gpaPredicate)
                        .peek(student -> {
                            System.out.println("After 2nd filter: " + student);
                        })
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(streams);

    }
}
