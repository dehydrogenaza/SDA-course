//Na podstawie 100000elementowej tablicy z losowo wybranymi wartościami zaimplementuj następujące funkcjonalności:
//
//        zwróć listę unikalnych elementów,
//        zwróć listę elementów,które co najmniej raz powtórzyły się w wygenerowanej tablicy,
//        zwróć listę 25najczęściej powtarzających się elementów.
//
//        Zaimplementuj metodę,która deduplikuje elementy w liście.W przypadku znalezienia duplikatu,
//        zastępuje go nową losową wcześniej nie występującą wartością.Sprawdź czy metoda zadziałała poprawnie wywołując metodę numer 2.

        package task14;

import java.util.*;

public class RandomElements {

    private static final int RNG_RANGE = 100_000;
    private final Integer[] integers = new Integer[100_000];

    public RandomElements() {
        Random rng = new Random();
        for (int i = 0; i < integers.length; i++) {
            integers[i] = rng.nextInt(RNG_RANGE);
        }
    }

    public List<Integer> getUniques() {
//        Set<Integer> uniques = new TreeSet<>();
//        for (int i : integers) {
//            uniques.add(i);
//        }
        Set<Integer> uniques = new TreeSet<>(Arrays.asList(integers));

        //return uniques.stream().toList();
        return new LinkedList<>(uniques);
    }

    public List<Integer> getRepeatValues() {
        //najłatwiej: posortować i sprawdzać czy identyczne z sąsiadem
        //tutaj zrobimy rozwiązanie hipsterskie z usuwaniem elementów z seta
        List<Integer> uniques = getUniques();
        List<Integer> values = new LinkedList<>(Arrays.asList(integers));

        //values.removeAll(uniques); //nie działa, bo removeAll usuwa WSZYSTKIE wystąpienia
        for (Integer unique : uniques) {
            values.remove(unique); //remove usuwa pierwsze wystąpienie
        }

        Set<Integer> repeated = new TreeSet<>(values);
        return new LinkedList<>(repeated);
    }

    public List<Map.Entry<Integer, Integer>> get25MostFrequentRepeats() {
        Map<Integer, Integer> repeats = new HashMap<>();
        for (Integer i : integers) {
            Integer val = repeats.get(i);
            repeats.put(i, val == null ? 1 : val + 1);
        }

        List<Map.Entry<Integer, Integer>> mostFrequent =
                repeats.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .limit(25)
                .toList();

        return mostFrequent;
    }

//    public List<Integer> getRepeatValuesBySorting() {
//        List<Integer> values = new LinkedList<>();
//    }

    public Integer[] getIntegers() {
        return integers;
    }
}
