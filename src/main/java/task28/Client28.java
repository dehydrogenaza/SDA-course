package task28;

import java.util.List;

public class Client28 {

    public static void main(String[] args) {
        MyArrayList<Integer> skippingList = new MyArrayList<>();

        for (int i = 0; i < 20; i++) {
            skippingList.add(i);
        }

        List<Integer> skipped = skippingList.skipEveryNElements(3, 3);
        System.out.println(skipped);

        List<Integer> skippedWithLambda = skippingList.skipEveryNLambda(3, 3);
        System.out.println(skippedWithLambda);
    }
}
