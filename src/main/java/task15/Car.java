package task15;

public enum Car {
    FERRARI(true),
    PORSCHE(true),
    MERCEDES(false),
    BMW(false),
    OPEL(false),
    FIAT(false),
    TOYOTA(false);

    private final boolean premium;

    Car(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public boolean isRegular() {
        return !isPremium();
    }

    public boolean isFasterThan(Car otherCar) {
        return this.compareTo(otherCar) < 0;
    }
}
