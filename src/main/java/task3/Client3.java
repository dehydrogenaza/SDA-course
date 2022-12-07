//3. Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba, a następnie
// wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "". Na końcu każdego wiersza poza ostatnim,
// powinien być przecinek, a w ostatnim kropka.
    //Przykład:
    //Klucz: Java, Wartość: 18,
    //Klucz: Python, Wartość: 1,
    //…
    //Klucz: PHP, Wartość: 0.

package task3;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Client3 {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Java", 18);
        map.put("Kotlin", 60);
        map.put("Python", 1);
        map.put("PHP", 0);
        map.put("Ruby", -30);

        printMap(map);
    }

    private static void printMap(Map<String, Integer> map) {
        AtomicInteger index = new AtomicInteger();
        map.forEach((k, v) -> {
            System.out.print("Klucz: " + k + ", Wartość: " + v);

            if (index.getAndIncrement() < map.size() - 1) {
                System.out.print(",\n");
            }
        });
        System.out.print(".\n");
    }
}
