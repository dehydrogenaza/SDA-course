package task20_22;

public interface Shape3D extends Shape, Fillable {
    double calculateVolume();

    @Override
    default void fill(double amountOfWater) {
        double vol = calculateVolume();
        System.out.println("Nalewam " + amountOfWater);
        if (amountOfWater > vol) {
            System.out.println("\t > Przelało się.");
        } else if (amountOfWater == vol) {
            System.out.println("\t > W sam raz.");
        } else {
            System.out.println("\t > Za mało wody.");
        }
    }
}
