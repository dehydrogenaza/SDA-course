package task27;


public class Client27 {

    public static void main(String[] args) {
        Joiner joiner = new Joiner("---");

        System.out.println(joiner.join(1, 2, 3, 4, 5, 0));
        System.out.println(joiner.join(1.0, 2, 3.0, 4, 5.0, 0));
        System.out.println(joiner.join());
        System.out.println(joiner.join('a', 'z'));
        System.out.println(joiner.join(Client27.class, Joiner.class));
    }

}
