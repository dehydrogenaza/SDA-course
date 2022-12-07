package task14;

import java.util.List;

//zadanie domowe do 20-22 włącznie: obowiązkowe, +wcześniejsze pominięte dla chętnych
//+ dokończyć to

public class Client14 {

    public static void main(String[] args) {
        RandomElements randomElements = new RandomElements();
        Integer[] ints = randomElements.getIntegers();

        //wyświetlam pierwsze 500
//        for (int i = 0; i < ints.length / 200; i++) {
//            System.out.println("[" + i + "]: " + ints[i]);
//        }

        //List<Integer> uniques = randomElements.getUniques();
        //wyświetlam pierwsze x
//        for (int i = 0; i < uniques.size() / 200; i++) {
//            System.out.println("[" + i + "]: " + uniques.get(i));
//        }
        //System.out.println("Liczba unikatowych: " + uniques.size());

        //List<Integer> repeats = randomElements.getRepeatValues();
        //wyświetlam pierwsze x
//        for (int i = 0; i < repeats.size() / 200; i++) {
//            System.out.println("[" + i + "]: " + repeats.get(i));
//        }
        //System.out.println("Liczba powtórek: " + repeats.size());

        System.out.println(randomElements.get25MostFrequentRepeats());
    }
}
