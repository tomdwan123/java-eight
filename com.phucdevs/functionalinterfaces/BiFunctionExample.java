package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
            (students, studentPredicate) -> {

                  Map<String, Double> studentGpas = new HashMap<>();
                  students.forEach(student -> {
                      if (studentPredicate.test(student)) {
                          studentGpas.put(student.getName(), student.getGpa());
                      }
                  });

                  return studentGpas;
            };

    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(biFunction.apply(students, PredicateStudentExample.p2));
    }
}
