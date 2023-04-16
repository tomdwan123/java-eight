package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static void main(String[] args) {

        System.out.println(nameList());
        System.out.println(nameSet());
    }

    private static List<String> nameList() {

        List<String> nameList =
                StudentDataBase.getAllStudents()
                        .stream()
                        .map(Student::getName)
                        .map(String::toUpperCase)
                        .collect(Collectors.toList());

        return nameList;
    }

    private static Set<String> nameSet() {

        Set<String> nameSet =
                StudentDataBase.getAllStudents()
                        .stream()
                        .map(Student::getName)
                        .map(String::toUpperCase)
                        .collect(Collectors.toSet());

        return nameSet;
    }
}
