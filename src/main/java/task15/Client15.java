package task15;

public class Client15 {
    public static void main(String[] args) {

        Car bmw = Car.BMW;
        System.out.println(bmw.isPremium());
        System.out.println(bmw.isRegular());

        System.out.println(bmw.isFasterThan(Car.FIAT));
    }

}
