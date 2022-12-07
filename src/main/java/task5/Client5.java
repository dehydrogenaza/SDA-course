//Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet. W tym celu zaimplementuj obsługę metod:
//        • add
//        • remove
//        • size
//        • contains
//        • clear

package task5;

import java.util.HashSet;
import java.util.Set;

public class Client5 {
    public static void main(String[] args) {

        SDAHashSet<String> mySet = new SDAHashSet<>();

//        Set<String> threads_test = new HashSet<>();

        System.out.println(mySet.size());

        mySet.add("test1");
        mySet.add("test2");
        mySet.add("test3");

        System.out.println(mySet.size());

        System.out.println(mySet.contains("test1"));
        mySet.remove("test1");
        System.out.println(mySet.contains("test1"));

        mySet.clear();
        System.out.println(mySet.contains("test1"));
        System.out.println(mySet.size());
    }
}
