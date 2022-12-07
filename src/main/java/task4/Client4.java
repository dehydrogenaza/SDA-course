//Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
//        addToStorage(String key, String value) → dodawanie elementów do przechowywalni
//        printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
//        findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
//
//        Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.

package task4;

public class Client4 {

    public static void main(String[] args) {
        Storage storage = buildTestStorage();

        storage.printValues("aaa");

        storage.findValues("TEST");
    }

    private static Storage buildTestStorage() {
        Storage storage = new Storage();

        storage.addToStorage("aaa", "A1");
        storage.addToStorage("aaa", "A2");
        storage.addToStorage("aaa", "TEST");
        storage.addToStorage("bbb", "B1");
        storage.addToStorage("bbb", "TEST");
        storage.addToStorage("ccc", "C1");
        storage.addToStorage("bbb", "B2");
        storage.addToStorage("ddd", "TEST");

        return storage;
    }
}
