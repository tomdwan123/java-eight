package functionalinterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentByGpa();
        filterStudents();
    }

    private static void filterStudentsByGradeLevel() {

        System.out.println("filterStudentsByGradeLevel: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if ( p1.test(student) ) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudents() {

        System.out.println("filterStudents: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if ( p1.and(p2).test(student) ) {
                System.out.println(student);
            }
        });
    }

    private static void filterStudentByGpa() {

        System.out.println("filterStudentByGpa: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(student -> {
            if ( p2.test(student) ) {
                System.out.println(student);
            }
        });
    }
}
