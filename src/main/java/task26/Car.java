package task26;

public record Car(String name, String description, CarType carType) {

    @Override
    public String toString() {
        return "\n\t - " + name + " (" + description + ", " + carType + ")";
    }
}
