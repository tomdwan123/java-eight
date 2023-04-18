package streams_terminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

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

    public static void main(String[] args) {

        System.out.println("groupStudentGroupingByGender: " + groupStudentGroupingByGender());
        System.out.println("groupStudentGrouping: " + groupStudentGrouping());
    }
}
