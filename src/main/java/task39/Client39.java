//Zadanie 39.
//
//Napisz program, który ma za zadanie rozwiązać poniższy problem.
//Istnieje system przechowujący aktualne wyniki w zawodach.
// Wiele ekranów odczytuje aktualne wyniki, natomiast kilka czujników aktualizuje te wyniki.
//Napisz program, który pozwala na nieprzerwany odczyt danych przez wiele ekranów (wątków)
// oraz aktualizację danych przez wiele czujników (wątków).
//Aby zaktualizować wyniki, czujnik musi przekazać aktualne wyniki wraz z nowymi.
// System następnie weryfikuje czy czujnik miał aktualne dane i aktualizuje dane.
// Jeżeli w tym czasie dane w systemie zmieniły się, aktualizacja danych przez czujnik jest odrzucona.
//Dla ułatwienia możesz przyjąć, że czujnik odczytuje dane, czeka losową ilość czasu i zwiększa dane o losową wartość.

package task39;

public class Client39 {
    public static void main(String[] args) {
        Results results = new Results();

        for (int i = 0; i < 5; i++) {
            new Thread(new Display(results)).start();
        }

        for (int i = 0; i < 10; i++) {
            new Thread(new Sensor(results)).start();
        }

    }
}
