//Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
//        addToStorage(String key, String value) → dodawanie elementów do przechowywalni
//        printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
//        findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
//
//Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

package task4guava;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

import java.util.Collection;
import java.util.Map;

public class Storage {
    private final Multimap<String, String> storage = ArrayListMultimap.create();

    public boolean addToStorage(String key, String value) {
        return storage.put(key, value);
    }

    public void printValues(String key) {
        Collection<String> values = storage.get(key);
        System.out.println(values);
    }

    public void findValues(String value) {
        boolean found = false;
        for (Map.Entry<String, String> entry : storage.entries()) {
            if (entry.getValue().contains(value)) {
                System.out.println(entry.getKey());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nie znaleziono takiej wartości.");
        }
    }

    @Override
    public String toString() {
        return storage.toString();
    }
}
