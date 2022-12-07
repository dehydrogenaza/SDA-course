//Zaimplementuj generyczną metodę partOf, która na podstawie tablicy dowolnego typu oraz wskazanej
//        funkcji jako parametrów zwróci % elementów spełniających warunek.

package task29;

public class Client29 {

    public static void main(String[] args) {

        Integer[] testIntegers = {-2, -11, 5, 0, -3};
        String[] testStrings = {"a", "abc", "ab", "abcd"};

        System.out.println(Part.partOf(testIntegers, x -> x >= 0));
        System.out.println(Part.partOf(testStrings, s -> s.length() > 2));
    }

}
