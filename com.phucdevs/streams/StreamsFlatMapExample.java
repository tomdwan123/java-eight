package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static void main(String[] args) {

        System.out.println("printStudentActivities: " + printStudentActivities());
    }

    private static List<String> printStudentActivities() {

        List<String> activities =
                StudentDataBase.getAllStudents()
                        .stream()
                        .map(Student::getActivities)
                        .flatMap(List::stream)
                        .collect(Collectors.toList());

        return activities;
    }
 }
