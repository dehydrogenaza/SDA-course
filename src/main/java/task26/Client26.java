//Wykorzystując mechanizmy programowania funkcyjnego na podstawie zadanej struktury wyświetl:
//
//        listę wszystkich Modelów,
//        listę wszystkich aut,
//        listę wszystkich nazw producentów,
//        listę wszystkich lat założenia producentów,
//        listę wszystkich nazw modeli,
//        listę wszystkich lat startu produkcji modeli,
//        listę wszystkich nazw aut,
//        listę wszystkich opisów aut,
//        tylko modele z parzystym rokiem startu produkcji,
//        tylko auta producentów z parzystym rokiem założenia,
//        tylko auta z parzystym rokiem startu produkcji modelu oraz nieparzystym rokiem założenia producenta,
//        tylko auta typu CABRIO z nieparzystym rokiem startu produkcji modelu i parzystym rokiem założenia producenta,
//        tylko auta typu SEDAN z modelu nowszego niż 2019 oraz rokiem założenia producenta mniejszym niż 1919.

package task26;

import java.util.*;
import java.util.logging.Logger;

public class Client26 {
    private final static Logger LOGGER = Logger.getLogger(Client26.class.getName());

    public static void main(String[] args) {
//        LOGGER.info("info");
//        LOGGER.log(Level.WARNING, "warning");
//        LOGGER.log(Level.SEVERE, "severe");
//        System.out.println("normal text");
//
//        LOGGER.setLevel(Level.SEVERE); //poziom przepuszczany do logu
//        LOGGER.log(Level.WARNING, "warning 2");
//        LOGGER.log(Level.SEVERE, "severe 2");
        Random rng = new Random();

        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String nameChars = "" + (char) (65 + i) + "V" + i;
            CarType carType = switch (rng.nextInt(4)) {
                case 0 -> CarType.CABRIO;
                case 1 -> CarType.COUPE;
                case 2 -> CarType.SEDAN;
                default -> CarType.HATCHBACK;
            };
            cars.add(new Car("car " + nameChars.repeat(2), nameChars.repeat(3).toLowerCase(), carType));
        }

        List<Model> models = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String nameChar = "" + (char) (65 + i);
            models.add(new Model("model " + nameChar.repeat(1 + i), 2022 - i, cars.subList(i * 4, i * 4 + 3)));
        }

        Set<Manufacturer> manufacturers = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            String name = "FACTORY " + i;
            manufacturers.add(new Manufacturer(name, 1939 + 10 * i, models.subList(i, 4)));
        }

//        System.out.println(manufacturers);
        Service service = new Service(manufacturers);

        System.out.println(service.getAllModels());
        System.out.println("=================================");
        System.out.println(service.getAllCars());
        System.out.println("=================================");
        System.out.println(service.getAllManufacturerNames());
        System.out.println("=================================");
        System.out.println(service.getAllManufacturerYearsOfCreation());
        System.out.println("=================================");
        System.out.println(service.getAllModelNames());
        System.out.println("=================================");
        System.out.println(service.getAllModelProductionStartYear());
        System.out.println("=================================");
        System.out.println(service.getAllCarNames());
        System.out.println("=================================");
        System.out.println(service.getAllCarDescriptions());
        System.out.println("=================================");
        System.out.println(service.getModelsWithEvenProductionStartYear());
        System.out.println("=================================");
        System.out.println(service.getCarsOfManufacturersWithEvenYearsOfCreation());
        System.out.println("=================================");
        System.out.println(service.getCarsOfManufacturersWithOddYearsOfCreationAndEvenProductionStartYear());
        System.out.println("=================================");
        System.out.println(service.getCabrioCarsOfManufacturersWithOddYearsOfCreationAndEvenProductionStartYear());
        System.out.println("=================================");
        System.out.println(service.getSedanCarsOfManufacturersOlderThan1919AndModelsNewerThan2019());
    }
}
