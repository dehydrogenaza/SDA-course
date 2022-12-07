//Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą
// konstruktora. Zaimplementuj metody:
//        loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi
//          pojemność magazynka
//        isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
//        shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój
//          i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli
//          “pusty magazynek”

package task7;

public class Clip {
    private final String[] bullets;
    private int cursor;

    public Clip(int capacity) {
        bullets = new String[capacity];
        cursor = -1;
    }

    public boolean loadBullet(String bulletName) {
        if (cursor < bullets.length - 1) {
            bullets[++cursor] = bulletName;
            return true;
        }
        return false;
    }

    public boolean isLoaded() {
        return cursor >= 0;
    }

    public void shoot() {
        if (isLoaded()) {
            System.out.println("Szczelam 🔫: " + bullets[cursor--]);
        } else {
            System.out.println("(klik klik) pusto ☠");
        }
    }
}
