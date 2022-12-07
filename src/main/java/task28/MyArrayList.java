package task28;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyArrayList<E> extends ArrayList<E> {

    public List<E> skipEveryNElements(int startIndex, int skip) {
        List<E> skipped = new ArrayList<>();
        for (int i = startIndex; i < this.size(); i += (skip + 1)) {
            skipped.add(this.get(i));
        }

        return skipped;
    }

    public List<E> skipEveryNLambda(int startIndex, int skip) {
        return IntStream.range(0, this.size())
                .filter(i -> ((i - startIndex) % (skip + 1) == 0 && i - startIndex >= 0))
                .mapToObj(this::get)
                .collect(Collectors.toList());
    }
}
