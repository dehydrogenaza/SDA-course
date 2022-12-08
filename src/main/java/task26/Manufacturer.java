package task26;

import java.util.List;

public record Manufacturer(String name, int yearOfCreation, List<Model> models) {

    @Override
    public String toString() {
        StringBuilder retVal = new StringBuilder(name);
        retVal.append(" (")
                .append(yearOfCreation)
                .append(") ");
        for (Model model : models) {
            retVal.append("\n");
            retVal.append(model);
        }
        retVal.append("\n");
        return retVal.toString();
    }
}
