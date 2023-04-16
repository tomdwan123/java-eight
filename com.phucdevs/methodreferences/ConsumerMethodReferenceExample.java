package methodreferences;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /*
     * classname:methodName
     */
    static Consumer<Student> c1 = p -> System.out.println(p);

    /*
     * classname::instanceMethodName
     */
    static Consumer<Student> c2 = Student::printListOfActivities;

    public static void main(String[] args) {

        List<Student> students = StudentDataBase.getAllStudents();
        students.forEach(c1);
        students.forEach(c2);
    }
}
