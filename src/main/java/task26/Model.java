package task26;

import java.util.List;

public record Model(String name, int productionStartYear, List<Car> cars) {

    @Override
    public String toString() {
        return "\t" + name + " (" + productionStartYear + ")";
    }
}
