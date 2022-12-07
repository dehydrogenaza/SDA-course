package task27;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public <T> String join(T... elements) {
//        return Arrays.stream(elements).map(Object::toString).collect(Collectors.joining(separator));
        return Arrays.stream(elements).map(x -> x.toString()).collect(Collectors.joining(separator));
    }
}
