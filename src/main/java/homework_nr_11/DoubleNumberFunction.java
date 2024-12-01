package homework_nr_11;

import java.util.function.Function;

public class DoubleNumberFunction implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 2;
    }

    public static void main(String[] args) {
        DoubleNumberFunction doubleNumberFunction = new DoubleNumberFunction();
        Integer result = doubleNumberFunction.apply(3);
        System.out.println(result);
    }
}
