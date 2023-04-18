package streams_terminal;

import data.Student;
import data.StudentDataBase;

import static java.util.stream.Collectors.joining;

public class StreamJoiningExample {

    public static String joining1() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName) // Stream<String>
                .collect(joining());
    }

    public static String joining2() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("-"));
    }

    public static String joining3() {

        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("-", "(", ")"));
    }

    public static void main(String[] args) {

        System.out.println("joining1: " + joining1());
        System.out.println("joining2: " + joining2());
        System.out.println("joining3: " + joining3());
    }
}
