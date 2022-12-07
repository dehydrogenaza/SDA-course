//Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
//        addToStorage(String key, String value) → dodawanie elementów do przechowywalni
//        printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
//        findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
//
//Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

package task4;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Storage {
    private final Map<String, List<String>> values;

    public Storage() {
        values = new HashMap<>(); //to mogłoby być w linijce 16, konstruktor domyślny by wystarczył
    }

    public void addToStorage(String key, String value) {
        if (values.containsKey(key)) {
            values.get(key).add(value);
        } else {
            List<String> newList = new ArrayList<>();
            newList.add(value);
            values.put(key, newList);
        }
    }

    public void printValues(String key) {
        if (values.containsKey(key)) {
            System.out.println(values.get(key));
        } else {
            System.out.println("Nie ma takiego klucza.");
        }
    }

    public void findValues(String searchedValue) {
        boolean found = false;
        for (Map.Entry<String, List<String>> entry : values.entrySet()) {
            if (entry.getValue().contains(searchedValue)) {
                System.out.println(entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nie znaleziono takiej wartości.");
        }

//        values.forEach((k, v) -> {
//            if (v.contains(searchedValue)) {
//                System.out.println(k);
//            }
//        });
    }
}
