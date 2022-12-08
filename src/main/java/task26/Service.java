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

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Service {

    private final Set<Manufacturer> manufacturers;

    public Service(Set<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    //1
    public List<Model> getAllModels() {
        return manufacturers.stream()
                .flatMap(m -> m.models().stream())
                .collect(Collectors.toList());
    }

    //2
    public List<Car> getAllCars(){
        return manufacturers.stream()
                .flatMap(m -> m.models().stream()) //mamy teraz w strumieniu modele
                .flatMap(m -> m.cars().stream()) //teraz dostalismy az do samochodow
                .collect(Collectors.toList());
    }

    //3
    public List<String> getAllManufacturerNames() {
        return manufacturers.stream()
                .map(Manufacturer::name)
                .collect(Collectors.toList());
    }

    //4
    public List<Integer> getAllManufacturerYearsOfCreation() {
        return manufacturers.stream()
                .map(Manufacturer::yearOfCreation)
                .collect(Collectors.toList());
    }

    //5
    public List<String> getAllModelNames() {
        return manufacturers.stream()
                .flatMap(m -> m.models().stream())
                .map(Model::name)
                .collect(Collectors.toList());
    }

    //6
    public List<Integer> getAllModelProductionStartYear() {
        return manufacturers.stream()
                .flatMap(m -> m.models().stream())
                .map(Model::productionStartYear)
                .collect(Collectors.toList());
    }

    //7
    public List<String> getAllCarNames(){
        return manufacturers.stream()
                .flatMap(m -> m.models().stream()) //mamy teraz w strumieniu modele
                .flatMap(m -> m.cars().stream()) //teraz dostalismy az do samochodow
                .map(Car::name)
                .collect(Collectors.toList());
    }

    //8
    public List<String> getAllCarDescriptions(){
        return manufacturers.stream()
                .flatMap(m -> m.models().stream()) //mamy teraz w strumieniu modele
                .flatMap(m -> m.cars().stream()) //teraz dostalismy az do samochodow
                .map(Car::description)
                .collect(Collectors.toList());
    }

    //9
    public List<Model> getModelsWithEvenProductionStartYear() {
        return manufacturers.stream()
                .flatMap(m -> m.models().stream())
                .filter(model -> model.productionStartYear() % 2 == 0)
                .collect(Collectors.toList());
    }

    //10
    public List<Car> getCarsOfManufacturersWithEvenYearsOfCreation(){
        return manufacturers.stream()
                .filter(m -> m.yearOfCreation() % 2 == 0)
                .flatMap(m -> m.models().stream())
                .flatMap(model -> model.cars().stream())
                .collect(Collectors.toList());
    }

    //11
    public List<Car> getCarsOfManufacturersWithOddYearsOfCreationAndEvenProductionStartYear(){
        return manufacturers.stream()
                .filter(m -> m.yearOfCreation() % 2 != 0)
                .flatMap(m -> m.models().stream())
                .filter(model -> model.productionStartYear() % 2 == 0)
                .flatMap(model -> model.cars().stream())
                .collect(Collectors.toList());
    }

    //12
    public List<Car> getCabrioCarsOfManufacturersWithOddYearsOfCreationAndEvenProductionStartYear(){
        return manufacturers.stream()
                .filter(m -> m.yearOfCreation() % 2 == 0)
                .flatMap(m -> m.models().stream())
                .filter(model -> model.productionStartYear() % 2 != 0)
                .flatMap(model -> model.cars().stream())
                .filter(car -> car.carType() == CarType.CABRIO)
                .collect(Collectors.toList());
    }

    //13
    public List<Car> getSedanCarsOfManufacturersOlderThan1919AndModelsNewerThan2019(){
        return manufacturers.stream()
                .filter(m -> m.yearOfCreation() < 1919)
                .flatMap(m -> m.models().stream())
                .filter(model -> model.productionStartYear() > 2019)
                .flatMap(model -> model.cars().stream())
                .filter(car -> car.carType() == CarType.SEDAN)
                .collect(Collectors.toList());
    }
}
