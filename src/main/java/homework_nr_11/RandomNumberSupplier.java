package homework_nr_11;

import java.util.Random;
import java.util.function.Supplier;

public class RandomNumberSupplier implements Supplier <Integer>{

    @Override
    public Integer get() {
        Random random = new Random();
        return random.nextInt();
    }

    public static void main(String[] args) {
        RandomNumberSupplier randomNumberSupplier = new RandomNumberSupplier();
        Integer result = randomNumberSupplier.get();
        System.out.println(result);
    }


}
