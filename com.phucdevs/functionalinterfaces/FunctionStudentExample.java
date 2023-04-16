package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> {

        Map<String, Double> studentGrades = new HashMap<>();

        students.forEach(student -> {
            if (PredicateStudentExample.p1.test(student)) {
                studentGrades.put(
                        student.getName(),
                        student.getGpa()
                );
            }
        });

        return  studentGrades;
    };


    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();
        System.out.println(studentFunction.apply(students));
    }
}
