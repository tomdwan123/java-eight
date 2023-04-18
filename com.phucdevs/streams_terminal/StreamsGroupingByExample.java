package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toSet;

public class StreamsGroupingByExample {

    public static Map<String, List<Student>> groupStudentGroupingByGender() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> groupStudentGrouping() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
    }

    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping1() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        groupingBy(
                                Student::getGradeLevel,
                                groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")
                        )
                );
    }

    public static Map<String, Integer> twoLevelGrouping2() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(
                        groupingBy(
                                Student::getName,
                                summingInt(Student::getNoteBooks)
                        )
                );
    }

    public static LinkedHashMap<String, Set<Student>> threeArgumentsGroupBy() {

        return StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
    }

    public static void main(String[] args) {

        System.out.println("groupStudentGroupingByGender: " + groupStudentGroupingByGender());
        System.out.println("groupStudentGrouping: " + groupStudentGrouping());
        System.out.println("twoLevelGrouping1: " +twoLevelGrouping1());
        System.out.println("twoLevelGrouping2: " + twoLevelGrouping2());
        System.out.println("threeArgumentsGroupBy: " + threeArgumentsGroupBy());
    }
}
