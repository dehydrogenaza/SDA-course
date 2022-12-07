//1. Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie
// od Z do A.
//2. Stwórz metodę, która jako parametr przyjmuje listę stringów, następnie zwraca tą listę posortowaną alfabetycznie
// od Z do A nie biorąc pod uwagę wielkości liter.

package task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client1and2 {

    public static void main(String[] args) {
        List<String> test1 = buildTestList();
        System.out.println(reverseSortList(test1));

        List<String> test2 = buildTestList();
        System.out.println(sortListWithoutCase(test2));
    }

    private static List<String> reverseSortList(List<String> list) {
        //task 1
        list.sort(Comparator.reverseOrder());
        return list;
    }

    private static List<String> sortListWithoutCase(List<String> list) {
        //task 2
        list.sort(Comparator.comparing(String::toLowerCase));
        Collections.reverse(list);
        return list;
    }

    private static List<String> buildTestList() {
        List<String> testList = new ArrayList<>();
        testList.add("aaa aa");
        testList.add("b");
        testList.add("ca");
        testList.add("ac");
        testList.add("zz");
        testList.add("GG");
        testList.add("ZZ");
        testList.add("zz");

        return testList;
    }
}
