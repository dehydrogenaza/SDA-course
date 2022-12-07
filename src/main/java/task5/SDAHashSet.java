//Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet. W tym celu zaimplementuj obsługę metod:
//        • add
//        • remove
//        • size
//        • contains
//        • clear

package task5;

//najłatwiej użyć HashMapy, ale to trochę czity...

import java.io.Serializable;
import java.util.HashMap;

public class SDAHashSet<T> implements Serializable {
    private static final Boolean DUMMY = true;
    private final HashMap<T, Boolean> map = new HashMap<>();

    public boolean add(T element) {
        if (map.containsKey(element)) {
            return false;
        }
        map.put(element, DUMMY);
        return true;
    }

    public boolean remove(T element) {
        if (map.containsKey(element)) {
            map.remove(element);
            return true;
        }
        return false;
    }

    public int size() {
        return map.size();
    }

    public boolean contains(T element) {
        return map.containsKey(element);
    }

    public void clear() {
        map.clear();
    }
}
