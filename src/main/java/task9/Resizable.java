//Stwórz interfejs Resizable posiadający metodę resize(double resizeFactor).
//        Zaimplementuj interfejs w klasie z poprzedniego zadania (Circle). Przy wywołaniu metody
//            resize(doubleresizeFactor), promień ma zmienić swoje rozmiary o zadany współczynnik (1.5, 0.5, 10.0, itp).
//        Sprawdź poprawność zmiany rozmiaru wywołując pozostałe metody klasy Circle.

package task9;

public interface Resizable<T> {
    T resize(double resizeFactor);
}
