package task24;

public class Client24 {
    public static void main(String[] args) {

        Basket<Integer> basket = new Basket<>();

        for (int i = 0; i < 10; i++) {
            basket.addToBasket(i);
            System.out.println(basket.getI());
        }

        //basket.addToBasket(11);
        for (int i = 10; i > 0; i--) {
            basket.removeFromBasket();
            System.out.println(basket.getI());
        }

        //basket.removeFromBasket();
    }
}
