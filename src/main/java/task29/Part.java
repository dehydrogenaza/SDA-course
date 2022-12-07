//Zaimplementuj generyczną metodę partOf, która na podstawie tablicy dowolnego typu oraz wskazanej
//        funkcji jako parametrów zwróci % elementów spełniających warunek.

package task29;

import java.util.Arrays;
import java.util.function.Predicate;

public class Part {

    public static <T> double partOf(T[] array, Predicate<T> predicate) {
        if (array.length == 0) return 0;

        long validElements = Arrays.stream(array).filter(predicate).count();

        return 100.0 * validElements / array.length;
    }

}
