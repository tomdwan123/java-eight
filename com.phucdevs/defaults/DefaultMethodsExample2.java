package defaults;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    public static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    public static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
    public static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> students) {

        System.out.println("After sortByName: ");
        students.sort(nameComparator);
        students.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> students) {

        System.out.println("After sortByGpa: ");
        students.sort(gpaComparator);
        students.forEach(studentConsumer);
    }

    public static void comparatorChaining(List<Student> students) {

        System.out.println("After comparatorChaining: ");
        students.sort(gradeComparator.thenComparing(nameComparator));
        students.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> students) {

        System.out.println("After sortWithNullValues: ");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        students.sort(studentComparator);
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        System.out.println("Before sort: ");
        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(studentConsumer);
        //sortByName(students);
        //sortByGpa(students);
        //comparatorChaining(students);
        sortWithNullValues(students);
    }
}
