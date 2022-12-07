package task32;

import java.io.Serializable;

public class Car implements Serializable {

    private final String name;
    private final DriveType type;
    private final long price;

    public Car(String name, DriveType type, long price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public DriveType getType() {
        return type;
    }

    public long getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  name + " (" +  type + ") " + price;
    }
}
