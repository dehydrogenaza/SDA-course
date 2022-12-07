//Napisz program, który będzie w stanie zapisać listę elementów (np. aut) do pliku w takim formacie,
//        aby był również w stanie odczytać ten plik i stworzyć nową listę elementów i wypisać ją w konsoli.

package task32;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Client32 {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            cars.add(new Car("Mazda " + i, DriveType.ELECTRIC, (long) (Math.random() * 50000) + 50000));
        }


        File path = new File("task32.txt");

        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(cars);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Car> readCars;
        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            readCars = (List<Car>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Car car : readCars) {
            System.out.println(car);
        }
    }

}
