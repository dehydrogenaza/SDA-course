//Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą
// konstruktora. Zaimplementuj metody:
//        loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi niż wynosi
//          pojemność magazynka
//        isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie
//        shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany nabój
//          i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje w konsoli
//          “pusty magazynek”

package task7;

import java.util.ArrayList;
import java.util.List;

public class Client7 {

    public static void main(String[] args) {
//        List<String> lst = new ArrayList<>();
//        lst.remove(0);

        Clip clip = new Clip(5);
        clip.loadBullet("PIF 1");
        clip.loadBullet("PAF 2");
        clip.loadBullet("PIF 3");
        clip.loadBullet("PAF 4");
        clip.loadBullet("PIF 5");
        clip.loadBullet("Nadmiarowy");

        clip.shoot();
        clip.shoot();
        clip.shoot();
        clip.shoot();
        clip.shoot();
        clip.shoot();

        clip.loadBullet("PIF 6");
        clip.loadBullet("PAF 7");
        clip.loadBullet("PIF 8");
        clip.loadBullet("PAF 9");
        clip.loadBullet("PIF 10");
        clip.loadBullet("Nadmiarowy");

        clip.shoot();
        clip.shoot();
        clip.shoot();
        clip.shoot();
        clip.shoot();
        clip.shoot();
    }
}
