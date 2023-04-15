package imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeAndDeclarativeExample2 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Imperative
        List<Integer> uniqueList1 = new ArrayList<>();
        for (Integer integer : integerList) {
            if (!uniqueList1.contains(integer)) {
                uniqueList1.add(integer);
            }
        }
        System.out.println("uniqueList1: " + uniqueList1);

        // Declarative
        List<Integer> uniqueList2 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("uniqueList2: " + uniqueList2);
    }
}
